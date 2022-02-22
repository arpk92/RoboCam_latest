package org.p057b.p061c;

import java.lang.Thread;

/* renamed from: org.b.c.b */
public abstract class C2563b implements Runnable {

    /* renamed from: a */
    private final Thread.UncaughtExceptionHandler f6847a;

    public C2563b(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f6847a = uncaughtExceptionHandler;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo7432a();

    public void run() {
        try {
            mo7432a();
        } catch (Throwable th) {
            this.f6847a.uncaughtException(Thread.currentThread(), th);
        }
    }
}
