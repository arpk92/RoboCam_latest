package org.p057b.p061c;

import org.p035a.p036a.p039c.C2395o;
import org.p035a.p036a.p043d.p044a.p048d.C2466s;
import org.p035a.p036a.p043d.p044a.p048d.C2468u;
import org.p035a.p036a.p043d.p044a.p048d.C2470w;
import org.p035a.p036a.p043d.p044a.p048d.p049a.C2441c;
import org.p035a.p036a.p043d.p044a.p048d.p049a.C2442d;

/* renamed from: org.b.c.i */
public class C2578i implements C2607v {

    /* renamed from: a */
    private final C2466s f6895a;

    /* renamed from: b */
    private final C2468u f6896b;

    public C2578i(C2466s sVar, C2468u uVar) {
        this.f6895a = sVar;
        this.f6896b = uVar;
    }

    /* renamed from: a */
    private String m10126a(C2466s sVar) {
        return m10127b(sVar) + sVar.mo7195b("Host") + sVar.mo7208h();
    }

    /* renamed from: b */
    private String m10127b(C2466s sVar) {
        return sVar.mo7195b("Origin").matches("(?s)https://.*") ? "wss://" : "ws://";
    }

    @Override // org.p057b.p061c.C2607v
    /* renamed from: a */
    public void mo7445a(C2598s sVar) {
        sVar.mo7498c("HIXIE-75");
        this.f6896b.mo7209a(new C2470w(101, "Web Socket Protocol Handshake"));
        this.f6896b.mo7189a("Upgrade", "WebSocket");
        this.f6896b.mo7189a("Connection", "Upgrade");
        String b = this.f6895a.mo7195b("Origin");
        if (b != null) {
            this.f6896b.mo7189a("WebSocket-Origin", b);
        }
        this.f6896b.mo7189a("WebSocket-Location", m10126a(this.f6895a));
        String b2 = this.f6895a.mo7195b("WebSocket-Protocol");
        if (b2 != null) {
            this.f6896b.mo7189a("WebSocket-Protocol", b2);
        }
    }

    @Override // org.p057b.p061c.C2607v
    /* renamed from: a */
    public boolean mo7446a() {
        return false;
    }

    @Override // org.p057b.p061c.C2607v
    /* renamed from: b */
    public C2395o mo7447b() {
        return new C2441c();
    }

    @Override // org.p057b.p061c.C2607v
    /* renamed from: c */
    public C2395o mo7448c() {
        return new C2442d();
    }
}
