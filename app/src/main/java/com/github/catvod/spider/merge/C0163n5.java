package com.github.catvod.spider.merge;

import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import kotlinx.coroutines.internal.MainDispatcherFactory;

/* renamed from: com.github.catvod.spider.merge.n5  reason: case insensitive filesystem */
/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public final class C0163n5 {
    public static final AbstractC0151m5 a;

    static {
        Object next;
        AbstractC0151m5 createDispatcher;
        String n = E.n("kotlinx.coroutines.fast.service.loader");
        if (n != null) {
            Boolean.parseBoolean(n);
        }
        List n2 = C0129k7.n(C0129k7.m(ServiceLoader.load(MainDispatcherFactory.class, MainDispatcherFactory.class.getClassLoader()).iterator()));
        Iterator it = n2.iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                int loadPriority = ((MainDispatcherFactory) next).getLoadPriority();
                do {
                    Object next2 = it.next();
                    int loadPriority2 = ((MainDispatcherFactory) next2).getLoadPriority();
                    if (loadPriority < loadPriority2) {
                        next = next2;
                        loadPriority = loadPriority2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        MainDispatcherFactory mainDispatcherFactory = (MainDispatcherFactory) next;
        if (mainDispatcherFactory != null && (createDispatcher = mainDispatcherFactory.createDispatcher(n2)) != null) {
            a = createDispatcher;
            return;
        }
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }
}
