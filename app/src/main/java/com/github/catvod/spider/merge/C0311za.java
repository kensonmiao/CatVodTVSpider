package com.github.catvod.spider.merge;

import com.github.catvod.crawler.SpiderDebug;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* renamed from: com.github.catvod.spider.merge.za  reason: case insensitive filesystem */
/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public final class C0311za {
    private String A;
    private String B;
    private String C;
    private String D;
    private Pattern E;
    private String F;
    private Pattern G;
    private String H;
    private Pattern I;
    private String J;
    private Pattern K;
    private String L;
    private Pattern M;
    private String N;
    private Pattern O;
    private String P;
    private Pattern Q;
    private String R;
    private Pattern S;
    private String T;
    private Pattern U;
    private String V;
    private String W;
    private Pattern X;
    private String Y;
    private String Z;
    private String a;
    private String a0;
    private String b;
    private Pattern b0;
    private String c;
    private String c0;
    private String d;
    private Pattern d0;
    private Pattern e;
    private String e0;
    private String f;
    private String f0;
    private Pattern g;
    private String g0;
    private final LinkedHashMap<String, String> h = new LinkedHashMap<>();
    private String h0;
    private JSONObject i;
    private String i0;
    private String j;
    private Pattern j0;
    private String k;
    private String k0;
    private Pattern l;
    private Pattern l0;
    private String m;
    private String m0;
    private Pattern n;
    private Pattern n0;
    private String o;
    private String o0;
    private Pattern p;
    private Pattern p0;
    private String q;
    private Pattern r;
    private String s;
    private String t;
    private String u;
    private Pattern v;
    private String w;
    private Pattern x;
    private String y;
    private Pattern z;

    private static String a(Pattern pattern, String str) {
        if (pattern == null) {
            return str;
        }
        try {
            Matcher matcher = pattern.matcher(str);
            if (matcher.find()) {
                return matcher.group(1).trim();
            }
        } catch (Exception e) {
            SpiderDebug.log(e);
        }
        return str;
    }

    public static C0311za b(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            C0311za c0311za = new C0311za();
            c0311za.a = jSONObject.optString("ua");
            c0311za.b = jSONObject.optString("homeUrl").trim();
            c0311za.c = jSONObject.optString("cateNode").trim();
            c0311za.d = jSONObject.optString("cateName").trim();
            c0311za.e = g0(jSONObject, "cateNameR");
            c0311za.f = jSONObject.optString("cateId").trim();
            c0311za.g = g0(jSONObject, "cateIdR");
            JSONObject optJSONObject = jSONObject.optJSONObject("cateManual");
            if (optJSONObject != null) {
                Iterator<String> keys = optJSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    c0311za.h.put(next.trim(), optJSONObject.getString(next).trim());
                }
            }
            c0311za.i = jSONObject.optJSONObject("filter");
            c0311za.j = jSONObject.optString("homeVodNode").trim();
            c0311za.k = jSONObject.optString("homeVodName").trim();
            c0311za.l = g0(jSONObject, "homeVodNameR");
            c0311za.m = jSONObject.optString("homeVodId").trim();
            c0311za.n = g0(jSONObject, "homeVodIdR");
            c0311za.o = jSONObject.optString("homeVodImg").trim();
            c0311za.p = g0(jSONObject, "homeVodImgR");
            c0311za.q = jSONObject.optString("homeVodMark").trim();
            c0311za.r = g0(jSONObject, "homeVodMarkR");
            c0311za.s = jSONObject.optString("cateUrl").trim();
            c0311za.t = jSONObject.optString("cateVodNode").trim();
            c0311za.u = jSONObject.optString("cateVodName").trim();
            c0311za.v = g0(jSONObject, "cateVodNameR");
            c0311za.w = jSONObject.optString("cateVodId").trim();
            c0311za.x = g0(jSONObject, "cateVodIdR");
            c0311za.y = jSONObject.optString("cateVodImg").trim();
            c0311za.z = g0(jSONObject, "cateVodImgR");
            c0311za.A = jSONObject.optString("cateVodMark").trim();
            g0(jSONObject, "cateVodMarkR");
            c0311za.B = jSONObject.optString("dtUrl");
            c0311za.C = jSONObject.optString("dtNode");
            c0311za.D = jSONObject.optString("dtName");
            c0311za.E = g0(jSONObject, "dtNameR");
            c0311za.F = jSONObject.optString("dtImg");
            c0311za.G = g0(jSONObject, "dtImgR");
            c0311za.H = jSONObject.optString("dtCate");
            c0311za.I = g0(jSONObject, "dtCateR");
            c0311za.J = jSONObject.optString("dtYear");
            c0311za.K = g0(jSONObject, "dtYearR");
            c0311za.L = jSONObject.optString("dtArea");
            c0311za.M = g0(jSONObject, "dtAreaR");
            c0311za.N = jSONObject.optString("dtMark");
            c0311za.O = g0(jSONObject, "dtMarkR");
            c0311za.P = jSONObject.optString("dtActor");
            c0311za.Q = g0(jSONObject, "dtActorR");
            c0311za.R = jSONObject.optString("dtDirector");
            c0311za.S = g0(jSONObject, "dtDirectorR");
            c0311za.T = jSONObject.optString("dtDesc");
            c0311za.U = g0(jSONObject, "dtDescR");
            c0311za.V = jSONObject.optString("dtFromNode");
            c0311za.W = jSONObject.optString("dtFromName");
            c0311za.X = g0(jSONObject, "dtFromNameR");
            c0311za.Y = jSONObject.optString("dtUrlNode");
            c0311za.Z = jSONObject.optString("dtUrlSubNode");
            jSONObject.optInt("dtUrlOrder");
            c0311za.a0 = jSONObject.optString("dtUrlId");
            c0311za.b0 = g0(jSONObject, "dtUrlIdR");
            c0311za.c0 = jSONObject.optString("dtUrlName");
            c0311za.d0 = g0(jSONObject, "dtUrlNameR");
            c0311za.e0 = jSONObject.optString("playUrl");
            c0311za.f0 = jSONObject.optString("playUa");
            c0311za.g0 = jSONObject.optString("searchUrl");
            c0311za.h0 = jSONObject.optString("scVodNode").trim();
            c0311za.i0 = jSONObject.optString("scVodName").trim();
            c0311za.j0 = g0(jSONObject, "scVodNameR");
            c0311za.k0 = jSONObject.optString("scVodId").trim();
            c0311za.l0 = g0(jSONObject, "scVodIdR");
            c0311za.m0 = jSONObject.optString("scVodImg").trim();
            c0311za.n0 = g0(jSONObject, "scVodImgR");
            c0311za.o0 = jSONObject.optString("scVodMark").trim();
            c0311za.p0 = g0(jSONObject, "scVodMarkR");
            return c0311za;
        } catch (Exception e) {
            SpiderDebug.log(e);
            return null;
        }
    }

    private static Pattern g0(JSONObject jSONObject, String str) {
        String trim = jSONObject.optString(str).trim();
        if (trim.isEmpty()) {
            return null;
        }
        try {
            return Pattern.compile(trim);
        } catch (Exception e) {
            SpiderDebug.log(e);
            return null;
        }
    }

    public final String A() {
        return this.R;
    }

    public final String B(String str) {
        return a(this.S, str);
    }

    public final String C() {
        return this.W;
    }

    public final String D(String str) {
        return a(this.X, str);
    }

    public final String E() {
        return this.V;
    }

    public final String F() {
        return this.F;
    }

    public final String G(String str) {
        return a(this.G, str);
    }

    public final String H() {
        return this.N;
    }

    public final String I(String str) {
        return a(this.O, str);
    }

    public final String J() {
        return this.D;
    }

    public final String K(String str) {
        return a(this.E, str);
    }

    public final String L() {
        return this.C;
    }

    public final String M() {
        return this.B;
    }

    public final String N() {
        return this.a0;
    }

    public final String O(String str) {
        return a(this.b0, str);
    }

    public final String P() {
        return this.c0;
    }

    public final String Q(String str) {
        return a(this.d0, str);
    }

    public final String R() {
        return this.Y;
    }

    public final String S() {
        return this.Z;
    }

    public final String T() {
        return this.J;
    }

    public final String U(String str) {
        return a(this.K, str);
    }

    public final JSONObject V() {
        return this.i;
    }

    public final String W() {
        return this.b;
    }

    public final String X() {
        return this.m;
    }

    public final String Y(String str) {
        return a(this.n, str);
    }

    public final String Z() {
        return this.o;
    }

    public final String a0(String str) {
        return a(this.p, str);
    }

    public final String b0() {
        return this.q;
    }

    public final String c() {
        return this.f;
    }

    public final String c0(String str) {
        return a(this.r, str);
    }

    public final String d(String str) {
        return a(this.g, str);
    }

    public final String d0() {
        return this.k;
    }

    public final LinkedHashMap<String, String> e() {
        return this.h;
    }

    public final String e0(String str) {
        return a(this.l, str);
    }

    public final String f() {
        return this.d;
    }

    public final String f0() {
        return this.j;
    }

    public final String g(String str) {
        return a(this.e, str);
    }

    public final String h() {
        return this.c;
    }

    public final String h0() {
        return this.f0;
    }

    public final String i() {
        return this.s;
    }

    public final String i0() {
        return this.e0;
    }

    public final String j() {
        return this.w;
    }

    public final String j0() {
        return this.g0;
    }

    public final String k(String str) {
        return a(this.x, str);
    }

    public final String k0() {
        return this.k0;
    }

    public final String l() {
        return this.y;
    }

    public final String l0(String str) {
        return a(this.l0, str);
    }

    public final String m(String str) {
        return a(this.z, str);
    }

    public final String m0() {
        return this.m0;
    }

    public final String n() {
        return this.A;
    }

    public final String n0(String str) {
        return a(this.n0, str);
    }

    public final String o(String str) {
        return a(this.v, str);
    }

    public final String o0() {
        return this.o0;
    }

    public final String p() {
        return this.u;
    }

    public final String p0(String str) {
        return a(this.p0, str);
    }

    public final String q(String str) {
        return a(this.v, str);
    }

    public final String q0() {
        return this.i0;
    }

    public final String r() {
        return this.t;
    }

    public final String r0(String str) {
        return a(this.j0, str);
    }

    public final String s() {
        return this.P;
    }

    public final String s0() {
        return this.h0;
    }

    public final String t(String str) {
        return a(this.Q, str);
    }

    public final String t0() {
        return this.a;
    }

    public final String u() {
        return this.L;
    }

    public final String v(String str) {
        return a(this.M, str);
    }

    public final String w() {
        return this.H;
    }

    public final String x(String str) {
        return a(this.I, str);
    }

    public final String y() {
        return this.T;
    }

    public final String z(String str) {
        return a(this.U, str);
    }
}
