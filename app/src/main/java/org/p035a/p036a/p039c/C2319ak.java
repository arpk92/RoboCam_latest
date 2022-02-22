package org.p035a.p036a.p039c;

import java.net.SocketAddress;
import org.p035a.p036a.p054f.p055a.C2537j;

/* renamed from: org.a.a.c.ak */
public class C2319ak implements C2324ap {

    /* renamed from: a */
    private final C2384f f6198a;

    /* renamed from: b */
    private final C2390l f6199b;

    /* renamed from: c */
    private final Object f6200c;

    /* renamed from: d */
    private final SocketAddress f6201d;

    public C2319ak(C2384f fVar, C2390l lVar, Object obj, SocketAddress socketAddress) {
        if (fVar == null) {
            throw new NullPointerException("channel");
        } else if (lVar == null) {
            throw new NullPointerException("future");
        } else if (obj == null) {
            throw new NullPointerException("message");
        } else {
            this.f6198a = fVar;
            this.f6199b = lVar;
            this.f6200c = obj;
            if (socketAddress != null) {
                this.f6201d = socketAddress;
            } else {
                this.f6201d = fVar.mo7053p();
            }
        }
    }

    @Override // org.p035a.p036a.p039c.C2387i
    /* renamed from: a */
    public C2384f mo6990a() {
        return this.f6198a;
    }

    @Override // org.p035a.p036a.p039c.C2387i
    /* renamed from: b */
    public C2390l mo6991b() {
        return this.f6199b;
    }

    @Override // org.p035a.p036a.p039c.C2324ap
    /* renamed from: c */
    public Object mo7006c() {
        return this.f6200c;
    }

    @Override // org.p035a.p036a.p039c.C2324ap
    /* renamed from: d */
    public SocketAddress mo7007d() {
        return this.f6201d;
    }

    public String toString() {
        return mo7007d() == mo6990a().mo7053p() ? mo6990a().toString() + " WRITE: " + C2537j.m10063a(mo7006c()) : mo6990a().toString() + " WRITE: " + C2537j.m10063a(mo7006c()) + " to " + mo7007d();
    }
}
