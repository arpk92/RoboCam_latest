package org.p035a.p036a.p054f.p055a.p056a;

import android.support.v8.renderscript.Allocation;
import android.support.v8.renderscript.ScriptIntrinsicBLAS;
import org.p035a.p036a.p054f.p055a.p056a.C2510h;

@SuppressWarnings("ALL")
/* renamed from: org.a.a.f.a.a.c */
final class C2502c {

    /* renamed from: ae */
    private static final C2504a[] f6601ae = new C2504a[10];

    /* renamed from: af */
    private static final String[] f6602af = {"need dictionary", "stream end", "", "file error", "stream error", "data error", "insufficient memory", "buffer error", "incompatible version", ""};

    /* renamed from: A */
    int f6603A;

    /* renamed from: B */
    int f6604B;

    /* renamed from: C */
    int f6605C;

    /* renamed from: D */
    int f6606D;

    /* renamed from: E */
    int f6607E;

    /* renamed from: F */
    int f6608F;

    /* renamed from: G */
    int f6609G;

    /* renamed from: H */
    int f6610H;

    /* renamed from: I */
    int f6611I;

    /* renamed from: J */
    short[] f6612J = new short[1146];

    /* renamed from: K */
    short[] f6613K = new short[ScriptIntrinsicBLAS.LOWER];

    /* renamed from: L */
    short[] f6614L = new short[78];

    /* renamed from: M */
    C2513j f6615M = new C2513j();

    /* renamed from: N */
    C2513j f6616N = new C2513j();

    /* renamed from: O */
    C2513j f6617O = new C2513j();

    /* renamed from: P */
    short[] f6618P = new short[16];

    /* renamed from: Q */
    int[] f6619Q = new int[573];

    /* renamed from: R */
    int f6620R;

    /* renamed from: S */
    int f6621S;

    /* renamed from: T */
    byte[] f6622T = new byte[573];

    /* renamed from: U */
    int f6623U;

    /* renamed from: V */
    int f6624V;

    /* renamed from: W */
    int f6625W;

    /* renamed from: X */
    int f6626X;

    /* renamed from: Y */
    int f6627Y;

    /* renamed from: Z */
    int f6628Z;

    /* renamed from: a */
    C2514k f6629a;

    /* renamed from: aa */
    int f6630aa;

    /* renamed from: ab */
    int f6631ab;

    /* renamed from: ac */
    short f6632ac;

    /* renamed from: ad */
    int f6633ad;

    /* renamed from: ag */
    private boolean f6634ag;

    /* renamed from: ah */
    private int f6635ah;

    /* renamed from: b */
    int f6636b;

    /* renamed from: c */
    byte[] f6637c;

    /* renamed from: d */
    int f6638d;

    /* renamed from: e */
    int f6639e;

    /* renamed from: f */
    int f6640f;

    /* renamed from: g */
    C2510h.C2511a f6641g;

    /* renamed from: h */
    byte f6642h;

    /* renamed from: i */
    int f6643i;

    /* renamed from: j */
    int f6644j;

    /* renamed from: k */
    int f6645k;

    /* renamed from: l */
    int f6646l;

    /* renamed from: m */
    byte[] f6647m;

    /* renamed from: n */
    int f6648n;

    /* renamed from: o */
    short[] f6649o;

    /* renamed from: p */
    short[] f6650p;

    /* renamed from: q */
    int f6651q;

    /* renamed from: r */
    int f6652r;

    /* renamed from: s */
    int f6653s;

    /* renamed from: t */
    int f6654t;

    /* renamed from: u */
    int f6655u;

    /* renamed from: v */
    int f6656v;

    /* renamed from: w */
    int f6657w;

    /* renamed from: x */
    int f6658x;

    /* renamed from: y */
    int f6659y;

    /* renamed from: z */
    int f6660z;

    /* renamed from: org.a.a.f.a.a.c$a */
    private static final class C2504a {

        /* renamed from: a */
        final int f6662a;

        /* renamed from: b */
        final int f6663b;

        /* renamed from: c */
        final int f6664c;

        /* renamed from: d */
        final int f6665d;

        /* renamed from: e */
        final int f6666e;

        C2504a(int i, int i2, int i3, int i4, int i5) {
            this.f6662a = i;
            this.f6663b = i2;
            this.f6664c = i3;
            this.f6665d = i4;
            this.f6666e = i5;
        }
    }

    static {
        f6601ae[0] = new C2504a(0, 0, 0, 0, 0);
        f6601ae[1] = new C2504a(4, 4, 8, 4, 1);
        f6601ae[2] = new C2504a(4, 5, 16, 8, 1);
        f6601ae[3] = new C2504a(4, 6, 32, 32, 1);
        f6601ae[4] = new C2504a(4, 4, 16, 16, 2);
        f6601ae[5] = new C2504a(8, 16, 32, 32, 2);
        f6601ae[6] = new C2504a(8, 16, Allocation.USAGE_SHARED, Allocation.USAGE_SHARED, 2);
        f6601ae[7] = new C2504a(8, 32, Allocation.USAGE_SHARED, 256, 2);
        f6601ae[8] = new C2504a(32, Allocation.USAGE_SHARED, 258, 1024, 2);
        f6601ae[9] = new C2504a(32, 258, 258, 4096, 2);
    }

    C2502c() {
    }

    /* renamed from: a */
    private int m9957a(C2514k kVar) {
        kVar.f6768h = 0;
        kVar.f6764d = 0;
        kVar.f6769i = null;
        this.f6640f = 0;
        this.f6639e = 0;
        this.f6634ag = false;
        this.f6636b = this.f6641g == C2510h.C2511a.NONE ? 113 : 42;
        kVar.f6772l = C2500a.m9955a(0, null, 0, 0);
        kVar.f6773m = 0;
        this.f6635ah = 0;
        this.f6643i = 0;
        m9975c();
        m9969b();
        return 0;
    }

    /* renamed from: a */
    private int m9958a(C2514k kVar, int i, int i2, int i3, int i4, int i5, C2510h.C2511a aVar) {
        if (aVar == C2510h.C2511a.ZLIB_OR_NONE) {
            throw new IllegalArgumentException("ZLIB_OR_NONE allowed only for inflate");
        }
        kVar.f6769i = null;
        if (i == -1) {
            i = 6;
        }
        if (i3 < 0) {
            throw new IllegalArgumentException("windowBits: " + i3);
        } else if (i4 < 1 || i4 > 9 || i2 != 8 || i3 < 9 || i3 > 15 || i < 0 || i > 9 || i5 < 0 || i5 > 2) {
            return -2;
        } else {
            kVar.f6770j = this;
            this.f6641g = aVar;
            this.f6645k = i3;
            this.f6644j = 1 << this.f6645k;
            this.f6646l = this.f6644j - 1;
            this.f6653s = i4 + 7;
            this.f6652r = 1 << this.f6653s;
            this.f6654t = this.f6652r - 1;
            this.f6655u = ((this.f6653s + 3) - 1) / 3;
            this.f6647m = new byte[(this.f6644j * 2)];
            this.f6649o = new short[this.f6644j];
            this.f6650p = new short[this.f6652r];
            this.f6624V = 1 << (i4 + 6);
            this.f6637c = new byte[(this.f6624V * 4)];
            this.f6638d = this.f6624V * 4;
            this.f6626X = this.f6624V / 2;
            this.f6623U = this.f6624V * 3;
            this.f6608F = i;
            this.f6609G = i5;
            return m9957a(kVar);
        }
    }

    /* renamed from: a */
    private void m9959a(byte b) {
        byte[] bArr = this.f6637c;
        int i = this.f6640f;
        this.f6640f = i + 1;
        bArr[i] = b;
    }

    /* renamed from: a */
    private void m9960a(int i) {
        m9959a((byte) i);
        m9959a((byte) (i >>> 8));
    }

    /* renamed from: a */
    private void m9961a(int i, int i2) {
        if (this.f6633ad > 16 - i2) {
            this.f6632ac = (short) (this.f6632ac | ((i << this.f6633ad) & 65535));
            m9960a(this.f6632ac);
            this.f6632ac = (short) (i >>> (16 - this.f6633ad));
            this.f6633ad += i2 - 16;
            return;
        }
        this.f6632ac = (short) (this.f6632ac | ((i << this.f6633ad) & 65535));
        this.f6633ad += i2;
    }

    /* renamed from: a */
    private void m9962a(int i, int i2, int i3) {
        m9961a(i - 257, 5);
        m9961a(i2 - 1, 5);
        m9961a(i3 - 4, 4);
        for (int i4 = 0; i4 < i3; i4++) {
            m9961a(this.f6614L[(C2513j.f6753d[i4] * 2) + 1], 3);
        }
        m9977c(this.f6612J, i - 1);
        m9977c(this.f6613K, i2 - 1);
    }

    /* renamed from: a */
    private void m9963a(int i, int i2, boolean z) {
        m9986i();
        this.f6631ab = 8;
        if (z) {
            m9960a((short) i2);
            m9960a((short) (i2 ^ -1));
        }
        m9966a(this.f6647m, i, i2);
    }

    /* renamed from: a */
    private void m9964a(int i, short[] sArr) {
        int i2 = i * 2;
        m9961a(sArr[i2] & 65535, sArr[i2 + 1] & 65535);
    }

    /* renamed from: a */
    private void m9965a(boolean z) {
        m9976c(this.f6656v >= 0 ? this.f6656v : -1, this.f6660z - this.f6656v, z);
        this.f6656v = this.f6660z;
        this.f6629a.mo7321c();
    }

    /* renamed from: a */
    private void m9966a(byte[] bArr, int i, int i2) {
        System.arraycopy(bArr, i, this.f6637c, this.f6640f, i2);
        this.f6640f += i2;
    }

    /* renamed from: a */
    private void m9967a(short[] sArr, short[] sArr2) {
        int i = 0;
        if (this.f6625W != 0) {
            do {
                byte b = (byte) (((this.f6637c[this.f6626X + (i * 2)] << 8) & 65280) | (this.f6637c[this.f6626X + (i * 2) + 1] & 255));
                byte b2 = (byte) (this.f6637c[this.f6623U + i] & 255);
                i++;
                if (b == 0) {
                    m9964a(b2, sArr);
                } else {
                    byte b3 = C2513j.f6755f[b2];
                    m9964a(b3 + 256 + 1, sArr);
                    int i2 = C2513j.f6750a[b3];
                    if (i2 != 0) {
                        m9961a(b2 - C2513j.f6756g[b3], i2);
                    }
                    int i3 = b - 1;
                    int a = C2513j.m10010a(i3);
                    m9964a(a, sArr2);
                    int i4 = C2513j.f6751b[a];
                    if (i4 != 0) {
                        m9961a(i3 - C2513j.f6757h[a], i4);
                    }
                }
            } while (i < this.f6625W);
        }
        m9964a(256, sArr);
        this.f6631ab = sArr[513];
    }

    /* renamed from: a */
    private static boolean m9968a(short[] sArr, int i, int i2, byte[] bArr) {
        short s = sArr[i * 2];
        short s2 = sArr[i2 * 2];
        return s < s2 || (s == s2 && bArr[i] <= bArr[i2]);
    }

    /* renamed from: b */
    private void m9969b() {
        this.f6648n = this.f6644j * 2;
        this.f6607E = f6601ae[this.f6608F].f6663b;
        this.f6610H = f6601ae[this.f6608F].f6662a;
        this.f6611I = f6601ae[this.f6608F].f6664c;
        this.f6606D = f6601ae[this.f6608F].f6665d;
        this.f6660z = 0;
        this.f6656v = 0;
        this.f6604B = 0;
        this.f6605C = 2;
        this.f6657w = 2;
        this.f6659y = 0;
        this.f6651q = 0;
    }

    /* renamed from: b */
    private void m9970b(int i) {
        m9959a((byte) (i >> 8));
        m9959a((byte) i);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: org.a.a.f.a.a.c.a(int, int, boolean):void
     arg types: [int, int, int]
     candidates:
      org.a.a.f.a.a.c.a(int, int, int):void
      org.a.a.f.a.a.c.a(byte[], int, int):void
      org.a.a.f.a.a.c.a(int, int, boolean):void */
    /* renamed from: b */
    private void m9971b(int i, int i2, boolean z) {
        m9961a((z ? 1 : 0) + 0, 3);
        m9963a(i, i2, true);
    }

    /* renamed from: b */
    private void m9972b(short[] sArr, int i) {
        int i2;
        int i3;
        short s = -1;
        short s2 = sArr[1];
        if (s2 == 0) {
            i3 = 138;
            i2 = 3;
        } else {
            i2 = 4;
            i3 = 7;
        }
        sArr[((i + 1) * 2) + 1] = -1;
        int i4 = 0;
        int i5 = 0;
        while (i5 <= i) {
            short s3 = sArr[((i5 + 1) * 2) + 1];
            i4++;
            if (i4 >= i3 || s2 != s3) {
                if (i4 < i2) {
                    short[] sArr2 = this.f6614L;
                    int i6 = s2 * 2;
                    sArr2[i6] = (short) (i4 + sArr2[i6]);
                } else if (s2 != 0) {
                    if (s2 != s) {
                        short[] sArr3 = this.f6614L;
                        int i7 = s2 * 2;
                        sArr3[i7] = (short) (sArr3[i7] + 1);
                    }
                    short[] sArr4 = this.f6614L;
                    sArr4[32] = (short) (sArr4[32] + 1);
                } else if (i4 <= 10) {
                    short[] sArr5 = this.f6614L;
                    sArr5[34] = (short) (sArr5[34] + 1);
                } else {
                    short[] sArr6 = this.f6614L;
                    sArr6[36] = (short) (sArr6[36] + 1);
                }
                if (s3 == 0) {
                    i3 = 138;
                    i4 = 0;
                    s = s2;
                    i2 = 3;
                } else if (s2 == s3) {
                    i3 = 6;
                    i4 = 0;
                    s = s2;
                    i2 = 3;
                } else {
                    i2 = 4;
                    i3 = 7;
                    i4 = 0;
                    s = s2;
                }
            }
            i5++;
            s2 = s3;
        }
    }

    /* renamed from: b */
    private boolean m9973b(int i, int i2) {
        this.f6637c[this.f6626X + (this.f6625W * 2)] = (byte) (i >>> 8);
        this.f6637c[this.f6626X + (this.f6625W * 2) + 1] = (byte) i;
        this.f6637c[this.f6623U + this.f6625W] = (byte) i2;
        this.f6625W++;
        if (i == 0) {
            short[] sArr = this.f6612J;
            int i3 = i2 * 2;
            sArr[i3] = (short) (sArr[i3] + 1);
        } else {
            this.f6630aa++;
            short[] sArr2 = this.f6612J;
            int i4 = (C2513j.f6755f[i2] + 256 + 1) * 2;
            sArr2[i4] = (short) (sArr2[i4] + 1);
            short[] sArr3 = this.f6613K;
            int a = C2513j.m10010a(i - 1) * 2;
            sArr3[a] = (short) (sArr3[a] + 1);
        }
        if ((this.f6625W & 8191) == 0 && this.f6608F > 2) {
            int i5 = this.f6625W * 8;
            int i6 = this.f6660z - this.f6656v;
            for (int i7 = 0; i7 < 30; i7++) {
                i5 = (int) (((long) i5) + (((long) this.f6613K[i7 * 2]) * (5 + ((long) C2513j.f6751b[i7]))));
            }
            int i8 = i5 >>> 3;
            if (this.f6630aa < this.f6625W / 2 && i8 < i6 / 2) {
                return true;
            }
        }
        return this.f6625W == this.f6624V + -1;
    }

    /* renamed from: c */
    private int m9974c(int i) {
        int i2 = 1;
        int i3 = 65535;
        if (65535 > this.f6638d - 5) {
            i3 = this.f6638d - 5;
        }
        while (true) {
            if (this.f6604B <= 1) {
                m9987j();
                if (this.f6604B == 0 && i == 0) {
                    return 0;
                }
                if (this.f6604B == 0) {
                    m9965a(i == 4);
                    if (this.f6629a.f6767g == 0) {
                        return i == 4 ? 2 : 0;
                    }
                    if (i == 4) {
                        i2 = 3;
                    }
                    return i2;
                }
            }
            this.f6660z += this.f6604B;
            this.f6604B = 0;
            int i4 = this.f6656v + i3;
            if (this.f6660z == 0 || this.f6660z >= i4) {
                this.f6604B = this.f6660z - i4;
                this.f6660z = i4;
                m9965a(false);
                if (this.f6629a.f6767g == 0) {
                    return 0;
                }
            }
            if (this.f6660z - this.f6656v >= this.f6644j - 262) {
                m9965a(false);
                if (this.f6629a.f6767g == 0) {
                    return 0;
                }
            }
        }
    }

    /* renamed from: c */
    private void m9975c() {
        this.f6615M.f6758i = this.f6612J;
        this.f6615M.f6760k = C2512i.f6742c;
        this.f6616N.f6758i = this.f6613K;
        this.f6616N.f6760k = C2512i.f6743d;
        this.f6617O.f6758i = this.f6614L;
        this.f6617O.f6760k = C2512i.f6744e;
        this.f6632ac = 0;
        this.f6633ad = 0;
        this.f6631ab = 8;
        m9979d();
    }

    /* renamed from: c */
    private void m9976c(int i, int i2, boolean z) {
        int i3;
        int i4;
        int i5;
        int i6 = 1;
        if (this.f6608F > 0) {
            if (this.f6642h == 2) {
                m9984g();
            }
            this.f6615M.mo7311a(this);
            this.f6616N.mo7311a(this);
            i5 = m9980e();
            i4 = ((this.f6627Y + 3) + 7) >>> 3;
            i3 = ((this.f6628Z + 3) + 7) >>> 3;
            if (i3 <= i4) {
                i4 = i3;
            }
        } else {
            int i7 = i2 + 5;
            i3 = i7;
            i4 = i7;
            i5 = 0;
        }
        if (i2 + 4 <= i4 && i != -1) {
            m9971b(i, i2, z);
        } else if (i3 == i4) {
            if (!z) {
                i6 = 0;
            }
            m9961a(i6 + 2, 3);
            m9967a(C2512i.f6740a, C2512i.f6741b);
        } else {
            if (!z) {
                i6 = 0;
            }
            m9961a(i6 + 4, 3);
            m9962a(this.f6615M.f6759j + 1, this.f6616N.f6759j + 1, i5 + 1);
            m9967a(this.f6612J, this.f6613K);
        }
        m9979d();
        if (z) {
            m9986i();
        }
    }

    /* renamed from: c */
    private void m9977c(short[] sArr, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        short s = -1;
        short s2 = sArr[1];
        if (s2 == 0) {
            i2 = 3;
            i3 = 138;
        } else {
            i2 = 4;
            i3 = 7;
        }
        int i7 = i3;
        int i8 = 0;
        int i9 = i2;
        int i10 = 0;
        while (i8 <= i) {
            short s3 = sArr[((i8 + 1) * 2) + 1];
            int i11 = i10 + 1;
            if (i11 >= i7 || s2 != s3) {
                if (i11 < i9) {
                    do {
                        m9964a(s2, this.f6614L);
                        i11--;
                    } while (i11 != 0);
                } else if (s2 != 0) {
                    if (s2 != s) {
                        m9964a(s2, this.f6614L);
                        i11--;
                    }
                    m9964a(16, this.f6614L);
                    m9961a(i11 - 3, 2);
                } else if (i11 <= 10) {
                    m9964a(17, this.f6614L);
                    m9961a(i11 - 3, 3);
                } else {
                    m9964a(18, this.f6614L);
                    m9961a(i11 - 11, 7);
                }
                if (s3 == 0) {
                    i4 = 3;
                    i5 = 138;
                    i6 = 0;
                    s = s2;
                } else if (s2 == s3) {
                    i5 = 6;
                    i6 = 0;
                    s = s2;
                    i4 = 3;
                } else {
                    i4 = 4;
                    i5 = 7;
                    i6 = 0;
                    s = s2;
                }
            } else {
                i5 = i7;
                i6 = i11;
                i4 = i9;
            }
            i8++;
            s2 = s3;
            i7 = i5;
            i9 = i4;
            i10 = i6;
        }
    }

    /* renamed from: d */
    private int m9978d(int i) {
        short s;
        boolean z;
        short s2;
        int i2;
        int i3 = 1;
        short s3 = 0;
        while (true) {
            if (this.f6604B < 262) {
                m9987j();
                if (this.f6604B < 262 && i == 0) {
                    return 0;
                }
                if (this.f6604B == 0) {
                    m9965a(i == 4);
                    if (this.f6629a.f6767g == 0) {
                        return i == 4 ? 2 : 0;
                    }
                    if (i == 4) {
                        i3 = 3;
                    }
                    return i3;
                }
            }
            if (this.f6604B >= 3) {
                this.f6651q = ((this.f6651q << this.f6655u) ^ (this.f6647m[(this.f6660z + 3) - 1] & 255)) & this.f6654t;
                s = (short) (this.f6650p[this.f6651q] & 65535);
                this.f6649o[this.f6660z & this.f6646l] = this.f6650p[this.f6651q];
                this.f6650p[this.f6651q] = (short) this.f6660z;
            } else {
                s = s3;
            }
            if (!(((long) s) == 0 || ((this.f6660z - s) & 65535) > this.f6644j - 262 || this.f6609G == 2)) {
                this.f6657w = m9982f(s);
            }
            if (this.f6657w >= 3) {
                boolean b = m9973b(this.f6660z - this.f6603A, this.f6657w - 3);
                this.f6604B -= this.f6657w;
                if (this.f6657w > this.f6607E || this.f6604B < 3) {
                    this.f6660z += this.f6657w;
                    this.f6657w = 0;
                    this.f6651q = this.f6647m[this.f6660z] & 255;
                    this.f6651q = ((this.f6651q << this.f6655u) ^ (this.f6647m[this.f6660z + 1] & 255)) & this.f6654t;
                    s3 = s;
                    z = b;
                } else {
                    this.f6657w--;
                    do {
                        this.f6660z++;
                        this.f6651q = ((this.f6651q << this.f6655u) ^ (this.f6647m[(this.f6660z + 3) - 1] & 255)) & this.f6654t;
                        s2 = (short) (this.f6650p[this.f6651q] & 65535);
                        this.f6649o[this.f6660z & this.f6646l] = this.f6650p[this.f6651q];
                        this.f6650p[this.f6651q] = (short) this.f6660z;
                        i2 = this.f6657w - 1;
                        this.f6657w = i2;
                    } while (i2 != 0);
                    this.f6660z++;
                    s3 = s2;
                    z = b;
                }
            } else {
                boolean b2 = m9973b(0, this.f6647m[this.f6660z] & 255);
                this.f6604B--;
                this.f6660z++;
                s3 = s;
                z = b2;
            }
            if (z) {
                m9965a(false);
                if (this.f6629a.f6767g == 0) {
                    return 0;
                }
            }
        }
    }

    /* renamed from: d */
    private void m9979d() {
        for (int i = 0; i < 286; i++) {
            this.f6612J[i * 2] = 0;
        }
        for (int i2 = 0; i2 < 30; i2++) {
            this.f6613K[i2 * 2] = 0;
        }
        for (int i3 = 0; i3 < 19; i3++) {
            this.f6614L[i3 * 2] = 0;
        }
        this.f6612J[512] = 1;
        this.f6628Z = 0;
        this.f6627Y = 0;
        this.f6630aa = 0;
        this.f6625W = 0;
    }

    /* renamed from: e */
    private int m9980e() {
        m9972b(this.f6612J, this.f6615M.f6759j);
        m9972b(this.f6613K, this.f6616N.f6759j);
        this.f6617O.mo7311a(this);
        int i = 18;
        while (i >= 3 && this.f6614L[(C2513j.f6753d[i] * 2) + 1] == 0) {
            i--;
        }
        this.f6627Y += ((i + 1) * 3) + 5 + 5 + 4;
        return i;
    }

    /* renamed from: e */
    private int m9981e(int i) {
        int i2;
        int i3 = 1;
        short s = 0;
        while (true) {
            if (this.f6604B < 262) {
                m9987j();
                if (this.f6604B < 262 && i == 0) {
                    return 0;
                }
                if (this.f6604B == 0) {
                    if (this.f6659y != 0) {
                        m9973b(0, this.f6647m[this.f6660z - 1] & 255);
                        this.f6659y = 0;
                    }
                    m9965a(i == 4);
                    if (this.f6629a.f6767g == 0) {
                        return i == 4 ? 2 : 0;
                    }
                    if (i == 4) {
                        i3 = 3;
                    }
                    return i3;
                }
            }
            if (this.f6604B >= 3) {
                this.f6651q = ((this.f6651q << this.f6655u) ^ (this.f6647m[(this.f6660z + 3) - 1] & 255)) & this.f6654t;
                s = (short) (this.f6650p[this.f6651q] & 65535);
                this.f6649o[this.f6660z & this.f6646l] = this.f6650p[this.f6651q];
                this.f6650p[this.f6651q] = (short) this.f6660z;
            }
            this.f6605C = this.f6657w;
            this.f6658x = this.f6603A;
            this.f6657w = 2;
            if (s != 0 && this.f6605C < this.f6607E && ((this.f6660z - s) & 65535) <= this.f6644j - 262) {
                if (this.f6609G != 2) {
                    this.f6657w = m9982f(s);
                }
                if (this.f6657w <= 5 && (this.f6609G == 1 || (this.f6657w == 3 && this.f6660z - this.f6603A > 4096))) {
                    this.f6657w = 2;
                }
            }
            if (this.f6605C >= 3 && this.f6657w <= this.f6605C) {
                int i4 = (this.f6660z + this.f6604B) - 3;
                boolean b = m9973b((this.f6660z - 1) - this.f6658x, this.f6605C - 3);
                this.f6604B -= this.f6605C - 1;
                this.f6605C -= 2;
                do {
                    int i5 = this.f6660z + 1;
                    this.f6660z = i5;
                    if (i5 <= i4) {
                        this.f6651q = ((this.f6651q << this.f6655u) ^ (this.f6647m[(this.f6660z + 3) - 1] & 255)) & this.f6654t;
                        s = (short) (this.f6650p[this.f6651q] & 65535);
                        this.f6649o[this.f6660z & this.f6646l] = this.f6650p[this.f6651q];
                        this.f6650p[this.f6651q] = (short) this.f6660z;
                    }
                    i2 = this.f6605C - 1;
                    this.f6605C = i2;
                } while (i2 != 0);
                this.f6659y = 0;
                this.f6657w = 2;
                this.f6660z++;
                if (b) {
                    m9965a(false);
                    if (this.f6629a.f6767g == 0) {
                        return 0;
                    }
                } else {
                    continue;
                }
            } else if (this.f6659y != 0) {
                if (m9973b(0, this.f6647m[this.f6660z - 1] & 255)) {
                    m9965a(false);
                }
                this.f6660z++;
                this.f6604B--;
                if (this.f6629a.f6767g == 0) {
                    return 0;
                }
            } else {
                this.f6659y = 1;
                this.f6660z++;
                this.f6604B--;
            }
        }
    }

    /* renamed from: f */
    private int m9982f(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        byte b;
        byte b2;
        int i6 = this.f6606D;
        int i7 = this.f6660z;
        int i8 = this.f6605C;
        int i9 = this.f6660z > this.f6644j + -262 ? this.f6660z - (this.f6644j - 262) : 0;
        int i10 = this.f6611I;
        int i11 = this.f6646l;
        int i12 = this.f6660z + 258;
        byte b3 = this.f6647m[(i7 + i8) - 1];
        byte b4 = this.f6647m[i7 + i8];
        if (this.f6605C >= this.f6610H) {
            i6 >>= 2;
        }
        if (i10 > this.f6604B) {
            b = b3;
            i5 = this.f6604B;
            i4 = i8;
            i3 = i7;
            i2 = i6;
            b2 = b4;
        } else {
            b = b3;
            i5 = i10;
            i4 = i8;
            i3 = i7;
            i2 = i6;
            b2 = b4;
        }
        while (true) {
            if (this.f6647m[i + i4] == b2 && this.f6647m[(i + i4) - 1] == b && this.f6647m[i] == this.f6647m[i3]) {
                int i13 = i + 1;
                if (this.f6647m[i13] == this.f6647m[i3 + 1]) {
                    int i14 = i3 + 2;
                    int i15 = i13 + 1;
                    do {
                        i14++;
                        int i16 = i15 + 1;
                        if (this.f6647m[i14] != this.f6647m[i16]) {
                            break;
                        }
                        i14++;
                        int i17 = i16 + 1;
                        if (this.f6647m[i14] != this.f6647m[i17]) {
                            break;
                        }
                        i14++;
                        int i18 = i17 + 1;
                        if (this.f6647m[i14] != this.f6647m[i18]) {
                            break;
                        }
                        i14++;
                        int i19 = i18 + 1;
                        if (this.f6647m[i14] != this.f6647m[i19]) {
                            break;
                        }
                        i14++;
                        int i20 = i19 + 1;
                        if (this.f6647m[i14] != this.f6647m[i20]) {
                            break;
                        }
                        i14++;
                        int i21 = i20 + 1;
                        if (this.f6647m[i14] != this.f6647m[i21]) {
                            break;
                        }
                        i14++;
                        int i22 = i21 + 1;
                        if (this.f6647m[i14] != this.f6647m[i22]) {
                            break;
                        }
                        i14++;
                        i15 = i22 + 1;
                        if (this.f6647m[i14] != this.f6647m[i15]) {
                            break;
                        }
                    } while (i14 < i12);
                    int i23 = 258 - (i12 - i14);
                    int i24 = i12 - 258;
                    if (i23 > i4) {
                        this.f6603A = i;
                        if (i23 >= i5) {
                            i4 = i23;
                            break;
                        }
                        b = this.f6647m[(i24 + i23) - 1];
                        b2 = this.f6647m[i24 + i23];
                        i4 = i23;
                        i3 = i24;
                    } else {
                        i3 = i24;
                    }
                }
            }
            i = this.f6649o[i & i11] & 65535;
            if (i > i9) {
                i2--;
                if (i2 == 0) {
                    break;
                }
            } else {
                break;
            }
        }
        return i4 <= this.f6604B ? i4 : this.f6604B;
    }

    /* renamed from: f */
    private void m9983f() {
        m9961a(2, 3);
        m9964a(256, C2512i.f6740a);
        m9985h();
        if (((this.f6631ab + 1) + 10) - this.f6633ad < 9) {
            m9961a(2, 3);
            m9964a(256, C2512i.f6740a);
            m9985h();
        }
        this.f6631ab = 7;
    }

    /* renamed from: g */
    private void m9984g() {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i3 < 7) {
            i2 += this.f6612J[i3 * 2];
            i3++;
        }
        int i4 = 0;
        while (i3 < 128) {
            i4 += this.f6612J[i3 * 2];
            i3++;
        }
        while (i3 < 256) {
            i2 += this.f6612J[i3 * 2];
            i3++;
        }
        if (i2 <= (i4 >>> 2)) {
            i = 1;
        }
        this.f6642h = (byte) i;
    }

    /* renamed from: h */
    private void m9985h() {
        if (this.f6633ad == 16) {
            m9960a(this.f6632ac);
            this.f6632ac = 0;
            this.f6633ad = 0;
        } else if (this.f6633ad >= 8) {
            m9959a((byte) this.f6632ac);
            this.f6632ac = (short) (this.f6632ac >>> 8);
            this.f6633ad -= 8;
        }
    }

    /* renamed from: i */
    private void m9986i() {
        if (this.f6633ad > 8) {
            m9960a(this.f6632ac);
        } else if (this.f6633ad > 0) {
            m9959a((byte) this.f6632ac);
        }
        this.f6632ac = 0;
        this.f6633ad = 0;
    }

    /* renamed from: j */
    private void m9987j() {
        int i;
        do {
            int i2 = (this.f6648n - this.f6604B) - this.f6660z;
            if (i2 == 0 && this.f6660z == 0 && this.f6604B == 0) {
                i = this.f6644j;
            } else if (i2 == -1) {
                i = i2 - 1;
            } else if (this.f6660z >= (this.f6644j + this.f6644j) - 262) {
                System.arraycopy(this.f6647m, this.f6644j, this.f6647m, 0, this.f6644j);
                this.f6603A -= this.f6644j;
                this.f6660z -= this.f6644j;
                this.f6656v -= this.f6644j;
                int i3 = this.f6652r;
                int i4 = i3;
                do {
                    i3--;
                    short s = (short) (this.f6650p[i3] & 65535);
                    this.f6650p[i3] = s >= this.f6644j ? (short) (s - this.f6644j) : 0;
                    i4--;
                } while (i4 != 0);
                int i5 = this.f6644j;
                int i6 = i5;
                do {
                    i5--;
                    short s2 = (short) (this.f6649o[i5] & 65535);
                    this.f6649o[i5] = s2 >= this.f6644j ? (short) (s2 - this.f6644j) : 0;
                    i6--;
                } while (i6 != 0);
                i = this.f6644j + i2;
            } else {
                i = i2;
            }
            if (this.f6629a.f6763c != 0) {
                this.f6604B = this.f6629a.mo7318a(this.f6647m, this.f6660z + this.f6604B, i) + this.f6604B;
                if (this.f6604B >= 3) {
                    this.f6651q = this.f6647m[this.f6660z] & 255;
                    this.f6651q = ((this.f6651q << this.f6655u) ^ (this.f6647m[this.f6660z + 1] & 255)) & this.f6654t;
                }
                if (this.f6604B >= 262) {
                    return;
                }
            } else {
                return;
            }
        } while (this.f6629a.f6763c != 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo7295a() {
        if (this.f6636b != 42 && this.f6636b != 113 && this.f6636b != 666) {
            return -2;
        }
        this.f6637c = null;
        this.f6650p = null;
        this.f6649o = null;
        this.f6647m = null;
        return this.f6636b == 113 ? -3 : 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo7296a(C2514k kVar, int i) {
        int e;
        if (i > 4 || i < 0) {
            return -2;
        }
        if (kVar.f6765e == null || ((kVar.f6761a == null && kVar.f6763c != 0) || (this.f6636b == 666 && i != 4))) {
            kVar.f6769i = f6602af[4];
            return -2;
        } else if (kVar.f6767g == 0) {
            kVar.f6769i = f6602af[7];
            return -5;
        } else {
            this.f6629a = kVar;
            int i2 = this.f6643i;
            this.f6643i = i;
            if (this.f6636b == 42) {
                switch (this.f6641g) {
                    case ZLIB:
                        int i3 = (((this.f6645k - 8) << 4) + 8) << 8;
                        int i4 = ((this.f6608F - 1) & 255) >> 1;
                        if (i4 > 3) {
                            i4 = 3;
                        }
                        int i5 = (i4 << 6) | i3;
                        if (this.f6660z != 0) {
                            i5 |= 32;
                        }
                        m9970b(i5 + (31 - (i5 % 31)));
                        if (this.f6660z != 0) {
                            m9970b((int) (kVar.f6772l >>> 16));
                            m9970b((int) (kVar.f6772l & 65535));
                        }
                        kVar.f6772l = C2500a.m9955a(0, null, 0, 0);
                        break;
                    case GZIP:
                        m9959a((byte) 31);
                        m9959a((byte) -117);
                        m9959a((byte) 8);
                        m9959a((byte) 0);
                        m9959a((byte) 0);
                        m9959a((byte) 0);
                        m9959a((byte) 0);
                        m9959a((byte) 0);
                        switch (f6601ae[this.f6608F].f6666e) {
                            case 1:
                                m9959a((byte) 4);
                                break;
                            case 2:
                                m9959a((byte) 2);
                                break;
                            default:
                                m9959a((byte) 0);
                                break;
                        }
                        m9959a((byte) -1);
                        kVar.f6773m = 0;
                        break;
                }
                this.f6636b = 113;
            }
            if (this.f6640f != 0) {
                kVar.mo7321c();
                if (kVar.f6767g == 0) {
                    this.f6643i = -1;
                    return 0;
                }
            } else if (kVar.f6763c == 0 && i <= i2 && i != 4) {
                kVar.f6769i = f6602af[7];
                return -5;
            }
            if (this.f6636b != 666 || kVar.f6763c == 0) {
                int i6 = kVar.f6762b;
                try {
                    if (!(kVar.f6763c == 0 && this.f6604B == 0 && (i == 0 || this.f6636b == 666))) {
                        switch (f6601ae[this.f6608F].f6666e) {
                            case 0:
                                e = m9974c(i);
                                break;
                            case 1:
                                e = m9978d(i);
                                break;
                            case 2:
                                e = m9981e(i);
                                break;
                            default:
                                e = -1;
                                break;
                        }
                        if (e == 2 || e == 3) {
                            this.f6636b = 666;
                        }
                        if (e == 0 || e == 2) {
                            if (kVar.f6767g == 0) {
                                this.f6643i = -1;
                            }
                            return 0;
                        } else if (e == 1) {
                            if (i == 1) {
                                m9983f();
                            } else {
                                m9971b(0, 0, false);
                                if (i == 3) {
                                    for (int i7 = 0; i7 < this.f6652r; i7++) {
                                        this.f6650p[i7] = 0;
                                    }
                                }
                            }
                            kVar.mo7321c();
                            if (kVar.f6767g == 0) {
                                this.f6643i = -1;
                                this.f6635ah += kVar.f6762b - i6;
                                return 0;
                            }
                        }
                    }
                    this.f6635ah += kVar.f6762b - i6;
                    if (i != 4) {
                        return 0;
                    }
                    if (this.f6641g == C2510h.C2511a.NONE || this.f6634ag) {
                        return 1;
                    }
                    switch (this.f6641g) {
                        case ZLIB:
                            m9970b((int) (kVar.f6772l >>> 16));
                            m9970b((int) (kVar.f6772l & 65535));
                            break;
                        case GZIP:
                            m9959a((byte) (kVar.f6773m & 255));
                            m9959a((byte) ((kVar.f6773m >>> 8) & 255));
                            m9959a((byte) ((kVar.f6773m >>> 16) & 255));
                            m9959a((byte) ((kVar.f6773m >>> 24) & 255));
                            m9959a((byte) (this.f6635ah & 255));
                            m9959a((byte) ((this.f6635ah >>> 8) & 255));
                            m9959a((byte) ((this.f6635ah >>> 16) & 255));
                            m9959a((byte) ((this.f6635ah >>> 24) & 255));
                            break;
                    }
                    kVar.mo7321c();
                    this.f6634ag = true;
                    return this.f6640f != 0 ? 0 : 1;
                } finally {
                    this.f6635ah += kVar.f6762b - i6;
                }
            } else {
                kVar.f6769i = f6602af[7];
                return -5;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo7297a(C2514k kVar, int i, int i2, int i3, C2510h.C2511a aVar) {
        return m9958a(kVar, i, 8, i2, i3, 0, aVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo7298a(short[] sArr, int i) {
        int i2 = this.f6619Q[i];
        int i3 = i << 1;
        while (i3 <= this.f6620R) {
            int i4 = (i3 >= this.f6620R || !m9968a(sArr, this.f6619Q[i3 + 1], this.f6619Q[i3], this.f6622T)) ? i3 : i3 + 1;
            if (m9968a(sArr, i2, this.f6619Q[i4], this.f6622T)) {
                break;
            }
            this.f6619Q[i] = this.f6619Q[i4];
            i3 = i4 << 1;
            i = i4;
        }
        this.f6619Q[i] = i2;
    }
}
