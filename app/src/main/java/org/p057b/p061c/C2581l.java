package org.p057b.p061c;

import org.p035a.p036a.p038b.C2284d;
import org.p035a.p036a.p038b.C2286f;
import org.p035a.p036a.p039c.C2384f;
import org.p035a.p036a.p039c.C2390l;
import org.p035a.p036a.p039c.C2391m;
import org.p035a.p036a.p039c.C2396p;
import org.p035a.p036a.p043d.p044a.p047c.C2435a;
import org.p035a.p036a.p043d.p044a.p047c.C2437c;
import org.p035a.p036a.p043d.p044a.p051f.C2475b;
import org.p057b.p060b.C2559e;
import org.p057b.p060b.C2560f;

/* renamed from: org.b.c.l */
public class C2581l extends C2475b<C2581l.C2584a> {

    /* renamed from: c */
    private final C2560f f6904c = new C2560f();

    /* renamed from: d */
    private final boolean f6905d;

    /* renamed from: e */
    private final boolean f6906e;

    /* renamed from: f */
    private final byte[] f6907f;

    /* renamed from: g */
    private boolean f6908g;

    /* renamed from: h */
    private int f6909h;

    /* renamed from: i */
    private long f6910i;

    /* renamed from: j */
    private byte[] f6911j;

    /* renamed from: k */
    private C2569e f6912k;

    /* renamed from: org.b.c.l$a */
    public enum C2584a {
        FRAME_START,
        MASKING_KEY,
        PAYLOAD,
        CORRUPT
    }

    private C2581l(boolean z, byte[] bArr) {
        super(C2584a.FRAME_START);
        this.f6905d = z;
        this.f6906e = z;
        this.f6907f = bArr;
    }

    /* renamed from: a */
    private int m10144a(long j) {
        if (j <= 2147483647L) {
            return (int) j;
        }
        try {
            throw new C2437c("Length:" + j);
        } catch (C2437c c2437c) {
            c2437c.printStackTrace();
        }
        return 0;
    }

    /* renamed from: a */
    static void m10145a(C2284d dVar, byte[] bArr) {
        int b = dVar.mo6829b();
        for (int i = 0; i < b; i++) {
            dVar.mo6878f(i, dVar.mo6881n(i) ^ bArr[i % 4]);
        }
    }

    /* renamed from: a */
    private void m10146a(C2384f fVar, String str) {
        mo7262a(C2584a.CORRUPT);
        if (fVar.mo7120l()) {
            fVar.mo6892a(C2286f.f6097c).mo6936a(C2391m.f6335a);
            fVar.mo6905i().mo6941g();
        }
        try {
            throw new C2435a(str);
        } catch (C2435a c2435a) {
            c2435a.printStackTrace();
        }
    }

    /* renamed from: d */
    public static C2581l m10147d() {
        return new C2581l(true, null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Object mo7181a(C2396p pVar, final C2384f fVar, C2284d dVar, C2584a aVar) {
        switch (aVar) {
            case FRAME_START:
                this.f6911j = null;
                byte f = dVar.mo6843f();
                this.f6908g = (f & 128) != 0;
                int i = (f & 112) >> 4;
                this.f6909h = f & 15;
                byte f2 = dVar.mo6843f();
                boolean z = (f2 & 128) != 0;
                byte b = (byte) (f2 & Byte.MAX_VALUE);
                if (i != 0) {
                    m10146a(fVar, "RSV != 0 and no extension negotiated, RSV:" + i);
                    return null;
                } else if (!this.f6905d || !this.f6906e || z) {
                    if (this.f6909h > 7) {
                        if (!this.f6908g) {
                            m10146a(fVar, "fragmented control frame");
                            return null;
                        } else if (b > 125) {
                            m10146a(fVar, "control frame with payload length > 125 octets");
                            return null;
                        } else if (this.f6909h != 8 && this.f6909h != 9 && this.f6909h != 10) {
                            m10146a(fVar, "control frame using reserved opcode " + this.f6909h);
                            return null;
                        } else if (this.f6909h == 8 && b == 1) {
                            m10146a(fVar, "received close control frame with payload len 1");
                            return null;
                        }
                    } else if (this.f6909h != 0 && this.f6909h != 1 && this.f6909h != 2) {
                        m10146a(fVar, "data frame using reserved opcode " + this.f6909h);
                        return null;
                    } else if (this.f6912k == null && this.f6909h == 0) {
                        m10146a(fVar, "received continuation data frame outside fragmented message");
                        return null;
                    } else if (!(this.f6912k == null || this.f6909h == 0)) {
                        m10146a(fVar, "received non-continuation data frame while inside fragmented message");
                        return null;
                    }
                    if (b == 126) {
                        this.f6910i = (long) dVar.mo6850i();
                        if (this.f6910i < 126) {
                            m10146a(fVar, "invalid data frame length (not using minimal length encoding)");
                            return null;
                        }
                    } else if (b == Byte.MAX_VALUE) {
                        this.f6910i = dVar.mo6852j();
                        if (this.f6910i < 65536) {
                            m10146a(fVar, "invalid data frame length (not using minimal length encoding)");
                            return null;
                        }
                    } else {
                        this.f6910i = (long) b;
                    }
                    if (z) {
                        mo7262a(C2584a.MASKING_KEY);
                    } else {
                        mo7262a(C2584a.PAYLOAD);
                        return null;
                    }
                } else {
                    m10146a(fVar, "Received unmasked frame");
                    return null;
                }
                break;
            case MASKING_KEY:
                this.f6911j = dVar.mo6844f(4).mo6884t();
                mo7262a(C2584a.PAYLOAD);
                break;
            case PAYLOAD:
                break;
            case CORRUPT:
                dVar.mo6843f();
                return null;
            default:
                throw new Error("Shouldn't reach here.");
        }
        C2284d f3 = dVar.mo6844f(m10144a(this.f6910i));
        if (this.f6911j != null) {
            m10145a(f3, this.f6911j);
        }
        mo7262a(C2584a.FRAME_START);
        if (this.f6909h == 8) {
            fVar.mo6892a(new C2574f(8, true, 0, this.f6907f, C2286f.m8923a(0))).mo6936a(new C2391m() {
                /* class org.p057b.p061c.C2581l.C25821 */

                @Override // org.p035a.p036a.p039c.C2391m
                /* renamed from: a */
                public void mo6933a(C2390l lVar) {
                    fVar.mo6905i();
                }
            });
            return null;
        }
        if (this.f6909h == 0) {
            this.f6912k.mo7442a(f3);
        } else if (this.f6909h == 9 || this.f6909h == 10) {
            return new C2569e(this.f6909h, this.f6904c, f3);
        } else {
            this.f6912k = new C2569e(this.f6909h, this.f6904c, f3);
        }
        if (!this.f6908g) {
            return null;
        }
        C2569e eVar = this.f6912k;
        this.f6912k = null;
        return eVar;
    }
}
