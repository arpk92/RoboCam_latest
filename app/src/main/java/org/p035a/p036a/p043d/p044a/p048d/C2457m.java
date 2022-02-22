package org.p035a.p036a.p043d.p044a.p048d;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.p035a.p036a.p038b.C2284d;
import org.p035a.p036a.p038b.C2286f;
import org.p035a.p036a.p039c.C2323ao;
import org.p035a.p036a.p039c.C2324ap;
import org.p035a.p036a.p039c.C2329au;
import org.p035a.p036a.p039c.C2387i;
import org.p035a.p036a.p039c.C2396p;
import org.p035a.p036a.p039c.C2403w;
import org.p035a.p036a.p039c.C2405y;
import org.p035a.p036a.p043d.p044a.p046b.C2434g;

/* renamed from: org.a.a.d.a.d.m */
public abstract class C2457m extends C2329au implements C2323ao {

    /* renamed from: a */
    static final /* synthetic */ boolean f6426a = (!C2457m.class.desiredAssertionStatus());

    /* renamed from: b */
    private final Queue<String> f6427b = new ConcurrentLinkedQueue();

    /* renamed from: c */
    private volatile C2434g<C2284d> f6428c;

    protected C2457m() {
    }

    /* renamed from: a */
    private C2284d m9719a() {
        if (this.f6428c == null) {
            return C2286f.f6097c;
        }
        C2284d a = this.f6428c.mo7154a() ? C2286f.m8937a((C2284d[]) this.f6428c.mo7155a((Object[]) new C2284d[this.f6428c.mo7159e()])) : C2286f.f6097c;
        this.f6428c = null;
        return a;
    }

    /* renamed from: a */
    private C2284d m9720a(C2284d dVar) {
        this.f6428c.mo7161a(dVar);
        return C2286f.m8937a((C2284d[]) this.f6428c.mo7155a((Object[]) new C2284d[this.f6428c.mo7159e()]));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract String mo7212a(String str);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C2434g/*<Object>*/ mo7213a(C2460o oVar, String str);

    @Override // org.p035a.p036a.p039c.C2323ao
    /* renamed from: a */
    public void mo7009a(C2396p pVar) {
    }

    @Override // org.p035a.p036a.p039c.C2329au
    /* renamed from: a */
    public void mo7017a(C2396p pVar, C2324ap apVar) {
        Object c = apVar.mo7006c();
        if (!(c instanceof C2460o)) {
            pVar.mo6979a((C2387i) apVar);
            return;
        }
        String b = ((C2460o) c).mo7195b("Accept-Encoding");
        if (b == null) {
            b = "identity";
        }
        boolean offer = this.f6427b.offer(b);
        if (f6426a || offer) {
            pVar.mo6979a((C2387i) apVar);
            return;
        }
        throw new AssertionError();
    }

    @Override // org.p035a.p036a.p039c.C2323ao
    /* renamed from: b */
    public void mo7010b(C2396p pVar) {
    }

    @Override // org.p035a.p036a.p039c.C2329au
    /* renamed from: b */
    public void mo7022b(C2396p pVar, C2324ap apVar) {
        Object c = apVar.mo7006c();
        if ((c instanceof C2468u) && ((C2468u) c).mo7210g().mo7245a() == 100) {
            pVar.mo6981b(apVar);
        } else if (c instanceof C2460o) {
            C2460o oVar = (C2460o) c;
            m9719a();
            String poll = this.f6427b.poll();
            if (poll == null) {
                throw new IllegalStateException("cannot send more responses than requests");
            }
            String b = oVar.mo7195b("Content-Encoding");
            if (b == null || "identity".equalsIgnoreCase(b)) {
                if (oVar.mo7194a() || oVar.mo7203f().mo6836c()) {
                    C2434g<C2284d> a = mo7213a(oVar, poll);
                    this.f6428c = a;
                    if (a != null) {
                        oVar.mo7196b("Content-Encoding", mo7212a(poll));
                        if (!oVar.mo7194a()) {
                            C2284d a2 = C2286f.m8937a(m9720a(oVar.mo7203f()), m9719a());
                            oVar.mo7191a(a2);
                            if (oVar.mo7201d("Content-Length")) {
                                oVar.mo7196b("Content-Length", Integer.toString(a2.mo6838d()));
                            }
                        }
                    }
                }
                pVar.mo6981b(apVar);
                return;
            }
            pVar.mo6981b(apVar);
        } else if (c instanceof C2448f) {
            C2448f fVar = (C2448f) c;
            C2284d a3 = fVar.mo7172a();
            if (this.f6428c == null) {
                pVar.mo6981b(apVar);
            } else if (!fVar.mo7174b()) {
                C2284d a4 = m9720a(a3);
                if (a4.mo6836c()) {
                    fVar.mo7173a(a4);
                    pVar.mo6981b(apVar);
                }
            } else {
                C2284d a5 = m9719a();
                if (a5.mo6836c()) {
                    C2405y.m9548a(pVar, C2405y.m9549b(apVar.mo6990a()), new C2438a(a5), apVar.mo7007d());
                }
                pVar.mo6981b(apVar);
            }
        } else {
            pVar.mo6981b(apVar);
        }
    }

    @Override // org.p035a.p036a.p039c.C2323ao
    /* renamed from: c */
    public void mo7011c(C2396p pVar) {
    }

    @Override // org.p035a.p036a.p039c.C2323ao
    /* renamed from: d */
    public void mo7012d(C2396p pVar) {
        m9719a();
    }

    @Override // org.p035a.p036a.p039c.C2329au
    /* renamed from: g */
    public void mo7030g(C2396p pVar, C2403w wVar) {
        m9719a();
        super.mo7030g(pVar, wVar);
    }
}
