package com.github.catvod.spider.merge;

import okhttp3.Call;
import okhttp3.Response;

/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public abstract class N5<T> {
    private T a = null;

    public final void a(Call call, Response response) {
        T onParseResponse = onParseResponse(call, response);
        this.a = onParseResponse;
        onResponse(onParseResponse);
    }

    public final void b() {
        this.a = "";
    }

    public T getResult() {
        return this.a;
    }

    public void onError(Call call, Exception exc) {
        onFailure(call, exc);
    }

    public abstract void onFailure(Call call, Exception exc);

    protected abstract T onParseResponse(Call call, Response response);

    protected abstract void onResponse(T t);
}
