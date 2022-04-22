package com.github.catvod.spider;

import android.annotation.TargetApi;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;

import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.utils.Misc;
import com.github.catvod.utils.okhttp.OKCallBack;
import com.github.catvod.utils.okhttp.OkHttpUtil;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.seimicrawler.xpath.JXDocument;
import org.seimicrawler.xpath.JXNode;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Response;

public class XPathGaze extends XPathFilter {

    private static final Pattern xKeyPattern = Pattern.compile("http(s*)://(.+)");

    @Override
    protected void loadRuleExt(String json) {
        super.loadRuleExt(json);
    }

    @Override
    public String categoryContent(String tid, String pg, boolean filter, HashMap<String, String> extend) {
        try {
            fetchRule();
            String cateUrl = rule.getCateUrl();
            Map<String, String> headerMap = this.getHeaders();
            Map<String, String> paramsMap = new HashMap<>();
            if (filter && extend != null && extend.size() > 0) {
                for (Iterator<String> it = extend.keySet().iterator(); it.hasNext(); ) {
                    String key = it.next();
                    String value = extend.get(key);
                    if (value.length() > 0) {
                        paramsMap.put(key, value);
                    }
                }
            }
            if(!paramsMap.containsKey("mcountry"))
                paramsMap.put("mcountry", "all");
            if(!paramsMap.containsKey("tag_arr[]"))
                paramsMap.put("tag_arr[]", "all");
            if(!paramsMap.containsKey("sort"))
                paramsMap.put("sort", "updatetime");
            if(!paramsMap.containsKey("album"))
                paramsMap.put("album", "all");
            paramsMap.put("title", "");
            paramsMap.put("mform", tid);
            paramsMap.put("page", pg);
            String pageData = OkHttpUtil.string(OkHttpUtil.defaultClient(),
                    cateUrl, null, paramsMap, headerMap, null, OkHttpUtil.METHOD_POST);
            if(!pageData.isEmpty()) {
                JSONArray videoList = (new JSONObject(pageData)).getJSONArray("mlist");
                JSONArray videos = new JSONArray();
                for (int i = 0; i < videoList.length(); i++) {
                    JSONObject v = new JSONObject();
                    JSONObject orgData = videoList.getJSONObject(i);
                    v.put("vod_id", orgData.getString("mid"));
                    v.put("vod_name", orgData.getString("title"));
                    v.put("vod_pic", orgData.getString("cover_img"));
                    v.put("vod_remarks", orgData.getString("grade"));
                    videos.put(v);
                }
                JSONObject result = new JSONObject();
                result.put("page", pg);
                result.put("pagecount", Integer.MAX_VALUE);
                result.put("limit", 90);
                result.put("total", Integer.MAX_VALUE);
                result.put("list", videos);
                return result.toString();
            }
        } catch (Exception ex) {
            SpiderDebug.log(ex);
        }
        return "";
    }

    @Override
    public String detailContent(List<String> ids) {
        try {
            fetchRule();
            String webUrl = rule.getDetailUrl().replace("{vid}", ids.get(0));
            String webContent = fetch(webUrl);
            JXDocument doc = JXDocument.create(webContent);
            JXNode vodNode = doc.selNOne(rule.getDetailNode());

            String cover = "", title = "", desc = "", category = "", area = "", year = "", remark = "", director = "", actor = "";

            title = vodNode.selOne(rule.getDetailName()).asString().trim();
            title = rule.getDetailNameR(title);

            if(!rule.getDetailImg().isEmpty()) {
                try {
                    cover = vodNode.selOne(rule.getDetailImg()).asString().trim();
                    cover = rule.getDetailImgR(cover);
                    cover = Misc.fixUrl(webUrl, cover);
                } catch (Exception e) {
                    SpiderDebug.log(e);
                }
            }
            if (!rule.getDetailCate().isEmpty()) {
                try {
                    category = vodNode.selOne(rule.getDetailCate()).asString().trim();
                    category = rule.getDetailCateR(category);
                } catch (Exception e) {
                    SpiderDebug.log(e);
                }
            }
            if (!rule.getDetailYear().isEmpty()) {
                try {
                    year = vodNode.selOne(rule.getDetailYear()).asString().trim();
                    year = rule.getDetailYearR(year);
                } catch (Exception e) {
                    SpiderDebug.log(e);
                }
            }
            if (!rule.getDetailArea().isEmpty()) {
                try {
                    area = vodNode.selOne(rule.getDetailArea()).asString().trim();
                    area = rule.getDetailAreaR(area);
                } catch (Exception e) {
                    SpiderDebug.log(e);
                }
            }
            if (!rule.getDetailMark().isEmpty()) {
                try {
                    remark = vodNode.selOne(rule.getDetailMark()).asString().trim();
                    remark = rule.getDetailMarkR(remark);
                } catch (Exception e) {
                    SpiderDebug.log(e);
                }
            }
            if (!rule.getDetailActor().isEmpty()) {
                try {
                    actor = vodNode.selOne(rule.getDetailActor()).asString().trim();
                    actor = rule.getDetailActorR(actor);
                } catch (Exception e) {
                    SpiderDebug.log(e);
                }
            }
            if (!rule.getDetailDirector().isEmpty()) {
                try {
                    director = vodNode.selOne(rule.getDetailDirector()).asString().trim();
                    director = rule.getDetailDirectorR(director);
                } catch (Exception e) {
                    SpiderDebug.log(e);
                }
            }
            if (!rule.getDetailDesc().isEmpty()) {
                try {
                    desc = vodNode.selOne(rule.getDetailDesc()).asString().trim();
                    desc = rule.getDetailDescR(desc);
                } catch (Exception e) {
                    SpiderDebug.log(e);
                }
            }

            JSONObject vod = new JSONObject();
            vod.put("vod_id", ids.get(0));
            vod.put("vod_name", title);
            vod.put("vod_pic", cover);
            vod.put("type_name", category);
            vod.put("vod_year", year);
            vod.put("vod_area", area);
            vod.put("vod_remarks", remark);
            vod.put("vod_actor", actor);
            vod.put("vod_director", director);
            vod.put("vod_content", desc);

            ArrayList<String> playFrom = new ArrayList<>();
            String configScriptTagSrc = doc.selNOne("//script[contains(@src, 'configs.js')]/@src").asString();
            Integer realId = Integer.parseInt(configScriptTagSrc.substring(configScriptTagSrc.indexOf("?mid=") + 5));
            SpiderDebug.log(realId.toString());

            JSONObject result = new JSONObject();
            JSONObject reqObj = new JSONObject();
            reqObj.put("id", realId);
            OkHttpUtil.postJson(OkHttpUtil.defaultClient(), rule.getHomeUrl() + "mfiles",
                    reqObj.toString(), getHeaders(), new OKCallBack.OKCallBackString() {
                @Override
                public void onFailure(Call call, Exception e) {
                }

                @Override
                public void onResponse(String response) {
                    try {
                        result.put("result", new JSONObject(response));
                    } catch (JSONException e) {
                    }
                }
            });

            playFrom.add("选集");
            SpiderDebug.log(result.toString());
            JSONArray listArr = result.getJSONObject("result").getJSONArray("list");
            ArrayList<String> playList = new ArrayList<>();
            List<String> vodItems = new ArrayList<>();
            for (int i = 0; i < listArr.length(); i++) {
                JSONObject vItem = listArr.getJSONObject(i);
                String key = (String.valueOf(vItem.getInt("id")) + realId);
                key = "0000000000000000".substring(0, key.length()) + key;
                String decryptedLink = decrypt(key, vItem.getString("src"));
                StringBuilder localUrlBd = new StringBuilder();
                localUrlBd.append(Proxy.localProxyUrl());
                localUrlBd.append("?do=gaze&type=m3u8&url=");
                localUrlBd.append("aHR0cDovL3dkb2MtNzUzODkucGljZ3pjLnFwaWMuY24vTVRNeE1ESTJOek0wTlRnMU5ETTROemtfNDMxMTM5X1dhYjgxYndwMmhaQkVpRmVfMTY0ODQ3ODcxOQ==");
                //localUrlBd.append(Base64.encodeToString(decryptedLink.getBytes(Misc.Iso8859_1), 10));
                vodItems.add(vItem.getString("name") + "$" + localUrlBd.toString());
            }
            playList.add(TextUtils.join("#", vodItems));
            String vod_play_from = TextUtils.join("$$$", playFrom);
            String vod_play_url = TextUtils.join("$$$", playList);
            vod.put("vod_play_from", vod_play_from);
            vod.put("vod_play_url", vod_play_url);

            detailContentExt(webContent, vod);

            JSONObject returnedObj = new JSONObject();
            JSONArray list = new JSONArray();
            list.put(vod);
            returnedObj.put("list", list);
            return returnedObj.toString();
        } catch (Exception e) {
            SpiderDebug.log(e.getMessage());
            for (StackTraceElement traceEl : e.getStackTrace()) {
                SpiderDebug.log(traceEl.toString());
            }
        }
        return "";
    }

    protected HashMap<String, String> getHeaders() {
        HashMap<String, String> headers = new HashMap<>();
        headers.put("X-Requested-With", "XMLHttpRequest");
        headers.put("User-Agent", rule.getUa().isEmpty()
                ? "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/94.0.4606.54 Safari/537.36"
                : rule.getUa());
        return headers;
    }

    public static Object[] vod(Map<String, String> map) {
        String str = (String) map.get("type");
        String str2 = new String(Base64.decode((String) map.get("url"), 10), Misc.Iso8859_1);
        if (str.equals("m3u8")) {
            return ChangeM3U8(str2);
        }
        if (str.equals("key")) {
            return GetTsData(str2);
        }
        return null;
    }

    static Object[] ChangeM3U8(String str) {
        try {
            String m3u8Data = OkHttpUtil.string(str, null);
            StringBuilder mainStr = new StringBuilder();
            Matcher matcher = xKeyPattern.matcher(m3u8Data);
            int i = 0;
            while (matcher.find()) {
                mainStr.append(m3u8Data, i, matcher.start());
                StringBuilder linkStr = new StringBuilder();
                linkStr.append(Proxy.localProxyUrl());
                linkStr.append("?do=gaze&type=key&url=");
                String imageLink = matcher.group(0);
                linkStr.append(Base64.encodeToString(imageLink.getBytes(Misc.Iso8859_1), 10));
                mainStr.append(linkStr.toString());
                i = matcher.end();
            }
            mainStr.append(m3u8Data, i, m3u8Data.length());
            String proxiedM3U8 = mainStr.toString();
            return new Object[]{Integer.valueOf(200), "application/x-mpegURL", new ByteArrayInputStream(proxiedM3U8.getBytes(Misc.Iso8859_1))};
        }catch(Exception ex) {
            StringWriter sw = new StringWriter();
            PrintWriter pw = new PrintWriter(sw);
            ex.printStackTrace(pw);
            SpiderDebug.log(ex.getMessage());
            SpiderDebug.log(sw.toString());
        }
        return null;
    }

    @TargetApi(Build.VERSION_CODES.KITKAT)
    static Object[] GetTsData(String str) {
        try {
            SpiderDebug.log("I'm here");

            OKCallBack<Response> okCB = new OKCallBack.OKCallBackDefault() {
                public void onFailure(Call call, Exception exception) {
                }

                public void onResponse(Response response) {
                }
            };
            OkHttpUtil.get(OkHttpUtil.defaultClient(), str, null, null, okCB);
            Response resp = okCB.getResult();
            if (resp.code() != 200) {
                return null;
            }

            InputStream data = resp.body().byteStream();
            data.skip(125);

            return new Object[]{Integer.valueOf(200), "application/octet-stream", data};
        }catch (Exception ex) {
            StringWriter sw = new StringWriter();
            PrintWriter pw = new PrintWriter(sw);
            ex.printStackTrace(pw);
            SpiderDebug.log(ex.getMessage());
            SpiderDebug.log(sw.toString());
        }
        return null;
    }

    @TargetApi(Build.VERSION_CODES.KITKAT)
    private String decrypt(String key, String str) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            IvParameterSpec iv = new IvParameterSpec("1234567890123456".getBytes(StandardCharsets.UTF_8));
            byte[] keyInByte = key.getBytes(StandardCharsets.UTF_8);
            SecretKey originalKey = new SecretKeySpec(keyInByte, 0, keyInByte.length, "AES");
            cipher.init(Cipher.DECRYPT_MODE, originalKey, iv);
            byte[] plainText = cipher.doFinal(Base64.decode(str, 0));
            return new String(plainText);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }
}
