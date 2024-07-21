package com.github.catvod.spider.merge;

import java.util.Arrays;
import java.util.regex.Pattern;

/* renamed from: com.github.catvod.spider.merge.ma  reason: case insensitive filesystem */
/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public final class C0156ma {
    public static final /* synthetic */ int a = 0;

    static {
        Arrays.asList("mp4", "mkv", "wmv", "flv", "avi", "mp3", "aac", "flac", "m4a", "ape", "ogg");
        Pattern.compile("http((?!http).){12,}?\\.(m3u8|mp4|flv|avi|mkv|rm|wmv|mpg|m4a|mp3)\\?.*|http((?!http).){12,}\\.(m3u8|mp4|flv|avi|mkv|rm|wmv|mpg|m4a|mp3)|http((?!http).)*?video/tos*");
    }
}
