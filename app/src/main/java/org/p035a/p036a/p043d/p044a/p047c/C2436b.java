package org.p035a.p036a.p043d.p044a.p047c;

import java.net.SocketAddress;
import org.p035a.p036a.p038b.C2284d;
import org.p035a.p036a.p038b.C2286f;
import org.p035a.p036a.p038b.C2287g;
import org.p035a.p036a.p039c.C2320al;
import org.p035a.p036a.p039c.C2323ao;
import org.p035a.p036a.p039c.C2324ap;
import org.p035a.p036a.p039c.C2331av;
import org.p035a.p036a.p039c.C2384f;
import org.p035a.p036a.p039c.C2387i;
import org.p035a.p036a.p039c.C2396p;
import org.p035a.p036a.p039c.C2403w;
import org.p035a.p036a.p039c.C2405y;

/* renamed from: org.a.a.d.a.c.b */
public abstract class C2436b extends C2331av implements C2323ao {

    /* renamed from: b */
    static final /* synthetic */ boolean f6393b = (!C2436b.class.desiredAssertionStatus());

    /* renamed from: a */
    protected C2284d f6394a;

    /* renamed from: c */
    private boolean f6395c;

    /* renamed from: d */
    private volatile C2396p f6396d;

    /* renamed from: e */
    private int f6397e;

    /* renamed from: f */
    private int f6398f;

    protected C2436b() {
        this(false);
    }

    protected C2436b(boolean z) {
        this.f6398f = 1024;
        this.f6395c = z;
    }

    /* renamed from: a */
    private void m9616a(C2396p pVar, C2384f fVar, C2284d dVar, SocketAddress socketAddress) {
        while (dVar.mo6836c()) {
            int a = dVar.mo6816a();
            Object a2 = mo7163a(pVar, fVar, dVar);
            if (a2 == null) {
                if (a == dVar.mo6816a()) {
                    return;
                }
            } else if (a == dVar.mo6816a()) {
                throw new IllegalStateException("decode() method must read at least one byte if it returned a frame (caused by: " + getClass() + ")");
            } else {
                mo7167a(pVar, socketAddress, a2);
            }
        }
    }

    /* renamed from: a */
    public final int mo7162a() {
        return this.f6397e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo7163a(C2396p pVar, C2384f fVar, C2284d dVar);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C2284d mo7164a(C2284d dVar) {
        C2284d dVar2 = this.f6394a;
        if (f6393b || dVar2.mo6836c()) {
            if (dVar2 instanceof C2287g) {
                C2287g gVar = (C2287g) dVar2;
                if (gVar.mo6889v() >= this.f6398f) {
                    dVar2 = gVar.mo6854k();
                }
            }
            C2284d a = C2286f.m8937a(dVar2, dVar);
            this.f6394a = a;
            return a;
        }
        throw new AssertionError();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C2284d mo7165a(C2396p pVar, int i) {
        return pVar.mo6977a().mo7051m().mo6942a().mo6860a(Math.max(i, 256));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C2284d mo7166a(C2396p pVar, C2284d dVar) {
        int d = dVar.mo6838d();
        if (d > 0) {
            int r = dVar.mo6882r();
            if (d < r && r > this.f6397e) {
                C2284d a = mo7165a(pVar, dVar.mo6838d());
                this.f6394a = a;
                this.f6394a.mo6824a(dVar);
                return a;
            } else if (dVar.mo6816a() != 0) {
                C2284d l = dVar.mo6855l();
                this.f6394a = l;
                return l;
            } else {
                this.f6394a = dVar;
                return dVar;
            }
        } else {
            this.f6394a = null;
            return null;
        }
    }

    @Override // org.p035a.p036a.p039c.C2323ao
    /* renamed from: a */
    public void mo7009a(C2396p pVar) {
        this.f6396d = pVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7167a(C2396p pVar, SocketAddress socketAddress, Object obj) {
        if (!this.f6395c) {
            C2405y.m9545a(pVar, obj, socketAddress);
        } else if (obj instanceof Object[]) {
            for (Object obj2 : (Object[]) obj) {
                C2405y.m9545a(pVar, obj2, socketAddress);
            }
        } else if (obj instanceof Iterable) {
            for (Object obj3 : (Iterable) obj) {
                C2405y.m9545a(pVar, obj3, socketAddress);
            }
        } else {
            C2405y.m9545a(pVar, obj, socketAddress);
        }
    }

    @Override // org.p035a.p036a.p039c.C2331av
    /* renamed from: a */
    public void mo6813a(C2396p pVar, C2320al alVar) {
        pVar.mo6979a((C2387i) alVar);
    }

    @Override // org.p035a.p036a.p039c.C2331av
    /* renamed from: a */
    public void mo7037a(C2396p pVar, C2324ap apVar) {
        Object c = apVar.mo7006c();
        if (!(c instanceof C2284d)) {
            pVar.mo6979a((C2387i) apVar);
            return;
        }
        C2284d dVar = (C2284d) c;
        if (!dVar.mo6836c()) {
            return;
        }
        if (this.f6394a == null) {
            try {
                m9616a(pVar, apVar.mo6990a(), dVar, apVar.mo7007d());
            } finally {
                mo7166a(pVar, dVar);
            }
        } else {
            C2284d a = mo7164a(dVar);
            try {
                m9616a(pVar, apVar.mo6990a(), a, apVar.mo7007d());
            } finally {
                mo7166a(pVar, a);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo7168b() {
        return mo7170c().mo6838d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public Object mo7169b(C2396p pVar, C2384f fVar, C2284d dVar) {
        return mo7163a(pVar, fVar, dVar);
    }

    @Override // org.p035a.p036a.p039c.C2323ao
    /* renamed from: b */
    public void mo7010b(C2396p pVar) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public C2284d mo7170c() {
        C2284d dVar = this.f6394a;
        return dVar == null ? C2286f.f6097c : dVar;
    }

    @Override // org.p035a.p036a.p039c.C2323ao
    /* renamed from: c */
    public void mo7011c(C2396p pVar) {
    }

    @Override // org.p035a.p036a.p039c.C2323ao
    /* renamed from: d */
    public void mo7012d(C2396p pVar) {
    }

    @Override // org.p035a.p036a.p039c.C2331av
    /* renamed from: e */
    public void mo7043e(C2396p pVar, C2403w wVar) {
        mo7171h(pVar, wVar);
    }

    @Override // org.p035a.p036a.p039c.C2331av
    /* renamed from: g */
    public void mo7045g(C2396p pVar, C2403w wVar) {
        mo7171h(pVar, wVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo7171h(C2396p pVar, C2403w wVar) {
        try {
            C2284d dVar = this.f6394a;
            if (dVar != null) {
                this.f6394a = null;
                if (dVar.mo6836c()) {
                    m9616a(pVar, pVar.mo6977a(), dVar, null);
                }
                Object b = mo7169b(pVar, pVar.mo6977a(), dVar);
                if (b != null) {
                    mo7167a(pVar, (SocketAddress) null, b);
                }
                pVar.mo6979a((C2387i) wVar);
            }
        } finally {
            pVar.mo6979a((C2387i) wVar);
        }
    }
}
