package org.p035a.p036a.p054f.p055a;

import java.util.concurrent.Executor;

/* renamed from: org.a.a.f.a.d */
public final class C2529d {

    /* renamed from: a */
    public static final ThreadLocal<Executor> f6807a = new ThreadLocal<>();

    /* renamed from: a */
    public static void m10053a(final Executor executor, final Runnable runnable) {
        if (executor == null) {
            throw new NullPointerException("parent");
        } else if (runnable == null) {
            throw new NullPointerException("runnable");
        } else {
            executor.execute(new Runnable() {
                /* class org.p035a.p036a.p054f.p055a.C2529d.C25301 */

                public void run() {
                    C2529d.f6807a.set(executor);
                    try {
                        runnable.run();
                    } finally {
                        C2529d.f6807a.remove();
                    }
                }
            });
        }
    }
}
