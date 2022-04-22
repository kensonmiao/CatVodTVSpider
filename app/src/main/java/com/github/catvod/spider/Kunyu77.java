//
// Decompiled by Jadx (from NP Manager)
//
package com.github.catvod.spider;

import android.os.Build;
import android.os.Build.VERSION;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.utils.Misc;
import com.github.catvod.utils.okhttp.OkHttpUtil;

import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class Kunyu77 extends Spider {
    private String X;

    public String homeContent(boolean z) {
        JSONArray jSONArray = null;
        Throwable e;
        Object obj;
        Object obj2;
        String str;
        JSONArray jSONArray2;
        JSONObject jSONObject;
        Kunyu77 kunyu77 = this;
        Object obj3 = "2021";
        Object obj4 = "2022";
        String str2 = "data";
        String str3 = "全部";
        String str4 = "key";
        String str5 = "";
        String str6 = "name";
        String str7 = "v";
        String str8 = "n";
        try {
            String str9 = "http://api.kunyu77.com/api.php/provide/filter";
            JSONObject jSONObject2 = new JSONObject(kunyu77.X(OkHttpUtil.string(str9, kunyu77.K(str9)))).getJSONObject(str2);
            Iterator keys = jSONObject2.keys();
            JSONArray jSONArray3 = new JSONArray();
            JSONObject jSONObject3 = new JSONObject();
            JSONArray jSONArray4 = null;
            while (keys.hasNext()) {
                str9 = (String) keys.next();
                Iterator it = keys;
                JSONObject jSONObject4 = jSONObject2;
                String string = jSONObject2.getJSONArray(str9).getJSONObject(0).getString("cat");
                JSONObject jSONObject5 = new JSONObject();
                JSONObject jSONObject6 = jSONObject3;
                jSONObject5.put("type_id", str9);
                jSONObject5.put("type_name", string);
                jSONArray3.put(jSONObject5);
                if (jSONArray4 == null) {
                    try {
                        string = "http://api.kunyu77.com/api.php/provide/searchFilter?type_id=0&pagenum=1&pagesize=1";
                        jSONObject2 = new JSONObject(OkHttpUtil.string(string, kunyu77.K(string))).getJSONObject(str2).getJSONObject("conditions");
                        jSONArray = new JSONArray();
                    } catch (Exception e2) {
                        e = e2;
                        obj = obj3;
                        obj2 = obj4;
                        str = str2;
                        jSONArray2 = jSONArray3;
                        jSONObject = jSONObject6;
                        SpiderDebug.log(e);
                        jSONObject3 = jSONObject;
                        keys = it;
                        jSONObject2 = jSONObject4;
                        obj3 = obj;
                        obj4 = obj2;
                        str2 = str;
                        jSONArray3 = jSONArray2;
                        kunyu77 = this;
                    }
                    try {
                        JSONObject jSONObject7 = null;
                        JSONArray jSONArray5 = null;
                        jSONObject3 = new JSONObject();
                        jSONObject3.put(str4, "year");
                        jSONObject3.put(str6, "年份");
                        jSONArray4 = new JSONArray();
                        jSONObject = new JSONObject();
                        jSONObject.put(str8, str3);
                        jSONObject.put(str7, str5);
                        jSONArray4.put(jSONObject);
                        jSONObject = new JSONObject();
                        jSONObject.put(str8, obj4);
                        jSONObject.put(str7, obj4);
                        jSONArray4.put(jSONObject);
                        jSONObject = new JSONObject();
                        jSONObject.put(str8, obj3);
                        jSONObject.put(str7, obj3);
                        jSONArray4.put(jSONObject);
                        JSONArray jSONArray6 = jSONObject2.getJSONArray("y");
                        obj = obj3;
                        obj2 = obj4;
                        int i = 0;
                        while (true) {
                            try {
                                str = str2;
                                str2 = "value";
                                if (i >= jSONArray6.length()) {
                                    break;
                                }
                                try {
                                    jSONObject7 = jSONArray6.getJSONObject(i);
                                    jSONArray5 = jSONArray6;
                                    jSONObject = new JSONObject();
                                    jSONArray2 = jSONArray3;
                                } catch (Exception e3) {
                                    e = e3;
                                    jSONArray2 = jSONArray3;
                                    jSONArray4 = jSONArray;
                                    jSONObject = jSONObject6;
                                    SpiderDebug.log(e);
                                    jSONObject3 = jSONObject;
                                    keys = it;
                                    jSONObject2 = jSONObject4;
                                    obj3 = obj;
                                    obj4 = obj2;
                                    str2 = str;
                                    jSONArray3 = jSONArray2;
                                    kunyu77 = this;
                                }
                                try {
                                    jSONObject.put(str8, jSONObject7.getString(str6));
                                    jSONObject.put(str7, jSONObject7.getString(str2));
                                    jSONArray4.put(jSONObject);
                                    i++;
                                    str2 = str;
                                    jSONArray6 = jSONArray5;
                                    jSONArray3 = jSONArray2;
                                } catch (Exception e4) {
                                    e = e4;
                                    jSONArray4 = jSONArray;
                                    jSONObject = jSONObject6;
                                    SpiderDebug.log(e);
                                    jSONObject3 = jSONObject;
                                    keys = it;
                                    jSONObject2 = jSONObject4;
                                    obj3 = obj;
                                    obj4 = obj2;
                                    str2 = str;
                                    jSONArray3 = jSONArray2;
                                    kunyu77 = this;
                                }
                            } catch (Exception e5) {
                                e = e5;
                                str = str2;
                                jSONArray2 = jSONArray3;
                                jSONArray4 = jSONArray;
                                jSONObject = jSONObject6;
                                SpiderDebug.log(e);
                                jSONObject3 = jSONObject;
                                keys = it;
                                jSONObject2 = jSONObject4;
                                obj3 = obj;
                                obj4 = obj2;
                                str2 = str;
                                jSONArray3 = jSONArray2;
                                kunyu77 = this;
                            }
                        }
                        jSONArray2 = jSONArray3;
                        jSONObject3.put(str2, jSONArray4);
                        jSONArray.put(jSONObject3);
                        jSONObject = new JSONObject();
                        jSONObject.put(str4, "area");
                        jSONObject.put(str6, "地区");
                        JSONArray jSONArray7 = new JSONArray();
                        jSONObject7 = new JSONObject();
                        jSONObject7.put(str8, str3);
                        jSONObject7.put(str7, str5);
                        jSONArray7.put(jSONObject7);
                        JSONArray jSONArray8 = jSONObject2.getJSONArray("a");
                        int i2 = 0;
                        while (i2 < jSONArray8.length()) {
                            jSONObject3 = jSONArray8.getJSONObject(i2);
                            JSONObject jSONObject8 = new JSONObject();
                            jSONArray5 = jSONArray8;
                            jSONObject8.put(str8, jSONObject3.getString(str6));
                            jSONObject8.put(str7, jSONObject3.getString(str2));
                            jSONArray7.put(jSONObject8);
                            i2++;
                            jSONArray8 = jSONArray5;
                        }
                        jSONObject.put(str2, jSONArray7);
                        jSONArray.put(jSONObject);
                        jSONObject = new JSONObject();
                        jSONObject.put(str4, "category");
                        jSONObject.put(str6, "类型");
                        jSONArray7 = new JSONArray();
                        jSONObject7 = new JSONObject();
                        jSONObject7.put(str8, str3);
                        jSONObject7.put(str7, str5);
                        jSONArray7.put(jSONObject7);
                        jSONArray8 = jSONObject2.getJSONArray("scat");
                        for (int i3 = 0; i3 < jSONArray8.length(); i3++) {
                            JSONObject jSONObject9 = jSONArray8.getJSONObject(i3);
                            jSONObject3 = new JSONObject();
                            jSONObject3.put(str8, jSONObject9.getString(str6));
                            jSONObject3.put(str7, jSONObject9.getString(str2));
                            jSONArray7.put(jSONObject3);
                        }
                        jSONObject.put(str2, jSONArray7);
                        jSONArray.put(jSONObject);
                        jSONArray4 = jSONArray;
                    } catch (Exception e6) {
                        e = e6;
                        obj = obj3;
                        obj2 = obj4;
                        str = str2;
                        jSONArray2 = jSONArray3;
                        jSONArray4 = jSONArray;
                        jSONObject = jSONObject6;
                        SpiderDebug.log(e);
                        jSONObject3 = jSONObject;
                        keys = it;
                        jSONObject2 = jSONObject4;
                        obj3 = obj;
                        obj4 = obj2;
                        str2 = str;
                        jSONArray3 = jSONArray2;
                        kunyu77 = this;
                    }
                } else {
                    obj = obj3;
                    obj2 = obj4;
                    str = str2;
                    jSONArray2 = jSONArray3;
                }
                try {
                    if (jSONArray4.length() > 0) {
                        jSONObject = jSONObject6;
                        try {
                            jSONObject.put(str9, jSONArray4);
                        } catch (Exception e7) {
                            e = e7;
                        }
                    } else {
                        jSONObject = jSONObject6;
                    }
                } catch (Exception e8) {
                    e = e8;
                    jSONObject = jSONObject6;
                    SpiderDebug.log(e);
                    jSONObject3 = jSONObject;
                    keys = it;
                    jSONObject2 = jSONObject4;
                    obj3 = obj;
                    obj4 = obj2;
                    str2 = str;
                    jSONArray3 = jSONArray2;
                    kunyu77 = this;
                }
                jSONObject3 = jSONObject;
                keys = it;
                jSONObject2 = jSONObject4;
                obj3 = obj;
                obj4 = obj2;
                str2 = str;
                jSONArray3 = jSONArray2;
                kunyu77 = this;
            }
            jSONArray2 = jSONArray3;
            jSONObject = jSONObject3;
            JSONObject jSONObject10 = new JSONObject();
            jSONObject10.put("class", jSONArray2);
            if (z) {
                jSONObject10.put("filters", jSONObject);
            }
            return jSONObject10.toString();
        } catch (Throwable unused) {
            return str5;
        }
    }

    public String detailContent(List<String> list) {
        List<String> list2 = list;
        String str = "$$$";
        String str2 = "data";
        String str3 = "";
        try {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("http://api.kunyu77.com/api.php/provide/videoDetail?ids=");
            stringBuilder.append((String) list2.get(0));
            String stringBuilder2 = stringBuilder.toString();
            JSONObject jSONObject = new JSONObject(X(OkHttpUtil.string(stringBuilder2, K(stringBuilder2)))).getJSONObject(str2);
            JSONObject jSONObject2 = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject3 = new JSONObject();
            String string = jSONObject.getString("videoName");
            jSONObject3.put("vod_id", jSONObject.getString("id"));
            jSONObject3.put("vod_name", string);
            jSONObject3.put("vod_pic", jSONObject.getString("videoCover"));
            jSONObject3.put("type_name", jSONObject.getString("subCategory"));
            jSONObject3.put("vod_year", jSONObject.getString("year"));
            jSONObject3.put("vod_area", jSONObject.getString("area"));
            jSONObject3.put("vod_remarks", jSONObject.getString("msg"));
            jSONObject3.put("vod_actor", jSONObject.getString("actor"));
            jSONObject3.put("vod_director", jSONObject.getString("director"));
            jSONObject3.put("vod_content", jSONObject.getString("brief").trim());
            stringBuilder = new StringBuilder();
            stringBuilder.append("http://api.kunyu77.com/api.php/provide/videoPlaylist?ids=");
            stringBuilder.append((String) list2.get(0));
            String stringBuilder3 = stringBuilder.toString();
            JSONArray jSONArray2 = new JSONObject(OkHttpUtil.string(stringBuilder3, K(stringBuilder3))).getJSONObject(str2).getJSONArray("episodes");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (int i = 0; i < jSONArray2.length(); i++) {
                JSONArray jSONArray3 = jSONArray2.getJSONObject(i).getJSONArray("playurls");
                for (int i2 = 0; i2 < jSONArray3.length(); i2++) {
                    JSONObject jSONObject4 = jSONArray3.getJSONObject(i2);
                    String string2 = jSONObject4.getString("playfrom");
                    ArrayList arrayList = (ArrayList) linkedHashMap.get(string2);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        linkedHashMap.put(string2, arrayList);
                    }
                    string2 = jSONObject4.getString("title").replace(string, str3).trim();
                    if (string2.isEmpty()) {
                        StringBuilder stringBuilder4 = new StringBuilder();
                        stringBuilder4.append(i + 1);
                        stringBuilder4.append(str3);
                        string2 = stringBuilder4.toString();
                    }
                    String string3 = jSONObject4.getString("playurl");
                    StringBuilder stringBuilder5 = new StringBuilder();
                    stringBuilder5.append(string2);
                    stringBuilder5.append("$");
                    stringBuilder5.append(string3);
                    arrayList.add(stringBuilder5.toString());
                }
            }
            stringBuilder3 = TextUtils.join(str, linkedHashMap.keySet());
            stringBuilder = new StringBuilder();
            int size = (short) linkedHashMap.size();
            for (Object join : linkedHashMap.values()) {
                size = (short) (size - 1);
                stringBuilder.append(TextUtils.join("#", (ArrayList)join));
                if (size > 0) {
                    stringBuilder.append(str);
                }
            }
            jSONObject3.put("vod_play_from", stringBuilder3);
            jSONObject3.put("vod_play_url", stringBuilder.toString());
            jSONArray.put(jSONObject3);
            jSONObject2.put("list", jSONArray);
            return jSONObject2.toString();
        } catch (Throwable unused) {
            return str3;
        }
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> hashMap) {
        String str3 = "total";
        String str4 = "page";
        try {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("http://api.kunyu77.com/api.php/provide/searchFilter?type_id=");
            stringBuilder.append(str);
            stringBuilder.append("&pagenum=");
            stringBuilder.append(str2);
            stringBuilder.append("&pagesize=24");
            str = stringBuilder.toString();
            for (String str5 : hashMap.keySet()) {
                String trim = ((String) hashMap.get(str5)).trim();
                if (trim.length() != 0) {
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append(str);
                    stringBuilder2.append("&");
                    stringBuilder2.append(str5);
                    stringBuilder2.append("=");
                    stringBuilder2.append(URLEncoder.encode(trim));
                    str = stringBuilder2.toString();
                }
            }
            JSONObject jSONObject = new JSONObject(X(OkHttpUtil.string(str, K(str)))).getJSONObject("data");
            JSONArray jSONArray = jSONObject.getJSONArray("result");
            JSONArray jSONArray2 = new JSONArray();
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("vod_id", jSONObject2.getString("id"));
                jSONObject3.put("vod_name", jSONObject2.getString("title"));
                jSONObject3.put("vod_pic", jSONObject2.getString("videoCover"));
                jSONObject3.put("vod_remarks", jSONObject2.getString("msg"));
                jSONArray2.put(jSONObject3);
            }
            JSONObject jSONObject4 = new JSONObject();
            int parseInt = Integer.parseInt(jSONObject.getString(str4));
            int i2 = jSONObject.getInt(str3);
            int i3 = jSONObject.getInt("pagesize");
            jSONObject4.put(str4, parseInt);
            jSONObject4.put("pagecount", i3);
            jSONObject4.put("limit", 24);
            jSONObject4.put(str3, i2);
            jSONObject4.put("list", jSONArray2);
            return jSONObject4.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    public String searchContent(String str, boolean z) {
        String str2 = "";
        if (z) {
            return str2;
        }
        try {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("http://api.kunyu77.com/api.php/provide/searchVideo?searchName=");
            stringBuilder.append(URLEncoder.encode(str));
            String stringBuilder2 = stringBuilder.toString();
            JSONArray jSONArray = new JSONObject(X(OkHttpUtil.string(stringBuilder2, K(stringBuilder2)))).getJSONArray("data");
            JSONArray jSONArray2 = new JSONArray();
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                JSONObject jSONObject2 = new JSONObject();
                String string = jSONObject.getString("videoName");
                if (string.contains(str)) {
                    jSONObject2.put("vod_id", jSONObject.getString("id"));
                    jSONObject2.put("vod_name", string);
                    jSONObject2.put("vod_pic", jSONObject.getString("videoCover"));
                    jSONObject2.put("vod_remarks", jSONObject.getString("msg"));
                    jSONArray2.put(jSONObject2);
                }
            }
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("list", jSONArray2);
            return jSONObject3.toString();
        } catch (Throwable unused) {
            return str2;
        }
    }

    public Kunyu77() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Dalvik/2.1.0 (Linux; U; Android ");
        stringBuilder.append(VERSION.RELEASE);
        stringBuilder.append("; ");
        stringBuilder.append(Build.MODEL);
        stringBuilder.append(" Build/");
        stringBuilder.append(Build.ID);
        stringBuilder.append(")");
        this.X = stringBuilder.toString();
    }

    private HashMap<String, String> K(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("user-agent", this.X);
        return hashMap;
    }

    protected String X(String str) {
        return str;
    }

    public String homeVideoContent() {
        try {
            JSONObject jSONObject;
            JSONArray jSONArray = new JSONArray();
            try {
                String string = OkHttpUtil.string("http://api.kunyu77.com/api.php/provide/homeBlock?type_id=0",
                        this.K("http://api.kunyu77.com/api.php/provide/homeBlock?type_id=0"));
                jSONObject = new JSONObject(this.X(string));
                JSONArray subJSONArray = jSONObject.getJSONObject("data").getJSONArray("blocks");
                for (int i = 0; i < subJSONArray.length(); ++i) {
                    JSONObject subArrJSONObj = subJSONArray.getJSONObject(i);
                    if (!subArrJSONObj.getString("block_name").startsWith("\u70ed\u64ad")) continue;
                    JSONArray jSONArray2 = subArrJSONObj.getJSONArray("contents");
                    for (int j = 0; j < jSONArray2.length() && j < 3; ++j) {
                        JSONObject jSONObject2 = jSONArray2.getJSONObject(j);
                        JSONObject returnedObj = new JSONObject();
                        returnedObj.put("vod_id", (Object)jSONObject2.getString("id"));
                        returnedObj.put("vod_name", (Object)jSONObject2.getString("title"));
                        returnedObj.put("vod_pic", (Object)jSONObject2.getString("videoCover"));
                        returnedObj.put("vod_remarks", (Object)jSONObject2.getString("msg"));
                        jSONArray.put((Object)returnedObj);
                    }
                }
            }
            catch (Exception exception) {}
            jSONObject = new JSONObject();
            jSONObject.put("list", (Object)jSONArray);
            return jSONObject.toString();
        }
        catch (Throwable throwable) {
            return "";
        }
    }

    public String playerContent(String flag, String id, List<String> vipFlags) {
        try {
            StringBuilder string = new StringBuilder();
            string.append("http://api.kunyu77.com/api.php/provide/parserUrl?url=");
            string.append(id);
            String urlString = string.toString();
            String string3 = OkHttpUtil.string(urlString, this.K(urlString));
            JSONObject backData = new JSONObject(this.X(string3));
            JSONObject jSONObject = backData.getJSONObject("data");
            JSONObject playHeader = jSONObject.optJSONObject("playHeader");
            String string4 = jSONObject.getString("url");
            JSONObject jSONObject2 = Misc.jsonParse(string4, OkHttpUtil.string(string4, this.K(string4)));
            if (jSONObject2 != null) {
                jSONObject2.put("parse", 0);
                jSONObject2.put("playUrl", (Object)"");
                if (string == null) return jSONObject2.toString();
                JSONObject jSONObject3 = jSONObject2.getJSONObject("header");
                Iterator iterator = backData.keys();
                while (iterator.hasNext()) {
                    String string5 = (String)iterator.next();
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(" ");
                    stringBuilder.append(backData.getString(string5));
                    jSONObject3.put(string5, (Object)stringBuilder.toString());
                }
                jSONObject2.put("header", (Object)jSONObject3.toString());
                return jSONObject2.toString();
            }
        }
        catch (Throwable throwable) {}
        try {
            if (Misc.isVideoFormat(id)) {
                JSONObject returnObj = new JSONObject();
                returnObj.put("parse", 1);
                returnObj.put("jx", (Object)"1");
                returnObj.put("url", id);
                return returnObj.toString();
            }
            JSONObject returnObj = new JSONObject();
            returnObj.put("parse", 0);
            returnObj.put("playUrl", (Object)"");
            returnObj.put("url", (Object)id);
            return returnObj.toString();
        }
        catch (Throwable throwable) {
            return "";
        }
    }
}