package org.p035a.p036a.p039c;

import org.p035a.p036a.p053e.C2491b;
import org.p035a.p036a.p053e.C2492c;

/* renamed from: org.a.a.c.av */
public class C2331av implements C2404x {

    /* renamed from: a */
    private static final C2491b f6205a = C2492c.m9930a(C2331av.class.getName());

    /* renamed from: a */
    public void mo6813a(C2396p pVar, C2320al alVar) {
        if (this == pVar.mo6980b().mo6955a()) {
            f6205a.mo7285b("EXCEPTION, please implement " + getClass().getName() + ".exceptionCaught() for proper handling.", alVar.mo6994c());
        }
        pVar.mo6979a((C2387i) alVar);
    }

    /* renamed from: a */
    public void mo7037a(C2396p pVar, C2324ap apVar) {
        pVar.mo6979a((C2387i) apVar);
    }

    /* renamed from: a */
    public void mo7038a(C2396p pVar, C2337az azVar) {
        pVar.mo6979a((C2387i) azVar);
    }

    /* renamed from: a */
    public void mo6814a(C2396p pVar, C2403w wVar) {
        pVar.mo6979a((C2387i) wVar);
    }

    /* renamed from: a */
    public void mo6815a(C2396p pVar, C2414z zVar) {
        pVar.mo6979a((C2387i) zVar);
    }

    @Override // org.p035a.p036a.p039c.C2404x
    /* renamed from: b */
    public void mo7023b(C2396p pVar, C2387i iVar) {
        if (iVar instanceof C2324ap) {
            mo7037a(pVar, (C2324ap) iVar);
        } else if (iVar instanceof C2337az) {
            mo7038a(pVar, (C2337az) iVar);
        } else if (iVar instanceof C2414z) {
            C2414z zVar = (C2414z) iVar;
            if (zVar.mo6992c().mo6902g()) {
                mo6815a(pVar, zVar);
            } else {
                mo7040b(pVar, zVar);
            }
        } else if (iVar instanceof C2403w) {
            C2403w wVar = (C2403w) iVar;
            switch (wVar.mo7003c()) {
                case OPEN:
                    if (Boolean.TRUE.equals(wVar.mo7004d())) {
                        mo6814a(pVar, wVar);
                        return;
                    } else {
                        mo7045g(pVar, wVar);
                        return;
                    }
                case BOUND:
                    if (wVar.mo7004d() != null) {
                        mo7039b(pVar, wVar);
                        return;
                    } else {
                        mo7044f(pVar, wVar);
                        return;
                    }
                case CONNECTED:
                    if (wVar.mo7004d() != null) {
                        mo7041c(pVar, wVar);
                        return;
                    } else {
                        mo7043e(pVar, wVar);
                        return;
                    }
                case INTEREST_OPS:
                    mo7042d(pVar, wVar);
                    return;
                default:
                    pVar.mo6979a(iVar);
                    return;
            }
        } else if (iVar instanceof C2320al) {
            mo6813a(pVar, (C2320al) iVar);
        } else {
            pVar.mo6979a(iVar);
        }
    }

    /* renamed from: b */
    public void mo7039b(C2396p pVar, C2403w wVar) {
        pVar.mo6979a((C2387i) wVar);
    }

    /* renamed from: b */
    public void mo7040b(C2396p pVar, C2414z zVar) {
        pVar.mo6979a((C2387i) zVar);
    }

    /* renamed from: c */
    public void mo7041c(C2396p pVar, C2403w wVar) {
        pVar.mo6979a((C2387i) wVar);
    }

    /* renamed from: d */
    public void mo7042d(C2396p pVar, C2403w wVar) {
        pVar.mo6979a((C2387i) wVar);
    }

    /* renamed from: e */
    public void mo7043e(C2396p pVar, C2403w wVar) {
        pVar.mo6979a((C2387i) wVar);
    }

    /* renamed from: f */
    public void mo7044f(C2396p pVar, C2403w wVar) {
        pVar.mo6979a((C2387i) wVar);
    }

    /* renamed from: g */
    public void mo7045g(C2396p pVar, C2403w wVar) {
        pVar.mo6979a((C2387i) wVar);
    }
}
