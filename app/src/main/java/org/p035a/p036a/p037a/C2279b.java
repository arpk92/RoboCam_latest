package org.p035a.p036a.p037a;

import java.net.SocketAddress;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import org.p035a.p036a.p039c.C2320al;
import org.p035a.p036a.p039c.C2328at;
import org.p035a.p036a.p039c.C2331av;
import org.p035a.p036a.p039c.C2384f;
import org.p035a.p036a.p039c.C2387i;
import org.p035a.p036a.p039c.C2388j;
import org.p035a.p036a.p039c.C2389k;
import org.p035a.p036a.p039c.C2390l;
import org.p035a.p036a.p039c.C2395o;
import org.p035a.p036a.p039c.C2396p;
import org.p035a.p036a.p039c.C2398r;
import org.p035a.p036a.p039c.C2403w;
import org.p035a.p036a.p039c.C2405y;
import org.p035a.p036a.p039c.C2414z;

/* renamed from: org.a.a.a.b */
public class C2279b extends C2278a {

    /* renamed from: a */
    private volatile C2395o f6086a;

    /* renamed from: org.a.a.a.b$a */
    private final class C2280a extends C2331av {

        /* renamed from: a */
        final /* synthetic */ boolean f6087a = (!C2279b.class.desiredAssertionStatus());

        /* renamed from: c */
        private final SocketAddress f6089c;

        /* renamed from: d */
        private final BlockingQueue<C2390l> f6090d;

        /* renamed from: e */
        private final Map<String, Object> f6091e = new HashMap();

        C2280a(SocketAddress socketAddress, BlockingQueue<C2390l> blockingQueue) {
            this.f6089c = socketAddress;
            this.f6090d = blockingQueue;
        }

        @Override // org.p035a.p036a.p039c.C2331av
        /* renamed from: a */
        public void mo6813a(C2396p pVar, C2320al alVar) {
            boolean offer = this.f6090d.offer(C2405y.m9536a(alVar.mo6990a(), alVar.mo6994c()));
            if (f6087a || offer) {
                pVar.mo6979a((C2387i) alVar);
                return;
            }
            throw new AssertionError();
        }

        /* JADX INFO: finally extract failed */
        @Override // org.p035a.p036a.p039c.C2331av
        /* renamed from: a */
        public void mo6814a(C2396p pVar, C2403w wVar) {
            try {
                wVar.mo6990a().mo7051m().mo6946a(C2279b.this.mo6808b());
                Map<String, Object> c = C2279b.this.mo6809c();
                HashMap hashMap = new HashMap();
                for (Map.Entry<String, Object> entry : c.entrySet()) {
                    if (entry.getKey().startsWith("child.")) {
                        this.f6091e.put(entry.getKey().substring(6), entry.getValue());
                    } else if (!entry.getKey().equals("pipelineFactory")) {
                        hashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                wVar.mo6990a().mo7051m().mo6944a(hashMap);
                pVar.mo6979a((C2387i) wVar);
                boolean offer = this.f6090d.offer(wVar.mo6990a().mo6893a(this.f6089c));
                if (!f6087a && !offer) {
                    throw new AssertionError();
                }
            } catch (Throwable th) {
                pVar.mo6979a((C2387i) wVar);
                throw th;
            }
        }

        @Override // org.p035a.p036a.p039c.C2331av
        /* renamed from: a */
        public void mo6815a(C2396p pVar, C2414z zVar) {
            try {
                zVar.mo6992c().mo7051m().mo6944a(this.f6091e);
            } catch (Throwable th) {
                C2405y.m9559c(zVar.mo6992c(), th);
            }
            pVar.mo6979a((C2387i) zVar);
        }
    }

    /* renamed from: a */
    public C2384f mo6811a(SocketAddress socketAddress) {
        if (socketAddress == null) {
            throw new NullPointerException("localAddress");
        }
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        C2280a aVar = new C2280a(socketAddress, linkedBlockingQueue);
        C2395o e = mo6812e();
        C2398r a = C2405y.m9539a();
        a.mo6958a("binder", aVar);
        if (e != null) {
            a.mo6958a("userHandler", e);
        }
        C2384f a2 = mo6805a().mo7116a(a);
        C2390l lVar = null;
        boolean z = false;
        while (true) {
            try {
                lVar = (C2390l) linkedBlockingQueue.poll(2147483647L, TimeUnit.SECONDS);
                z = z;
            } catch (InterruptedException e2) {
                z = true;
                lVar = lVar;
            }
            if (lVar != null) {
                break;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        lVar.mo6941g();
        if (lVar.mo6949d()) {
            return a2;
        }
        lVar.mo6939c().mo6905i().mo6941g();
        throw new C2388j("Failed to bind to: " + socketAddress, lVar.mo6950e());
    }

    @Override // org.p035a.p036a.p037a.C2278a
    /* renamed from: a */
    public void mo6806a(C2389k kVar) {
        if (kVar == null) {
            throw new NullPointerException("factory");
        } else if (!(kVar instanceof C2328at)) {
            throw new IllegalArgumentException("factory must be a " + C2328at.class.getSimpleName() + ": " + kVar.getClass());
        } else {
            super.mo6806a(kVar);
        }
    }

    /* renamed from: e */
    public C2395o mo6812e() {
        return this.f6086a;
    }
}
