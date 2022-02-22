package org.p035a.p036a.p039c;

import java.util.Map;
import org.p035a.p036a.p038b.C2285e;
import org.p035a.p036a.p038b.C2291k;

/* renamed from: org.a.a.c.ah */
public class C2315ah implements C2385g {

    /* renamed from: a */
    private volatile C2400t f6189a;

    /* renamed from: b */
    private volatile C2285e f6190b = C2291k.m9046b();

    @Override // org.p035a.p036a.p039c.C2385g
    /* renamed from: a */
    public C2285e mo6942a() {
        return this.f6190b;
    }

    @Override // org.p035a.p036a.p039c.C2385g
    /* renamed from: a */
    public void mo6944a(Map<String, Object> map) {
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            mo7000a(entry.getKey(), entry.getValue());
        }
    }

    /* renamed from: a */
    public void mo6999a(C2285e eVar) {
        if (eVar == null) {
            throw new NullPointerException("bufferFactory");
        }
        this.f6190b = eVar;
    }

    @Override // org.p035a.p036a.p039c.C2385g
    /* renamed from: a */
    public void mo6946a(C2400t tVar) {
        if (tVar == null) {
            throw new NullPointerException("pipelineFactory");
        }
        this.f6189a = tVar;
    }

    /* renamed from: a */
    public boolean mo7000a(String str, Object obj) {
        if (str.equals("pipelineFactory")) {
            mo6946a((C2400t) obj);
        } else if (!str.equals("bufferFactory")) {
            return false;
        } else {
            mo6999a((C2285e) obj);
        }
        return true;
    }

    @Override // org.p035a.p036a.p039c.C2385g
    /* renamed from: b */
    public C2400t mo6948b() {
        return this.f6189a;
    }
}
