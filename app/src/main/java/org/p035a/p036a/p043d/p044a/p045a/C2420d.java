package org.p035a.p036a.p043d.p044a.p045a;

import java.util.concurrent.atomic.AtomicBoolean;
import org.p035a.p036a.p038b.C2284d;
import org.p035a.p036a.p038b.C2286f;
import org.p035a.p036a.p039c.C2323ao;
import org.p035a.p036a.p039c.C2384f;
import org.p035a.p036a.p039c.C2387i;
import org.p035a.p036a.p039c.C2390l;
import org.p035a.p036a.p039c.C2391m;
import org.p035a.p036a.p039c.C2396p;
import org.p035a.p036a.p039c.C2403w;
import org.p035a.p036a.p039c.C2405y;
import org.p035a.p036a.p043d.p044a.p050e.C2473b;
import org.p035a.p036a.p054f.p055a.p056a.C2514k;

/* renamed from: org.a.a.d.a.a.d */
public class C2420d extends C2473b implements C2323ao {

    /* renamed from: a */
    private static final byte[] f6368a = new byte[0];

    /* renamed from: b */
    private final C2514k f6369b;

    /* renamed from: c */
    private final AtomicBoolean f6370c;

    /* renamed from: d */
    private volatile C2396p f6371d;

    public C2420d() {
        this(6);
    }

    public C2420d(int i) {
        this(C2425f.ZLIB, i);
    }

    public C2420d(C2425f fVar, int i) {
        this(fVar, i, 15, 8);
    }

    public C2420d(C2425f fVar, int i, int i2, int i3) {
        this.f6369b = new C2514k();
        this.f6370c = new AtomicBoolean();
        if (i < 0 || i > 9) {
            throw new IllegalArgumentException("compressionLevel: " + i + " (expected: 0-9)");
        } else if (i2 < 9 || i2 > 15) {
            throw new IllegalArgumentException("windowBits: " + i2 + " (expected: 9-15)");
        } else if (i3 < 1 || i3 > 9) {
            throw new IllegalArgumentException("memLevel: " + i3 + " (expected: 1-9)");
        } else if (fVar == null) {
            throw new NullPointerException("wrapper");
        } else if (fVar == C2425f.ZLIB_OR_NONE) {
            throw new IllegalArgumentException("wrapper '" + C2425f.ZLIB_OR_NONE + "' is not " + "allowed for compression.");
        } else {
            synchronized (this.f6369b) {
                int a = this.f6369b.mo7314a(i, i2, i3, C2423e.m9588a(fVar));
                if (a != 0) {
                    C2423e.m9589a(this.f6369b, "initialization failure", a);
                }
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: org.a.a.c.y.a(org.a.a.c.f, java.lang.Throwable):org.a.a.c.l
     arg types: [org.a.a.c.f, org.a.a.d.a.a.a]
     candidates:
      org.a.a.c.y.a(org.a.a.c.f, long):org.a.a.c.l
      org.a.a.c.y.a(org.a.a.c.f, boolean):org.a.a.c.l
      org.a.a.c.y.a(org.a.a.c.p, java.lang.Throwable):org.a.a.c.l
      org.a.a.c.y.a(org.a.a.c.f, java.lang.Object):void
      org.a.a.c.y.a(org.a.a.c.f, java.net.SocketAddress):void
      org.a.a.c.y.a(org.a.a.c.f, org.a.a.c.f):void
      org.a.a.c.y.a(org.a.a.c.p, org.a.a.c.l):void
      org.a.a.c.y.a(org.a.a.c.f, java.lang.Throwable):org.a.a.c.l */
    /* renamed from: b */
    private C2390l m9580b(final C2396p pVar, final C2387i iVar) {
        C2390l a;
        C2284d dVar = null;
        if (!this.f6370c.compareAndSet(false, true)) {
            if (iVar != null) {
                pVar.mo6981b(iVar);
            }
            return C2405y.m9549b(pVar.mo6977a());
        }
        synchronized (this.f6369b) {
            try {
                this.f6369b.f6761a = f6368a;
                this.f6369b.f6762b = 0;
                this.f6369b.f6763c = 0;
                byte[] bArr = new byte[32];
                this.f6369b.f6765e = bArr;
                this.f6369b.f6766f = 0;
                this.f6369b.f6767g = bArr.length;
                int b = this.f6369b.mo7320b(4);
                if (b != 0 && b != 1) {
                    a = C2405y.m9536a(pVar.mo6977a(), (Throwable) C2423e.m9590b(this.f6369b, "compression failure", b));
                } else if (this.f6369b.f6766f != 0) {
                    a = C2405y.m9534a(pVar.mo6977a());
                    dVar = pVar.mo6977a().mo7051m().mo6942a().mo6861a(bArr, 0, this.f6369b.f6766f);
                } else {
                    a = C2405y.m9534a(pVar.mo6977a());
                    dVar = C2286f.f6097c;
                }
            } finally {
                this.f6369b.mo7319b();
                this.f6369b.f6761a = null;
                this.f6369b.f6765e = null;
            }
        }
        if (dVar != null) {
            C2405y.m9547a(pVar, a, dVar);
        }
        if (iVar == null) {
            return a;
        }
        a.mo6936a(new C2391m() {
            /* class org.p035a.p036a.p043d.p044a.p045a.C2420d.C24211 */

            @Override // org.p035a.p036a.p039c.C2391m
            /* renamed from: a */
            public void mo6933a(C2390l lVar) {
                pVar.mo6981b(iVar);
            }
        });
        return a;
    }

    /* access modifiers changed from: protected */
    @Override // org.p035a.p036a.p043d.p044a.p050e.C2473b
    /* renamed from: a */
    public Object mo7152a(C2396p pVar, C2384f fVar, Object obj) {
        if ((obj instanceof C2284d) && !this.f6370c.get()) {
            synchronized (this.f6369b) {
                try {
                    C2284d dVar = (C2284d) obj;
                    byte[] bArr = new byte[dVar.mo6838d()];
                    dVar.mo6827a(bArr);
                    this.f6369b.f6761a = bArr;
                    this.f6369b.f6762b = 0;
                    this.f6369b.f6763c = bArr.length;
                    byte[] bArr2 = new byte[(((int) Math.ceil(((double) bArr.length) * 1.001d)) + 12)];
                    this.f6369b.f6765e = bArr2;
                    this.f6369b.f6766f = 0;
                    this.f6369b.f6767g = bArr2.length;
                    int b = this.f6369b.mo7320b(2);
                    if (b != 0) {
                        C2423e.m9589a(this.f6369b, "compression failure", b);
                    }
                    obj = this.f6369b.f6766f != 0 ? pVar.mo6977a().mo7051m().mo6942a().mo6886a(dVar.mo6870p(), bArr2, 0, this.f6369b.f6766f) : C2286f.f6097c;
                } finally {
                    this.f6369b.f6761a = null;
                    this.f6369b.f6765e = null;
                }
            }
        }
        return obj;
    }

    @Override // org.p035a.p036a.p039c.C2323ao
    /* renamed from: a */
    public void mo7009a(C2396p pVar) {
        this.f6371d = pVar;
    }

    @Override // org.p035a.p036a.p039c.C2386h, org.p035a.p036a.p043d.p044a.p050e.C2473b
    /* renamed from: a */
    public void mo7019a(C2396p pVar, C2387i iVar) {
        if (iVar instanceof C2403w) {
            C2403w wVar = (C2403w) iVar;
            switch (wVar.mo7003c()) {
                case OPEN:
                case CONNECTED:
                case BOUND:
                    if (Boolean.FALSE.equals(wVar.mo7004d()) || wVar.mo7004d() == null) {
                        m9580b(pVar, iVar);
                        return;
                    }
            }
        }
        super.mo7019a(pVar, iVar);
    }

    @Override // org.p035a.p036a.p039c.C2323ao
    /* renamed from: b */
    public void mo7010b(C2396p pVar) {
    }

    @Override // org.p035a.p036a.p039c.C2323ao
    /* renamed from: c */
    public void mo7011c(C2396p pVar) {
    }

    @Override // org.p035a.p036a.p039c.C2323ao
    /* renamed from: d */
    public void mo7012d(C2396p pVar) {
    }
}
