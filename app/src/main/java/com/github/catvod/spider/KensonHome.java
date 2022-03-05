package com.github.catvod.spider;

import android.content.Context;

import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.crawler.SpiderReqResult;
import com.github.catvod.utils.Misc;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.seimicrawler.xpath.JXDocument;
import org.seimicrawler.xpath.JXNode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class KensonHome extends XPathFilter {

    private Duboku duboku = new Duboku();
    private XPathMacFilter tvb = new XPathMacFilter();
    private Imaple imaple = new Imaple();

    @Override
    public void init(Context context, String extend) {
        super.init(context, extend);
        fetchRule();
        duboku.init(context, rule.getHomeUrl() + "/duboku");
        tvb.init(context, rule.getHomeUrl() + "/tvb");
        imaple.init(context);
    }

    @Override
    public String homeContent(boolean filter) {
        fetchRule();
        duboku.fetchRule();
        tvb.fetchRule();
        JSONObject result = new JSONObject();
        JSONArray classes = new JSONArray();
        try {
            JSONObject cateTVB = new JSONObject();
            cateTVB.put("type_id", "!tvb!-USA_AllDramas");
            cateTVB.put("type_name", "TVB");
            classes.put(cateTVB);

            JSONObject cateTVBVariety = new JSONObject();
            cateTVBVariety.put("type_id", "!tvb!-USA_GP_Variety");
            cateTVBVariety.put("type_name", "香港综艺");
            classes.put(cateTVBVariety);

            JSONObject cateTVBDaily = new JSONObject();
            cateTVBDaily.put("type_id", "!tvb!-USA_GP_News");
            cateTVBDaily.put("type_name", "香港时事");
            classes.put(cateTVBDaily);

            JSONObject cateTVBSP = new JSONObject();
            cateTVBSP.put("type_id", "!tvb!-USA_SpecialProgram");
            cateTVBSP.put("type_name", "特备节目");
            classes.put(cateTVBSP);

            JSONObject cateDuboku2 = new JSONObject();
            cateDuboku2.put("type_id", "!duboku!-2");
            cateDuboku2.put("type_name", "连续剧");
            classes.put(cateDuboku2);

            JSONObject cateDuboku3 = new JSONObject();
            cateDuboku3.put("type_id", "!duboku!-3");
            cateDuboku3.put("type_name", "大陆综艺");
            classes.put(cateDuboku3);

            JSONObject cateImaple = new JSONObject();
            cateImaple.put("type_id", "!imaple!-1");
            cateImaple.put("type_name", "电影");
            classes.put(cateImaple);

            result.put("class", classes);

            JSONArray finalList = new JSONArray();
            JSONArray tvbList = new JSONObject(tvb.homeContent(false)).getJSONArray("list");
            this.replaceVid(tvbList, finalList, "!tvb!-", 56);
            JSONArray dubokuList = new JSONObject(duboku.homeContent(false)).getJSONArray("list");
            this.replaceVid(dubokuList, finalList, "!duboku!-", 17);
            JSONArray imapleList = new JSONObject(imaple.categoryContent("1", "1", false, null)).getJSONArray("list");
            this.replaceVid(imapleList, finalList, "!imaple!-", imapleList.length());
            result.put("list", finalList);
            if (filter && rule.getFilter() != null) {
                result.put("filters", rule.getFilter());
            }
            String resultJson = result.toString();
            return resultJson;
        } catch (JSONException e) {
            SpiderDebug.log(e);
        }
        return result.toString();
    }

    @Override
    public String homeVideoContent() {
        try {
            fetchRule();
            duboku.fetchRule();
            tvb.fetchRule();
        } catch (Exception e) {
            SpiderDebug.log(e);
        }
        return "";
    }

    @Override
    public String categoryContent(String tid, String pg, boolean filter, HashMap<String, String> extend) {
        fetchRule();
        try {
            String webId = "";
            String returnedStr = "";
            if(tid.startsWith("!tvb!")) {
                if (extend != null && extend.size() > 0 && extend.containsKey("cateId") && extend.get("cateId").length() > 0) {
                    extend.put("cateId", extend.get("cateId").replace("!tvb!-", ""));
                }
                if(pg.equals("2")) {
                    JSONObject fakeResult = new JSONObject();
                    fakeResult.put("page", pg);
                    fakeResult.put("pagecount", Integer.MAX_VALUE);
                    fakeResult.put("limit", 90);
                    fakeResult.put("total", Integer.MAX_VALUE);
                    fakeResult.put("list", new JSONObject[0]);
                    returnedStr = fakeResult.toString();
                } else
                    returnedStr = tvb.categoryContent(tid.replace("!tvb!-",""), pg, filter, extend);
                webId = "!tvb!-";
            } else if(tid.startsWith("!duboku!")) {
                if (extend != null && extend.size() > 0 && extend.containsKey("cateId") && extend.get("cateId").length() > 0) {
                    extend.put("cateId", extend.get("cateId").replace("!duboku!-", ""));
                }
                returnedStr = duboku.categoryContent(tid.replace("!duboku!-", ""), pg, filter, extend);
                webId = "!duboku!-";
            } else if(tid.startsWith("!imaple!")) {
                if (extend != null && extend.size() > 0 && extend.containsKey("tid") && extend.get("tid").length() > 0) {
                    extend.put("tid", extend.get("tid").replace("!imaple!-", ""));
                }
                returnedStr = imaple.categoryContent(tid.replace("!imaple!-", ""), pg, filter, extend);
                webId = "!imaple!-";
            }
            JSONObject returnedObj = new JSONObject(returnedStr);
            JSONArray list = returnedObj.getJSONArray("list");
            this.replaceVid(list, null, webId, list.length());
            returnedObj.put("list", list);
            return returnedObj.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
        }
        return "";
    }

    @Override
    public String detailContent(List<String> ids) {
        try {
            String webId = "";
            String returnedStr = "";
            if(ids.get(0).startsWith("!tvb!")) {
                ids.set(0, ids.get(0).replace("!tvb!-", ""));
                returnedStr = tvb.detailContent(ids);
                webId = "!tvb!-";
            } else if(ids.get(0).startsWith("!duboku!")) {
                ids.set(0, ids.get(0).replace("!duboku!-", ""));
                returnedStr = duboku.detailContent(ids);
                webId = "!duboku!-";
            } else if(ids.get(0).startsWith("!imaple!")) {
                ids.set(0, ids.get(0).replace("!imaple!-", ""));
                returnedStr = imaple.detailContent(ids);
                webId = "!imaple!-";
            }
            returnedStr = returnedStr.replace("$", "$" + webId)
                .replace("$" + webId +"$" + webId +"$" + webId, "$$$");
            SpiderDebug.log(returnedStr);
            return returnedStr;
        } catch (Exception e) {
            SpiderDebug.log(e);
        }
        return "";
    }

    @Override
    public String playerContent(String flag, String id, List<String> vipFlags) {
        try {
            String webId = "";
            String returnedStr = "";
            SpiderDebug.log(id);
            if(id.startsWith("!tvb!")) {
                return tvb.playerContent(flag, id.replace("!tvb!-", ""), vipFlags);
            } else if(id.startsWith("!duboku!")) {
                return duboku.playerContent(flag, id.replace("!duboku!-", ""), vipFlags);
            } else if(id.startsWith("!imaple!")) {
                return imaple.playerContent(flag, id.replace("!imaple!-", ""), vipFlags);
            }
        } catch (Exception e) {
            SpiderDebug.log(e);
        }
        return "";
    }

    private void replaceVid(JSONArray arr, JSONArray targetArr, String webName, int take) throws JSONException {
        for (int i = 0; i < take && i < arr.length(); i++) {
            JSONObject vodObj = arr.getJSONObject(i);
            vodObj.put("vod_id", webName + vodObj.get("vod_id"));
            if(targetArr != null)
                targetArr.put(vodObj);
        }
    }
}
