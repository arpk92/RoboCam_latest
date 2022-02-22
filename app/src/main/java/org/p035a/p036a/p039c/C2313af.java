package org.p035a.p036a.p039c;

import org.p035a.p036a.p054f.p055a.C2536i;

/* renamed from: org.a.a.c.af */
public class C2313af implements C2320al {

    /* renamed from: a */
    private final C2384f f6182a;

    /* renamed from: b */
    private final Throwable f6183b;

    public C2313af(C2384f fVar, Throwable th) {
        if (fVar == null) {
            throw new NullPointerException("channel");
        } else if (th == null) {
            throw new NullPointerException("cause");
        } else {
            this.f6182a = fVar;
            this.f6183b = th;
            C2536i.m10062a(th);
        }
    }

    @Override // org.p035a.p036a.p039c.C2387i
    /* renamed from: a */
    public C2384f mo6990a() {
        return this.f6182a;
    }

    @Override // org.p035a.p036a.p039c.C2387i
    /* renamed from: b */
    public C2390l mo6991b() {
        return C2405y.m9549b(mo6990a());
    }

    @Override // org.p035a.p036a.p039c.C2320al
    /* renamed from: c */
    public Throwable mo6994c() {
        return this.f6183b;
    }

    public String toString() {
        return mo6990a().toString() + " EXCEPTION: " + this.f6183b;
    }
}
