package com.github.catvod.spider.merge;

/* renamed from: com.github.catvod.spider.merge.z1  reason: case insensitive filesystem */
/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public final class C0302z1 extends K4 {
    public C0302z1(String str, String str2, String str3) {
        String str4;
        R0.p(str);
        R0.p(str2);
        R0.p(str3);
        super.b("name", str);
        super.b("publicId", str2);
        super.b("systemId", str3);
        if (K("publicId")) {
            str4 = "PUBLIC";
        } else if (!K("systemId")) {
            return;
        } else {
            str4 = "SYSTEM";
        }
        super.b("pubSysKey", str4);
    }

    private boolean K(String str) {
        return !C0308z7.c(super.c(str));
    }

    public final void L(String str) {
        if (str != null) {
            super.b("pubSysKey", str);
        }
    }

    @Override // com.github.catvod.spider.merge.K4, com.github.catvod.spider.merge.A5
    public final /* bridge */ /* synthetic */ int h() {
        return 0;
    }

    @Override // com.github.catvod.spider.merge.K4, com.github.catvod.spider.merge.A5
    public final A5 m() {
        return this;
    }

    @Override // com.github.catvod.spider.merge.A5
    public final String t() {
        return "#doctype";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.A5
    public final void w(Appendable appendable, int i, C0278x1 c0278x1) {
        appendable.append((c0278x1.g() != 1 || K("publicId") || K("systemId")) ? "<!DOCTYPE" : "<!doctype");
        if (K("name")) {
            appendable.append(" ").append(super.c("name"));
        }
        if (K("pubSysKey")) {
            appendable.append(" ").append(super.c("pubSysKey"));
        }
        if (K("publicId")) {
            appendable.append(" \"").append(super.c("publicId")).append('\"');
        }
        if (K("systemId")) {
            appendable.append(" \"").append(super.c("systemId")).append('\"');
        }
        appendable.append('>');
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.A5
    public final void x(Appendable appendable, int i, C0278x1 c0278x1) {
    }
}
