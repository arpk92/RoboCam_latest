package org.p035a.p036a.p039c;

/* renamed from: org.a.a.c.ax */
public class C2334ax implements C2403w {

    /* renamed from: a */
    private final C2384f f6207a;

    /* renamed from: b */
    private final C2402v f6208b;

    /* renamed from: c */
    private final Object f6209c;

    public C2334ax(C2384f fVar, C2402v vVar, Object obj) {
        if (fVar == null) {
            throw new NullPointerException("channel");
        } else if (vVar == null) {
            throw new NullPointerException("state");
        } else {
            this.f6207a = fVar;
            this.f6208b = vVar;
            this.f6209c = obj;
        }
    }

    @Override // org.p035a.p036a.p039c.C2387i
    /* renamed from: a */
    public C2384f mo6990a() {
        return this.f6207a;
    }

    @Override // org.p035a.p036a.p039c.C2387i
    /* renamed from: b */
    public C2390l mo6991b() {
        return C2405y.m9549b(mo6990a());
    }

    @Override // org.p035a.p036a.p039c.C2403w
    /* renamed from: c */
    public C2402v mo7003c() {
        return this.f6208b;
    }

    @Override // org.p035a.p036a.p039c.C2403w
    /* renamed from: d */
    public Object mo7004d() {
        return this.f6209c;
    }

    public String toString() {
        String obj = mo6990a().toString();
        StringBuilder sb = new StringBuilder(obj.length() + 64);
        sb.append(obj);
        switch (mo7003c()) {
            case OPEN:
                if (!Boolean.TRUE.equals(mo7004d())) {
                    sb.append(" CLOSED");
                    break;
                } else {
                    sb.append(" OPEN");
                    break;
                }
            case BOUND:
                if (mo7004d() == null) {
                    sb.append(" UNBOUND");
                    break;
                } else {
                    sb.append(" BOUND: ");
                    sb.append(mo7004d());
                    break;
                }
            case CONNECTED:
                if (mo7004d() == null) {
                    sb.append(" DISCONNECTED");
                    break;
                } else {
                    sb.append(" CONNECTED: ");
                    sb.append(mo7004d());
                    break;
                }
            case INTEREST_OPS:
                sb.append(" INTEREST_CHANGED");
                break;
            default:
                sb.append(mo7003c().name());
                sb.append(": ");
                sb.append(mo7004d());
                break;
        }
        return sb.toString();
    }
}
