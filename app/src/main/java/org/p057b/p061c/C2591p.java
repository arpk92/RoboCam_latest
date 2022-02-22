package org.p057b.p061c;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;
import org.p035a.p036a.p039c.C2324ap;
import org.p035a.p036a.p043d.p044a.p048d.C2466s;
import org.p057b.C2610f;
import org.p057b.p060b.C2558d;

/* renamed from: org.b.c.p */
public class C2591p implements C2610f {

    /* renamed from: a */
    private final C2466s f6951a;

    /* renamed from: b */
    private final C2324ap f6952b;

    /* renamed from: c */
    private final Map<String, Object> f6953c = new HashMap();

    /* renamed from: d */
    private final Object f6954d;

    /* renamed from: e */
    private final long f6955e;

    /* renamed from: f */
    private C2558d f6956f;

    public C2591p(C2324ap apVar, C2466s sVar, Object obj, long j) {
        this.f6952b = apVar;
        this.f6951a = sVar;
        this.f6954d = obj;
        this.f6955e = j;
    }

    /* renamed from: b */
    private C2558d m10167b() {
        if (this.f6956f == null) {
            this.f6956f = new C2558d(URI.create(mo7459a()).getRawQuery());
        }
        return this.f6956f;
    }

    @Override // org.p057b.C2610f
    /* renamed from: a */
    public String mo7459a() {
        return this.f6951a.mo7208h();
    }

    @Override // org.p057b.C2610f
    /* renamed from: a */
    public String mo7460a(String str) {
        return m10167b().mo7421a(str);
    }

    public String toString() {
        return this.f6952b.mo7007d() + " " + this.f6951a.mo7207g() + " " + this.f6951a.mo7208h();
    }
}
