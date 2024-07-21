package com.github.catvod.spider.merge;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.github.catvod.spider.merge.m0  reason: case insensitive filesystem */
/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public final class C0146m0 {
    private static final Map<String, Class<?>> a;
    private static final Map<Class<?>, Class<?>> b;
    private static final Map<Class<?>, Class<?>> c;
    private static final Map<String, String> d;
    public static final /* synthetic */ int e = 0;

    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.Map<java.lang.Class<?>, java.lang.Class<?>>, java.util.HashMap] */
    static {
        String.valueOf('.');
        String.valueOf('$');
        HashMap hashMap = new HashMap();
        a = hashMap;
        Class cls = Boolean.TYPE;
        hashMap.put("boolean", cls);
        hashMap.put("byte", Byte.TYPE);
        hashMap.put("char", Character.TYPE);
        hashMap.put("short", Short.TYPE);
        Class cls2 = Integer.TYPE;
        hashMap.put("int", cls2);
        Class cls3 = Long.TYPE;
        hashMap.put("long", cls3);
        hashMap.put("double", Double.TYPE);
        Class cls4 = Float.TYPE;
        hashMap.put("float", cls4);
        hashMap.put("void", Void.TYPE);
        HashMap hashMap2 = new HashMap();
        b = hashMap2;
        hashMap2.put(cls, Boolean.class);
        hashMap2.put(Byte.TYPE, Byte.class);
        hashMap2.put(Character.TYPE, Character.class);
        hashMap2.put(Short.TYPE, Short.class);
        hashMap2.put(cls2, Integer.class);
        hashMap2.put(cls3, Long.class);
        hashMap2.put(Double.TYPE, Double.class);
        hashMap2.put(cls4, Float.class);
        Class cls5 = Void.TYPE;
        hashMap2.put(cls5, cls5);
        c = new HashMap();
        for (Map.Entry entry : hashMap2.entrySet()) {
            Class cls6 = (Class) entry.getKey();
            Class cls7 = (Class) entry.getValue();
            if (!cls6.equals(cls7)) {
                c.put(cls7, cls6);
            }
        }
        HashMap e2 = B6.e("int", "I", "boolean", "Z");
        e2.put("float", "F");
        e2.put("long", "J");
        e2.put("short", "S");
        e2.put("byte", "B");
        e2.put("double", "D");
        e2.put("char", "C");
        HashMap hashMap3 = new HashMap();
        for (Map.Entry entry2 : e2.entrySet()) {
            hashMap3.put(entry2.getValue(), entry2.getKey());
        }
        Collections.unmodifiableMap(e2);
        d = Collections.unmodifiableMap(hashMap3);
    }

    public static String a(Class<?> cls) {
        if (cls == null) {
            return "";
        }
        String name = cls.getName();
        if (A7.c(name)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        if (name.startsWith("[")) {
            while (name.charAt(0) == '[') {
                name = name.substring(1);
                sb.append("[]");
            }
            if (name.charAt(0) == 'L' && name.charAt(name.length() - 1) == ';') {
                name = name.substring(1, name.length() - 1);
            }
            Map<String, String> map = d;
            if (map.containsKey(name)) {
                name = map.get(name);
            }
        }
        int lastIndexOf = name.lastIndexOf(46);
        int indexOf = name.indexOf(36, lastIndexOf != -1 ? lastIndexOf + 1 : 0);
        String substring = name.substring(lastIndexOf + 1);
        if (indexOf != -1) {
            substring = substring.replace('$', '.');
        }
        return substring + ((Object) sb);
    }
}
