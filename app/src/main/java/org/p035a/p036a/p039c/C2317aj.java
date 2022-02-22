package org.p035a.p036a.p039c;

/* renamed from: org.a.a.c.aj */
public class C2317aj implements C2403w {

    /* renamed from: a */
    private final C2384f f6193a;

    /* renamed from: b */
    private final C2390l f6194b;

    /* renamed from: c */
    private final C2402v f6195c;

    /* renamed from: d */
    private final Object f6196d;

    public C2317aj(C2384f fVar, C2390l lVar, C2402v vVar, Object obj) {
        if (fVar == null) {
            throw new NullPointerException("channel");
        } else if (lVar == null) {
            throw new NullPointerException("future");
        } else if (vVar == null) {
            throw new NullPointerException("state");
        } else {
            this.f6193a = fVar;
            this.f6194b = lVar;
            this.f6195c = vVar;
            this.f6196d = obj;
        }
    }

    @Override // org.p035a.p036a.p039c.C2387i
    /* renamed from: a */
    public C2384f mo6990a() {
        return this.f6193a;
    }

    @Override // org.p035a.p036a.p039c.C2387i
    /* renamed from: b */
    public C2390l mo6991b() {
        return this.f6194b;
    }

    @Override // org.p035a.p036a.p039c.C2403w
    /* renamed from: c */
    public C2402v mo7003c() {
        return this.f6195c;
    }

    @Override // org.p035a.p036a.p039c.C2403w
    /* renamed from: d */
    public Object mo7004d() {
        return this.f6196d;
    }

    public String toString() {
        String obj = mo6990a().toString();
        StringBuilder sb = new StringBuilder(obj.length() + 64);
        sb.append(obj);
        switch (mo7003c()) {
            case OPEN:
                if (!Boolean.TRUE.equals(mo7004d())) {
                    sb.append(" CLOSE");
                    break;
                } else {
                    sb.append(" OPEN");
                    break;
                }
            case BOUND:
                if (mo7004d() == null) {
                    sb.append(" UNBIND");
                    break;
                } else {
                    sb.append(" BIND: ");
                    sb.append(mo7004d());
                    break;
                }
            case CONNECTED:
                if (mo7004d() == null) {
                    sb.append(" DISCONNECT");
                    break;
                } else {
                    sb.append(" CONNECT: ");
                    sb.append(mo7004d());
                    break;
                }
            case INTEREST_OPS:
                sb.append(" CHANGE_INTEREST: ");
                sb.append(mo7004d());
                break;
            default:
                sb.append(' ');
                sb.append(mo7003c().name());
                sb.append(": ");
                sb.append(mo7004d());
                break;
        }
        return sb.toString();
    }
}
