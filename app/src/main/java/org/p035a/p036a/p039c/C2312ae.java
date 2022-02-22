package org.p035a.p036a.p039c;

/* renamed from: org.a.a.c.ae */
public class C2312ae implements C2414z {

    /* renamed from: a */
    private final C2384f f6180a;

    /* renamed from: b */
    private final C2384f f6181b;

    public C2312ae(C2384f fVar, C2384f fVar2) {
        if (fVar == null) {
            throw new NullPointerException("parentChannel");
        } else if (fVar2 == null) {
            throw new NullPointerException("childChannel");
        } else {
            this.f6180a = fVar;
            this.f6181b = fVar2;
        }
    }

    @Override // org.p035a.p036a.p039c.C2387i
    /* renamed from: a */
    public C2384f mo6990a() {
        return this.f6180a;
    }

    @Override // org.p035a.p036a.p039c.C2387i
    /* renamed from: b */
    public C2390l mo6991b() {
        return C2405y.m9549b(mo6990a());
    }

    @Override // org.p035a.p036a.p039c.C2414z
    /* renamed from: c */
    public C2384f mo6992c() {
        return this.f6181b;
    }

    public String toString() {
        String obj = mo6990a().toString();
        StringBuilder sb = new StringBuilder(obj.length() + 32);
        sb.append(obj);
        sb.append(mo6992c().mo6902g() ? " CHILD_OPEN: " : " CHILD_CLOSED: ");
        sb.append(mo6992c().mo6891a());
        return sb.toString();
    }
}
