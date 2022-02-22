package org.p035a.p036a.p039c.p041b.p042a;

import java.net.InetSocketAddress;
import java.nio.channels.SocketChannel;
import org.p035a.p036a.p039c.C2384f;
import org.p035a.p036a.p039c.C2389k;
import org.p035a.p036a.p039c.C2398r;
import org.p035a.p036a.p039c.C2401u;
import org.p035a.p036a.p039c.p041b.C2378g;

/* renamed from: org.a.a.c.b.a.m */
public class C2356m extends C2340a<SocketChannel> implements C2378g {

    /* renamed from: s */
    static final /* synthetic */ boolean f6287s = (!C2356m.class.desiredAssertionStatus());

    /* renamed from: q */
    private final C2357n f6288q;

    /* renamed from: r */
    volatile int f6289r = 0;

    public C2356m(C2384f fVar, C2389k kVar, C2398r rVar, C2401u uVar, SocketChannel socketChannel, C2358o oVar) {
        super(fVar, kVar, rVar, uVar, oVar, socketChannel);
        this.f6288q = new C2346e(socketChannel.socket());
    }

    @Override // org.p035a.p036a.p039c.C2384f, org.p035a.p036a.p039c.C2296a
    /* renamed from: g */
    public boolean mo6902g() {
        return this.f6289r >= 0;
    }

    /* access modifiers changed from: protected */
    @Override // org.p035a.p036a.p039c.p041b.p042a.C2340a, org.p035a.p036a.p039c.C2296a
    /* renamed from: h */
    public boolean mo6903h() {
        if (!super.mo6903h()) {
            return false;
        }
        this.f6289r = -1;
        return true;
    }

    @Override // org.p035a.p036a.p039c.p041b.p042a.C2340a, org.p035a.p036a.p039c.C2296a
    /* renamed from: k */
    public /* bridge */ /* synthetic */ int mo6907k() {
        return super.mo6907k();
    }

    @Override
    public C2348g mo7051m() {
        return null;
    }

    @Override // org.p035a.p036a.p039c.C2384f
    /* renamed from: l */
    public boolean mo7120l() {
        return this.f6289r == 2;
    }

    @Override // org.p035a.p036a.p039c.C2384f
    /* renamed from: n */
    public boolean mo7113n() {
        return this.f6289r >= 1;
    }

    //@Override // org.p035a.p036a.p039c.p041b.p042a.C2340a, org.p035a.p036a.p039c.C2296a
    /* renamed from: q */
    public /* bridge */ /* synthetic */ InetSocketAddress mo7054q() {
        return super.mo7052o();
    }

    //@Override // org.p035a.p036a.p039c.p041b.p042a.C2340a
    /* renamed from: r */
    public /* bridge */ /* synthetic */ InetSocketAddress mo7055r() {
        return super.mo7053p();
    }

    /* access modifiers changed from: package-private */
    @Override // org.p035a.p036a.p039c.p041b.p042a.C2340a
    /* renamed from: u */
    public InetSocketAddress mo7058u() {
        return (InetSocketAddress) ((SocketChannel) this.f6229p).socket().getLocalSocketAddress();
    }

    /* access modifiers changed from: package-private */
    @Override // org.p035a.p036a.p039c.p041b.p042a.C2340a
    /* renamed from: v */
    public InetSocketAddress mo7059v() {
        return (InetSocketAddress) ((SocketChannel) this.f6229p).socket().getRemoteSocketAddress();
    }

    /* renamed from: w */
    public C2357n mo7056s() {
        return this.f6288q;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public final void mo7122x() {
        if (this.f6289r != -1) {
            this.f6289r = 2;
        }
    }
}
