package org.p035a.p036a.p039c.p041b.p042a;

import org.p035a.p036a.p039c.C2338b;
import org.p035a.p036a.p039c.C2384f;
import org.p035a.p036a.p039c.C2387i;
import org.p035a.p036a.p039c.C2390l;
import org.p035a.p036a.p039c.C2398r;
import org.p035a.p036a.p039c.p041b.C2339a;

/* renamed from: org.a.a.c.b.a.b */
public abstract class C2343b extends C2338b {
    @Override // org.p035a.p036a.p039c.C2401u, org.p035a.p036a.p039c.C2338b
    /* renamed from: a */
    public C2390l mo6987a(C2398r rVar, Runnable runnable) {
        C2384f b = rVar.mo6965b();
        if (!(b instanceof C2340a)) {
            return super.mo6987a(rVar, runnable);
        }
        C2339a aVar = new C2339a(rVar.mo6965b(), runnable);
        ((C2340a) b).f6216c.mo7085a(aVar);
        return aVar;
    }

    /* access modifiers changed from: protected */
    @Override // org.p035a.p036a.p039c.C2338b
    /* renamed from: a */
    public boolean mo7048a(C2387i iVar, Throwable th) {
        C2384f a = iVar.mo6990a();
        if (a instanceof C2340a) {
            return !C2344c.m9335e((C2340a) a);
        }
        return false;
    }
}
