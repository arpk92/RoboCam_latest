package org.p035a.p036a.p039c;

/* renamed from: org.a.a.c.b */
public abstract class C2338b implements C2401u {
    protected C2338b() {
    }

    @Override // org.p035a.p036a.p039c.C2401u
    /* renamed from: a */
    public C2390l mo6987a(C2398r rVar, Runnable runnable) {
        try {
            runnable.run();
            return C2405y.m9549b(rVar.mo6965b());
        } catch (Throwable th) {
            return C2405y.m9536a(rVar.mo6965b(), th);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: org.a.a.c.y.b(org.a.a.c.f, java.lang.Throwable):org.a.a.c.l
     arg types: [org.a.a.c.f, org.a.a.c.s]
     candidates:
      org.a.a.c.y.b(org.a.a.c.f, java.lang.Object):org.a.a.c.l
      org.a.a.c.y.b(org.a.a.c.f, long):void
      org.a.a.c.y.b(org.a.a.c.f, java.net.SocketAddress):void
      org.a.a.c.y.b(org.a.a.c.p, java.lang.Throwable):void
      org.a.a.c.y.b(org.a.a.c.f, java.lang.Throwable):org.a.a.c.l */
    @Override // org.p035a.p036a.p039c.C2401u
    /* renamed from: a */
    public void mo6989a(C2398r rVar, C2387i iVar, C2399s sVar) {
        Throwable cause = sVar.getCause();
        if (cause != null) {
            sVar = (C2399s) cause;
        }
        if (mo7048a(iVar, sVar)) {
            C2405y.m9552b(iVar.mo6990a(), (Throwable) sVar);
        } else {
            C2405y.m9559c(iVar.mo6990a(), sVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo7048a(C2387i iVar, Throwable th) {
        return false;
    }
}
