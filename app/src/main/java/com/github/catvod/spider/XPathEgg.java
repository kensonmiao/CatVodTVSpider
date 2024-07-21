package com.github.catvod.spider;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Base64;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;

import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.utils.AES;
import com.github.catvod.utils.Misc;
import com.github.catvod.utils.okhttp.OKCallBack;
import com.github.catvod.utils.okhttp.OkHttpUtil;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import okhttp3.Call;

public class XPathEgg extends XPathFilter {

    //region Original Page Data
    private static String pageData;
    private static String originalPageData = "";

    public static Object[] vod(Map<String, String> map) {
        if (map.get("type").equals("printPage")) return printPage();
        return null;
    }

    private static Object[] printPage() {
        Object[] returnedObj = new Object[3];
        returnedObj[0] = 200;
        returnedObj[1] = "text/html";
        returnedObj[2] = new ByteArrayInputStream(pageData.getBytes());
        return returnedObj;
    }

    @Override
    public void init(Context context, String ext) {
        String iv = "7456258946879235";
        String key = "s9o4js0#de0e%@!c";
        try {
            byte[] ivInByte = iv.getBytes(StandardCharsets.UTF_8);
            byte[] keyInByte = key.getBytes(StandardCharsets.UTF_8);
            //Grab js template for 蛋蛋 detail page
            originalPageData = OkHttpUtil.string("https://codeberg.org/kensonlogin55/CatPic/raw/branch/main/xpath/xpathEgg", null);
            originalPageData = AES.decryptOfAesCbcPkcs7(Base64.decode(originalPageData, 0), keyInByte, ivInByte);
        }catch (Exception ex) {
            SpiderDebug.log(ex.getMessage());
        }
        super.init(context, ext);
    }

    @Override
    protected String categoryUrl(String tid, String pg, boolean filter, HashMap<String, String> extend) {
        return super.categoryUrl(tid, String.valueOf(Integer.parseInt(pg) - 1), filter, extend);
    }

    @Override
    protected void detailContentExt(String content, JSONObject vod) {
        try {
            String startFlag = "infoid=";
            int start = content.indexOf(startFlag);
            start = start + startFlag.length();
            int end = content.indexOf(";", start);
            String infoid = content.substring(start, end);

            startFlag = "link5='";
            start = content.indexOf(startFlag);
            start = start + startFlag.length();
            end = content.indexOf("';", start);
            String link5 = content.substring(start, end);

            JSONObject json = new JSONObject();
            json.put("infoid", infoid);
            json.put("link5", link5);

            //Set to static var, then use proxy to populate the js script
            pageData = originalPageData.replace("{infoid}", infoid).replace("{link5}", link5);
            //SpiderDebug.log(pageData);
            int millSecCount = 0;
            XPathEggJSInterface jsInterface = new XPathEggJSInterface();
            parser(Proxy.localProxyUrl() + "?do=egg&type=printPage", jsInterface);
            String returnedLinks = jsInterface.getLinksInJava();

            //Wait for result back, or return null as timeout result while over 30 sec
            while (returnedLinks.isEmpty() && millSecCount <= 10000) {
                Thread.sleep(100);
                millSecCount += 100;
                returnedLinks = jsInterface.getLinksInJava();
            }

            if (returnedLinks.isEmpty()) return;

            //Re-organize result
            String[] resources = returnedLinks.split("@@@");
            StringBuilder resourceNames = new StringBuilder();
            StringBuilder items = new StringBuilder();
            for (String resource : resources) {
                if (resource.isEmpty()) continue;
                String[] resNameAndLinks = resource.split("!!!");
                resourceNames.append(resNameAndLinks[0]).append("$$$");
                items.append(resNameAndLinks[1].replace("|", "#").substring(0, resNameAndLinks[1].length() - 1)).append("$$$");
            }
            vod.put("vod_play_from", resourceNames.substring(0, resourceNames.length() - 3));
            vod.put("vod_play_url", items.substring(0, items.length() - 3));
        } catch (Exception ignored) {
        }
    }

    @Override
    public String playerContent(String flag, String id, List<String> vipFlags) {
        try {
            fetchRule();
            HashMap<String, String> json = new HashMap<>();
            json.put("url", id);
            HashMap<String, String> headers = new HashMap<>();
            headers.put("accept", "*/*");
            headers.put("x-requested-with", "XMLHttpRequest");
            headers.put("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/86.0.4240.198 Safari/537.36");
            headers.put("origin", "https://www.dandanzan.top");
            headers.put("accept-language", "zh-CN,zh;q=0.9");
            JSONObject result = new JSONObject();
            OkHttpUtil.post(OkHttpUtil.defaultClient(), rule.getPlayUrl(), json, headers, new OKCallBack.OKCallBackString() {
                @Override
                public void onFailure(Call call, Exception e) {
                }

                @Override
                public void onResponse(String response) {
                    try {
                        result.put("url", response);
                    } catch (JSONException ignored) {
                    }
                }
            });
            result.put("parse", 0);
            result.put("playUrl", "");
            if (!rule.getPlayUa().isEmpty()) {
                result.put("ua", rule.getPlayUa());
            }
            return result.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
        }
        return "";
    }

    @SuppressLint("SetJavaScriptEnabled")
    public static void parser(String url, XPathEggJSInterface jsInterfaceObj) {
        Init.run(() -> {
            SpiderDebug.log("Start to load webView:" + url);
            WebView webView = Misc.getWebView();
            jsInterfaceObj.webView = webView;
            webView.addJavascriptInterface(jsInterfaceObj, "andFunc");
            webView.loadUrl(url);
        });
    }

    public static class XPathEggJSInterface {

        private String links = "";
        private WebView webView;

        @JavascriptInterface
        public void setLinks(String links) {
            this.links = links;
            destroy();
        }

        public String getLinksInJava() {
            return links;
        }

        protected void destroy() {
            Init.run(() -> {
                webView.destroy();
                webView = null;
            });
        }
    }
}
