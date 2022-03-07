package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;

import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.crawler.SpiderReq;
import com.github.catvod.crawler.SpiderReqResult;
import com.github.catvod.utils.Misc;

import org.json.JSONException;
import org.json.JSONObject;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Duboku extends XPathFilter {

    public void init(Context context, String extend) {
        super.init(context, extend);
    }

    @Override
    public String playerContent(String flag, String id, List<String> vipFlags) {
        fetchRule();
        String webUrl = rule.getPlayUrl().isEmpty() ? id : rule.getPlayUrl().replace("{playUrl}", id);
        String videoUrl = null;
        // 尝试分析直连
        try {
            Document doc = Jsoup.parse(fetch(webUrl));
            Elements allScript = doc.select("script");
            for (int i = 0; i < allScript.size(); i++) {
                String scContent = allScript.get(i).html().trim();
                if (scContent.startsWith("var player_")) {
                    int start = scContent.indexOf('{');
                    int end = scContent.lastIndexOf('}') + 1;
                    String json = scContent.substring(start, end);
                    JSONObject player = new JSONObject(json);
                    videoUrl = player.getString("url");
                    break;
                }
            }
        } catch (Exception e) {
            SpiderDebug.log(e);
        }
        if (videoUrl != null && isVideoFormat(videoUrl)) {
            try {
                JSONObject headers = new JSONObject();
                headers.put("origin", "https://tv.gboku.com/");
                headers.put("User-Agent", " Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.114 Safari/537.36");
                headers.put("referer", " https://tv.gboku.com/");
                JSONObject result = new JSONObject();
                result.put("parse", 0);
                result.put("playUrl", "");
                result.put("url", videoUrl);
                result.put("header", headers.toString());
                return result.toString();
            } catch (Exception e) {
                SpiderDebug.log(e);
            }
        }
        // 上述都失败了就按默认模式走
        return super.playerContent(flag, id, vipFlags);
    }
}
