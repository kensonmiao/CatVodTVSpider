package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;

import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.utils.Misc;
import com.github.catvod.utils.okhttp.OKCallBack;
import com.github.catvod.utils.okhttp.OkHttpUtil;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import okhttp3.Call;
import okhttp3.Response;

/**
 * M浏览器中的App影视
 * <p>
 * Author: 群友 不负此生
 */
public class AppYsV3 extends Spider {

    private String apiUrl;

    @Override
    public void init(Context context, String extend) {
        super.init(context, extend);
        try {
            apiUrl = extend;
        } catch (Throwable th) {
        }
    }

    @Override
    public String homeContent(boolean filter) {
        try {
            String url = apiUrl;
            String json = OkHttpUtil.string(url, getHeaders(url));
            JSONObject jobj = new JSONObject(json);
            if(jobj.has("class")) {
                JSONArray classArr = new JSONArray();
                for(int i=0; i< jobj.getJSONArray("class").length(); i++) {
                    JSONObject classJObject = jobj.getJSONArray("class").getJSONObject(i);
                    if(classJObject.getInt("type_pid") > 0)
                        classArr.put(classJObject);
                }
                jobj.put("class", classArr);
            }
            return jobj.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
        }
        return "";
    }

    @Override
    public String homeVideoContent() {
        try {
            String url = apiUrl + "?ac=detail";
            String json = OkHttpUtil.string(url, getHeaders(url));
            return json;
        } catch (Exception e) {
            SpiderDebug.log(e);
        }
        return "";
    }

    @Override
    public String categoryContent(String tid, String pg, boolean filter, HashMap<String, String> extend) {
        try {
            String url = apiUrl + "?ac=detail&t=" + tid + "&pg=" + pg;
            String json = OkHttpUtil.string(url, getHeaders(url));
            return json;
        } catch (Exception e) {
            SpiderDebug.log(e);
        }
        return "";
    }

    @Override
    public String detailContent(List<String> ids) {
        try {
            String idsStr = String.join(",", ids);
            String url = apiUrl + "?ac=detail&ids=" + idsStr;
            String json = OkHttpUtil.string(url, getHeaders(url));
            return json;
        } catch (Exception e) {
            SpiderDebug.log(e);
        }
        return "";
    }

    @Override
    public String searchContent(String key, boolean quick) {
        try {
            String url = "https://search.lziapi.com/json-api/?dname=liangzi&key=" + key + "&count=50";
            String json = OkHttpUtil.string(url, getHeaders(url));
            JSONObject obj = new JSONObject(json);
            JSONArray jsonArray = null;
            JSONArray videos = new JSONArray();
            if (obj.has("posts") && obj.get("posts") instanceof JSONArray) {
                jsonArray = obj.getJSONArray("posts");
            }
            if (jsonArray != null) {
                for (int i = 0; i < jsonArray.length(); i++) {
                    JSONObject vObj = jsonArray.getJSONObject(i);
                    if (vObj.has("vod_id")) {
                        JSONObject v = new JSONObject();
                        v.put("vod_id", vObj.getString("vod_id"));
                        v.put("vod_name", vObj.getString("vod_name"));
                        v.put("vod_pic", vObj.getString("vod_pic"));
                        videos.put(v);
                    }
                }
            }
            JSONObject result = new JSONObject();
            result.put("list", videos);
            return result.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
        }
        return "";
    }

    @Override
    public String playerContent(String flag, String id, List<String> vipFlags) {
        try {
            if (OkHttpUtil.proxyClient() == null) {
                JSONObject result = new JSONObject();
                result.put("parse", 0);
                result.put("playUrl", "");
                result.put("url", id);
                return result.toString();
            } else {
                JSONObject result = new JSONObject();
                result.put("parse", 0);
                result.put("playUrl", "");
                result.put("url", Proxy.localProxyUrl() + "do=appysV3&url=" + id);
                return result.toString();
            }
        } catch (Exception e) {
            SpiderDebug.log(e);
        }
        return "";
    }

    public static Object[] getStreamData(String url) {
        Object[] returnedObj = new Object[3];
        returnedObj[0] = 200;

        OKCallBack<Object> streamCallBack = new OKCallBack<Object>() {
            @Override
            public Object onParseResponse(Call call, Response response) {
                try {
                    returnedObj[1] = response.header("Content-Type");
                    if(response.header("Content-Type").equals("application/vnd.apple.mpegurl")){
                        String content = response.body().string();
                        String baseUrl = getBaseUrl(url);
                        String redirectUrl = getRedirectUrl(content, baseUrl);
                        String replacedUrl = url;
                        while (redirectUrl != null && !redirectUrl.isEmpty()) {
                            replacedUrl = redirectUrl;
                            baseUrl = getBaseUrl(replacedUrl);
                            content = OkHttpUtil.string(OkHttpUtil.proxyClient(), replacedUrl, null, null, null, null, OkHttpUtil.METHOD_GET);
                            redirectUrl = getRedirectUrl(content, baseUrl);
                        }
                        content = replaceRelativePaths(content, baseUrl, Proxy.localProxyUrl() + "do=appysV3&url=");
                        returnedObj[2] = content;
                    } else {
                        returnedObj[2] = response.body().byteStream();
                    }
                    return null;
                } catch (Exception e) {
                    return "";
                }
            }

            @Override
            public void onFailure(Call call, Exception e) {
                setResult("");
                SpiderDebug.log(e);
            }

            @Override
            public void onResponse(Object response) {
            }
        };

        OkHttpUtil.get(OkHttpUtil.proxyClient(), url, streamCallBack);

        return returnedObj;
    }

    public static String getBaseUrl(String url) {
        URL urlObj = null;
        try {
            urlObj = new URL(url);
            String authority = urlObj.getProtocol() + "://" + urlObj.getHost();
            if (urlObj.getPort() != -1) {
                authority += ":" + urlObj.getPort();
            }
            String path = urlObj.getPath();
            if (path.contains("/")) {
                path = path.substring(0, path.lastIndexOf('/') + 1);
            }
            return authority + path;
        } catch (MalformedURLException e) {
            SpiderDebug.log("Not a url: " + url);
        }
        return null;
    }

    public static String getRedirectUrl(String m3u8Content, String baseUrl) throws URISyntaxException {
        String pattern = "#EXT-X-STREAM-INF.*?\n(.*)";
        Pattern regex = Pattern.compile(pattern, Pattern.DOTALL | Pattern.CASE_INSENSITIVE);
        Matcher matcher = regex.matcher(m3u8Content);

        if (matcher.find()) {
            String tagValue = matcher.group(1).trim();
            if (tagValue.startsWith("http://") || tagValue.startsWith("https://")) {
                // Absolute or root-relative URL
                return tagValue;
            } else if (tagValue.startsWith("/")) {
                URI baseUri = new URI(baseUrl);
                String originAuthority = baseUri.getScheme() + "://" + baseUri.getHost();
                return originAuthority + tagValue;
            } else {
                // Relative URL
                URI baseUri = new URI(baseUrl);
                String fullPath = baseUrl.endsWith("/") ? baseUrl + tagValue : baseUrl + "/" + tagValue;
                return baseUri.resolve(fullPath).toString();
            }
        }
        return null;
    }

    public static String replaceRelativePaths(String m3u8Content, String baseUrl, String proxyUrl) throws URISyntaxException {
        String pattern = "^(?!(http|https))(.*)\\.ts$";
        URI baseUri = new URI(baseUrl);
        String authority = baseUri.getScheme() + "://" + baseUri.getHost();
        if (baseUrl != null && !baseUrl.endsWith("/")) {
            baseUrl += "/";
        }

        Pattern regex = Pattern.compile(pattern, Pattern.MULTILINE | Pattern.CASE_INSENSITIVE);
        Matcher matcher = regex.matcher(m3u8Content);

        StringBuffer result = new StringBuffer();
        while (matcher.find()) {
            String relativePath = matcher.group(2);
            String addedPath = baseUrl;
            if (relativePath.startsWith("/")) {
                addedPath = authority;
            }
            String absolutePath = proxyUrl + addedPath + relativePath;
            matcher.appendReplacement(result, absolutePath + ".ts");
        }
        matcher.appendTail(result);

        return result.toString();
    }

    private static String processUrls(String inputText, String authority, String fullPath) {
        // Define regex patterns
        String httpPattern = "(http://|https://)[^\\s]+";
        String absolutePattern = "/[^\\s]+";
        String relativePattern = "(?<!http://|https://|/)[^\\s]+";
        String prefix = Proxy.localProxyUrl() + "do=appysV3&url=";

        // Process http/https URLs
        Pattern pattern = Pattern.compile(httpPattern);
        Matcher matcher = pattern.matcher(inputText);
        StringBuffer result = new StringBuffer();
        while (matcher.find()) {
            matcher.appendReplacement(result, prefix + matcher.group());
        }
        matcher.appendTail(result);
        inputText = result.toString();

        // Process absolute URLs
        pattern = Pattern.compile(absolutePattern);
        matcher = pattern.matcher(inputText);
        result = new StringBuffer();
        while (matcher.find()) {
            matcher.appendReplacement(result, prefix + authority + matcher.group());
        }
        matcher.appendTail(result);
        inputText = result.toString();

        // Process relative URLs
        pattern = Pattern.compile(relativePattern);
        matcher = pattern.matcher(inputText);
        result = new StringBuffer();
        while (matcher.find()) {
            matcher.appendReplacement(result, prefix + fullPath + "/" + matcher.group());
        }
        matcher.appendTail(result);

        return result.toString();
    }

    private HashMap<String, String> getHeaders(String URL) {
        HashMap<String, String> headers = new HashMap<>();
        headers.put("User-Agent", UA());
        return headers;
    }

    private String UA() {
        return "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/110.0.0.0 Safari/537.36";
    }

    // ######选集
    private final HashMap<String, ArrayList<String>> parseUrlMap = new HashMap<>();

    @Override
    public boolean manualVideoCheck() {
        return true;
    }

    @Override
    public boolean isVideoFormat(String url) {
        return Misc.isVideoFormat(url);
    }

}
