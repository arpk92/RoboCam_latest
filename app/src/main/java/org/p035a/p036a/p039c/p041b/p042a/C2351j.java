package org.p035a.p036a.p039c.p041b.p042a;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.p035a.p036a.p039c.C2381c;
import org.p035a.p036a.p039c.C2388j;
import org.p035a.p036a.p039c.C2389k;
import org.p035a.p036a.p039c.C2398r;
import org.p035a.p036a.p039c.C2401u;
import org.p035a.p036a.p039c.C2405y;
import org.p035a.p036a.p039c.p041b.C2373b;
import org.p035a.p036a.p039c.p041b.C2375d;
import org.p035a.p036a.p039c.p041b.C2376e;
import org.p035a.p036a.p053e.C2491b;
import org.p035a.p036a.p053e.C2492c;

/* renamed from: org.a.a.c.b.a.j */
class C2351j extends C2381c implements C2375d {

    /* renamed from: f */
    private static final C2491b f6270f = C2492c.m9929a(C2351j.class);

    /* renamed from: c */
    final ServerSocketChannel f6271c;

    /* renamed from: d */
    final Lock f6272d = new ReentrantLock();

    /* renamed from: e */
    volatile Selector f6273e;

    /* renamed from: g */
    private final C2376e f6274g;

    C2351j(C2389k kVar, C2398r rVar, C2401u uVar) {
        super(kVar, rVar, uVar);
        try {
            this.f6271c = ServerSocketChannel.open();
            try {
                this.f6271c.configureBlocking(false);
                this.f6274g = new C2373b(this.f6271c.socket());
                C2405y.m9558c(this);
            } catch (IOException e) {
                try {
                    this.f6271c.close();
                } catch (IOException e2) {
                    if (f6270f.mo7288c()) {
                        f6270f.mo7285b("Failed to close a partially initialized socket.", e2);
                    }
                }
                throw new C2388j("Failed to enter non-blocking mode.", e);
            }
        } catch (IOException e3) {
            throw new C2388j("Failed to open a server socket.", e3);
        }
    }

    /* access modifiers changed from: protected */
    @Override // org.p035a.p036a.p039c.C2296a
    /* renamed from: h */
    public boolean mo6903h() {
        return super.mo6903h();
    }

    @Override // org.p035a.p036a.p039c.C2384f
    /* renamed from: n */
    public boolean mo7113n() {
        return mo6902g() && this.f6271c.socket().isBound();
    }

    @Override // org.p035a.p036a.p039c.C2296a
    /* renamed from: q */
    public C2376e mo7051m() {
        return this.f6274g;
    }

    /* renamed from: r */
    public InetSocketAddress mo7052o() {
        return (InetSocketAddress) this.f6271c.socket().getLocalSocketAddress();
    }

    /* renamed from: s */
    public InetSocketAddress mo7053p() {
        return null;
    }
}
