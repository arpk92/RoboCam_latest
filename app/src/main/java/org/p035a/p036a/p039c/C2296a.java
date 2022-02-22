package org.p035a.p036a.p039c;

import android.support.v8.renderscript.Allocation;
import java.net.SocketAddress;
import java.util.concurrent.ConcurrentMap;
import org.p035a.p036a.p054f.p055a.C2516b;

/* renamed from: org.a.a.c.a */
public abstract class C2296a implements C2384f {

    /* renamed from: a */
    static final ConcurrentMap<Integer, C2384f> f6117a = new C2516b();

    /* renamed from: b */
    static final /* synthetic */ boolean f6118b = (!C2296a.class.desiredAssertionStatus());

    /* renamed from: c */
    private final Integer f6119c;

    /* renamed from: d */
    private final C2384f f6120d;

    /* renamed from: e */
    private final C2389k f6121e;

    /* renamed from: f */
    private final C2398r f6122f;

    /* renamed from: g */
    private final C2390l f6123g = new C2333aw(this);

    /* renamed from: h */
    private final C2297a f6124h = new C2297a();

    /* renamed from: i */
    private volatile int f6125i = 1;

    /* renamed from: j */
    private boolean f6126j;

    /* renamed from: k */
    private String f6127k;

    /* renamed from: org.a.a.c.a$a */
    private final class C2297a extends C2308ac {
        public C2297a() {
            super(C2296a.this, false);
        }

        @Override // org.p035a.p036a.p039c.C2308ac, org.p035a.p036a.p039c.C2390l
        /* renamed from: a */
        public boolean mo6909a() {
            return false;
        }

        @Override // org.p035a.p036a.p039c.C2308ac, org.p035a.p036a.p039c.C2390l
        /* renamed from: a */
        public boolean mo6910a(Throwable th) {
            return false;
        }

        /* access modifiers changed from: package-private */
       // @Override // org.p035a.p036a.p039c.C2308ac
        /* renamed from: b */
        public boolean mo6911b() {
            return super.mo6909a();
        }
    }

    protected C2296a(Integer num, C2384f fVar, C2389k kVar, C2398r rVar, C2401u uVar) {
        this.f6119c = num;
        this.f6120d = fVar;
        this.f6121e = kVar;
        this.f6122f = rVar;
        rVar.mo6960a(this, uVar);
    }

    protected C2296a(C2384f fVar, C2389k kVar, C2398r rVar, C2401u uVar) {
        this.f6120d = fVar;
        this.f6121e = kVar;
        this.f6122f = rVar;
        this.f6119c = m9109b(this);
        rVar.mo6960a(this, uVar);
    }

    /* renamed from: b */
    private static Integer m9109b(C2384f fVar) {
        Integer valueOf = Integer.valueOf(System.identityHashCode(fVar));
        while (f6117a.putIfAbsent(valueOf, fVar) != null) {
            valueOf = Integer.valueOf(valueOf.intValue() + 1);
        }
        return valueOf;
    }

    /* renamed from: q */
    private String mo7054q() {
        String hexString = Integer.toHexString(this.f6119c.intValue());
        switch (hexString.length()) {
            case 0:
                return "00000000";
            case 1:
                return "0000000" + hexString;
            case 2:
                return "000000" + hexString;
            case 3:
                return "00000" + hexString;
            case 4:
                return "0000" + hexString;
            case 5:
                return "000" + hexString;
            case 6:
                return "00" + hexString;
            case 7:
                return "0" + hexString;
            default:
                return hexString;
        }
    }

    /* renamed from: a */
    public final int compareTo(C2384f fVar) {
        return mo6891a().compareTo(fVar.mo6891a());
    }

    @Override // org.p035a.p036a.p039c.C2384f
    /* renamed from: a */
    public final Integer mo6891a() {
        return this.f6119c;
    }

    @Override // org.p035a.p036a.p039c.C2384f
    /* renamed from: a */
    public C2390l mo6892a(Object obj) {
        return C2405y.m9550b(this, obj);
    }

    @Override // org.p035a.p036a.p039c.C2384f
    /* renamed from: a */
    public C2390l mo6893a(SocketAddress socketAddress) {
        return C2405y.m9557c(this, socketAddress);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6894a(int i) {
        this.f6125i = i;
    }

    @Override // org.p035a.p036a.p039c.C2384f
    /* renamed from: b */
    public C2384f mo6895b() {
        return this.f6120d;
    }

    /* renamed from: c */
    public C2389k mo6896c() {
        return this.f6121e;
    }

    @Override // org.p035a.p036a.p039c.C2384f
    /* renamed from: d */
    public C2398r mo6898d() {
        return this.f6122f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public C2390l mo6899e() {
        return this.f6123g;
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public C2390l mo6901f() {
        return new C2321am(this, new UnsupportedOperationException());
    }

    @Override // org.p035a.p036a.p039c.C2384f
    /* renamed from: g */
    public boolean mo6902g() {
        return !this.f6124h.mo6951i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public boolean mo6903h() {
        f6117a.remove(this.f6119c);
        return this.f6124h.mo6911b();
    }

    public final int hashCode() {
        return System.identityHashCode(this);
    }

    @Override // org.p035a.p036a.p039c.C2384f
    /* renamed from: i */
    public C2390l mo6905i() {
        C2390l l = C2405y.m9568l(this);
        if (f6118b || this.f6124h == l) {
            return this.f6124h;
        }
        throw new AssertionError();
    }

    @Override // org.p035a.p036a.p039c.C2384f
    /* renamed from: j */
    public C2390l mo6906j() {
        return this.f6124h;
    }

    /* renamed from: k */
    public int mo6907k() {
        return this.f6125i;
    }

    public String toString() {
        boolean l = mo7120l();
        if (this.f6126j == l && this.f6127k != null) {
            return this.f6127k;
        }
        StringBuilder sb = new StringBuilder((int) Allocation.USAGE_SHARED);
        sb.append("[id: 0x");
        sb.append(mo7054q());
        SocketAddress o = mo7052o();
        SocketAddress p = mo7053p();
        if (p != null) {
            sb.append(", ");
            if (mo6895b() == null) {
                sb.append(o);
                sb.append(l ? " => " : " :> ");
                sb.append(p);
            } else {
                sb.append(p);
                sb.append(l ? " => " : " :> ");
                sb.append(o);
            }
        } else if (o != null) {
            sb.append(", ");
            sb.append(o);
        }
        sb.append(']');
        String sb2 = sb.toString();
        this.f6127k = sb2;
        this.f6126j = l;
        return sb2;
    }
}
