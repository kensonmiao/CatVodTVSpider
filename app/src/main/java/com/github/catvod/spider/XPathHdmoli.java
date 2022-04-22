package com.github.catvod.spider;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;

import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.utils.Misc;
import com.github.catvod.utils.okhttp.OKCallBack;
import com.github.catvod.utils.okhttp.OkHttpUtil;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import java.util.regex.Pattern;

import okhttp3.Call;

public class XPathHdmoli extends XPathFilter {

    @Override
    protected void loadRuleExt(String json) {
        try {
            JSONObject jsonObj = new JSONObject(json);
        } catch (JSONException e) {
            SpiderDebug.log(e);
        }
    }

    @Override
    public String playerContent(String flag, String id, List<String> vipFlags) {
        try {
            fetchRule();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(rule.getHomeUrl());
            stringBuilder.append(id);
            String playPage = OkHttpUtil.string(stringBuilder.toString(), null).replaceAll("[\r\n]+", " ");
            String foundData = null;
            try {
                int startPt = playPage.indexOf("var now=");
                int endPt = playPage.indexOf(";var pn");
                if(startPt != 0 && endPt != 0)
                    foundData = playPage.substring(startPt+9, endPt - 1);
            }catch (Exception ex) {
                SpiderDebug.log(ex);
            }
            if(foundData == null)
                return "";

            String[] foundDataWithCaption = foundData.split("\\|");
            SpiderDebug.log("Found： " + foundData);
            String videoJsonStr = OkHttpUtil.string(foundDataWithCaption[0] + "&type=json", null);
            SpiderDebug.log(videoJsonStr);
            JSONObject videoData = new JSONObject(videoJsonStr);

            JSONObject result = new JSONObject();
            result.put("parse", 0);
            if(videoData.has("url")) {
                String url = videoData.getString("url");
                result.put("url", url);
            } else if(videoData.has("pin")) {
                String m3u8Data = decompress(videoData.getString("pin"));
                if(m3u8Data != null) {
                    OutputStreamWriter outputStreamWriter = new OutputStreamWriter(context.openFileOutput("hdmoli_temp.m3u8", Context.MODE_PRIVATE));
                    outputStreamWriter.write(m3u8Data);
                    outputStreamWriter.close();
                    result.put("url", Proxy.localProxyUrl() + "?do=hdmoli_m3u8temp");
                }
            }

            if(foundDataWithCaption.length > 1) {
                result.put("subf", "/vtt/utf-8");
                result.put("subt", foundDataWithCaption[1]);
            }

            if (!rule.getPlayUa().isEmpty()) {
                result.put("ua", rule.getPlayUa());
            }
            return result.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
        }
        return "";
    }

    @TargetApi(Build.VERSION_CODES.KITKAT)
    private String decompress(String str) {
        try {
            byte[] compressedDataInByte = str.getBytes(StandardCharsets.ISO_8859_1);
            byte[] decompressedDataInByte = null;
            Inflater inflater = new Inflater();
            inflater.setInput(compressedDataInByte, 0, compressedDataInByte.length);
            int bufferSizeInBytes = compressedDataInByte.length;
            List<Byte> bytesDecompressedSoFar = new ArrayList<>();
            byte[] bytesDecompressedBuffer = new byte[bufferSizeInBytes];
            try {
                while (inflater.needsInput() == false) {
                    int numberOfBytesDecompressedThisTime = inflater.inflate(bytesDecompressedBuffer);
                    for (int b = 0; b < numberOfBytesDecompressedThisTime; b++) {
                        bytesDecompressedSoFar.add(bytesDecompressedBuffer[b]);
                    }
                }
                decompressedDataInByte = new byte[bytesDecompressedSoFar.size()];
                for (int b = 0; b < decompressedDataInByte.length; b++) {
                    decompressedDataInByte[b] = bytesDecompressedSoFar.get(b);
                }
            } catch (DataFormatException dfe) {
                dfe.printStackTrace();
            }
            inflater.end();
            if(decompressedDataInByte != null)
                return new String(decompressedDataInByte, 0, decompressedDataInByte.length, StandardCharsets.UTF_8);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
        return null;
    }

    public static Object[] GetTempM3U8() {
        Context context = Init.CONTEXT;
        Object[] returnedObj = new Object[3];
        returnedObj[0] = 200;
        returnedObj[1] = "application/x-mpegURL";

        try {
            InputStream inputStream = context.openFileInput("hdmoli_temp.m3u8");
            returnedObj[2] = inputStream;
        }
        catch (Exception e) {
            SpiderDebug.log(e);
        }

        return returnedObj;
    }
}
