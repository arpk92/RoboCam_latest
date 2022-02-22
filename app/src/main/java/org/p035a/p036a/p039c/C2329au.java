package org.p035a.p036a.p039c;

import org.p035a.p036a.p053e.C2491b;
import org.p035a.p036a.p053e.C2492c;

/* renamed from: org.a.a.c.au */
public class C2329au implements C2386h, C2404x {

    /* renamed from: a */
    private static final C2491b f6203a = C2492c.m9930a(C2329au.class.getName());

    /* renamed from: a */
    public void mo7016a(C2396p pVar, C2320al alVar) {
        if (this == pVar.mo6980b().mo6955a()) {
            f6203a.mo7285b("EXCEPTION, please implement " + getClass().getName() + ".exceptionCaught() for proper handling.", alVar.mo6994c());
        }
        pVar.mo6979a((C2387i) alVar);
    }

    /* renamed from: a */
    public void mo7017a(C2396p pVar, C2324ap apVar) {
        pVar.mo6979a((C2387i) apVar);
    }

    /* renamed from: a */
    public void mo7018a(C2396p pVar, C2337az azVar) {
        pVar.mo6979a((C2387i) azVar);
    }

    @Override // org.p035a.p036a.p039c.C2386h
    /* renamed from: a */
    public void mo7019a(C2396p pVar, C2387i iVar) {
        if (iVar instanceof C2324ap) {
            mo7022b(pVar, (C2324ap) iVar);
        } else if (iVar instanceof C2403w) {
            C2403w wVar = (C2403w) iVar;
            switch (wVar.mo7003c()) {
                case OPEN:
                    if (!Boolean.TRUE.equals(wVar.mo7004d())) {
                        mo7036m(pVar, wVar);
                        return;
                    }
                    return;
                case BOUND:
                    if (wVar.mo7004d() != null) {
                        mo7031h(pVar, wVar);
                        return;
                    } else {
                        mo7035l(pVar, wVar);
                        return;
                    }
                case CONNECTED:
                    if (wVar.mo7004d() != null) {
                        mo7032i(pVar, wVar);
                        return;
                    } else {
                        mo7034k(pVar, wVar);
                        return;
                    }
                case INTEREST_OPS:
                    mo7033j(pVar, wVar);
                    return;
                default:
                    pVar.mo6981b(iVar);
                    return;
            }
        } else {
            pVar.mo6981b(iVar);
        }
    }

    /* renamed from: a */
    public void mo7020a(C2396p pVar, C2403w wVar) {
        pVar.mo6979a((C2387i) wVar);
    }

    /* renamed from: a */
    public void mo7021a(C2396p pVar, C2414z zVar) {
        pVar.mo6979a((C2387i) zVar);
    }

    /* renamed from: b */
    public void mo7022b(C2396p pVar, C2324ap apVar) {
        pVar.mo6981b(apVar);
    }

    @Override // org.p035a.p036a.p039c.C2404x
    /* renamed from: b */
    public void mo7023b(C2396p pVar, C2387i iVar) {
        if (iVar instanceof C2324ap) {
            mo7017a(pVar, (C2324ap) iVar);
        } else if (iVar instanceof C2337az) {
            mo7018a(pVar, (C2337az) iVar);
        } else if (iVar instanceof C2414z) {
            C2414z zVar = (C2414z) iVar;
            if (zVar.mo6992c().mo6902g()) {
                mo7021a(pVar, zVar);
            } else {
                mo7025b(pVar, zVar);
            }
        } else if (iVar instanceof C2403w) {
            C2403w wVar = (C2403w) iVar;
            switch (wVar.mo7003c()) {
                case OPEN:
                    if (Boolean.TRUE.equals(wVar.mo7004d())) {
                        mo7020a(pVar, wVar);
                        return;
                    } else {
                        mo7030g(pVar, wVar);
                        return;
                    }
                case BOUND:
                    if (wVar.mo7004d() != null) {
                        mo7024b(pVar, wVar);
                        return;
                    } else {
                        mo7029f(pVar, wVar);
                        return;
                    }
                case CONNECTED:
                    if (wVar.mo7004d() != null) {
                        mo7026c(pVar, wVar);
                        return;
                    } else {
                        mo7028e(pVar, wVar);
                        return;
                    }
                case INTEREST_OPS:
                    mo7027d(pVar, wVar);
                    return;
                default:
                    pVar.mo6979a(iVar);
                    return;
            }
        } else if (iVar instanceof C2320al) {
            mo7016a(pVar, (C2320al) iVar);
        } else {
            pVar.mo6979a(iVar);
        }
    }

    /* renamed from: b */
    public void mo7024b(C2396p pVar, C2403w wVar) {
        pVar.mo6979a((C2387i) wVar);
    }

    /* renamed from: b */
    public void mo7025b(C2396p pVar, C2414z zVar) {
        pVar.mo6979a((C2387i) zVar);
    }

    /* renamed from: c */
    public void mo7026c(C2396p pVar, C2403w wVar) {
        pVar.mo6979a((C2387i) wVar);
    }

    /* renamed from: d */
    public void mo7027d(C2396p pVar, C2403w wVar) {
        pVar.mo6979a((C2387i) wVar);
    }

    /* renamed from: e */
    public void mo7028e(C2396p pVar, C2403w wVar) {
        pVar.mo6979a((C2387i) wVar);
    }

    /* renamed from: f */
    public void mo7029f(C2396p pVar, C2403w wVar) {
        pVar.mo6979a((C2387i) wVar);
    }

    /* renamed from: g */
    public void mo7030g(C2396p pVar, C2403w wVar) {
        pVar.mo6979a((C2387i) wVar);
    }

    /* renamed from: h */
    public void mo7031h(C2396p pVar, C2403w wVar) {
        pVar.mo6981b(wVar);
    }

    /* renamed from: i */
    public void mo7032i(C2396p pVar, C2403w wVar) {
        pVar.mo6981b(wVar);
    }

    /* renamed from: j */
    public void mo7033j(C2396p pVar, C2403w wVar) {
        pVar.mo6981b(wVar);
    }

    /* renamed from: k */
    public void mo7034k(C2396p pVar, C2403w wVar) {
        pVar.mo6981b(wVar);
    }

    /* renamed from: l */
    public void mo7035l(C2396p pVar, C2403w wVar) {
        pVar.mo6981b(wVar);
    }

    /* renamed from: m */
    public void mo7036m(C2396p pVar, C2403w wVar) {
        pVar.mo6981b(wVar);
    }
}
