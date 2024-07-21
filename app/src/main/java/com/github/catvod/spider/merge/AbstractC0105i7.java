package com.github.catvod.spider.merge;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.github.catvod.spider.merge.i7  reason: case insensitive filesystem */
/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public abstract class AbstractC0105i7 {
    public static final C0093h7 c = new C0093h7();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List a(Collection collection) {
        Iterator it = collection.iterator();
        ArrayList arrayList = null;
        while (it.hasNext()) {
            AbstractC0105i7 abstractC0105i7 = (AbstractC0105i7) it.next();
            if (abstractC0105i7 instanceof C0081g7) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add((C0081g7) abstractC0105i7);
                it.remove();
            }
        }
        return arrayList == null ? Collections.emptyList() : arrayList;
    }

    public static AbstractC0105i7 b(AbstractC0105i7 abstractC0105i7, AbstractC0105i7 abstractC0105i72) {
        C0093h7 c0093h7;
        if (abstractC0105i7 == null || abstractC0105i7 == (c0093h7 = c)) {
            return abstractC0105i72;
        }
        if (abstractC0105i72 == null || abstractC0105i72 == c0093h7) {
            return abstractC0105i7;
        }
        C0045d7 c0045d7 = new C0045d7(abstractC0105i7, abstractC0105i72);
        AbstractC0105i7[] abstractC0105i7Arr = c0045d7.d;
        return abstractC0105i7Arr.length == 1 ? abstractC0105i7Arr[0] : c0045d7;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: com.github.catvod.spider.merge.e7 */
    /* JADX WARN: Multi-variable type inference failed */
    public static AbstractC0105i7 e(AbstractC0105i7 abstractC0105i7, AbstractC0105i7 abstractC0105i72) {
        if (abstractC0105i7 == null) {
            return abstractC0105i72;
        }
        if (abstractC0105i72 == null) {
            return abstractC0105i7;
        }
        C0093h7 c0093h7 = c;
        C0093h7 c0093h72 = c0093h7;
        c0093h72 = c0093h7;
        if (abstractC0105i7 != c0093h7 && abstractC0105i72 != c0093h7) {
            C0057e7 c0057e7 = new C0057e7(abstractC0105i7, abstractC0105i72);
            AbstractC0105i7[] abstractC0105i7Arr = c0057e7.d;
            c0093h72 = c0057e7;
            if (abstractC0105i7Arr.length == 1) {
                return abstractC0105i7Arr[0];
            }
        }
        return c0093h72;
    }

    public abstract boolean c(M6<?, ?> m6, S6 s6);

    public AbstractC0105i7 d(M6<?, ?> m6, S6 s6) {
        return this;
    }
}
