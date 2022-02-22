package org.p057b.p061c;

import java.lang.Thread;
import java.util.concurrent.Executor;
import org.p035a.p036a.p039c.C2320al;
import org.p035a.p036a.p039c.C2324ap;
import org.p035a.p036a.p039c.C2331av;
import org.p035a.p036a.p039c.C2396p;
import org.p035a.p036a.p039c.C2403w;
import org.p035a.p036a.p043d.p044a.p048d.p049a.C2440b;
import org.p057b.C2615k;

/* renamed from: org.b.c.u */
public class C2604u extends C2331av {

    /* renamed from: a */
    private final Executor f6998a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C2598s f6999b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C2615k f7000c;

    /* renamed from: d */
    private final C2564c f7001d;

    public C2604u(Executor executor, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, Thread.UncaughtExceptionHandler uncaughtExceptionHandler2, final C2598s sVar, final C2615k kVar) {
        this.f6998a = executor;
        this.f6999b = sVar;
        this.f7000c = kVar;
        this.f7001d = new C2564c(executor, uncaughtExceptionHandler, uncaughtExceptionHandler2) {
            /* class org.p057b.p061c.C2604u.C26051 */

            /* access modifiers changed from: protected */
            @Override // org.p057b.p061c.C2564c
            /* renamed from: a */
            public void mo7435a() {
                kVar.mo7409b(sVar);
            }
        };
    }

    @Override // org.p035a.p036a.p039c.C2331av
    /* renamed from: a */
    public void mo6813a(C2396p pVar, C2320al alVar) {
        this.f7001d.mo7436a(alVar);
    }

    @Override // org.p035a.p036a.p039c.C2331av
    /* renamed from: a */
    public void mo7037a(C2396p pVar, C2324ap apVar) {
        final Thread.UncaughtExceptionHandler a = this.f7001d.mo7434a(apVar.mo6990a());
        Object c = apVar.mo7006c();
        if (c instanceof C2569e) {
            ((C2569e) c).mo7443a(this.f7000c, this.f6999b, this.f6998a, a);
            return;
        }
        final C2440b bVar = (C2440b) c;
        this.f6998a.execute(new Runnable() {
            /* class org.p057b.p061c.C2604u.C26062 */

            public void run() {
                try {
                    C2604u.this.f7000c.mo7407a(C2604u.this.f6999b, bVar.mo7179d());
                } catch (Throwable th) {
                    a.uncaughtException(Thread.currentThread(), th);
                }
            }
        });
    }

    @Override // org.p035a.p036a.p039c.C2331av
    /* renamed from: f */
    public void mo7044f(C2396p pVar, C2403w wVar) {
        this.f7001d.mo7437a(wVar);
    }
}
