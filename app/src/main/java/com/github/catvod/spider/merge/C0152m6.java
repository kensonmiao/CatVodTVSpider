package com.github.catvod.spider.merge;

import java.lang.reflect.Method;

/* renamed from: com.github.catvod.spider.merge.m6 */
/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public class C0152m6 {
    public void a(Throwable th, Throwable th2) {
        C0305z4.h(th, "cause");
        C0305z4.h(th2, "exception");
        Method method = C0140l6.a;
        if (method != null) {
            method.invoke(th, th2);
        }
    }

    public I6 b() {
        return new I2();
    }
}
