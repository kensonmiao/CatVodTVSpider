package com.github.catvod.spider.merge;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public final class A1<Key1, Key2, Value> {
    Map<Key1, Map<Key2, Value>> a = new LinkedHashMap();

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.LinkedHashMap, java.util.Map<Key1, java.util.Map<Key2, Value>>] */
    public final Value a(Key1 key1, Key2 key2) {
        Map map = (Map) this.a.get(key1);
        if (map == null) {
            return null;
        }
        return (Value) map.get(key2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.LinkedHashMap, java.util.Map<Key1, java.util.Map<Key2, Value>>] */
    public final Value b(Key1 key1, Key2 key2, Value value) {
        Value value2;
        Map<Key2, Value> map = (Map) this.a.get(key1);
        if (map == null) {
            map = new LinkedHashMap<>();
            this.a.put(key1, map);
            value2 = null;
        } else {
            value2 = map.get(key2);
        }
        map.put(key2, value);
        return value2;
    }
}
