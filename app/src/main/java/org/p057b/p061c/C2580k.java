package org.p057b.p061c;


import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.p035a.p036a.p039c.C2395o;
import org.p035a.p036a.p043d.p044a.p048d.C2466s;
import org.p035a.p036a.p043d.p044a.p048d.C2468u;
import org.p035a.p036a.p043d.p044a.p048d.C2470w;
import org.p057b.p060b.C2554a;

/* renamed from: org.b.c.k */
public class C2580k implements C2607v {

    /* renamed from: a */
    private static final Charset f6900a = Charset.forName("ASCII");

    /* renamed from: b */
    private static final MessageDigest f6901b;

    /* renamed from: c */
    private final C2466s f6902c;

    /* renamed from: d */
    private final C2468u f6903d;

    static {
        try {
            f6901b = MessageDigest.getInstance("SHA1");
        } catch (NoSuchAlgorithmException e) {
            throw new InternalError("SHA-1 not supported on this platform");
        }
    }

    public C2580k(C2466s sVar, C2468u uVar) {
        this.f6902c = sVar;
        this.f6903d = uVar;
    }

    /* renamed from: a */
    private byte[] m10138a(String str) {
        return f6901b.digest(str.getBytes(f6900a));
    }

    /* renamed from: d */
    private Integer m10139d() {
        if (this.f6902c.mo7201d("Sec-WebSocket-Version")) {
            return Integer.valueOf(Integer.parseInt(this.f6902c.mo7195b("Sec-WebSocket-Version").trim()));
        }
        return null;
    }

    @Override // org.p057b.p061c.C2607v
    /* renamed from: a */
    public void mo7445a(C2598s sVar) {
        sVar.mo7494a(m10139d().intValue());
        if (m10139d().intValue() < 8) {
            this.f6903d.mo7209a(C2470w.f6488O);
            this.f6903d.mo7196b("Sec-WebSocket-Version", String.valueOf(8));
            return;
        }
        String b = this.f6902c.mo7195b("Sec-WebSocket-Key");
        if (b == null) {
            this.f6903d.mo7209a(C2470w.f6516s);
            return;
        }
        String a = C2554a.m10088a(m10138a(b + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11"));
        this.f6903d.mo7209a(new C2470w(101, "Switching Protocols"));
        this.f6903d.mo7189a("Upgrade", "WebSocket".toLowerCase());
        this.f6903d.mo7189a("Connection", "Upgrade");
        this.f6903d.mo7189a("Sec-WebSocket-Accept", a);
        String b2 = this.f6902c.mo7195b("Sec-WebSocket-Protocol");
        if (b2 != null) {
            this.f6903d.mo7189a("Sec-WebSocket-Protocol", b2);
        }
    }

    @Override // org.p057b.p061c.C2607v
    /* renamed from: a */
    public boolean mo7446a() {
        return m10139d() != null;
    }

    @Override // org.p057b.p061c.C2607v
    /* renamed from: b */
    public C2395o mo7447b() {
        return C2581l.m10147d();
    }

    @Override // org.p057b.p061c.C2607v
    /* renamed from: c */
    public C2395o mo7448c() {
        return new C2585m();
    }
}
