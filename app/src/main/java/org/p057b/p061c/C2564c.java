package org.p057b.p061c;

import java.lang.Thread;
import java.nio.channels.ClosedChannelException;
import java.util.concurrent.Executor;
import org.p035a.p036a.p039c.C2320al;
import org.p035a.p036a.p039c.C2384f;
import org.p035a.p036a.p039c.C2403w;
import org.p057b.C2616l;

/* renamed from: org.b.c.c */
abstract class C2564c {

    /* renamed from: a */
    protected final Executor f6848a;

    /* renamed from: b */
    protected final Thread.UncaughtExceptionHandler f6849b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Thread.UncaughtExceptionHandler f6850c;

    public C2564c(Executor executor, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, Thread.UncaughtExceptionHandler uncaughtExceptionHandler2) {
        this.f6850c = uncaughtExceptionHandler2;
        this.f6848a = executor;
        this.f6849b = uncaughtExceptionHandler;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Thread.UncaughtExceptionHandler mo7434a(final C2384f fVar) {
        return new Thread.UncaughtExceptionHandler() {
            /* class org.p057b.p061c.C2564c.C25673 */

            public void uncaughtException(Thread thread, Throwable th) {
                C2564c.this.f6849b.uncaughtException(thread, C2616l.m10277a(th, fVar));
            }
        };
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo7435a();

    /* renamed from: a */
    public void mo7436a(final C2320al alVar) {
        if (alVar.mo6994c() instanceof ClosedChannelException) {
            alVar.mo6990a().mo6905i();
            return;
        }
        final Thread currentThread = Thread.currentThread();
        this.f6848a.execute(new Runnable() {
            /* class org.p057b.p061c.C2564c.C25662 */

            public void run() {
                C2564c.this.f6850c.uncaughtException(currentThread, C2616l.m10278a(alVar));
            }
        });
    }

    /* renamed from: a */
    public void mo7437a(C2403w wVar) {
        final Thread currentThread = Thread.currentThread();
        final Thread.UncaughtExceptionHandler a = mo7434a(wVar.mo6990a());
        this.f6848a.execute(new Runnable() {
            /* class org.p057b.p061c.C2564c.C25651 */

            public void run() {
                try {
                    C2564c.this.mo7435a();
                } catch (Throwable th) {
                    a.uncaughtException(currentThread, th);
                }
            }
        });
    }
}
