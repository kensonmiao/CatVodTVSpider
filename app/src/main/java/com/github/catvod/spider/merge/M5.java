package com.github.catvod.spider.merge;

import java.io.IOException;
import okhttp3.Call;
import okhttp3.Response;

/* loaded from: C:\Users\Administrator\Desktop\dex2jar-2.1\dex-tools-2.1\classes.dex */
public abstract class M5 extends N5<String> {
    @Override // com.github.catvod.spider.merge.N5
    public void onError(Call call, Exception exc) {
        b();
        onFailure(call, exc);
    }

    /* JADX DEBUG: Method merged with bridge method */
    @Override // com.github.catvod.spider.merge.N5
    public String onParseResponse(Call call, Response response) {
        try {
            return response.body().string();
        } catch (IOException unused) {
            return "";
        }
    }
}
