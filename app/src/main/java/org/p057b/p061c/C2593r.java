package org.p057b.p061c;

import java.lang.Thread;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLEngine;
import org.p035a.p036a.p037a.C2279b;
import org.p035a.p036a.p039c.C2384f;
import org.p035a.p036a.p039c.C2398r;
import org.p035a.p036a.p039c.C2400t;
import org.p035a.p036a.p039c.C2405y;
import org.p035a.p036a.p039c.p041b.p042a.C2352k;
import org.p035a.p036a.p043d.p044a.p048d.C2450g;
import org.p035a.p036a.p043d.p044a.p048d.C2453j;
import org.p035a.p036a.p043d.p044a.p048d.C2456l;
import org.p035a.p036a.p043d.p044a.p048d.C2467t;
import org.p035a.p036a.p043d.p044a.p048d.C2469v;
import org.p035a.p036a.p043d.p052b.C2482d;
import org.p057b.C2609e;
import org.p057b.C2612h;
import org.p057b.C2615k;
import org.p057b.p058a.C2547a;
import org.p057b.p058a.C2550b;
import org.p057b.p058a.C2551c;
import org.p057b.p058a.C2552d;
import org.p057b.p058a.p059a.C2548a;
import org.p057b.p058a.p059a.C2549b;
import org.p057b.p060b.C2557c;

/* renamed from: org.b.c.r */
public class C2593r implements C2612h {

    /* renamed from: a */
    protected long f6964a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final SocketAddress f6965b;

    /* renamed from: c */
    private final URI f6966c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final List<C2609e> f6967d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final List<ExecutorService> f6968e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final Executor f6969f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C2279b f6970g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C2384f f6971h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public SSLContext f6972i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public Thread.UncaughtExceptionHandler f6973j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public Thread.UncaughtExceptionHandler f6974k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public C2568d f6975l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public C2600t f6976m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public long f6977n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public int f6978o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public int f6979p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public int f6980q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public int f6981r;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: org.b.c.r.<init>(java.util.concurrent.ExecutorService, int):void
     arg types: [java.util.concurrent.ScheduledExecutorService, int]
     candidates:
      org.b.c.r.<init>(java.util.concurrent.Executor, int):void
      org.b.c.r.<init>(java.util.concurrent.ExecutorService, int):void */
    public C2593r(int i) {
        this((ExecutorService) Executors.newSingleThreadScheduledExecutor(new C2557c("WEBBIT-HANDLER-THREAD")), i);
    }

    public C2593r(Executor executor, int i) {
        this(executor, new InetSocketAddress(i), m10188a(i));
    }

    public C2593r(Executor executor, SocketAddress socketAddress, URI uri) {
        this.f6967d = new ArrayList();
        this.f6968e = new ArrayList();
        this.f6964a = 1;
        this.f6977n = 5000;
        this.f6978o = 4096;
        this.f6979p = 8192;
        this.f6980q = 8192;
        this.f6981r = 65536;
        this.f6969f = executor;
        this.f6965b = socketAddress;
        this.f6966c = uri;
        mo7477a(new C2548a());
        mo7481b(new C2549b());
        mo7482c();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: org.b.c.r.<init>(java.util.concurrent.Executor, int):void
     arg types: [java.util.concurrent.ExecutorService, int]
     candidates:
      org.b.c.r.<init>(java.util.concurrent.ExecutorService, int):void
      org.b.c.r.<init>(java.util.concurrent.Executor, int):void */
    private C2593r(ExecutorService executorService, int i) {
        this((Executor) executorService, i);
        this.f6968e.add(executorService);
    }

    /* renamed from: a */
    private static URI m10188a(int i) {
        try {
            return URI.create("http://" + InetAddress.getLocalHost().getHostName() + (i == 80 ? "" : ":" + i) + "/");
        } catch (UnknownHostException e) {
            throw new RuntimeException("can not create URI from localhost hostname - use constructor to pass an explicit URI", e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m10194a(ExecutorService executorService) {
        executorService.shutdown();
        try {
            if (!executorService.awaitTermination(5, TimeUnit.SECONDS)) {
                executorService.shutdownNow();
                if (!executorService.awaitTermination(5, TimeUnit.SECONDS)) {
                    System.err.println("ExecutorService did not terminate");
                }
            }
        } catch (InterruptedException e) {
            executorService.shutdownNow();
            Thread.currentThread().interrupt();
        }
    }

    /* Return type fixed from 'java.util.concurrent.Future<org.b.c.r>' to match base method */
    @Override // org.p057b.C2553b
    /* renamed from: a */
    public Future<? extends C2612h> mo7415a() {
        FutureTask futureTask = new FutureTask(new Callable<C2593r>() {
            /* class org.p057b.p061c.C2593r.C25941 */

            /* renamed from: a */
            public C2593r call() {
                if (C2593r.this.mo7484e()) {
                    throw new IllegalStateException("Server already started.");
                }
                C2279b unused = C2593r.this.f6970g = new C2279b();
                C2593r.this.f6970g.mo6807a(new C2400t() {
                    /* class org.p057b.p061c.C2593r.C25941.C25951 */

                    @Override // org.p035a.p036a.p039c.C2400t
                    /* renamed from: a */
                    public C2398r mo7144a() {
                        long f = C2593r.this.mo7485f();
                        Object g = C2593r.this.mo7486g();
                        C2398r a = C2405y.m9539a();
                        if (C2593r.this.f6972i != null) {
                            SSLEngine createSSLEngine = C2593r.this.f6972i.createSSLEngine();
                            createSSLEngine.setUseClientMode(false);
                            C2482d dVar = new C2482d(createSSLEngine);
                            dVar.mo7277a(true);
                            a.mo6958a("ssl", dVar);
                        }
                        a.mo6958a("staleconnectiontracker", C2593r.this.f6976m);
                        a.mo6958a("connectiontracker", C2593r.this.f6975l);
                        a.mo6958a("flashpolicydecoder", new C2575g(C2593r.this.f6969f, C2593r.this.f6973j, C2593r.this.f6974k, C2593r.this.mo7483d()));
                        a.mo6958a("decoder", new C2467t(C2593r.this.f6978o, C2593r.this.f6979p, C2593r.this.f6980q));
                        a.mo6958a("aggregator", new C2450g(C2593r.this.f6981r));
                        a.mo6958a("decompressor", new C2456l());
                        a.mo6958a("encoder", new C2469v());
                        a.mo6958a("compressor", new C2453j());
                        a.mo6958a("handler", new C2586n(C2593r.this.f6969f, C2593r.this.f6967d, g, f, C2593r.this.f6973j, C2593r.this.f6974k));
                        return a;
                    }
                });
                C2600t unused2 = C2593r.this.f6976m = new C2600t(C2593r.this.f6977n, C2593r.this.f6969f);
                ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(new C2557c("WEBBIT-STALE-CONNECTION-CHECK-THREAD"));
                newSingleThreadScheduledExecutor.scheduleWithFixedDelay(new Runnable() {
                    /* class org.p057b.p061c.C2593r.C25941.C25962 */

                    public void run() {
                        C2593r.this.f6976m.mo7500a();
                    }
                }, C2593r.this.f6977n / 2, C2593r.this.f6977n / 2, TimeUnit.MILLISECONDS);
                C2593r.this.f6968e.add(newSingleThreadScheduledExecutor);
                C2568d unused3 = C2593r.this.f6975l = new C2568d();
                ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new C2557c("WEBBIT-BOSS-THREAD"));
                C2593r.this.f6968e.add(newSingleThreadExecutor);
                ExecutorService newSingleThreadExecutor2 = Executors.newSingleThreadExecutor(new C2557c("WEBBIT-WORKER-THREAD"));
                C2593r.this.f6968e.add(newSingleThreadExecutor2);
                C2593r.this.f6970g.mo6806a(new C2352k(newSingleThreadExecutor, newSingleThreadExecutor2, 1));
                C2384f unused4 = C2593r.this.f6971h = C2593r.this.f6970g.mo6811a(C2593r.this.f6965b);
                return C2593r.this;
            }
        });
        new Thread(futureTask, "WEBBIT-STARTUP-THREAD").start();
        return futureTask;
    }

    /* renamed from: a */
    public C2593r mo7476a(String str, C2609e eVar) {
        return mo7478a(new C2551c(str, eVar));
    }

    /* renamed from: a */
    public C2593r mo7477a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f6973j = uncaughtExceptionHandler;
        return this;
    }

    /* renamed from: a */
    public C2593r mo7478a(C2609e eVar) {
        this.f6967d.add(eVar);
        return this;
    }

    /* Return type fixed from 'java.util.concurrent.Future<org.b.h>' to match base method */
    @Override // org.p057b.C2553b
    /* renamed from: b */
    public Future<? extends C2612h> mo7416b() {
        FutureTask futureTask = new FutureTask(new Callable<C2612h>() {
            /* class org.p057b.p061c.C2593r.C25972 */

            /* renamed from: a */
            public C2612h call() {
                if (C2593r.this.f6971h != null) {
                    C2593r.this.f6971h.mo6905i();
                }
                if (C2593r.this.f6975l != null) {
                    C2593r.this.f6975l.mo7441a();
                    C2568d unused = C2593r.this.f6975l = (C2568d) null;
                }
                if (C2593r.this.f6970g != null) {
                    C2593r.this.f6970g.mo6810d();
                }
                for (ExecutorService executorService : C2593r.this.f6968e) {
                    C2593r.this.m10194a(executorService);
                }
                C2279b unused2 = C2593r.this.f6970g = (C2279b) null;
                if (C2593r.this.f6971h != null) {
                    C2593r.this.f6971h.mo6906j().mo6940f();
                }
                return C2593r.this;
            }
        });
        new Thread(futureTask, "WEBBIT-SHUTDOW-THREAD").start();
        return futureTask;
    }

    /* renamed from: b */
    public C2593r mo7479a(String str, C2615k kVar) {
        return mo7476a(str, new C2550b(kVar));
    }

    /* renamed from: b */
    public C2593r mo7481b(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f6974k = uncaughtExceptionHandler;
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo7482c() {
        mo7478a(new C2552d("Webbit"));
        mo7478a(new C2547a());
    }

    /* renamed from: d */
    public int mo7483d() {
        return this.f6966c.getPort() == -1 ? this.f6966c.getScheme().equalsIgnoreCase("https") ? 443 : 80 : this.f6966c.getPort();
    }

    /* renamed from: e */
    public boolean mo7484e() {
        return this.f6971h != null && this.f6971h.mo7113n();
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public long mo7485f() {
        return System.currentTimeMillis();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public Object mo7486g() {
        long j = this.f6964a;
        this.f6964a = 1 + j;
        return Long.valueOf(j);
    }
}
