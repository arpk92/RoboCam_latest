package org.p057b.p061c;


import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.p035a.p036a.p038b.C2284d;
import org.p035a.p036a.p038b.C2286f;
import org.p035a.p036a.p039c.C2395o;
import org.p035a.p036a.p043d.p044a.p048d.C2466s;
import org.p035a.p036a.p043d.p044a.p048d.C2468u;
import org.p035a.p036a.p043d.p044a.p048d.C2470w;
import org.p035a.p036a.p043d.p044a.p048d.p049a.C2441c;
import org.p035a.p036a.p043d.p044a.p048d.p049a.C2442d;

/* renamed from: org.b.c.j */
public class C2579j implements C2607v {

    /* renamed from: a */
    private static final MessageDigest f6897a;

    /* renamed from: b */
    private final C2466s f6898b;

    /* renamed from: c */
    private final C2468u f6899c;

    static {
        try {
            f6897a = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            throw new InternalError("MD5 not supported on this platform");
        }
    }

    public C2579j(C2466s sVar, C2468u uVar) {
        this.f6898b = sVar;
        this.f6899c = uVar;
    }

    /* renamed from: a */
    private String m10132a(C2466s sVar) {
        return m10133b(sVar) + sVar.mo7195b("Host") + sVar.mo7208h();
    }

    /* renamed from: b */
    private String m10133b(C2466s sVar) {
        return sVar.mo7195b("Origin").matches("(?s)https://.*") ? "wss://" : "ws://";
    }

    @Override // org.p057b.p061c.C2607v
    /* renamed from: a */
    public void mo7445a(C2598s sVar) {
        sVar.mo7498c("HIXIE-76");
        this.f6899c.mo7209a(new C2470w(101, "Web Socket Protocol Handshake"));
        this.f6899c.mo7189a("Upgrade", "WebSocket");
        this.f6899c.mo7189a("Connection", "Upgrade");
        this.f6899c.mo7189a("Sec-WebSocket-Origin", this.f6898b.mo7195b("Origin"));
        this.f6899c.mo7189a("Sec-WebSocket-Location", m10132a(this.f6898b));
        String b = this.f6898b.mo7195b("Sec-WebSocket-Protocol");
        if (b != null) {
            this.f6899c.mo7189a("Sec-WebSocket-Protocol", b);
        }
        String b2 = this.f6898b.mo7195b("Sec-WebSocket-Key1");
        String b3 = this.f6898b.mo7195b("Sec-WebSocket-Key2");
        int parseLong = (int) (Long.parseLong(b2.replaceAll("[^0-9]", "")) / ((long) b2.replaceAll("[^ ]", "").length()));
        int parseLong2 = (int) (Long.parseLong(b3.replaceAll("[^0-9]", "")) / ((long) b3.replaceAll("[^ ]", "").length()));
        long j = this.f6898b.mo7203f().mo6852j();
        C2284d a = C2286f.m8923a(16);
        a.mo6851i(parseLong);
        a.mo6851i(parseLong2);
        a.mo6822a(j);
        this.f6899c.mo7191a(C2286f.m8936a(f6897a.digest(a.mo6884t())));
    }

    @Override // org.p057b.p061c.C2607v
    /* renamed from: a */
    public boolean mo7446a() {
        return this.f6898b.mo7201d("Sec-WebSocket-Key1") && this.f6898b.mo7201d("Sec-WebSocket-Key2");
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
