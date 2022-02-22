package org.p035a.p036a.p039c;

import java.net.SocketAddress;
import org.p035a.p036a.p054f.p055a.C2537j;

/* renamed from: org.a.a.c.ay */
public class C2336ay implements C2324ap {

    /* renamed from: a */
    private final C2384f f6211a;

    /* renamed from: b */
    private final Object f6212b;

    /* renamed from: c */
    private final SocketAddress f6213c;

    public C2336ay(C2384f fVar, Object obj, SocketAddress socketAddress) {
        if (fVar == null) {
            throw new NullPointerException("channel");
        } else if (obj == null) {
            throw new NullPointerException("message");
        } else {
            this.f6211a = fVar;
            this.f6212b = obj;
            if (socketAddress != null) {
                this.f6213c = socketAddress;
            } else {
                this.f6213c = fVar.mo7053p();
            }
        }
    }

    @Override // org.p035a.p036a.p039c.C2387i
    /* renamed from: a */
    public C2384f mo6990a() {
        return this.f6211a;
    }

    @Override // org.p035a.p036a.p039c.C2387i
    /* renamed from: b */
    public C2390l mo6991b() {
        return C2405y.m9549b(mo6990a());
    }

    @Override // org.p035a.p036a.p039c.C2324ap
    /* renamed from: c */
    public Object mo7006c() {
        return this.f6212b;
    }

    @Override // org.p035a.p036a.p039c.C2324ap
    /* renamed from: d */
    public SocketAddress mo7007d() {
        return this.f6213c;
    }

    public String toString() {
        return mo7007d() == mo6990a().mo7053p() ? mo6990a().toString() + " RECEIVED: " + C2537j.m10063a(mo7006c()) : mo6990a().toString() + " RECEIVED: " + C2537j.m10063a(mo7006c()) + " from " + mo7007d();
    }
}
