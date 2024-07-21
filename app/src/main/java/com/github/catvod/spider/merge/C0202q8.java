package com.github.catvod.spider.merge;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.github.catvod.spider.merge.q8 */
/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
final class C0202q8 extends AbstractC0273w8 {
    public C0202q8() {
        H();
        J();
        y("{");
        x("}");
        w();
        v();
        A(",");
        z();
        C();
        G();
        F();
        E();
        D();
    }

    @Override // com.github.catvod.spider.merge.AbstractC0273w8
    public final void a(StringBuffer stringBuffer, Object obj) {
        super.a(stringBuffer, obj);
    }

    @Override // com.github.catvod.spider.merge.AbstractC0273w8
    protected final void c(StringBuffer stringBuffer, char c) {
        String valueOf = String.valueOf(c);
        stringBuffer.append('\"');
        stringBuffer.append(C0272w7.a(valueOf));
        stringBuffer.append('\"');
    }

    @Override // com.github.catvod.spider.merge.AbstractC0273w8
    protected final void e(StringBuffer stringBuffer, String str, Object obj) {
        if (obj == null) {
            l(stringBuffer);
        } else if ((obj instanceof String) || (obj instanceof Character)) {
            String obj2 = obj.toString();
            stringBuffer.append('\"');
            stringBuffer.append(C0272w7.a(obj2));
            stringBuffer.append('\"');
        } else if ((obj instanceof Number) || (obj instanceof Boolean)) {
            stringBuffer.append(obj);
        } else {
            String obj3 = obj.toString();
            boolean z = false;
            if (!(obj3.startsWith(r()) && obj3.endsWith(q()))) {
                if (obj3.startsWith(p()) && obj3.endsWith(o())) {
                    z = true;
                }
                if (!z) {
                    e(stringBuffer, str, obj3);
                    return;
                }
            }
            stringBuffer.append(obj);
        }
    }

    @Override // com.github.catvod.spider.merge.AbstractC0273w8
    protected final void f(StringBuffer stringBuffer, String str, Collection<?> collection) {
        if (collection == null || collection.isEmpty()) {
            stringBuffer.append(collection);
            return;
        }
        stringBuffer.append(p());
        int i = 0;
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            d(stringBuffer, str, i, it.next());
            i++;
        }
        stringBuffer.append(o());
    }

    @Override // com.github.catvod.spider.merge.AbstractC0273w8
    protected final void g(StringBuffer stringBuffer, Map map) {
        if (map == null || map.isEmpty()) {
            stringBuffer.append(map);
            return;
        }
        stringBuffer.append(r());
        boolean z = true;
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            String obj = key != null ? key.toString() : null;
            if (obj != null) {
                if (z) {
                    z = false;
                } else {
                    i(stringBuffer);
                }
                j(stringBuffer, obj);
                Object value = entry.getValue();
                if (value == null) {
                    l(stringBuffer);
                } else {
                    k(stringBuffer, obj, value, true);
                }
            }
        }
        stringBuffer.append(q());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.github.catvod.spider.merge.AbstractC0273w8
    public final void j(StringBuffer stringBuffer, String str) {
        StringBuilder a = A.a("\"");
        a.append(C0272w7.a(str));
        a.append("\"");
        super.j(stringBuffer, a.toString());
    }
}
