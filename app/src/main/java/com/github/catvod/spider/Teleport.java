package com.github.catvod.spider;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Environment;
import android.util.Base64;

import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.File;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

import dalvik.system.DexClassLoader;

public class Teleport extends Spider {

    public static class TeleportModel {
        public String fromLink;
        public String jarName;
        public JSONObject teleConfig;
        public LinkedHashMap<String, HashMap<String, String>> parsersMap = null;
        public Map<String, JSONObject> originalSiteJson = new HashMap<>();
    }

    public static Map<String, TeleportModel> JAR_MAPPER = new HashMap<>();
    private static ReentrantLock SYNC_LOCKER = new ReentrantLock();
    private static boolean IS_SYNC_LOCK = false;

    private JSONObject originalConfig = null;
    private Object invokedSpider = null;
    private TeleportModel model = null;
    private SharedPreferences sharedPreferences = null;
    private DexClassLoader loader = null;

    public static boolean getIsLock() {
        SYNC_LOCKER.lock();
        try {
            return IS_SYNC_LOCK;
        } finally {
            SYNC_LOCKER.unlock();
        }
    }

    public static void updateLockState(boolean toLock) {
        SYNC_LOCKER.lock();
        try {
            IS_SYNC_LOCK = toLock;
        } finally {
            SYNC_LOCKER.unlock();
        }
    }

    public void init(Context context, String extend) {
        try {
            sharedPreferences = context.getSharedPreferences(context.getPackageName() + "cat_vod", 0);
            JSONObject extJson = new JSONObject(extend);
            model = JAR_MAPPER.get(extJson.getString("from"));
            originalConfig = model.originalSiteJson.get(extJson.getString("key"));
            SpiderDebug.log(model.jarName);
            loader = getClassLoader(context, model.jarName);

            Class targetInitClass = loader.loadClass("com.github.catvod.spider.Init");
            targetInitClass.getMethod("init", Context.class).invoke(null, context);

            Class targetClass = loader.loadClass("com.github.catvod.spider." +
                    originalConfig.getString("api").replace("csp_", ""));
            invokedSpider = targetClass.newInstance();
            String originExt = originalConfig.getString("ext");
            if (originExt.isEmpty()) {
                this.invokeMethod("init", context);
            } else {
                SpiderDebug.log(originExt);
                this.invokeMethod("init", context, originExt);
            }
        } catch (Exception ex) {
            StringWriter sw = new StringWriter();
            PrintWriter pw = new PrintWriter(sw);
            ex.printStackTrace(pw);
            SpiderDebug.log(ex.getMessage());
            SpiderDebug.log(sw.toString());
        }
        init(context);
    }

    public String homeContent(boolean filter) {
        String returnedData = this.invokeMethod("homeContent", filter);
        return returnedData;
    }

    public String homeVideoContent() {
        return this.invokeMethod("homeVideoContent");
    }

    public String categoryContent(String tid, String pg, boolean filter, HashMap<String, String> extend) {
        return this.invokeMethod("categoryContent", tid, pg, filter, extend);
    }

    public String detailContent(List<String> ids) {
        return this.invokeMethod("detailContent", ids);
    }

    public String searchContent(String key, boolean quick) {
        return this.invokeMethodWithDelay("searchContent", key, quick);
    }

    @TargetApi(Build.VERSION_CODES.KITKAT)
    public String playerContent(String flag, String id, List<String> vipFlags) {
        String returnedData = this.invokeMethod("playerContent", flag, id, vipFlags);
        SpiderDebug.log(returnedData);
        returnedData = returnedData.replaceAll("do=",
                "do=teleproxyLink-" +
                        Base64.encodeToString(model.fromLink.getBytes(StandardCharsets.UTF_8), 0) + "__");
        return returnedData;
    }

    public boolean isVideoFormat(String url) {
        return this.invokeMethod("isVideoFormat", url);
    }

    public boolean manualVideoCheck() {
        return this.invokeMethod("manualVideoCheck", null);
    }

    private <T> T invokeMethod(String methodName, Object ... params) {
        T dataBack = null;
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("sss_api_config_id", model.fromLink);
        editor.apply();
        try {
            Method foundMethod = null;
            for(Method method: Spider.class.getMethods()) {
                if(method.getName() == methodName &&
                        method.getParameterTypes().length == params.length) {
                    foundMethod = method;
                    break;
                }
            }
            dataBack = (T)foundMethod.invoke(invokedSpider, params);
        }catch (Exception ex) {
            StringWriter sw = new StringWriter();
            PrintWriter pw = new PrintWriter(sw);
            ex.printStackTrace(pw);
            SpiderDebug.log(ex.getMessage());
            SpiderDebug.log(sw.toString());
        }
        editor = sharedPreferences.edit();
        editor.putString("sss_api_config_id", Init.getOriginApiId());
        editor.apply();
        return dataBack;
    }

    private <T> T invokeMethodWithDelay(String methodName, Object ... params) {
        T dataBack = null;
        try {
            Method foundMethod = null;
            for (Method method : Spider.class.getMethods()) {
                if (method.getName() == methodName &&
                        method.getParameterTypes().length == params.length) {
                    foundMethod = method;
                    break;
                }
            }
            while (getIsLock())
                Thread.sleep(100);
            updateLockState(true);
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putString("sss_api_config_id", model.fromLink);
            editor.commit();
            Thread timerUnlockThread = new Thread() {
                public void run() {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                    }
                    updateLockState(false);
                }
            };
            timerUnlockThread.start();
            dataBack = (T) foundMethod.invoke(invokedSpider, params);
        }catch (Exception ex) {
            StringWriter sw = new StringWriter();
            PrintWriter pw = new PrintWriter(sw);
            ex.printStackTrace(pw);
            SpiderDebug.log(ex.getMessage());
            SpiderDebug.log(sw.toString());
        } finally {
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putString("sss_api_config_id", Init.getOriginApiId());
            editor.commit();
            updateLockState(false);
        }
        return dataBack;
    }

    public static DexClassLoader getClassLoader(Context context, String paramString) {
        String dexPath = new File(getAppJarDir(context), paramString).getAbsolutePath();
        String optimizedDirectory = getAppDexDir(context).getAbsolutePath();
        String librarySearchPath = getAppLibDir(context).getAbsolutePath();
        ClassLoader parent = context.getClassLoader();
        return new DexClassLoader(dexPath, optimizedDirectory, librarySearchPath, parent);
    }

    // driver/lib/
    public static File getAppLibDir(Context context) {
        File localFile = new File(getAppHomeDir(context), "driver/lib/");
        if (!localFile.exists()) {
            localFile.mkdirs();
        }
        return localFile;
    }

    // driver/dex
    public static File getAppDexDir(Context context) {
        File localFile = new File(getAppHomeDir(context), "driver/dex/");
        if (!localFile.exists()) {
            localFile.mkdirs();
        }
        return localFile;
    }

    // driver/jar/
    public static File getAppJarDir(Context context) {
        File localFile = new File(getAppHomeDir(context), "driver/jar/");
        if (!localFile.exists()) {
            localFile.mkdirs();
        }
        return localFile;
    }

    public static File getAppHomeDir(Context context) {
        String packageName = context.getPackageName();
        File sdcardDir = Environment.getExternalStorageDirectory(); // /storage/emulated/0/
        String appHomeDir = sdcardDir + File.separator + "Android" + File.separator + "data" + File.separator + packageName + File.separator;
        File localFile = new File(appHomeDir);
        if (!localFile.exists()) {
            localFile.mkdirs();
        }
        return localFile;
    }
}
