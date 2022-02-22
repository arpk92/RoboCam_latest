package org.p057b.p061c;

import java.lang.Thread;
import java.util.List;
import java.util.concurrent.Executor;
import org.p035a.p036a.p039c.C2320al;
import org.p035a.p036a.p039c.C2324ap;
import org.p035a.p036a.p039c.C2331av;
import org.p035a.p036a.p039c.C2396p;
import org.p035a.p036a.p043d.p044a.p048d.C2447e;
import org.p035a.p036a.p043d.p044a.p048d.C2458n;
import org.p035a.p036a.p043d.p044a.p048d.C2460o;
import org.p035a.p036a.p043d.p044a.p048d.C2466s;
import org.p035a.p036a.p043d.p044a.p048d.C2470w;
import org.p035a.p036a.p043d.p044a.p048d.C2471x;
import org.p057b.C2609e;
import org.p057b.C2616l;

/* renamed from: org.b.c.n */
public class C2586n extends C2331av {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final Object f6921a = new Object();

    /* renamed from: b */
    private final Executor f6922b;

    /* renamed from: c */
    private final List<C2609e> f6923c;

    /* renamed from: d */
    private final Object f6924d;

    /* renamed from: e */
    private final long f6925e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final Thread.UncaughtExceptionHandler f6926f;

    /* renamed from: g */
    private final Thread.UncaughtExceptionHandler f6927g;

    /* renamed from: h */
    private final C2564c f6928h;

    public C2586n(Executor executor, List<C2609e> list, Object obj, long j, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, Thread.UncaughtExceptionHandler uncaughtExceptionHandler2) {
        this.f6922b = executor;
        this.f6923c = list;
        this.f6924d = obj;
        this.f6925e = j;
        this.f6926f = uncaughtExceptionHandler;
        this.f6927g = uncaughtExceptionHandler2;
        this.f6928h = new C2564c(executor, uncaughtExceptionHandler, uncaughtExceptionHandler2) {
            /* class org.p057b.p061c.C2586n.C25871 */

            /* access modifiers changed from: protected */
            @Override // org.p057b.p061c.C2564c
            /* renamed from: a */
            public void mo7435a() {
                throw new UnsupportedOperationException();
            }
        };
    }

    /* renamed from: a */
    private void m10154a(final C2396p pVar, C2324ap apVar, C2466s sVar) {
        final C2591p pVar2 = new C2591p(apVar, sVar, this.f6924d, this.f6925e);
        C2447e eVar = new C2447e(C2471x.f6527b, C2470w.f6501d);
        final C2592q qVar = new C2592q(pVar, eVar, C2458n.m9736a((C2460o) sVar), this.f6926f);
        final C2590o oVar = new C2590o(this.f6923c.iterator(), this.f6922b, pVar, pVar2, qVar, sVar, eVar, this.f6926f, this.f6927g);
        this.f6922b.execute(new Runnable() {
            /* class org.p057b.p061c.C2586n.C25882 */

            public void run() {
                try {
                    oVar.mo7454a(pVar2, qVar);
                } catch (Exception e) {
                    C2586n.this.f6926f.uncaughtException(Thread.currentThread(), C2616l.m10277a(e, pVar.mo6977a()));
                }
            }
        });
    }

    @Override // org.p035a.p036a.p039c.C2331av
    /* renamed from: a */
    public void mo6813a(final C2396p pVar, final C2320al alVar) {
        this.f6928h.mo7436a(alVar);
        final C2592q qVar = new C2592q(pVar, new C2447e(C2471x.f6527b, C2470w.f6489P), true, this.f6926f);
        this.f6922b.execute(new Runnable() {
            /* class org.p057b.p061c.C2586n.C25893 */

            public void run() {
                try {
                    pVar.mo6978a(C2586n.f6921a);
                    qVar.mo7467a(alVar.mo6994c());
                } catch (Exception e) {
                    C2586n.this.f6926f.uncaughtException(Thread.currentThread(), C2616l.m10277a(e, pVar.mo6977a()));
                }
            }
        });
    }

    @Override // org.p035a.p036a.p039c.C2331av
    /* renamed from: a */
    public void mo7037a(C2396p pVar, C2324ap apVar) {
        if (!(apVar.mo7006c() instanceof C2466s) || pVar.mo6984e() == f6921a) {
            super.mo7037a(pVar, apVar);
        } else {
            m10154a(pVar, apVar, (C2466s) apVar.mo7006c());
        }
    }
}
