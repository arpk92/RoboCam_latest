package org.p035a.p036a.p054f.p055a;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: org.a.a.f.a.f */
public final class C2533f {
    /* renamed from: a */
    public static void m10059a(ThreadLocal<Executor> threadLocal, Executor... executorArr) {
        boolean z = false;
        if (executorArr == null) {
            throw new NullPointerException("executors");
        }
        Executor[] executorArr2 = new Executor[executorArr.length];
        for (int i = 0; i < executorArr.length; i++) {
            if (executorArr[i] == null) {
                throw new NullPointerException("executors[" + i + "]");
            }
            executorArr2[i] = executorArr[i];
        }
        Executor executor = threadLocal.get();
        if (executor != null) {
            for (Executor executor2 : executorArr2) {
                if (executor2 == executor) {
                    throw new IllegalStateException("An Executor cannot be shut down from the thread acquired from itself.  Please make sure you are not calling releaseExternalResources() from an I/O worker thread.");
                }
            }
        }
        int length = executorArr2.length;
        int i2 = 0;
        while (i2 < length) {
            Executor executor3 = executorArr2[i2];
            if (executor3 instanceof ExecutorService) {
                ExecutorService executorService = (ExecutorService) executor3;
                while (true) {
                    try {
                        executorService.shutdownNow();
                    } catch (SecurityException e) {
                        try {
                            executorService.shutdown();
                        } catch (SecurityException e2) {
                        } catch (NullPointerException e3) {
                        }
                    } catch (NullPointerException e4) {
                    }
                    try {
                        if (executorService.awaitTermination(100, TimeUnit.MILLISECONDS)) {
                            break;
                        }
                    } catch (InterruptedException e5) {
                        z = true;
                    }
                }
            }
            i2++;
            z = z;
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    /* renamed from: a */
    public static void m10060a(Executor... executorArr) {
        m10059a(C2529d.f6807a, executorArr);
    }
}
