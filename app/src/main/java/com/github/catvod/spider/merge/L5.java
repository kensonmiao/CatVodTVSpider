package com.github.catvod.spider.merge;

import java.io.IOException;
import okhttp3.Call;
import okhttp3.Response;

/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public final class L5 extends N5<String> {
    @Override // com.github.catvod.spider.merge.N5
    public final void onError(Call call, Exception exc) {
        b();
        b();
    }

    @Override // com.github.catvod.spider.merge.N5
    public final void onFailure(Call call, Exception exc) {
        b();
    }

    @Override // com.github.catvod.spider.merge.N5
    public final String onParseResponse(Call call, Response response) {
        try {
            return response.body().string();
        } catch (IOException unused) {
            return "";
        }
    }

    @Override // com.github.catvod.spider.merge.N5
    protected final /* bridge */ /* synthetic */ void onResponse(String str) {
    }
}
