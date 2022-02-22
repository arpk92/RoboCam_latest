package org.p035a.p036a.p039c.p041b.p042a;

import java.io.IOException;
import java.nio.channels.AsynchronousCloseException;
import java.nio.channels.CancelledKeyException;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.NotYetConnectedException;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.WritableByteChannel;
import java.util.Iterator;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.p035a.p036a.p039c.C2324ap;
import org.p035a.p036a.p039c.C2384f;
import org.p035a.p036a.p039c.C2388j;
import org.p035a.p036a.p039c.C2390l;
import org.p035a.p036a.p039c.C2405y;
import org.p035a.p036a.p039c.p041b.C2380i;
import org.p035a.p036a.p039c.p041b.p042a.C2363s;
import org.p035a.p036a.p053e.C2491b;
import org.p035a.p036a.p053e.C2492c;
import org.p035a.p036a.p054f.C2545e;
import org.p035a.p036a.p054f.p055a.C2529d;

@SuppressWarnings("ALL")
/* renamed from: org.a.a.c.b.a.c */
abstract class C2344c implements C2380i {

    /* renamed from: g */
    static final /* synthetic */ boolean f6236g = (!C2344c.class.desiredAssertionStatus());

    /* renamed from: h */
    private static final AtomicInteger f6237h = new AtomicInteger();

    /* renamed from: i */
    private static final C2491b f6238i = C2492c.m9929a(C2344c.class);

    /* renamed from: j */
    private static final int f6239j = C2350i.f6269b;

    /* renamed from: a */
    final int f6240a = f6237h.incrementAndGet();

    /* renamed from: b */
    protected volatile Thread f6241b;

    /* renamed from: c */
    volatile Selector f6242c;

    /* renamed from: d */
    protected final AtomicBoolean f6243d = new AtomicBoolean();

    /* renamed from: e */
    protected final Queue<Runnable> f6244e = new ConcurrentLinkedQueue();

    /* renamed from: f */
    protected final C2363s f6245f = new C2363s();

    /* renamed from: k */
    private final Executor f6246k;

    /* renamed from: l */
    private boolean f6247l;

    /* renamed from: m */
    private final ReadWriteLock f6248m = new ReentrantReadWriteLock();

    /* renamed from: n */
    private final Object f6249n = new Object();

    /* renamed from: o */
    private final Queue<Runnable> f6250o = new ConcurrentLinkedQueue();

    /* renamed from: p */
    private final Queue<Runnable> f6251p = new ConcurrentLinkedQueue();

    /* renamed from: q */
    private volatile int f6252q;

    /* renamed from: r */
    private final boolean f6253r;

    @Deprecated
    public C2344c(Executor executor, boolean z) {
        this.f6246k = executor;
        this.f6253r = z;
    }

    /* renamed from: a */
    private Selector m9328a() {
        if (!this.f6247l) {
            try {
                this.f6242c = Selector.open();
                try {
                    C2529d.m10053a(this.f6246k, new C2545e(this, "New I/O  worker #" + this.f6240a));
                } catch (Throwable th) {
                    f6238i.mo7285b("Failed to close a selector.", th);
                }
            } catch (Throwable th2) {
                throw new C2388j("Failed to create a selector.", th2);
            }
        }
        if (f6236g || (this.f6242c != null && this.f6242c.isOpen())) {
            this.f6247l = true;
            return this.f6242c;
        }
        this.f6242c = null;
        throw new AssertionError();

    }

    /* renamed from: a */
    private void m9329a(Set<SelectionKey> set) {
        Iterator<SelectionKey> it = set.iterator();
        while (it.hasNext()) {
            SelectionKey next = it.next();
            it.remove();
            try {
                int readyOps = next.readyOps();
                if (((readyOps & 1) == 0 && readyOps != 0) || mo7093b(next)) {
                    if ((readyOps & 4) != 0) {
                        mo7087a(next);
                    }
                    if (m9334e()) {
                        return;
                    }
                }
            } catch (CancelledKeyException e) {
                m9332c(next);
            }
        }
    }

    /* renamed from: b */
    private void m9330b() {
        while (true) {
            Runnable poll = this.f6250o.poll();
            if (poll != null) {
                poll.run();
                m9334e();
            } else {
                return;
            }
        }
    }

    /* renamed from: c */
    private void m9331c() {
        while (true) {
            Runnable poll = this.f6244e.poll();
            if (poll != null) {
                poll.run();
                m9334e();
            } else {
                return;
            }
        }
    }

    /* renamed from: c */
    private void m9332c(SelectionKey selectionKey) {
        C2340a<?> aVar = (C2340a) selectionKey.attachment();
        mo7092b(aVar, C2405y.m9549b(aVar));
    }

    /* renamed from: d */
    private void m9333d() {
        while (true) {
            Runnable poll = this.f6251p.poll();
            if (poll != null) {
                poll.run();
                m9334e();
            } else {
                return;
            }
        }
    }

    /* renamed from: e */
    private boolean m9334e() {
        if (this.f6252q < 256) {
            return false;
        }
        this.f6252q = 0;
        try {
            this.f6242c.selectNow();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: e */
    static boolean m9335e(C2340a<?> aVar) {
        return Thread.currentThread() == aVar.f6216c.f6241b;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: org.a.a.c.b.a.c.a(java.lang.Runnable, boolean):void
     arg types: [java.lang.Runnable, int]
     candidates:
      org.a.a.c.b.a.c.a(org.a.a.c.b.a.a<?>, org.a.a.c.l):void
      org.a.a.c.b.a.c.a(java.lang.Runnable, boolean):void */
    /* renamed from: a */
    public void mo7085a(Runnable runnable) {
        mo7086a(runnable, false);
    }

    /* renamed from: a */
    public void mo7086a(Runnable runnable, boolean z) {
        Selector selector;
        if (z || Thread.currentThread() != this.f6241b) {
            synchronized (this.f6249n) {
                m9328a();
                boolean offer = this.f6251p.offer(runnable);
                if (!f6236g && !offer) {
                    throw new AssertionError();
                } else if (offer && (selector = this.f6242c) != null) {
                    selector.wakeup();
                }
            }
            return;
        }
        runnable.run();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo7087a(SelectionKey selectionKey) {
        C2340a<?> aVar = (C2340a) selectionKey.attachment();
        aVar.f6227n = false;
        mo7096d(aVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo7088a(C2340a<?> aVar) {
        if (!aVar.mo7120l()) {
            mo7099h(aVar);
        } else if (!mo7095c(aVar) && !aVar.f6227n && !aVar.f6226m) {
            mo7096d(aVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo7089a(C2340a<?> aVar, C2390l lVar) {
        Selector selector;
        Runnable c = mo7094c(aVar, lVar);
        synchronized (this.f6249n) {
            m9328a();
            boolean offer = this.f6250o.offer(c);
            if (!f6236g && !offer) {
                throw new AssertionError();
            } else if (this.f6243d.compareAndSet(false, true) && (selector = this.f6242c) != null) {
                selector.wakeup();
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: org.a.a.c.y.b(org.a.a.c.f, java.lang.Throwable):org.a.a.c.l
     arg types: [org.a.a.c.b.a.a<?>, java.nio.channels.ClosedChannelException]
     candidates:
      org.a.a.c.y.b(org.a.a.c.f, java.lang.Object):org.a.a.c.l
      org.a.a.c.y.b(org.a.a.c.f, long):void
      org.a.a.c.y.b(org.a.a.c.f, java.net.SocketAddress):void
      org.a.a.c.y.b(org.a.a.c.p, java.lang.Throwable):void
      org.a.a.c.y.b(org.a.a.c.f, java.lang.Throwable):org.a.a.c.l */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: org.a.a.c.y.b(org.a.a.c.f, java.lang.Throwable):org.a.a.c.l
     arg types: [org.a.a.c.b.a.a<?>, java.lang.Throwable]
     candidates:
      org.a.a.c.y.b(org.a.a.c.f, java.lang.Object):org.a.a.c.l
      org.a.a.c.y.b(org.a.a.c.f, long):void
      org.a.a.c.y.b(org.a.a.c.f, java.net.SocketAddress):void
      org.a.a.c.y.b(org.a.a.c.p, java.lang.Throwable):void
      org.a.a.c.y.b(org.a.a.c.f, java.lang.Throwable):org.a.a.c.l */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0078, code lost:
        r11.mo6909a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x007b, code lost:
        if (r0 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x007d, code lost:
        if (r2 == false) goto L_0x00cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x007f, code lost:
        org.p035a.p036a.p039c.C2405y.m9561e(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00cd, code lost:
        org.p035a.p036a.p039c.C2405y.m9560d(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:?, code lost:
        return;
     */
    /* renamed from: a */
    public void mo7090a(C2340a<?> aVar, C2390l lVar, int i) {
        boolean z = true;
        boolean e = m9335e(aVar);
        try {
            synchronized (aVar.f6217d) {
                Selector selector = this.f6242c;
                SelectionKey keyFor = aVar.f6229p.keyFor(selector);
                int t = (i & -5) | (aVar.mo7057t() & 4);
                if (keyFor == null || selector == null) {
                    if (aVar.mo7057t() == t) {
                        z = false;
                    }
                    aVar.mo7050b(t);
                    lVar.mo6909a();
                    if (z) {
                        if (e) {
                            C2405y.m9561e(aVar);
                        } else {
                            C2405y.m9560d(aVar);
                        }
                    }
                } else {
                    switch (f6239j) {
                        case 0:
                            if (aVar.mo7057t() != t) {
                                keyFor.interestOps(t);
                                if (Thread.currentThread() != this.f6241b && this.f6243d.compareAndSet(false, true)) {
                                    selector.wakeup();
                                    break;
                                }
                            }
                            z = false;
                            break;
                        case 1:
                        case 2:
                            if (aVar.mo7057t() != t) {
                                if (Thread.currentThread() == this.f6241b) {
                                    keyFor.interestOps(t);
                                    break;
                                } else {
                                    this.f6248m.readLock().lock();
                                    try {
                                        if (this.f6243d.compareAndSet(false, true)) {
                                            selector.wakeup();
                                        }
                                        keyFor.interestOps(t);
                                        break;
                                    } finally {
                                        this.f6248m.readLock().unlock();
                                    }
                                }
                            }
                            z = false;
                            break;
                        default:
                            throw new Error();
                    }
                    if (z) {
                        aVar.mo7050b(t);
                    }
                }
            }
        } catch (CancelledKeyException e2) {
            ClosedChannelException closedChannelException = new ClosedChannelException();
            lVar.mo6910a(closedChannelException);
            if (e) {
                C2405y.m9559c(aVar, closedChannelException);
            } else {
                C2405y.m9552b((C2384f) aVar, (Throwable) closedChannelException);
            }
        } catch (Throwable th) {
            lVar.mo6910a(th);
            if (e) {
                C2405y.m9559c(aVar, th);
            } else {
                C2405y.m9552b((C2384f) aVar, th);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo7091b(C2340a<?> aVar) {
        if (!aVar.f6227n) {
            mo7096d(aVar);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: org.a.a.c.y.b(org.a.a.c.f, java.lang.Throwable):org.a.a.c.l
     arg types: [org.a.a.c.b.a.a<?>, java.lang.Throwable]
     candidates:
      org.a.a.c.y.b(org.a.a.c.f, java.lang.Object):org.a.a.c.l
      org.a.a.c.y.b(org.a.a.c.f, long):void
      org.a.a.c.y.b(org.a.a.c.f, java.net.SocketAddress):void
      org.a.a.c.y.b(org.a.a.c.p, java.lang.Throwable):void
      org.a.a.c.y.b(org.a.a.c.f, java.lang.Throwable):org.a.a.c.l */
    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo7092b(C2340a<?> aVar, C2390l lVar) {
        boolean l = aVar.mo7120l();
        boolean n = aVar.mo7113n();
        boolean e = m9335e(aVar);
        try {
            aVar.f6229p.close();
            this.f6252q++;
            if (aVar.mo6903h()) {
                lVar.mo6909a();
                if (l) {
                    if (e) {
                        C2405y.m9563g(aVar);
                    } else {
                        C2405y.m9562f(aVar);
                    }
                }
                if (n) {
                    if (e) {
                        C2405y.m9565i(aVar);
                    } else {
                        C2405y.m9564h(aVar);
                    }
                }
                mo7099h(aVar);
                if (e) {
                    C2405y.m9567k(aVar);
                } else {
                    C2405y.m9566j(aVar);
                }
            } else {
                lVar.mo6909a();
            }
        } catch (Throwable th) {
            lVar.mo6910a(th);
            if (e) {
                C2405y.m9559c(aVar, th);
            } else {
                C2405y.m9552b((C2384f) aVar, th);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract boolean mo7093b(SelectionKey selectionKey);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract Runnable mo7094c(C2340a<?> aVar, C2390l lVar);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract boolean mo7095c(C2340a<?> aVar);

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: org.a.a.c.y.b(org.a.a.c.f, java.lang.Throwable):org.a.a.c.l
     arg types: [org.a.a.c.b.a.a<?>, java.lang.Throwable]
     candidates:
      org.a.a.c.y.b(org.a.a.c.f, java.lang.Object):org.a.a.c.l
      org.a.a.c.y.b(org.a.a.c.f, long):void
      org.a.a.c.y.b(org.a.a.c.f, java.net.SocketAddress):void
      org.a.a.c.y.b(org.a.a.c.p, java.lang.Throwable):void
      org.a.a.c.y.b(org.a.a.c.f, java.lang.Throwable):org.a.a.c.l */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00c6, code lost:
        r4 = r10;
        r3 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00ca, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00cb, code lost:
        r7 = r4;
        r8 = r14;
        r4 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00d0, code lost:
        r8.mo7131d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00e2, code lost:
        org.p035a.p036a.p039c.C2405y.m9559c(r23, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00eb, code lost:
        mo7092b(r23, org.p035a.p036a.p039c.C2405y.m9549b(r23));
        r6 = false;
        r3 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00fd, code lost:
        org.p035a.p036a.p039c.C2405y.m9552b((org.p035a.p036a.p039c.C2384f) r23, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0123, code lost:
        r3 = r6;
        r6 = r12;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0074 A[SYNTHETIC, Splitter:B:20:0x0074] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0085 A[Catch:{ AsynchronousCloseException -> 0x00c5, Throwable -> 0x00ca }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00c5 A[ExcHandler: AsynchronousCloseException (e java.nio.channels.AsynchronousCloseException), PHI: r10 
      PHI: (r10v2 long) = (r10v4 long), (r10v4 long), (r10v1 long) binds: [B:28:0x0093, B:29:?, B:20:0x0074] A[DONT_GENERATE, DONT_INLINE], Splitter:B:20:0x0074] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x007f A[EDGE_INSN: B:74:0x007f->B:24:0x007f ?: BREAK  , SYNTHETIC] */
    /* renamed from: d */
    public void mo7096d(C2340a<?> aVar) {
        C2363s.C2370g gVar;
        int i;
        C2363s.C2370g gVar2;
        Throwable th;
        long j = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3;
        boolean z4 = true;
        boolean z5 = false;
        boolean e = m9335e(aVar);
        long j2 = 0;
        C2363s sVar = this.f6245f;
        WritableByteChannel c = aVar.f6229p;
        Queue<C2324ap> queue = aVar.f6221h;
        int e2 = aVar.mo7051m().mo7109e();
        synchronized (aVar.f6218e) {
            aVar.f6226m = true;
            while (true) {
                C2324ap apVar = aVar.f6224k;
                if (apVar == null) {
                    apVar = queue.poll();
                    aVar.f6224k = apVar;
                    if (apVar == null) {
                        z3 = true;
                        aVar.f6227n = false;
                        break;
                    }
                    gVar = sVar.mo7126a(apVar.mo7006c());
                    aVar.f6225l = gVar;
                    C2390l b = apVar.mo6991b();
                    long j3 = 0;
                    i = e2;
                    while (true) {
                        if (i > 0) {
                            break;
                        }
                        try {
                            j3 = gVar.mo7127a(c);
                            if (j3 == 0) {
                                if (gVar.mo7128a()) {
                                    break;
                                }
                                i--;
                            } else {
                                j2 += j3;
                                break;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            gVar2 = null;
                            j = j2;
                            if (gVar2 != null) {
                            }
                            aVar.f6224k = null;
                            aVar.f6225l = null;
                            b.mo6910a(th);
                            if (e) {
                            }
                            if (th instanceof IOException) {
                            }
                            j2 = j;
                            z4 = z2;
                            z5 = z;
                        }
                    }
                    if (!gVar.mo7128a()) {
                        gVar.mo7131d();
                        aVar.f6224k = null;
                        aVar.f6225l = null;
                        b.mo6909a();
                        j = j2;
                        z = z5;
                        z2 = z4;
                        j2 = j;
                        z4 = z2;
                        z5 = z;
                    } else {
                        try {
                            aVar.f6227n = true;
                            if (j3 > 0) {
                                b.mo6937a(j3, gVar.mo7129b(), gVar.mo7130c());
                            }
                            z3 = false;
                            z5 = true;
                        } catch (Throwable th3) {
                            th = th3;
                            gVar2 = gVar;
                            z5 = true;
                            j = j2;
                            if (gVar2 != null) {
                            }
                            aVar.f6224k = null;
                            aVar.f6225l = null;
                            b.mo6910a(th);
                            if (e) {
                            }
                            if (th instanceof IOException) {
                            }
                            j2 = j;
                            z4 = z2;
                            z5 = z;
                        }
                    }
                } else {
                    gVar = aVar.f6225l;
                    C2390l b2 = apVar.mo6991b();
                    long j32 = 0;
                    i = e2;
                    while (true) {
                        if (i > 0) {
                        }
                        i--;
                    }
                    /*if (!gVar.mo7128a()) {
                    }*/
                }
            }
            aVar.f6226m = false;
            if (z4) {
                if (z5) {
                    mo7097f(aVar);
                } else if (z3) {
                    mo7098g(aVar);
                }
            }
        }
        if (e) {
            C2405y.m9554b(aVar, j2);
        } else {
            C2405y.m9535a(aVar, j2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo7097f(C2340a<?> aVar) {
        SelectionKey keyFor = aVar.f6229p.keyFor(this.f6242c);
        if (keyFor != null) {
            if (!keyFor.isValid()) {
                m9332c(keyFor);
                return;
            }
            synchronized (aVar.f6217d) {
                int t = aVar.mo7057t();
                if ((t & 4) == 0) {
                    int i = t | 4;
                    keyFor.interestOps(i);
                    aVar.mo7050b(i);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo7098g(C2340a<?> aVar) {
        SelectionKey keyFor = aVar.f6229p.keyFor(this.f6242c);
        if (keyFor != null) {
            if (!keyFor.isValid()) {
                m9332c(keyFor);
                return;
            }
            synchronized (aVar.f6217d) {
                int t = aVar.mo7057t();
                if ((t & 4) != 0) {
                    int i = t & -5;
                    keyFor.interestOps(i);
                    aVar.mo7050b(i);
                }
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: org.a.a.c.y.b(org.a.a.c.f, java.lang.Throwable):org.a.a.c.l
     arg types: [org.a.a.c.b.a.a<?>, java.lang.Throwable]
     candidates:
      org.a.a.c.y.b(org.a.a.c.f, java.lang.Object):org.a.a.c.l
      org.a.a.c.y.b(org.a.a.c.f, long):void
      org.a.a.c.y.b(org.a.a.c.f, java.net.SocketAddress):void
      org.a.a.c.y.b(org.a.a.c.p, java.lang.Throwable):void
      org.a.a.c.y.b(org.a.a.c.f, java.lang.Throwable):org.a.a.c.l */
    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo7099h(C2340a<?> aVar) {
        Throwable th = null;
        boolean z = false;
        synchronized (aVar.f6218e) {
            C2324ap apVar = aVar.f6224k;
            if (apVar != null) {
                th = aVar.mo6902g() ? new NotYetConnectedException() : new ClosedChannelException();
                C2390l b = apVar.mo6991b();
                aVar.f6225l.mo7131d();
                aVar.f6225l = null;
                aVar.f6224k = null;
                b.mo6910a(th);
                z = true;
            }
            Queue<C2324ap> queue = aVar.f6221h;
            while (true) {
                C2324ap poll = queue.poll();
                if (poll == null) {
                    break;
                }
                if (th == null) {
                    th = aVar.mo6902g() ? new NotYetConnectedException() : new ClosedChannelException();
                    z = true;
                }
                poll.mo6991b().mo6910a(th);
            }
        }
        if (!z) {
            return;
        }
        if (m9335e(aVar)) {
            C2405y.m9559c(aVar, th);
        } else {
            C2405y.m9552b((C2384f) aVar, th);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00aa, code lost:
        r0 = false;
     */
    public void run() {
        boolean z = false;
        this.f6241b = Thread.currentThread();
        Selector selector = this.f6242c;
        boolean z2 = false;
        while (true) {
            this.f6243d.set(false);
            if (f6239j != 0) {
                this.f6248m.writeLock().lock();
                this.f6248m.writeLock().unlock();
            }
            try {
                C2361q.m9412a(selector);
                if (this.f6243d.get()) {
                    selector.wakeup();
                }
                this.f6252q = 0;
                m9330b();
                m9333d();
                m9331c();
                m9329a(selector.selectedKeys());
                if (!selector.keys().isEmpty()) {
                    z = false;
                } else if (z2 || ((this.f6246k instanceof ExecutorService) && ((ExecutorService) this.f6246k).isShutdown())) {
                    synchronized (this.f6249n) {
                        try {
                            if (this.f6250o.isEmpty() && selector.keys().isEmpty()) {
                                break;
                            }
                            try {
                            } catch (Throwable th) {
                                th = th;
                                throw th;
                            }
                        } catch (Throwable th2) {
                           /* th = th2;
                            throw th;*/
                        }
                    }
                } else {
                    z = this.f6253r ? true : z2;
                }
                z2 = z;
            } catch (Throwable th3) {
                f6238i.mo7285b("Unexpected exception in the selector loop.", th3);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }
                z2 = z2;
            }
        }
        this.f6247l = false;
        try {
            selector.close();
        } catch (IOException e2) {
            f6238i.mo7285b("Failed to close a selector.", e2);
        } finally {
            this.f6242c = null;
        }
    }
}
