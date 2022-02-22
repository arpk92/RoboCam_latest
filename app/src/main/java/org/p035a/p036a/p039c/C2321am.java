package org.p035a.p036a.p039c;

/* renamed from: org.a.a.c.am */
public class C2321am extends C2306aa {

    /* renamed from: a */
    private final Throwable f6202a;

    public C2321am(C2384f fVar, Throwable th) {
        super(fVar);
        if (th == null) {
            throw new NullPointerException("cause");
        }
        this.f6202a = th;
    }

    @Override // org.p035a.p036a.p039c.C2390l
    /* renamed from: d */
    public boolean mo6949d() {
        return false;
    }

    @Override // org.p035a.p036a.p039c.C2390l
    /* renamed from: e */
    public Throwable mo6950e() {
        return this.f6202a;
    }
}
