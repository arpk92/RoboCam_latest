package org.p035a.p036a.p039c;

import java.util.Map;
import org.p035a.p036a.p038b.C2285e;
import org.p035a.p036a.p038b.C2291k;
import org.p035a.p036a.p054f.p055a.C2528c;

/* renamed from: org.a.a.c.ab */
public class C2307ab implements C2385g {

    /* renamed from: a */
    private volatile C2285e f6152a = C2291k.m9046b();

    /* renamed from: b */
    private volatile int f6153b = 10000;

    @Override // org.p035a.p036a.p039c.C2385g
    /* renamed from: a */
    public C2285e mo6942a() {
        return this.f6152a;
    }

    /* renamed from: a */
    public void mo6943a(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("connectTimeoutMillis: " + i);
        }
        this.f6153b = i;
    }

    @Override // org.p035a.p036a.p039c.C2385g
    /* renamed from: a */
    public void mo6944a(Map<String, Object> map) {
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            mo6947a(entry.getKey(), entry.getValue());
        }
    }

    /* renamed from: a */
    public void mo6945a(C2285e eVar) {
        if (eVar == null) {
            throw new NullPointerException("bufferFactory");
        }
        this.f6152a = eVar;
    }

    @Override // org.p035a.p036a.p039c.C2385g
    /* renamed from: a */
    public void mo6946a(C2400t tVar) {
    }

    /* renamed from: a */
    public boolean mo6947a(String str, Object obj) {
        if (str.equals("pipelineFactory")) {
            mo6946a((C2400t) obj);
        } else if (str.equals("connectTimeoutMillis")) {
            mo6943a(C2528c.m10051a(obj));
        } else if (!str.equals("bufferFactory")) {
            return false;
        } else {
            mo6945a((C2285e) obj);
        }
        return true;
    }

    @Override // org.p035a.p036a.p039c.C2385g
    /* renamed from: b */
    public C2400t mo6948b() {
        return null;
    }
}
