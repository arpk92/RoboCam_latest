package org.p035a.p036a.p054f.p055a.p056a;

import org.p035a.p036a.p054f.p055a.p056a.C2510h;

@SuppressWarnings("ALL")
/* renamed from: org.a.a.f.a.a.g */
final class C2508g {

    /* renamed from: o */
    private static final byte[] f6715o = {0, 0, -1, -1};

    /* renamed from: a */
    private int f6716a;

    /* renamed from: b */
    private int f6717b;

    /* renamed from: c */
    private final long[] f6718c = new long[1];

    /* renamed from: d */
    private long f6719d;

    /* renamed from: e */
    private int f6720e;

    /* renamed from: f */
    private C2510h.C2511a f6721f;

    /* renamed from: g */
    private int f6722g;

    /* renamed from: h */
    private C2505d f6723h;

    /* renamed from: i */
    private int f6724i;

    /* renamed from: j */
    private int f6725j;

    /* renamed from: k */
    private int f6726k;

    /* renamed from: l */
    private int f6727l;

    /* renamed from: m */
    private int f6728m;

    /* renamed from: n */
    private int f6729n;

    C2508g() {
    }

    /* renamed from: a */
    static int m10005a(C2514k kVar, byte[] bArr, int i) {
        int i2;
        if (kVar == null || kVar.f6771k == null || kVar.f6771k.f6716a != 6) {
            return -2;
        }
        if (C2500a.m9955a(1, bArr, 0, i) != kVar.f6772l) {
            return -3;
        }
        kVar.f6772l = C2500a.m9955a(0, null, 0, 0);
        if (i >= (1 << kVar.f6771k.f6722g)) {
            int i3 = (1 << kVar.f6771k.f6722g) - 1;
            int i4 = i - i3;
            i = i3;
            i2 = i4;
        } else {
            i2 = 0;
        }
        kVar.f6771k.f6723h.mo7302a(bArr, i2, i);
        kVar.f6771k.f6716a = 7;
        return 0;
    }

    /* renamed from: b */
    private int m10006b(C2514k kVar) {
        if (kVar == null || kVar.f6771k == null) {
            return -2;
        }
        kVar.f6768h = 0;
        kVar.f6764d = 0;
        kVar.f6769i = null;
        switch (this.f6721f) {
            case NONE:
                kVar.f6771k.f6716a = 7;
                break;
            case ZLIB:
            case ZLIB_OR_NONE:
                kVar.f6771k.f6716a = 0;
                break;
            case GZIP:
                kVar.f6771k.f6716a = 14;
                break;
        }
        kVar.f6771k.f6723h.mo7301a(kVar, (long[]) null);
        this.f6727l = 0;
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo7308a(C2514k kVar) {
        if (this.f6723h != null) {
            this.f6723h.mo7300a(kVar);
        }
        this.f6723h = null;
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0379, code lost:
        return 1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x05f8  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x0633  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x0644  */
    /* renamed from: a */
    public int mo7309a(C2514k kVar, int i) {
        if (kVar == null || kVar.f6771k == null || kVar.f6761a == null) {
            return -2;
        }
        int i2 = i == 4 ? -5 : 0;
        int i3 = -5;
        while (true) {
            switch (kVar.f6771k.f6716a) {
                case 0:
                    if (kVar.f6763c == 0) {
                        return i3;
                    }
                    if (kVar.f6771k.f6721f == C2510h.C2511a.ZLIB_OR_NONE) {
                        if ((kVar.f6761a[kVar.f6762b] & 15) != 8 || (kVar.f6761a[kVar.f6762b] >> 4) + 8 > kVar.f6771k.f6722g) {
                            kVar.f6771k.f6721f = C2510h.C2511a.NONE;
                            kVar.f6771k.f6716a = 7;
                            break;
                        } else {
                            kVar.f6771k.f6721f = C2510h.C2511a.ZLIB;
                        }
                    }
                    kVar.f6763c--;
                    kVar.f6764d++;
                    C2508g gVar = kVar.f6771k;
                    byte[] bArr = kVar.f6761a;
                    int i4 = kVar.f6762b;
                    kVar.f6762b = i4 + 1;
                    byte b = bArr[i4];
                    gVar.f6717b = b;
                    if ((b & 15) != 8) {
                        kVar.f6771k.f6716a = 13;
                        kVar.f6769i = "unknown compression method";
                        kVar.f6771k.f6720e = 5;
                        i3 = i2;
                        break;
                    } else if ((kVar.f6771k.f6717b >> 4) + 8 > kVar.f6771k.f6722g) {
                        kVar.f6771k.f6716a = 13;
                        kVar.f6769i = "invalid window size";
                        kVar.f6771k.f6720e = 5;
                        i3 = i2;
                        break;
                    } else {
                        kVar.f6771k.f6716a = 1;
                        i3 = i2;
                    }
                    break;
                case 1:
                    if (kVar.f6763c != 0) {
                        kVar.f6763c--;
                        kVar.f6764d++;
                        byte[] bArr2 = kVar.f6761a;
                        int i5 = kVar.f6762b;
                        kVar.f6762b = i5 + 1;
                        byte b2 = (byte) (bArr2[i5] & 255);
                        if (((kVar.f6771k.f6717b << 8) + b2) % 31 == 0) {
                            if ((b2 & 32) != 0) {
                                kVar.f6771k.f6716a = 2;
                                i3 = i2;
                                break;
                            } else {
                                kVar.f6771k.f6716a = 7;
                                i3 = i2;
                                break;
                            }
                        } else {
                            kVar.f6771k.f6716a = 13;
                            kVar.f6769i = "incorrect header check";
                            kVar.f6771k.f6720e = 5;
                            i3 = i2;
                            break;
                        }
                    } else {
                        return i3;
                    }
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    i2 = i3;
                    break;
                case 6:
                    kVar.f6771k.f6716a = 13;
                    kVar.f6769i = "need dictionary";
                    kVar.f6771k.f6720e = 0;
                    return -2;
                case 7:
                    int i6 = kVar.f6766f;
                    try {
                        i3 = kVar.f6771k.f6723h.mo7299a(kVar, i3);
                        if (i3 != -3) {
                            if (i3 == 0) {
                                i3 = i2;
                            }
                            if (i3 == 1) {
                                kVar.f6771k.f6723h.mo7301a(kVar, kVar.f6771k.f6718c);
                                int i7 = kVar.f6766f - i6;
                                this.f6727l += i7;
                                kVar.f6773m = C2501b.m9956a(kVar.f6773m, kVar.f6765e, i6, i7);
                                if (kVar.f6771k.f6721f != C2510h.C2511a.NONE) {
                                    if (kVar.f6771k.f6721f != C2510h.C2511a.ZLIB) {
                                        if (kVar.f6771k.f6721f != C2510h.C2511a.GZIP) {
                                            kVar.f6771k.f6716a = 13;
                                            kVar.f6769i = "unexpected state";
                                            kVar.f6771k.f6720e = 0;
                                            i3 = i2;
                                            break;
                                        } else {
                                            this.f6728m = 0;
                                            this.f6729n = 0;
                                            this.f6725j = 4;
                                            kVar.f6771k.f6716a = 24;
                                            i3 = i2;
                                            break;
                                        }
                                    } else {
                                        kVar.f6771k.f6716a = 8;
                                        i3 = i2;
                                    }
                                } else {
                                    kVar.f6771k.f6716a = 12;
                                    i3 = i2;
                                    break;
                                }
                            } else {
                                int i8 = kVar.f6766f - i6;
                                this.f6727l += i8;
                                kVar.f6773m = C2501b.m9956a(kVar.f6773m, kVar.f6765e, i6, i8);
                                return i3;
                            }
                        } else {
                            kVar.f6771k.f6716a = 13;
                            kVar.f6771k.f6720e = 0;
                            break;
                        }
                    } finally {
                        int i9 = kVar.f6766f - i6;
                        this.f6727l += i9;
                        kVar.f6773m = C2501b.m9956a(kVar.f6773m, kVar.f6765e, i6, i9);
                    }
                case 8:
                    if (kVar.f6763c == 0) {
                        return i3;
                    }
                    kVar.f6763c--;
                    kVar.f6764d++;
                    C2508g gVar2 = kVar.f6771k;
                    byte[] bArr3 = kVar.f6761a;
                    int i10 = kVar.f6762b;
                    kVar.f6762b = i10 + 1;
                    gVar2.f6719d = ((long) ((bArr3[i10] & 255) << 24)) & 4278190080L;
                    kVar.f6771k.f6716a = 9;
                    i3 = i2;
                case 9:
                    if (kVar.f6763c == 0) {
                        return i3;
                    }
                    kVar.f6763c--;
                    kVar.f6764d++;
                    C2508g gVar3 = kVar.f6771k;
                    long j = gVar3.f6719d;
                    byte[] bArr4 = kVar.f6761a;
                    int i11 = kVar.f6762b;
                    kVar.f6762b = i11 + 1;
                    gVar3.f6719d = j + (((long) ((bArr4[i11] & 255) << 16)) & 16711680);
                    kVar.f6771k.f6716a = 10;
                    i3 = i2;
                case 10:
                    if (kVar.f6763c == 0) {
                        return i3;
                    }
                    kVar.f6763c--;
                    kVar.f6764d++;
                    C2508g gVar4 = kVar.f6771k;
                    long j2 = gVar4.f6719d;
                    byte[] bArr5 = kVar.f6761a;
                    int i12 = kVar.f6762b;
                    kVar.f6762b = i12 + 1;
                    gVar4.f6719d = j2 + (((long) ((bArr5[i12] & 255) << 8)) & 65280);
                    kVar.f6771k.f6716a = 11;
                    i3 = i2;
                case 11:
                    if (kVar.f6763c != 0) {
                        kVar.f6763c--;
                        kVar.f6764d++;
                        C2508g gVar5 = kVar.f6771k;
                        long j3 = gVar5.f6719d;
                        byte[] bArr6 = kVar.f6761a;
                        int i13 = kVar.f6762b;
                        kVar.f6762b = i13 + 1;
                        gVar5.f6719d = j3 + (((long) bArr6[i13]) & 255);
                        if (((int) kVar.f6771k.f6718c[0]) == ((int) kVar.f6771k.f6719d)) {
                            kVar.f6771k.f6716a = 12;
                            break;
                        } else {
                            kVar.f6771k.f6716a = 13;
                            kVar.f6769i = "incorrect data check";
                            kVar.f6771k.f6720e = 5;
                            i3 = i2;
                            break;
                        }
                    } else {
                        return i3;
                    }
                case 12:
                    break;
                case 13:
                    return -3;
                case 14:
                    if (kVar.f6763c == 0) {
                        return i3;
                    }
                    kVar.f6763c--;
                    kVar.f6764d++;
                    byte[] bArr7 = kVar.f6761a;
                    int i14 = kVar.f6762b;
                    kVar.f6762b = i14 + 1;
                    if ((bArr7[i14] & 255) != 31) {
                        kVar.f6771k.f6716a = 13;
                        kVar.f6769i = "not a gzip stream";
                        kVar.f6771k.f6720e = 5;
                        i3 = i2;
                        break;
                    } else {
                        kVar.f6771k.f6716a = 15;
                        i3 = i2;
                    }
                case 15:
                    if (kVar.f6763c == 0) {
                        return i3;
                    }
                    kVar.f6763c--;
                    kVar.f6764d++;
                    byte[] bArr8 = kVar.f6761a;
                    int i15 = kVar.f6762b;
                    kVar.f6762b = i15 + 1;
                    if ((bArr8[i15] & 255) != 139) {
                        kVar.f6771k.f6716a = 13;
                        kVar.f6769i = "not a gzip stream";
                        kVar.f6771k.f6720e = 5;
                        i3 = i2;
                        break;
                    } else {
                        kVar.f6771k.f6716a = 16;
                        i3 = i2;
                    }
                case 16:
                    if (kVar.f6763c == 0) {
                        return i3;
                    }
                    kVar.f6763c--;
                    kVar.f6764d++;
                    byte[] bArr9 = kVar.f6761a;
                    int i16 = kVar.f6762b;
                    kVar.f6762b = i16 + 1;
                    if ((bArr9[i16] & 255) != 8) {
                        kVar.f6771k.f6716a = 13;
                        kVar.f6769i = "unknown compression method";
                        kVar.f6771k.f6720e = 5;
                        i3 = i2;
                        break;
                    } else {
                        kVar.f6771k.f6716a = 17;
                        i3 = i2;
                    }
                case 17:
                    if (kVar.f6763c == 0) {
                        return i3;
                    }
                    kVar.f6763c--;
                    kVar.f6764d++;
                    byte[] bArr10 = kVar.f6761a;
                    int i17 = kVar.f6762b;
                    kVar.f6762b = i17 + 1;
                    this.f6724i = bArr10[i17] & 255;
                    if ((this.f6724i & 226) != 0) {
                        kVar.f6771k.f6716a = 13;
                        kVar.f6769i = "unsupported flag";
                        kVar.f6771k.f6720e = 5;
                        i3 = i2;
                        break;
                    } else {
                        this.f6725j = 6;
                        kVar.f6771k.f6716a = 18;
                        i3 = i2;
                    }
                case 18:
                    while (this.f6725j > 0) {
                        if (kVar.f6763c == 0) {
                            return i3;
                        }
                        kVar.f6763c--;
                        kVar.f6764d++;
                        kVar.f6762b++;
                        this.f6725j--;
                        i3 = i2;
                    }
                    kVar.f6771k.f6716a = 19;
                    this.f6726k = 0;
                    this.f6725j = 2;
                case 19:
                    if ((this.f6724i & 4) == 0) {
                        kVar.f6771k.f6716a = 21;
                        break;
                    } else {
                        while (this.f6725j > 0) {
                            if (kVar.f6763c == 0) {
                                return i3;
                            }
                            kVar.f6763c--;
                            kVar.f6764d++;
                            int i18 = this.f6726k;
                            byte[] bArr11 = kVar.f6761a;
                            int i19 = kVar.f6762b;
                            kVar.f6762b = i19 + 1;
                            this.f6726k = i18 | ((bArr11[i19] & 255) << ((1 - this.f6725j) * 8));
                            this.f6725j--;
                            i3 = i2;
                        }
                        this.f6725j = this.f6726k;
                        kVar.f6771k.f6716a = 20;
                    }
                case 20:
                    while (this.f6725j > 0) {
                        if (kVar.f6763c == 0) {
                            return i3;
                        }
                        kVar.f6763c--;
                        kVar.f6764d++;
                        kVar.f6762b++;
                        this.f6725j--;
                        i3 = i2;
                    }
                    kVar.f6771k.f6716a = 21;
                case 21:
                    if ((this.f6724i & 8) != 0) {
                        while (kVar.f6763c != 0) {
                            kVar.f6763c--;
                            kVar.f6764d++;
                            byte[] bArr12 = kVar.f6761a;
                            int i20 = kVar.f6762b;
                            kVar.f6762b = i20 + 1;
                            if (bArr12[i20] == 0) {
                                i3 = i2;
                            } else {
                                i3 = i2;
                            }
                        }
                        return i3;
                    }
                    kVar.f6771k.f6716a = 22;
                case 22:
                    if ((this.f6724i & 16) != 0) {
                        while (kVar.f6763c != 0) {
                            kVar.f6763c--;
                            kVar.f6764d++;
                            byte[] bArr13 = kVar.f6761a;
                            int i21 = kVar.f6762b;
                            kVar.f6762b = i21 + 1;
                            if (bArr13[i21] == 0) {
                                i3 = i2;
                            } else {
                                i3 = i2;
                            }
                        }
                        return i3;
                    }
                    this.f6725j = 2;
                    kVar.f6771k.f6716a = 23;
                case 23:
                    if ((this.f6724i & 2) != 0) {
                        while (this.f6725j > 0) {
                            if (kVar.f6763c == 0) {
                                return i3;
                            }
                            kVar.f6763c--;
                            kVar.f6764d++;
                            kVar.f6762b++;
                            this.f6725j--;
                            i3 = i2;
                        }
                    }
                    kVar.f6771k.f6716a = 7;
                    break;
                case 24:
                    while (this.f6725j > 0) {
                        if (kVar.f6763c == 0) {
                            return i3;
                        }
                        kVar.f6763c--;
                        kVar.f6764d++;
                        this.f6725j--;
                        C2508g gVar6 = kVar.f6771k;
                        int i22 = gVar6.f6728m;
                        byte[] bArr14 = kVar.f6761a;
                        int i23 = kVar.f6762b;
                        kVar.f6762b = i23 + 1;
                        gVar6.f6728m = i22 | ((bArr14[i23] & 255) << ((3 - this.f6725j) * 8));
                        i3 = i2;
                    }
                    if (kVar.f6773m == kVar.f6771k.f6728m) {
                        this.f6725j = 4;
                        kVar.f6771k.f6716a = 25;
                        while (this.f6725j > 0) {
                            if (kVar.f6763c == 0) {
                                return i3;
                            }
                            kVar.f6763c--;
                            kVar.f6764d++;
                            this.f6725j--;
                            C2508g gVar7 = kVar.f6771k;
                            int i24 = gVar7.f6729n;
                            byte[] bArr15 = kVar.f6761a;
                            int i25 = kVar.f6762b;
                            kVar.f6762b = i25 + 1;
                            gVar7.f6729n = i24 | ((bArr15[i25] & 255) << ((3 - this.f6725j) * 8));
                            i3 = i2;
                        }
                        if (this.f6727l != kVar.f6771k.f6729n) {
                            kVar.f6771k.f6716a = 12;
                            break;
                        } else {
                            kVar.f6771k.f6716a = 13;
                            kVar.f6769i = "incorrect ISIZE checksum";
                            kVar.f6771k.f6720e = 5;
                            break;
                        }
                    } else {
                        kVar.f6771k.f6716a = 13;
                        kVar.f6769i = "incorrect CRC32 checksum";
                        kVar.f6771k.f6720e = 5;
                        break;
                    }
                case 25:
                    while (this.f6725j > 0) {
                    }
                    if (this.f6727l != kVar.f6771k.f6729n) {
                    }
                    break;
                default:
                    return -2;
            }
            break;
        }
        if (kVar.f6763c == 0) {
            return i3;
        }
        kVar.f6763c--;
        kVar.f6764d++;
        C2508g gVar8 = kVar.f6771k;
        byte[] bArr16 = kVar.f6761a;
        int i26 = kVar.f6762b;
        kVar.f6762b = i26 + 1;
        gVar8.f6719d = ((long) ((bArr16[i26] & 255) << 24)) & 4278190080L;
        kVar.f6771k.f6716a = 3;
        i3 = i2;
        if (kVar.f6763c == 0) {
            return i3;
        }
        kVar.f6763c--;
        kVar.f6764d++;
        C2508g gVar9 = kVar.f6771k;
        long j4 = gVar9.f6719d;
        byte[] bArr17 = kVar.f6761a;
        int i27 = kVar.f6762b;
        kVar.f6762b = i27 + 1;
        gVar9.f6719d = j4 + (((long) ((bArr17[i27] & 255) << 16)) & 16711680);
        kVar.f6771k.f6716a = 4;
        i3 = i2;
        if (kVar.f6763c == 0) {
            return i3;
        }
        kVar.f6763c--;
        kVar.f6764d++;
        C2508g gVar10 = kVar.f6771k;
        long j5 = gVar10.f6719d;
        byte[] bArr18 = kVar.f6761a;
        int i28 = kVar.f6762b;
        kVar.f6762b = i28 + 1;
        gVar10.f6719d = j5 + (((long) ((bArr18[i28] & 255) << 8)) & 65280);
        kVar.f6771k.f6716a = 5;
        if (kVar.f6763c == 0) {
            return i2;
        }
        kVar.f6763c--;
        kVar.f6764d++;
        C2508g gVar11 = kVar.f6771k;
        long j6 = gVar11.f6719d;
        byte[] bArr19 = kVar.f6761a;
        int i29 = kVar.f6762b;
        kVar.f6762b = i29 + 1;
        gVar11.f6719d = j6 + (((long) bArr19[i29]) & 255);
        kVar.f6772l = kVar.f6771k.f6719d;
        kVar.f6771k.f6716a = 6;
        return 2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo7310a(C2514k kVar, int i, C2510h.C2511a aVar) {
        C2508g gVar = null;
        kVar.f6769i = null;
        this.f6723h = null;
        this.f6721f = aVar;
        if (i < 0) {
            throw new IllegalArgumentException("w: " + i);
        } else if (i < 8 || i > 15) {
            mo7308a(kVar);
            return -2;
        } else {
            this.f6722g = i;
            C2508g gVar2 = kVar.f6771k;
            if (kVar.f6771k.f6721f != C2510h.C2511a.NONE) {
                gVar = this;
            }
            gVar2.f6723h = new C2505d(kVar, gVar, 1 << i);
            m10006b(kVar);
            return 0;
        }
    }
}
