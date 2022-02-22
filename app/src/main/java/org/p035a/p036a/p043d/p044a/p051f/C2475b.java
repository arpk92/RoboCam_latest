package org.p035a.p036a.p043d.p044a.p051f;

import java.lang.Enum;
import java.net.SocketAddress;
import org.p035a.p036a.p038b.C2284d;
import org.p035a.p036a.p039c.C2324ap;
import org.p035a.p036a.p039c.C2384f;
import org.p035a.p036a.p039c.C2387i;
import org.p035a.p036a.p039c.C2396p;
import org.p035a.p036a.p039c.C2403w;
import org.p035a.p036a.p043d.p044a.p047c.C2436b;

/* renamed from: org.a.a.d.a.f.b */
public abstract class C2475b<T extends Enum<T>> extends C2436b {

    /* renamed from: c */
    private final C2476c f6534c;

    /* renamed from: d */
    private T f6535d;

    /* renamed from: e */
    private int f6536e;

    /* renamed from: f */
    private boolean f6537f;

    protected C2475b() {
        this(null);
    }

    protected C2475b(T t) {
        this(t, false);
    }

    protected C2475b(T t, boolean z) {
        super(z);
        this.f6534c = new C2476c(this);
        this.f6535d = t;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: MutableMD:(org.a.a.c.p, org.a.a.c.f, org.a.a.b.d, java.lang.Enum):java.lang.Object
     arg types: [org.a.a.c.p, org.a.a.c.f, org.a.a.b.d, T]
     candidates:
      org.a.a.d.a.c.b.a(org.a.a.c.p, org.a.a.c.f, org.a.a.b.d, java.net.SocketAddress):void
      MutableMD:(org.a.a.c.p, org.a.a.c.f, org.a.a.b.d, java.lang.Enum):java.lang.Object */
    /* renamed from: a */
    private void m9817a(C2396p pVar, C2384f fVar, C2284d dVar, C2284d dVar2, SocketAddress socketAddress) {
        while (dVar.mo6836c()) {
            int a = dVar.mo6816a();
            this.f6536e = a;
            Object obj = null;
            T t = this.f6535d;
            try {
                obj = mo7181a(pVar, fVar, dVar2, (T) this.f6535d);
                if (obj == null) {
                    if (a == dVar.mo6816a() && t == this.f6535d) {
                        throw new IllegalStateException("null cannot be returned if no data is consumed and state didn't change.");
                    }
                }
            } catch (C2474a e) {
                int i = this.f6536e;
                if (i >= 0) {
                    dVar.mo6820a(i);
                }
            }
            if (obj != null) {
                if (a == dVar.mo6816a() && t == this.f6535d) {
                    throw new IllegalStateException("decode() method must consume at least one byte if it returned a decoded message (caused by: " + getClass() + ")");
                }
                mo7167a(pVar, socketAddress, obj);
            } else {
                return;
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: MutableMD:(org.a.a.c.p, org.a.a.c.f, org.a.a.b.d, java.lang.Enum):java.lang.Object
     arg types: [org.a.a.c.p, org.a.a.c.f, org.a.a.b.d, T]
     candidates:
      org.a.a.d.a.c.b.a(org.a.a.c.p, org.a.a.c.f, org.a.a.b.d, java.net.SocketAddress):void
      MutableMD:(org.a.a.c.p, org.a.a.c.f, org.a.a.b.d, java.lang.Enum):java.lang.Object */
    /* access modifiers changed from: protected */
    @Override // org.p035a.p036a.p043d.p044a.p047c.C2436b
    /* renamed from: a */
    public final Object mo7163a(C2396p pVar, C2384f fVar, C2284d dVar) {
        return mo7181a(pVar, fVar, dVar, (T) this.f6535d);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo7181a(C2396p pVar, C2384f fVar, C2284d dVar, T t);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo7262a(T t) {
        mo7265e();
        mo7263b((T) t);
    }

    /* JADX INFO: finally extract failed */
    @Override // org.p035a.p036a.p039c.C2331av, org.p035a.p036a.p043d.p044a.p047c.C2436b
    /* renamed from: a */
    public void mo7037a(C2396p pVar, C2324ap apVar) {
        boolean z = true;
        Object c = apVar.mo7006c();
        if (!(c instanceof C2284d)) {
            pVar.mo6979a((C2387i) apVar);
            return;
        }
        C2284d dVar = (C2284d) c;
        if (dVar.mo6836c()) {
            this.f6537f = true;
            if (this.f6394a == null) {
                this.f6394a = dVar;
                int a = dVar.mo6816a();
                int d = dVar.mo6838d();
                try {
                    m9817a(pVar, apVar.mo6990a(), dVar, this.f6534c, apVar.mo7007d());
                    int d2 = dVar.mo6838d();
                    if (d2 > 0) {
                        int r = dVar.mo6882r();
                        if (d2 == r || r <= mo7162a()) {
                            z = false;
                        }
                        if (this.f6536e > 0) {
                            int i = d - (this.f6536e - a);
                            if (z) {
                                C2284d a2 = mo7165a(pVar, i);
                                this.f6394a = a2;
                                a2.mo6826a(dVar, this.f6536e, i);
                                return;
                            }
                            this.f6394a = dVar.mo6879g(this.f6536e, i);
                        } else if (this.f6536e == 0) {
                            if (z) {
                                C2284d a3 = mo7165a(pVar, d);
                                this.f6394a = a3;
                                a3.mo6826a(dVar, a, d);
                                a3.mo6820a(dVar.mo6816a());
                                return;
                            }
                            C2284d g = dVar.mo6879g(a, d);
                            this.f6394a = g;
                            g.mo6820a(dVar.mo6816a());
                        } else if (z) {
                            C2284d a4 = mo7165a(pVar, dVar.mo6838d());
                            this.f6394a = a4;
                            a4.mo6824a(dVar);
                        } else {
                            this.f6394a = dVar;
                        }
                    } else {
                        this.f6394a = null;
                    }
                } catch (Throwable th) {
                    int d3 = dVar.mo6838d();
                    if (d3 > 0) {
                        int r2 = dVar.mo6882r();
                        boolean z2 = d3 != r2 && r2 > mo7162a();
                        if (this.f6536e > 0) {
                            int i2 = d - (this.f6536e - a);
                            if (z2) {
                                C2284d a5 = mo7165a(pVar, i2);
                                this.f6394a = a5;
                                a5.mo6826a(dVar, this.f6536e, i2);
                            } else {
                                this.f6394a = dVar.mo6879g(this.f6536e, i2);
                            }
                        } else if (this.f6536e == 0) {
                            if (z2) {
                                C2284d a6 = mo7165a(pVar, d);
                                this.f6394a = a6;
                                a6.mo6826a(dVar, a, d);
                                a6.mo6820a(dVar.mo6816a());
                            } else {
                                C2284d g2 = dVar.mo6879g(a, d);
                                this.f6394a = g2;
                                g2.mo6820a(dVar.mo6816a());
                            }
                        } else if (z2) {
                            C2284d a7 = mo7165a(pVar, dVar.mo6838d());
                            this.f6394a = a7;
                            a7.mo6824a(dVar);
                        } else {
                            this.f6394a = dVar;
                        }
                    } else {
                        this.f6394a = null;
                    }
                    throw th;
                }
            } else {
                C2284d a8 = mo7164a(dVar);
                try {
                    m9817a(pVar, apVar.mo6990a(), a8, this.f6534c, apVar.mo7007d());
                } finally {
                    mo7166a(pVar, a8);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public T mo7263b(T t) {
        T t2 = this.f6535d;
        this.f6535d = t;
        return t2;
    }

    /* access modifiers changed from: protected */
    @Override // org.p035a.p036a.p043d.p044a.p047c.C2436b
    /* renamed from: b */
    public final Object mo7169b(C2396p pVar, C2384f fVar, C2284d dVar) {
        return mo7264b(pVar, fVar, dVar, this.f6535d);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: MutableMD:(org.a.a.c.p, org.a.a.c.f, org.a.a.b.d, java.lang.Enum):java.lang.Object
     arg types: [org.a.a.c.p, org.a.a.c.f, org.a.a.b.d, T]
     candidates:
      org.a.a.d.a.c.b.a(org.a.a.c.p, org.a.a.c.f, org.a.a.b.d, java.net.SocketAddress):void
      MutableMD:(org.a.a.c.p, org.a.a.c.f, org.a.a.b.d, java.lang.Enum):java.lang.Object */
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public Object mo7264b(C2396p pVar, C2384f fVar, C2284d dVar, T t) {
        return mo7181a(pVar, fVar, dVar, (T) t);
    }

    /* access modifiers changed from: protected */
    @Override // org.p035a.p036a.p043d.p044a.p047c.C2436b
    /* renamed from: c */
    public C2284d mo7170c() {
        return super.mo7170c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo7265e() {
        C2284d dVar = this.f6394a;
        if (dVar != null) {
            this.f6536e = dVar.mo6816a();
        } else {
            this.f6536e = -1;
        }
    }

    /* access modifiers changed from: protected */
    @Override // org.p035a.p036a.p043d.p044a.p047c.C2436b
    /* renamed from: h */
    public void mo7171h(C2396p pVar, C2403w wVar) {
        try {
            C2284d dVar = this.f6394a;
            if (this.f6537f) {
                this.f6537f = false;
                this.f6534c.mo7268e();
                if (dVar != null && dVar.mo6836c()) {
                    m9817a(pVar, wVar.mo6990a(), dVar, this.f6534c, null);
                }
                Object b = mo7264b(pVar, wVar.mo6990a(), this.f6534c, this.f6535d);
                this.f6394a = null;
                if (b != null) {
                    mo7167a(pVar, (SocketAddress) null, b);
                }
            }
        } catch (C2474a e) {
        } catch (Throwable th) {
            pVar.mo6979a((C2387i) wVar);
            throw th;
        }
        pVar.mo6979a((C2387i) wVar);
    }
}
