package org.p035a.p036a.p039c.p041b;

import org.p035a.p036a.p039c.C2308ac;
import org.p035a.p036a.p039c.C2384f;

/* renamed from: org.a.a.c.b.a */
public class C2339a extends C2308ac implements Runnable {

    /* renamed from: a */
    private final Runnable f6214a;

    /* renamed from: b */
    private boolean f6215b;

    public C2339a(C2384f fVar, Runnable runnable) {
        super(fVar, true);
        this.f6214a = runnable;
    }

    public void run() {
        synchronized (this) {
            if (!mo6952j()) {
                this.f6215b = true;
                try {
                    this.f6214a.run();
                    mo6909a();
                } catch (Throwable th) {
                    mo6910a(th);
                }
            }
        }
    }
}
