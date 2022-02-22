package org.p057b.p061c;

import java.lang.Thread;
import java.util.Iterator;
import java.util.concurrent.Executor;
import org.p035a.p036a.p039c.C2384f;
import org.p035a.p036a.p039c.C2395o;
import org.p035a.p036a.p039c.C2396p;
import org.p035a.p036a.p039c.C2398r;
import org.p035a.p036a.p043d.p044a.p048d.C2466s;
import org.p035a.p036a.p043d.p044a.p048d.C2468u;
import org.p057b.C2608d;
import org.p057b.C2609e;
import org.p057b.C2610f;
import org.p057b.C2611g;
import org.p057b.C2614j;
import org.p057b.C2615k;
import org.p057b.C2616l;

/* renamed from: org.b.c.o */
public class C2590o implements C2608d {

    /* renamed from: a */
    private final Iterator<C2609e> f6939a;

    /* renamed from: b */
    private final Executor f6940b;

    /* renamed from: c */
    private final C2396p f6941c;

    /* renamed from: d */
    private final C2591p f6942d;

    /* renamed from: e */
    private final C2466s f6943e;

    /* renamed from: f */
    private final C2468u f6944f;

    /* renamed from: g */
    private final Thread.UncaughtExceptionHandler f6945g;

    /* renamed from: h */
    private final Thread.UncaughtExceptionHandler f6946h;

    /* renamed from: i */
    private C2610f f6947i;

    /* renamed from: j */
    private C2611g f6948j;

    /* renamed from: k */
    private C2608d f6949k = this;

    /* renamed from: l */
    private C2598s f6950l;

    public C2590o(Iterator<C2609e> it, Executor executor, C2396p pVar, C2591p pVar2, C2592q qVar, C2466s sVar, C2468u uVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, Thread.UncaughtExceptionHandler uncaughtExceptionHandler2) {
        this.f6939a = it;
        this.f6940b = executor;
        this.f6941c = pVar;
        this.f6942d = pVar2;
        this.f6948j = qVar;
        this.f6943e = sVar;
        this.f6944f = uVar;
        this.f6946h = uncaughtExceptionHandler2;
        this.f6945g = uncaughtExceptionHandler;
        this.f6947i = pVar2;
    }

    /* renamed from: a */
    private void m10158a(C2395o oVar, C2395o oVar2, C2398r rVar, C2384f fVar) {
        ((C2600t) rVar.mo6956a("staleconnectiontracker")).mo7501a(fVar);
        rVar.mo6956a("aggregator");
        rVar.mo6966b("decoder", "wsdecoder", oVar);
        rVar.mo6966b("handler", "wshandler", oVar2);
    }

    /* renamed from: a */
    private void m10159a(C2395o oVar, C2398r rVar) {
        rVar.mo6966b("encoder", "wsencoder", oVar);
    }

    /* renamed from: a */
    private void m10160a(C2598s sVar, C2395o oVar) {
        C2607v[] vVarArr = {new C2580k(this.f6943e, this.f6944f), new C2579j(this.f6943e, this.f6944f), new C2578i(this.f6943e, this.f6944f)};
        C2384f a = this.f6941c.mo6977a();
        C2398r d = a.mo6898d();
        for (C2607v vVar : vVarArr) {
            if (vVar.mo7446a()) {
                m10158a(vVar.mo7447b(), oVar, d, a);
                vVar.mo7445a(sVar);
                a.mo6892a(this.f6944f);
                m10159a(vVar.mo7448c(), d);
                return;
            }
        }
    }

    @Override // org.p057b.C2608d
    /* renamed from: a */
    public C2614j mo7452a(C2615k kVar) {
        C2598s b = mo7456b();
        m10160a(b, new C2604u(this.f6940b, this.f6945g, this.f6946h, b, kVar));
        try {
            kVar.mo7406a(b);
        } catch (Throwable th) {
            this.f6945g.uncaughtException(Thread.currentThread(), new C2616l(th));
        }
        return b;
    }

    @Override // org.p057b.C2608d
    /* renamed from: a */
    public void mo7453a() {
        mo7455a(this.f6947i, this.f6948j, this.f6949k);
    }

    @Override // org.p057b.C2608d
    /* renamed from: a */
    public void mo7454a(C2610f fVar, C2611g gVar) {
        mo7455a(fVar, gVar, this.f6949k);
    }

    /* renamed from: a */
    public void mo7455a(C2610f fVar, C2611g gVar, C2608d dVar) {
        this.f6947i = fVar;
        this.f6948j = gVar;
        this.f6949k = dVar;
        if (this.f6939a.hasNext()) {
            try {
                this.f6939a.next().mo7412a(fVar, gVar, dVar);
            } catch (Throwable th) {
                gVar.mo7467a(th);
            }
        } else {
            gVar.mo7464a(404).mo7463a();
        }
    }

    /* renamed from: b */
    public C2598s mo7456b() {
        if (this.f6950l == null) {
            this.f6950l = new C2598s(this.f6940b, this.f6942d, this.f6941c, null);
        }
        return this.f6950l;
    }

    /* renamed from: c */
    public Executor mo7457c() {
        return this.f6940b;
    }

    public void execute(Runnable runnable) {
        mo7457c().execute(runnable);
    }
}
