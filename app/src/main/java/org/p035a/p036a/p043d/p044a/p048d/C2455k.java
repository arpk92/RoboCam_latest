package org.p035a.p036a.p043d.p044a.p048d;

import org.p035a.p036a.p038b.C2284d;
import org.p035a.p036a.p038b.C2286f;
import org.p035a.p036a.p039c.C2323ao;
import org.p035a.p036a.p039c.C2324ap;
import org.p035a.p036a.p039c.C2331av;
import org.p035a.p036a.p039c.C2387i;
import org.p035a.p036a.p039c.C2396p;
import org.p035a.p036a.p039c.C2403w;
import org.p035a.p036a.p039c.C2405y;
import org.p035a.p036a.p043d.p044a.p046b.C2430c;

/* renamed from: org.a.a.d.a.d.k */
public abstract class C2455k extends C2331av implements C2323ao {

    /* renamed from: a */
    private C2430c<C2284d> f6425a;

    protected C2455k() {
    }

    /* renamed from: a */
    private C2284d m9708a() {
        if (this.f6425a == null) {
            return C2286f.f6097c;
        }
        C2284d a = this.f6425a.mo7154a() ? C2286f.m8937a((C2284d[]) this.f6425a.mo7155a((Object[]) new C2284d[this.f6425a.mo7159e()])) : C2286f.f6097c;
        this.f6425a = null;
        return a;
    }

    /* renamed from: a */
    private C2284d m9709a(C2284d dVar) {
        this.f6425a.mo7160a(dVar);
        return C2286f.m8937a((C2284d[]) this.f6425a.mo7155a((Object[]) new C2284d[this.f6425a.mo7159e()]));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C2430c<C2284d> mo7214a(String str);

    @Override // org.p035a.p036a.p039c.C2323ao
    /* renamed from: a */
    public void mo7009a(C2396p pVar) {
    }

    @Override // org.p035a.p036a.p039c.C2331av
    /* renamed from: a */
    public void mo7037a(C2396p pVar, C2324ap apVar) {
        Object c = apVar.mo7006c();
        if ((c instanceof C2468u) && ((C2468u) c).mo7210g().mo7245a() == 100) {
            pVar.mo6979a((C2387i) apVar);
        } else if (c instanceof C2460o) {
            C2460o oVar = (C2460o) c;
            m9708a();
            String b = oVar.mo7195b("Content-Encoding");
            String trim = b != null ? b.trim() : "identity";
            if (oVar.mo7194a() || oVar.mo7203f().mo6836c()) {
                C2430c<C2284d> a = mo7214a(trim);
                this.f6425a = a;
                if (a != null) {
                    oVar.mo7196b("Content-Encoding", mo7215b(trim));
                    if (!oVar.mo7194a()) {
                        C2284d a2 = C2286f.m8937a(m9709a(oVar.mo7203f()), m9708a());
                        oVar.mo7191a(a2);
                        if (oVar.mo7201d("Content-Length")) {
                            oVar.mo7196b("Content-Length", Integer.toString(a2.mo6838d()));
                        }
                    }
                }
            }
            pVar.mo6979a((C2387i) apVar);
        } else if (c instanceof C2448f) {
            C2448f fVar = (C2448f) c;
            C2284d a3 = fVar.mo7172a();
            if (this.f6425a == null) {
                pVar.mo6979a((C2387i) apVar);
            } else if (!fVar.mo7174b()) {
                C2284d a4 = m9709a(a3);
                if (a4.mo6836c()) {
                    fVar.mo7173a(a4);
                    pVar.mo6979a((C2387i) apVar);
                }
            } else {
                C2284d a5 = m9708a();
                if (a5.mo6836c()) {
                    C2405y.m9545a(pVar, new C2438a(a5), apVar.mo7007d());
                }
                pVar.mo6979a((C2387i) apVar);
            }
        } else {
            pVar.mo6979a((C2387i) apVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public String mo7215b(String str) {
        return "identity";
    }

    @Override // org.p035a.p036a.p039c.C2323ao
    /* renamed from: b */
    public void mo7010b(C2396p pVar) {
    }

    @Override // org.p035a.p036a.p039c.C2323ao
    /* renamed from: c */
    public void mo7011c(C2396p pVar) {
    }

    @Override // org.p035a.p036a.p039c.C2323ao
    /* renamed from: d */
    public void mo7012d(C2396p pVar) {
        m9708a();
    }

    @Override // org.p035a.p036a.p039c.C2331av
    /* renamed from: g */
    public void mo7045g(C2396p pVar, C2403w wVar) {
        m9708a();
        super.mo7045g(pVar, wVar);
    }
}
