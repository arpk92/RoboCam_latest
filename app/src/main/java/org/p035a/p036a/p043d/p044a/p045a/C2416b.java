package org.p035a.p036a.p043d.p044a.p045a;

import android.os.Build;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.CRC32;
import java.util.zip.Deflater;
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

/* renamed from: org.a.a.d.a.a.b */
public class C2416b extends C2473b implements C2323ao {

    /* renamed from: g */
    private static final byte[] f6353g = {31, -117, 8, 0, 0, 0, 0, 0, 0, 0};

    /* renamed from: a */
    private final byte[] f6354a;

    /* renamed from: b */
    private final Deflater f6355b;

    /* renamed from: c */
    private final AtomicBoolean f6356c;

    /* renamed from: d */
    private volatile C2396p f6357d;

    /* renamed from: e */
    private final boolean f6358e;

    /* renamed from: f */
    private final CRC32 f6359f;

    /* renamed from: h */
    private boolean f6360h;

    public C2416b() {
        this(6);
    }

    public C2416b(int i) {
        this(C2425f.ZLIB, i);
    }

    public C2416b(C2425f fVar, int i) {
        boolean z = true;
        this.f6354a = new byte[8192];
        this.f6356c = new AtomicBoolean();
        this.f6359f = new CRC32();
        this.f6360h = true;
        if (i < 0 || i > 9) {
            throw new IllegalArgumentException("compressionLevel: " + i + " (expected: 0-9)");
        } else if (fVar == null) {
            throw new NullPointerException("wrapper");
        } else if (fVar == C2425f.ZLIB_OR_NONE) {
            throw new IllegalArgumentException("wrapper '" + C2425f.ZLIB_OR_NONE + "' is not " + "allowed for compression.");
        } else {
            this.f6358e = fVar == C2425f.GZIP;
            this.f6355b = new Deflater(i, fVar == C2425f.ZLIB ? false : z);
        }
    }

    /* renamed from: b */
    private C2390l m9571b(final C2396p pVar, final C2387i iVar) {
        C2390l b = C2405y.m9549b(pVar.mo6977a());
        if (this.f6356c.compareAndSet(false, true)) {
            C2284d a = C2286f.m8934a(pVar.mo6977a().mo7051m().mo6942a());
            synchronized (this.f6355b) {
                this.f6355b.finish();
                while (!this.f6355b.finished()) {
                    a.mo6833b(this.f6354a, 0, this.f6355b.deflate(this.f6354a, 0, this.f6354a.length));
                }
                if (this.f6358e) {
                    int value = (int) this.f6359f.getValue();
                    int totalIn = this.f6355b.getTotalIn();
                    a.mo6848h(value);
                    a.mo6848h(value >>> 8);
                    a.mo6848h(value >>> 16);
                    a.mo6848h(value >>> 24);
                    a.mo6848h(totalIn);
                    a.mo6848h(totalIn >>> 8);
                    a.mo6848h(totalIn >>> 16);
                    a.mo6848h(totalIn >>> 24);
                }
                this.f6355b.end();
            }
            if (a.mo6836c()) {
                b = C2405y.m9534a(pVar.mo6977a());
                C2405y.m9547a(pVar, b, a);
            }
            if (iVar != null) {
                b.mo6936a(new C2391m() {
                    /* class org.p035a.p036a.p043d.p044a.p045a.C2416b.C24171 */

                    @Override // org.p035a.p036a.p039c.C2391m
                    /* renamed from: a */
                    public void mo6933a(C2390l lVar) {
                        pVar.mo6981b(iVar);
                    }
                });
            }
        } else if (iVar != null) {
            pVar.mo6981b(iVar);
        }
        return b;
    }

    /* JADX INFO: additional move instructions added (2) to help type inference */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:20:0x006f */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: org.a.a.b.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: org.a.a.b.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: org.a.a.b.d} */
    /* JADX WARN: Multi-variable type inference failed */
    /* access modifiers changed from: protected */
    @Override // org.p035a.p036a.p043d.p044a.p050e.C2473b
    /* renamed from: a */
    public Object mo7152a(C2396p pVar, C2384f fVar, Object obj) {
        boolean z = obj instanceof C2284d;
        C2284d dVar = (C2284d) obj;
        if (z) {
            dVar = (C2284d) obj;
            if (!this.f6356c.get()) {
                C2284d dVar2 = (C2284d) obj;
                byte[] bArr = new byte[dVar2.mo6838d()];
                dVar2.mo6827a(bArr);
                dVar = C2286f.m8924a(((int) Math.ceil(((double) bArr.length) * 1.001d)) + 12, fVar.mo7051m().mo6942a());
                synchronized (this.f6355b) {
                    if (this.f6358e) {
                        this.f6359f.update(bArr);
                        if (this.f6360h) {
                            dVar.mo6832b(f6353g);
                            this.f6360h = false;
                        }
                    }
                    this.f6355b.setInput(bArr);
                    while (!this.f6355b.needsInput()) {
                        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
                            dVar.mo6833b(this.f6354a, 0, this.f6355b.deflate(this.f6354a, 0, this.f6354a.length, 2));
                        }
                    }
                }
            }
        }
        return dVar;
    }

    @Override // org.p035a.p036a.p039c.C2323ao
    /* renamed from: a */
    public void mo7009a(C2396p pVar) {
        this.f6357d = pVar;
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
                        m9571b(pVar, iVar);
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
