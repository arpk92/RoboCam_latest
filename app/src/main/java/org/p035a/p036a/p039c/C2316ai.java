package org.p035a.p036a.p039c;

/* renamed from: org.a.a.c.ai */
public class C2316ai implements C2337az {

    /* renamed from: a */
    private final C2384f f6191a;

    /* renamed from: b */
    private final long f6192b;

    public C2316ai(C2384f fVar, long j) {
        if (fVar == null) {
            throw new NullPointerException("channel");
        } else if (j <= 0) {
            throw new IllegalArgumentException("writtenAmount must be a positive integer: " + j);
        } else {
            this.f6191a = fVar;
            this.f6192b = j;
        }
    }

    @Override // org.p035a.p036a.p039c.C2387i
    /* renamed from: a */
    public C2384f mo6990a() {
        return this.f6191a;
    }

    @Override // org.p035a.p036a.p039c.C2387i
    /* renamed from: b */
    public C2390l mo6991b() {
        return C2405y.m9549b(mo6990a());
    }

    /* renamed from: c */
    public long mo7001c() {
        return this.f6192b;
    }

    public String toString() {
        String obj = mo6990a().toString();
        StringBuilder sb = new StringBuilder(obj.length() + 32);
        sb.append(obj);
        sb.append(" WRITTEN_AMOUNT: ");
        sb.append(mo7001c());
        return sb.toString();
    }
}
