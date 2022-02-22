package org.p035a.p036a.p039c.p041b.p042a;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.util.concurrent.Executor;
import org.p035a.p036a.p038b.C2284d;
import org.p035a.p036a.p038b.C2285e;
import org.p035a.p036a.p039c.C2325aq;
import org.p035a.p036a.p039c.C2384f;
import org.p035a.p036a.p039c.C2388j;
import org.p035a.p036a.p039c.C2390l;
import org.p035a.p036a.p039c.C2405y;

/* renamed from: org.a.a.c.b.a.o */
public class C2358o extends C2344c {

    /* renamed from: h */
    static final /* synthetic */ boolean f6290h = (!C2358o.class.desiredAssertionStatus());

    /* renamed from: i */
    private final C2362r f6291i = new C2362r();

    /* renamed from: org.a.a.c.b.a.o$a */
    private final class C2359a implements Runnable {

        /* renamed from: b */
        private final C2356m f6293b;

        /* renamed from: c */
        private final C2390l f6294c;

        /* renamed from: d */
        private final boolean f6295d;

        C2359a(C2356m mVar, C2390l lVar, boolean z) {
            this.f6293b = mVar;
            this.f6294c = lVar;
            this.f6295d = z;
        }

        /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
         method: org.a.a.c.y.a(org.a.a.c.f, java.net.SocketAddress):void
         arg types: [org.a.a.c.b.a.m, java.net.InetSocketAddress]
         candidates:
          org.a.a.c.y.a(org.a.a.c.f, long):org.a.a.c.l
          org.a.a.c.y.a(org.a.a.c.f, java.lang.Throwable):org.a.a.c.l
          org.a.a.c.y.a(org.a.a.c.f, boolean):org.a.a.c.l
          org.a.a.c.y.a(org.a.a.c.p, java.lang.Throwable):org.a.a.c.l
          org.a.a.c.y.a(org.a.a.c.f, java.lang.Object):void
          org.a.a.c.y.a(org.a.a.c.f, org.a.a.c.f):void
          org.a.a.c.y.a(org.a.a.c.p, org.a.a.c.l):void
          org.a.a.c.y.a(org.a.a.c.f, java.net.SocketAddress):void */
        /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
         method: org.a.a.c.y.b(org.a.a.c.f, java.net.SocketAddress):void
         arg types: [org.a.a.c.b.a.m, java.net.InetSocketAddress]
         candidates:
          org.a.a.c.y.b(org.a.a.c.f, java.lang.Object):org.a.a.c.l
          org.a.a.c.y.b(org.a.a.c.f, java.lang.Throwable):org.a.a.c.l
          org.a.a.c.y.b(org.a.a.c.f, long):void
          org.a.a.c.y.b(org.a.a.c.p, java.lang.Throwable):void
          org.a.a.c.y.b(org.a.a.c.f, java.net.SocketAddress):void */
        public void run() {
            InetSocketAddress q = this.f6293b.mo7054q();
            InetSocketAddress r = this.f6293b.mo7055r();
            if (q == null || r == null) {
                if (this.f6294c != null) {
                    this.f6294c.mo6910a(new ClosedChannelException());
                }
                C2358o.this.mo7092b(this.f6293b, C2405y.m9549b(this.f6293b));
                return;
            }
            try {
                if (this.f6295d) {
                    ((SocketChannel) this.f6293b.f6229p).configureBlocking(false);
                }
                synchronized (this.f6293b.f6217d) {
                    ((SocketChannel) this.f6293b.f6229p).register(C2358o.this.f6242c, this.f6293b.mo7057t(), this.f6293b);
                }
                if (this.f6294c != null) {
                    this.f6293b.mo7122x();
                    this.f6294c.mo6909a();
                }
                if (this.f6295d || !((C2349h) this.f6293b).f6267q) {
                    C2405y.m9543a((C2384f) this.f6293b, (SocketAddress) q);
                }
                C2405y.m9555b((C2384f) this.f6293b, (SocketAddress) r);
            } catch (IOException e) {
                if (this.f6294c != null) {
                    this.f6294c.mo6910a(e);
                }
                C2358o.this.mo7092b(this.f6293b, C2405y.m9549b(this.f6293b));
                if (!(e instanceof ClosedChannelException)) {
                    throw new C2388j("Failed to register a socket to the selector.", e);
                }
            }
        }
    }

    @Deprecated
    public C2358o(Executor executor, boolean z) {
        super(executor, z);
    }

    @Override // org.p035a.p036a.p039c.p041b.p042a.C2344c
    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo7085a(Runnable runnable) {
        super.mo7085a(runnable);
    }

    @Override // org.p035a.p036a.p039c.p041b.p042a.C2344c
    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo7086a(Runnable runnable, boolean z) {
        super.mo7086a(runnable, z);
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [org.a.a.c.b.a.o] */
    /* access modifiers changed from: protected */
    @Override // org.p035a.p036a.p039c.p041b.p042a.C2344c
    /* renamed from: b */
    public boolean mo7093b(SelectionKey selectionKey) {
        boolean z;
        int i;
        SocketChannel socketChannel = (SocketChannel) selectionKey.channel();
        C2356m mVar = (C2356m) selectionKey.attachment();
        C2325aq f = mVar.mo7056s().mo7110f();
        int a = f.mo7013a();
        C2285e a2 = mVar.mo7056s().mo6942a();
        ByteBuffer order = ((C2358o) this).f6291i.mo7125a(a).order(a2.mo6859a());
        int i2 = 0;
        int i3 = 0;
        while (true) {
            try {
                i3 = socketChannel.read(order);
                if (i3 <= 0) {
                    i = i2;
                    break;
                }
                i2 += i3;
                if (!order.hasRemaining()) {
                    i = i2;
                    break;
                }
            } catch (ClosedChannelException e) {
                i3 = i3;
                z = true;
            } catch (Throwable th) {
                C2405y.m9559c(mVar, th);
                z = true;
            }
        }
        i2 = i;
        z = false;
        if (i2 > 0) {
            order.flip();
            C2284d a3 = a2.mo6860a(i2);
            a3.mo6875b(0, order);
            a3.mo6831b(i2);
            f.mo7014a(i2);
            C2405y.m9541a(mVar, a3);
        }
        if (i3 >= 0 && !z) {
            return true;
        }
        selectionKey.cancel();
        mo7092b(mVar, C2405y.m9549b(mVar));
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // org.p035a.p036a.p039c.p041b.p042a.C2344c
    /* renamed from: c */
    public Runnable mo7094c(C2340a<?> aVar, C2390l lVar) {
        return new C2359a((C2356m) aVar, lVar, !(aVar instanceof C2349h));
    }

    /* access modifiers changed from: protected */
    @Override // org.p035a.p036a.p039c.p041b.p042a.C2344c
    /* renamed from: c */
    public boolean mo7095c(C2340a<?> aVar) {
        Selector selector;
        Thread currentThread = Thread.currentThread();
        if (currentThread == this.f6241b) {
            return false;
        }
        if (aVar.f6220g.compareAndSet(false, true)) {
            boolean offer = this.f6244e.offer(aVar.f6219f);
            if (!f6290h && !offer) {
                throw new AssertionError();
            }
        }
        if (((aVar instanceof C2347f) && ((C2347f) aVar).f6265q == currentThread) || (selector = this.f6242c) == null || !this.f6243d.compareAndSet(false, true)) {
            return true;
        }
        selector.wakeup();
        return true;
    }

    @Override // org.p035a.p036a.p039c.p041b.p042a.C2344c
    public /* bridge */ /* synthetic */ void run() {
        super.run();
    }
}
