package org.p035a.p036a.p039c;

import java.net.SocketAddress;
import java.util.Map;

/* renamed from: org.a.a.c.y */
public final class C2405y {
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: org.a.a.c.y.a(org.a.a.c.f, boolean):org.a.a.c.l
     arg types: [org.a.a.c.f, int]
     candidates:
      org.a.a.c.y.a(org.a.a.c.f, long):org.a.a.c.l
      org.a.a.c.y.a(org.a.a.c.f, java.lang.Throwable):org.a.a.c.l
      org.a.a.c.y.a(org.a.a.c.p, java.lang.Throwable):org.a.a.c.l
      org.a.a.c.y.a(org.a.a.c.f, java.lang.Object):void
      org.a.a.c.y.a(org.a.a.c.f, java.net.SocketAddress):void
      org.a.a.c.y.a(org.a.a.c.f, org.a.a.c.f):void
      org.a.a.c.y.a(org.a.a.c.p, org.a.a.c.l):void
      org.a.a.c.y.a(org.a.a.c.f, boolean):org.a.a.c.l */
    /* renamed from: a */
    public static C2390l m9534a(C2384f fVar) {
        return m9537a(fVar, false);
    }

    /* renamed from: a */
    public static C2390l m9535a(final C2384f fVar, final long j) {
        return fVar.mo6898d().mo6954a(new Runnable() {
            /* class org.p035a.p036a.p039c.C2405y.C24072 */

            public void run() {
                C2405y.m9554b(fVar, j);
            }
        });
    }

    /* renamed from: a */
    public static C2390l m9536a(C2384f fVar, Throwable th) {
        return new C2321am(fVar, th);
    }

    /* renamed from: a */
    public static C2390l m9537a(C2384f fVar, boolean z) {
        return new C2308ac(fVar, z);
    }

    /* renamed from: a */
    public static C2390l m9538a(final C2396p pVar, final Throwable th) {
        return pVar.mo6980b().mo6954a(new Runnable() {
            /* class org.p035a.p036a.p039c.C2405y.C24138 */

            public void run() {
                C2405y.m9556b(pVar, th);
            }
        });
    }

    /* renamed from: a */
    public static C2398r m9539a() {
        return new C2309ad();
    }

    /* renamed from: a */
    public static C2398r m9540a(C2398r rVar) {
        C2398r a = m9539a();
        for (Map.Entry<String, C2395o> entry : rVar.mo6972c().entrySet()) {
            a.mo6958a(entry.getKey(), entry.getValue());
        }
        return a;
    }

    /* renamed from: a */
    public static void m9541a(C2384f fVar, Object obj) {
        m9542a(fVar, obj, (SocketAddress) null);
    }

    /* renamed from: a */
    public static void m9542a(C2384f fVar, Object obj, SocketAddress socketAddress) {
        fVar.mo6898d().mo6961a(new C2336ay(fVar, obj, socketAddress));
    }

    /* renamed from: a */
    public static void m9543a(C2384f fVar, SocketAddress socketAddress) {
        fVar.mo6898d().mo6961a(new C2334ax(fVar, C2402v.BOUND, socketAddress));
    }

    /* renamed from: a */
    private static void m9544a(C2384f fVar, C2384f fVar2) {
        fVar.mo6898d().mo6961a(new C2312ae(fVar, fVar2));
    }

    /* renamed from: a */
    public static void m9545a(C2396p pVar, Object obj, SocketAddress socketAddress) {
        pVar.mo6979a((C2387i) new C2336ay(pVar.mo6977a(), obj, socketAddress));
    }

    /* renamed from: a */
    public static void m9546a(C2396p pVar, C2390l lVar) {
        pVar.mo6981b(new C2317aj(pVar.mo6977a(), lVar, C2402v.OPEN, Boolean.FALSE));
    }

    /* renamed from: a */
    public static void m9547a(C2396p pVar, C2390l lVar, Object obj) {
        m9548a(pVar, lVar, obj, null);
    }

    /* renamed from: a */
    public static void m9548a(C2396p pVar, C2390l lVar, Object obj, SocketAddress socketAddress) {
        pVar.mo6981b(new C2319ak(pVar.mo6977a(), lVar, obj, socketAddress));
    }

    /* renamed from: b */
    public static C2390l m9549b(C2384f fVar) {
        return fVar instanceof C2296a ? ((C2296a) fVar).mo6899e() : new C2333aw(fVar);
    }

    /* renamed from: b */
    public static C2390l m9550b(C2384f fVar, Object obj) {
        return m9551b(fVar, obj, null);
    }

    /* renamed from: b */
    public static C2390l m9551b(C2384f fVar, Object obj, SocketAddress socketAddress) {
        C2390l a = m9534a(fVar);
        fVar.mo6898d().mo6971b(new C2319ak(fVar, a, obj, socketAddress));
        return a;
    }

    /* renamed from: b */
    public static C2390l m9552b(final C2384f fVar, final Throwable th) {
        return fVar.mo6898d().mo6954a(new Runnable() {
            /* class org.p035a.p036a.p039c.C2405y.C24127 */

            public void run() {
                C2405y.m9559c(fVar, th);
            }
        });
    }

    /* renamed from: b */
    public static C2400t m9553b(final C2398r rVar) {
        return new C2400t() {
            /* class org.p035a.p036a.p039c.C2405y.C24061 */

            @Override // org.p035a.p036a.p039c.C2400t
            /* renamed from: a */
            public C2398r mo7144a() {
                return C2405y.m9540a(rVar);
            }
        };
    }

    /* renamed from: b */
    public static void m9554b(C2384f fVar, long j) {
        if (j != 0) {
            fVar.mo6898d().mo6961a(new C2316ai(fVar, j));
        }
    }

    /* renamed from: b */
    public static void m9555b(C2384f fVar, SocketAddress socketAddress) {
        fVar.mo6898d().mo6961a(new C2334ax(fVar, C2402v.CONNECTED, socketAddress));
    }

    /* renamed from: b */
    public static void m9556b(C2396p pVar, Throwable th) {
        pVar.mo6979a((C2387i) new C2313af(pVar.mo6977a(), th));
    }

    /* renamed from: c */
    public static C2390l m9557c(C2384f fVar, SocketAddress socketAddress) {
        if (socketAddress == null) {
            throw new NullPointerException("localAddress");
        }
        C2390l a = m9534a(fVar);
        fVar.mo6898d().mo6971b(new C2317aj(fVar, a, C2402v.BOUND, socketAddress));
        return a;
    }

    /* renamed from: c */
    public static void m9558c(C2384f fVar) {
        if (fVar.mo6895b() != null) {
            m9544a(fVar.mo6895b(), fVar);
        }
        fVar.mo6898d().mo6961a(new C2334ax(fVar, C2402v.OPEN, Boolean.TRUE));
    }

    /* renamed from: c */
    public static void m9559c(C2384f fVar, Throwable th) {
        fVar.mo6898d().mo6961a(new C2313af(fVar, th));
    }

    /* renamed from: d */
    public static C2390l m9560d(final C2384f fVar) {
        return fVar.mo6898d().mo6954a(new Runnable() {
            /* class org.p035a.p036a.p039c.C2405y.C24083 */

            public void run() {
                C2405y.m9561e(fVar);
            }
        });
    }

    /* renamed from: e */
    public static void m9561e(C2384f fVar) {
        fVar.mo6898d().mo6961a(new C2334ax(fVar, C2402v.INTEREST_OPS, 1));
    }

    /* renamed from: f */
    public static C2390l m9562f(final C2384f fVar) {
        return fVar.mo6898d().mo6954a(new Runnable() {
            /* class org.p035a.p036a.p039c.C2405y.C24094 */

            public void run() {
                C2405y.m9563g(fVar);
            }
        });
    }

    /* renamed from: g */
    public static void m9563g(C2384f fVar) {
        fVar.mo6898d().mo6961a(new C2334ax(fVar, C2402v.CONNECTED, null));
    }

    /* renamed from: h */
    public static C2390l m9564h(final C2384f fVar) {
        return fVar.mo6898d().mo6954a(new Runnable() {
            /* class org.p035a.p036a.p039c.C2405y.C24105 */

            public void run() {
                C2405y.m9565i(fVar);
            }
        });
    }

    /* renamed from: i */
    public static void m9565i(C2384f fVar) {
        fVar.mo6898d().mo6961a(new C2334ax(fVar, C2402v.BOUND, null));
    }

    /* renamed from: j */
    public static C2390l m9566j(final C2384f fVar) {
        return fVar.mo6898d().mo6954a(new Runnable() {
            /* class org.p035a.p036a.p039c.C2405y.C24116 */

            public void run() {
                C2405y.m9567k(fVar);
            }
        });
    }

    /* renamed from: k */
    public static void m9567k(C2384f fVar) {
        fVar.mo6898d().mo6961a(new C2334ax(fVar, C2402v.OPEN, Boolean.FALSE));
        if (fVar.mo6895b() != null) {
            m9544a(fVar.mo6895b(), fVar);
        }
    }

    /* renamed from: l */
    public static C2390l m9568l(C2384f fVar) {
        C2390l j = fVar.mo6906j();
        fVar.mo6898d().mo6971b(new C2317aj(fVar, j, C2402v.OPEN, Boolean.FALSE));
        return j;
    }
}
