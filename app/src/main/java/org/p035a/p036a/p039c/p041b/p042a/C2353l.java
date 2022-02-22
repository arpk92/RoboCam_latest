package org.p035a.p036a.p039c.p041b.p042a;

import java.io.IOException;
import java.net.SocketAddress;
import java.net.SocketTimeoutException;
import java.nio.channels.CancelledKeyException;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.ClosedSelectorException;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.util.concurrent.atomic.AtomicInteger;
import org.p035a.p036a.p039c.C2324ap;
import org.p035a.p036a.p039c.C2384f;
import org.p035a.p036a.p039c.C2387i;
import org.p035a.p036a.p039c.C2390l;
import org.p035a.p036a.p039c.C2398r;
import org.p035a.p036a.p039c.C2402v;
import org.p035a.p036a.p039c.C2403w;
import org.p035a.p036a.p039c.C2405y;
import org.p035a.p036a.p053e.C2491b;
import org.p035a.p036a.p053e.C2492c;
import org.p035a.p036a.p054f.C2545e;
import org.p035a.p036a.p054f.p055a.C2529d;

/* renamed from: org.a.a.c.b.a.l */
class C2353l extends C2343b {

    /* renamed from: a */
    static final C2491b f6278a = C2492c.m9929a(C2353l.class);

    /* renamed from: c */
    static final /* synthetic */ boolean f6279c = (!C2353l.class.desiredAssertionStatus());

    /* renamed from: d */
    private static final AtomicInteger f6280d = new AtomicInteger();

    /* renamed from: b */
    final int f6281b = f6280d.incrementAndGet();

    /* renamed from: e */
    private final C2372t<C2358o> f6282e;

    /* renamed from: org.a.a.c.b.a.l$a */
    private final class C2355a implements Runnable {

        /* renamed from: b */
        private Selector f6285b;

        {
            try {
                f6285b = Selector.open();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        /* renamed from: c */
        private final C2351j f6286c;

        C2355a(C2351j jVar) {
            this.f6286c = jVar;
            try {
                jVar.f6271c.register(this.f6285b, 16);
                jVar.f6273e = this.f6285b;
            } catch (Throwable th) {
                m9389a();
                //throw th;
            }
        }

        /* renamed from: a */
        private void m9389a() {
            this.f6286c.f6273e = null;
            try {
                this.f6285b.close();
            } catch (Exception e) {
                if (C2353l.f6278a.mo7288c()) {
                    C2353l.f6278a.mo7285b("Failed to close a selector.", e);
                }
            }
        }

        /* renamed from: a */
        private void m9390a(SocketChannel socketChannel, Thread thread) {
            try {
                C2398r a = this.f6286c.mo7051m().mo6948b().mo7144a();
                C2358o a2 = C2353l.this.mo7118a();
                a2.mo7089a(new C2347f(this.f6286c.mo6896c(), a, this.f6286c, C2353l.this, socketChannel, a2, thread), (C2390l) null);
            } catch (Exception e) {
                if (C2353l.f6278a.mo7288c()) {
                    C2353l.f6278a.mo7285b("Failed to initialize an accepted socket.", e);
                }
                try {
                    socketChannel.close();
                } catch (IOException e2) {
                    if (C2353l.f6278a.mo7288c()) {
                        C2353l.f6278a.mo7285b("Failed to close a partially accepted socket.", e2);
                    }
                }
            }
        }

        public void run() {
            Thread currentThread = Thread.currentThread();
            this.f6286c.f6272d.lock();
            while (true) {
                try {
                    if (this.f6285b.select(1000) > 0) {
                        this.f6285b.selectedKeys().clear();
                    }
                    while (true) {
                        SocketChannel accept = this.f6286c.f6271c.accept();
                        if (accept == null) {
                            break;
                        }
                        m9390a(accept, currentThread);
                    }
                } catch (SocketTimeoutException | CancelledKeyException | ClosedSelectorException e) {
                } catch (ClosedChannelException e2) {
                    this.f6286c.f6272d.unlock();
                    m9389a();
                    return;
                } catch (Throwable th) {
                    this.f6286c.f6272d.unlock();
                    m9389a();
                  //  throw th;
                }
            }
        }
    }

    C2353l(C2372t<C2358o> tVar) {
        this.f6282e = tVar;
    }

    /* renamed from: a */
    private static void m9383a(C2351j jVar, C2390l lVar) {
        boolean n = jVar.mo7113n();
        try {
            if (jVar.f6271c.isOpen()) {
                jVar.f6271c.close();
                Selector selector = jVar.f6273e;
                if (selector != null) {
                    selector.wakeup();
                }
            }
            jVar.f6272d.lock();
            try {
                if (jVar.mo6903h()) {
                    lVar.mo6909a();
                    if (n) {
                        C2405y.m9565i(jVar);
                    }
                    C2405y.m9567k(jVar);
                } else {
                    lVar.mo6909a();
                }
            } finally {
                jVar.f6272d.unlock();
            }
        } catch (Throwable th) {
            lVar.mo6910a(th);
            C2405y.m9559c(jVar, th);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: org.a.a.c.y.a(org.a.a.c.f, java.net.SocketAddress):void
     arg types: [org.a.a.c.b.a.j, java.net.InetSocketAddress]
     candidates:
      org.a.a.c.y.a(org.a.a.c.f, long):org.a.a.c.l
      org.a.a.c.y.a(org.a.a.c.f, java.lang.Throwable):org.a.a.c.l
      org.a.a.c.y.a(org.a.a.c.f, boolean):org.a.a.c.l
      org.a.a.c.y.a(org.a.a.c.p, java.lang.Throwable):org.a.a.c.l
      org.a.a.c.y.a(org.a.a.c.f, java.lang.Object):void
      org.a.a.c.y.a(org.a.a.c.f, org.a.a.c.f):void
      org.a.a.c.y.a(org.a.a.c.p, org.a.a.c.l):void
      org.a.a.c.y.a(org.a.a.c.f, java.net.SocketAddress):void */
    /* renamed from: a */
    private void m9384a(C2351j jVar, C2390l lVar, SocketAddress socketAddress) {
        boolean z = false;
        try {
            jVar.f6271c.socket().bind(socketAddress, jVar.mo7051m().mo7135c());
            z = true;
            lVar.mo6909a();
            C2405y.m9543a((C2384f) jVar, (SocketAddress) jVar.mo7052o());
            C2529d.m10053a(((C2352k) jVar.mo6896c()).f6275a, new C2545e(new C2355a(jVar), "New I/O server boss #" + this.f6281b + " (" + jVar + ')'));
        } catch (Throwable th) {
            if (z) {
                m9383a(jVar, lVar);
            }
           /// throw th;
        }
    }

    /* renamed from: a */
    private void m9385a(C2387i iVar) {
        if (iVar instanceof C2403w) {
            C2403w wVar = (C2403w) iVar;
            C2351j jVar = (C2351j) wVar.mo6990a();
            C2390l b = wVar.mo6991b();
            C2402v c = wVar.mo7003c();
            Object d = wVar.mo7004d();
            switch (c) {
                case OPEN:
                    if (Boolean.FALSE.equals(d)) {
                        m9383a(jVar, b);
                        return;
                    }
                    return;
                case BOUND:
                    if (d != null) {
                        m9384a(jVar, b, (SocketAddress) d);
                        return;
                    } else {
                        m9383a(jVar, b);
                        return;
                    }
                default:
                    return;
            }
        }
    }

    /* renamed from: b */
    private static void m9386b(C2387i iVar) {
        if (iVar instanceof C2403w) {
            C2403w wVar = (C2403w) iVar;
            C2356m mVar = (C2356m) wVar.mo6990a();
            C2390l b = wVar.mo6991b();
            C2402v c = wVar.mo7003c();
            Object d = wVar.mo7004d();
            switch (c) {
                case OPEN:
                    if (Boolean.FALSE.equals(d)) {
                        mVar.f6216c.mo7092b(mVar, b);
                        return;
                    }
                    return;
                case BOUND:
                case CONNECTED:
                    if (d == null) {
                        mVar.f6216c.mo7092b(mVar, b);
                        return;
                    }
                    return;
                case INTEREST_OPS:
                    mVar.f6216c.mo7090a(mVar, b, ((Integer) d).intValue());
                    return;
                default:
                    return;
            }
        } else if (iVar instanceof C2324ap) {
            C2324ap apVar = (C2324ap) iVar;
            C2356m mVar2 = (C2356m) apVar.mo6990a();
            boolean offer = mVar2.f6221h.offer(apVar);
            if (f6279c || offer) {
                mVar2.f6216c.mo7088a(mVar2);
                return;
            }
            throw new AssertionError();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C2358o mo7118a() {
        return this.f6282e.mo7104b();
    }

    @Override // org.p035a.p036a.p039c.C2401u
    /* renamed from: a */
    public void mo6988a(C2398r rVar, C2387i iVar) {
        C2384f a = iVar.mo6990a();
        if (a instanceof C2351j) {
            m9385a(iVar);
        } else if (a instanceof C2356m) {
            m9386b(iVar);
        }
    }
}
