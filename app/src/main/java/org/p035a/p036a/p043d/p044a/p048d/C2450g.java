package org.p035a.p036a.p043d.p044a.p048d;

import java.util.List;
import java.util.Map;
import org.p035a.p036a.p038b.C2284d;
import org.p035a.p036a.p038b.C2286f;
import org.p035a.p036a.p038b.C2287g;
import org.p035a.p036a.p039c.C2323ao;
import org.p035a.p036a.p039c.C2324ap;
import org.p035a.p036a.p039c.C2331av;
import org.p035a.p036a.p039c.C2387i;
import org.p035a.p036a.p039c.C2396p;
import org.p035a.p036a.p039c.C2405y;
import org.p035a.p036a.p043d.p044a.p047c.C2437c;
import org.p035a.p036a.p054f.C2496a;

/* renamed from: org.a.a.d.a.d.g */
public class C2450g extends C2331av implements C2323ao {

    /* renamed from: a */
    private static final C2284d f6416a = C2286f.m8925a("HTTP/1.1 100 Continue\r\n\r\n", C2496a.f6594f);

    /* renamed from: b */
    private final int f6417b;

    /* renamed from: c */
    private C2460o f6418c;

    /* renamed from: d */
    private C2396p f6419d;

    /* renamed from: e */
    private int f6420e = 1024;

    public C2450g(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("maxContentLength must be a positive integer: " + i);
        }
        this.f6417b = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo7211a(C2284d dVar) {
        C2284d f = this.f6418c.mo7203f();
        if (f instanceof C2287g) {
            C2287g gVar = (C2287g) f;
            if (gVar.mo6889v() >= this.f6420e) {
                this.f6418c.mo7191a(C2286f.m8937a(gVar.mo6854k(), dVar));
                return;
            }
            List<C2284d> i = gVar.mo6887i(0, gVar.mo6838d());
            C2284d[] dVarArr = (C2284d[]) i.toArray(new C2284d[(i.size() + 1)]);
            dVarArr[dVarArr.length - 1] = dVar;
            this.f6418c.mo7191a(C2286f.m8937a(dVarArr));
            return;
        }
        this.f6418c.mo7191a(C2286f.m8937a(f, dVar));
    }

    @Override // org.p035a.p036a.p039c.C2323ao
    /* renamed from: a */
    public void mo7009a(C2396p pVar) {
        this.f6419d = pVar;
    }

    @Override // org.p035a.p036a.p039c.C2331av
    /* renamed from: a */
    public void mo7037a(C2396p pVar, C2324ap apVar) {
        Object c = apVar.mo7006c();
        C2460o oVar = this.f6418c;
        if (c instanceof C2460o) {
            C2460o oVar2 = (C2460o) c;
            if (C2458n.m9737b(oVar2)) {
                C2405y.m9547a(pVar, C2405y.m9549b(pVar.mo6977a()), f6416a.mo6871q());
            }
            if (oVar2.mo7194a()) {
                List<String> c2 = oVar2.mo7198c("Transfer-Encoding");
                c2.remove("chunked");
                if (c2.isEmpty()) {
                    oVar2.mo7187a("Transfer-Encoding");
                }
                oVar2.mo7193a(false);
                this.f6418c = oVar2;
                return;
            }
            this.f6418c = null;
            pVar.mo6979a((C2387i) apVar);
        } else if (!(c instanceof C2448f)) {
            pVar.mo6979a((C2387i) apVar);
        } else if (oVar == null) {
            throw new IllegalStateException("received " + C2448f.class.getSimpleName() + " without " + C2460o.class.getSimpleName());
        } else {
            C2448f fVar = (C2448f) c;
            C2284d f = oVar.mo7203f();
            if (f.mo6838d() > this.f6417b - fVar.mo7172a().mo6838d()) {
                try {
                    throw new C2437c("HTTP content length exceeded " + this.f6417b + " bytes.");
                } catch (C2437c c2437c) {
                    c2437c.printStackTrace();
                }
            }
            mo7211a(fVar.mo7172a());
            if (fVar.mo7174b()) {
                this.f6418c = null;
                if (fVar instanceof C2451h) {
                    for (Map.Entry<String, String> entry : ((C2451h) fVar).mo7185c()) {
                        oVar.mo7196b(entry.getKey(), entry.getValue());
                    }
                }
                oVar.mo7196b("Content-Length", String.valueOf(f.mo6838d()));
                C2405y.m9545a(pVar, oVar, apVar.mo7007d());
            }
        }
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
    }
}
