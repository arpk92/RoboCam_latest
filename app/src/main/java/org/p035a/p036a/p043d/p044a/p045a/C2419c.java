package org.p035a.p036a.p043d.p044a.p045a;

import org.p035a.p036a.p038b.C2284d;
import org.p035a.p036a.p038b.C2286f;
import org.p035a.p036a.p039c.C2384f;
import org.p035a.p036a.p039c.C2396p;
import org.p035a.p036a.p043d.p044a.p050e.C2472a;
import org.p035a.p036a.p054f.p055a.p056a.C2514k;

/* renamed from: org.a.a.d.a.a.c */
public class C2419c extends C2472a {

    /* renamed from: a */
    private final C2514k f6365a;

    /* renamed from: b */
    private byte[] f6366b;

    /* renamed from: c */
    private volatile boolean f6367c;

    public C2419c() {
        this(C2425f.ZLIB);
    }

    public C2419c(C2425f fVar) {
        this.f6365a = new C2514k();
        if (fVar == null) {
            throw new NullPointerException("wrapper");
        }
        synchronized (this.f6365a) {
            int a = this.f6365a.mo7316a(C2423e.m9588a(fVar));
            if (a != 0) {
                C2423e.m9589a(this.f6365a, "initialization failure", a);
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // org.p035a.p036a.p043d.p044a.p050e.C2472a
    /* renamed from: a */
    public Object mo7153a(C2396p pVar, C2384f fVar, Object obj) {
        if (!(obj instanceof C2284d) || this.f6367c) {
            return obj;
        }
        synchronized (this.f6365a) {
            try {
                C2284d dVar = (C2284d) obj;
                byte[] bArr = new byte[dVar.mo6838d()];
                dVar.mo6827a(bArr);
                this.f6365a.f6761a = bArr;
                this.f6365a.f6762b = 0;
                this.f6365a.f6763c = bArr.length;
                byte[] bArr2 = new byte[(bArr.length << 1)];
                C2284d a = C2286f.m8927a(dVar.mo6870p(), bArr2.length, pVar.mo6977a().mo7051m().mo6942a());
                this.f6365a.f6765e = bArr2;
                this.f6365a.f6766f = 0;
                this.f6365a.f6767g = bArr2.length;
                while (true) {
                    int a2 = this.f6365a.mo7313a(2);
                    if (this.f6365a.f6766f > 0) {
                        a.mo6833b(bArr2, 0, this.f6365a.f6766f);
                        this.f6365a.f6767g = bArr2.length;
                    }
                    this.f6365a.f6766f = 0;
                    switch (a2) {
                        case -5:
                            if (this.f6365a.f6763c > 0) {
                                break;
                            } else {
                                break;
                            }
                        case -4:
                        case -3:
                        case -2:
                        case -1:
                        default:
                            C2423e.m9589a(this.f6365a, "decompression failure", a2);
                            break;
                        case 0:
                            break;
                        case 1:
                            this.f6367c = true;
                            this.f6365a.mo7312a();
                            break;
                        case 2:
                            if (this.f6366b != null) {
                                int a3 = this.f6365a.mo7317a(this.f6366b, this.f6366b.length);
                                if (a3 == 0) {
                                    break;
                                } else {
                                    C2423e.m9589a(this.f6365a, "failed to set the dictionary", a3);
                                    break;
                                }
                            } else {
                                C2423e.m9589a(this.f6365a, "decompression failure", a2);
                                break;
                            }

                    }
                    //TODO; break
                    break;
                }
                if (a.mo6829b() != 0) {
                    this.f6365a.f6761a = null;
                    this.f6365a.f6765e = null;
                    return a;
                }
                this.f6365a.f6761a = null;
                this.f6365a.f6765e = null;
                return null;
            } catch (Throwable th) {
                this.f6365a.f6761a = null;
                this.f6365a.f6765e = null;
                throw th;
            }
        }
    }
}
