package org.p035a.p036a.p054f.p055a.p056a;

@SuppressWarnings("ALL")
/* renamed from: org.a.a.f.a.a.d */
final class C2505d {

    /* renamed from: g */
    private static final int[] f6667g = {0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535};

    /* renamed from: h */
    private static final int[] f6668h = {16, 17, 18, 0, 8, 7, 9, 6, 10, 5, 11, 4, 12, 3, 13, 2, 14, 1, 15};

    /* renamed from: a */
    int f6669a;

    /* renamed from: b */
    int f6670b;

    /* renamed from: c */
    byte[] f6671c;

    /* renamed from: d */
    final int f6672d;

    /* renamed from: e */
    int f6673e;

    /* renamed from: f */
    int f6674f;

    /* renamed from: i */
    private int f6675i;

    /* renamed from: j */
    private int f6676j;

    /* renamed from: k */
    private int f6677k;

    /* renamed from: l */
    private int f6678l;

    /* renamed from: m */
    private int[] f6679m;

    /* renamed from: n */
    private final int[] f6680n = new int[1];

    /* renamed from: o */
    private final int[] f6681o = new int[1];

    /* renamed from: p */
    private final C2506e f6682p = new C2506e();

    /* renamed from: q */
    private int f6683q;

    /* renamed from: r */
    private int[] f6684r = new int[4320];

    /* renamed from: s */
    private final Object f6685s;

    /* renamed from: t */
    private long f6686t;

    /* renamed from: u */
    private final C2507f f6687u = new C2507f();

    C2505d(C2514k kVar, Object obj, int i) {
        this.f6671c = new byte[i];
        this.f6672d = i;
        this.f6685s = obj;
        this.f6675i = 0;
        mo7301a(kVar, (long[]) null);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x0787, code lost:
        r19.f6674f = r5;
        r4 = mo7303b(r20, r21);
        r14 = r19.f6674f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x079b, code lost:
        if (r19.f6673e == r19.f6674f) goto L_0x07cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x079d, code lost:
        r19.f6670b = r9;
        r19.f6669a = r8;
        r20.f6763c = r6;
        r20.f6764d += (long) (r7 - r20.f6762b);
        r20.f6762b = r7;
        r19.f6674f = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x07cb, code lost:
        r19.f6675i = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x07d1, code lost:
        r19.f6670b = r9;
        r19.f6669a = r8;
        r20.f6763c = r6;
        r20.f6764d += (long) (r7 - r20.f6762b);
        r20.f6762b = r7;
        r19.f6674f = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:?, code lost:
        return mo7303b(r20, -3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:?, code lost:
        return mo7303b(r20, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:?, code lost:
        return mo7303b(r20, 1);
     */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0559  */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x0436 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x04d8 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x03c5  */
    /* renamed from: a */
    public int mo7299a(C2514k kVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19 = kVar.f6762b;
        int i20 = kVar.f6763c;
        int i21 = this.f6670b;
        int i22 = this.f6669a;
        int i23 = this.f6674f;
        int i24 = i23 < this.f6673e ? (this.f6673e - i23) - 1 : this.f6672d - i23;
        int i25 = i23;
        int i26 = i20;
        int i27 = i19;
        while (true) {
            switch (this.f6675i) {
                case 0:
                    int i28 = i26;
                    int i29 = i27;
                    int i30 = i22;
                    int i31 = i21;
                    while (i30 < 3) {
                        if (i28 != 0) {
                            i = 0;
                            i28--;
                            i31 |= (kVar.f6761a[i29] & 255) << i30;
                            i30 += 8;
                            i29++;
                        } else {
                            this.f6670b = i31;
                            this.f6669a = i30;
                            kVar.f6763c = i28;
                            kVar.f6764d += (long) (i29 - kVar.f6762b);
                            kVar.f6762b = i29;
                            this.f6674f = i25;
                            return mo7303b(kVar, i);
                        }
                    }
                    int i32 = i31 & 7;
                    this.f6683q = i32 & 1;
                    switch (i32 >>> 1) {
                        case 0:
                            int i33 = i30 - 3;
                            int i34 = i33 & 7;
                            i17 = (i31 >>> 3) >>> i34;
                            i18 = i33 - i34;
                            this.f6675i = 1;
                            break;
                        case 1:
                            int[] iArr = new int[1];
                            int[] iArr2 = new int[1];
                            int[][] iArr3 = new int[1][];
                            int[][] iArr4 = new int[1][];
                            C2507f.m10001a(iArr, iArr2, iArr3, iArr4);
                            this.f6682p.mo7305a(iArr[0], iArr2[0], iArr3[0], 0, iArr4[0], 0);
                            i17 = i31 >>> 3;
                            i18 = i30 - 3;
                            this.f6675i = 6;
                            break;
                        case 2:
                            i17 = i31 >>> 3;
                            i18 = i30 - 3;
                            this.f6675i = 3;
                            break;
                        case 3:
                            this.f6675i = 9;
                            kVar.f6769i = "invalid block type";
                            this.f6670b = i31 >>> 3;
                            this.f6669a = i30 - 3;
                            kVar.f6763c = i28;
                            kVar.f6764d += (long) (i29 - kVar.f6762b);
                            kVar.f6762b = i29;
                            this.f6674f = i25;
                            return mo7303b(kVar, -3);
                        default:
                            i18 = i30;
                            i17 = i31;
                            break;
                    }
                    i27 = i29;
                    i22 = i18;
                    i21 = i17;
                    i26 = i28;
                    break;
                case 1:
                    while (i22 < 32) {
                        if (i26 != 0) {
                            i = 0;
                            i26--;
                            i21 |= (kVar.f6761a[i27] & 255) << i22;
                            i22 += 8;
                            i27++;
                        } else {
                            this.f6670b = i21;
                            this.f6669a = i22;
                            kVar.f6763c = i26;
                            kVar.f6764d += (long) (i27 - kVar.f6762b);
                            kVar.f6762b = i27;
                            this.f6674f = i25;
                            return mo7303b(kVar, i);
                        }
                    }
                    if ((((i21 ^ -1) >>> 16) & 65535) == (65535 & i21)) {
                        this.f6676j = 65535 & i21;
                        this.f6675i = this.f6676j != 0 ? 2 : this.f6683q != 0 ? 7 : 0;
                        i22 = 0;
                        i21 = 0;
                        break;
                    } else {
                        this.f6675i = 9;
                        kVar.f6769i = "invalid stored block lengths";
                        this.f6670b = i21;
                        this.f6669a = i22;
                        kVar.f6763c = i26;
                        kVar.f6764d += (long) (i27 - kVar.f6762b);
                        kVar.f6762b = i27;
                        this.f6674f = i25;
                        return mo7303b(kVar, -3);
                    }
                case 2:
                    if (i26 != 0) {
                        if (i24 == 0) {
                            if (i25 == this.f6672d && this.f6673e != 0) {
                                i25 = 0;
                                i24 = 0 < this.f6673e ? (this.f6673e - 0) - 1 : this.f6672d - 0;
                            }
                            if (i24 == 0) {
                                this.f6674f = i25;
                                int b = mo7303b(kVar, i);
                                i25 = this.f6674f;
                                int i35 = i25 < this.f6673e ? (this.f6673e - i25) - 1 : this.f6672d - i25;
                                if (i25 != this.f6672d || this.f6673e == 0) {
                                    i24 = i35;
                                } else {
                                    i25 = 0;
                                    i24 = 0 < this.f6673e ? (this.f6673e - 0) - 1 : this.f6672d - 0;
                                }
                                if (i24 == 0) {
                                    this.f6670b = i21;
                                    this.f6669a = i22;
                                    kVar.f6763c = i26;
                                    kVar.f6764d += (long) (i27 - kVar.f6762b);
                                    kVar.f6762b = i27;
                                    this.f6674f = i25;
                                    return mo7303b(kVar, b);
                                }
                            }
                        }
                        i = 0;
                        int i36 = this.f6676j;
                        if (i36 > i26) {
                            i36 = i26;
                        }
                        int i37 = i36 > i24 ? i24 : i36;
                        System.arraycopy(kVar.f6761a, i27, this.f6671c, i25, i37);
                        int i38 = i27 + i37;
                        int i39 = i26 - i37;
                        int i40 = i25 + i37;
                        int i41 = i24 - i37;
                        int i42 = this.f6676j - i37;
                        this.f6676j = i42;
                        if (i42 == 0) {
                            this.f6675i = this.f6683q != 0 ? 7 : 0;
                            i24 = i41;
                            i25 = i40;
                            i26 = i39;
                            i27 = i38;
                            break;
                        } else {
                            i24 = i41;
                            i25 = i40;
                            i26 = i39;
                            i27 = i38;
                            break;
                        }
                    } else {
                        this.f6670b = i21;
                        this.f6669a = i22;
                        kVar.f6763c = i26;
                        kVar.f6764d += (long) (i27 - kVar.f6762b);
                        kVar.f6762b = i27;
                        this.f6674f = i25;
                        return mo7303b(kVar, i);
                    }
                    //break;
                case 3:
                    while (i22 < 14) {
                        if (i26 != 0) {
                            i = 0;
                            i26--;
                            i21 |= (kVar.f6761a[i27] & 255) << i22;
                            i22 += 8;
                            i27++;
                        } else {
                            this.f6670b = i21;
                            this.f6669a = i22;
                            kVar.f6763c = i26;
                            kVar.f6764d += (long) (i27 - kVar.f6762b);
                            kVar.f6762b = i27;
                            this.f6674f = i25;
                            return mo7303b(kVar, i);
                        }
                    }
                    int i43 = i21 & 16383;
                    this.f6677k = i43;
                    if ((i43 & 31) > 29 || ((i43 >> 5) & 31) > 29) {
                        this.f6675i = 9;
                        kVar.f6769i = "too many length or distance symbols";
                        this.f6670b = i21;
                        this.f6669a = i22;
                        kVar.f6763c = i26;
                        kVar.f6764d += (long) (i27 - kVar.f6762b);
                        kVar.f6762b = i27;
                        this.f6674f = i25;
                        break;
                    } else {
                        int i44 = (i43 & 31) + 258 + ((i43 >> 5) & 31);
                        if (this.f6679m == null || this.f6679m.length < i44) {
                            this.f6679m = new int[i44];
                        } else {
                            for (int i45 = 0; i45 < i44; i45++) {
                                this.f6679m[i45] = 0;
                            }
                        }
                        i21 >>>= 14;
                        i22 -= 14;
                        this.f6678l = 0;
                        this.f6675i = 4;
                        while (true) {
                            int i46 = i27;
                            i12 = i22;
                            i13 = i21;
                            if (this.f6678l >= (this.f6677k >>> 10) + 4) {
                                i11 = i11;
                                while (true) {
                                    i27 = i46;
                                    if (i12 >= 3) {
                                        int[] iArr5 = this.f6679m;
                                        int[] iArr6 = f6668h;
                                        int i47 = this.f6678l;
                                        this.f6678l = i47 + 1;
                                        iArr5[iArr6[i47]] = i13 & 7;
                                        i21 = i13 >>> 3;
                                        i22 = i12 - 3;
                                    } else if (i11 != 0) {
                                        i = 0;
                                        i11--;
                                        i46 = i27 + 1;
                                        i13 |= (kVar.f6761a[i27] & 255) << i12;
                                        i12 += 8;
                                    } else {
                                        this.f6670b = i13;
                                        this.f6669a = i12;
                                        kVar.f6763c = i11;
                                        kVar.f6764d += (long) (i27 - kVar.f6762b);
                                        kVar.f6762b = i27;
                                        this.f6674f = i25;
                                        return mo7303b(kVar, i);
                                    }
                                }
                            } else {
                                while (this.f6678l < 19) {
                                    int[] iArr7 = this.f6679m;
                                    int[] iArr8 = f6668h;
                                    int i48 = this.f6678l;
                                    this.f6678l = i48 + 1;
                                    iArr7[iArr8[i48]] = 0;
                                }
                                this.f6680n[0] = 7;
                                int a = this.f6687u.mo7307a(this.f6679m, this.f6680n, this.f6681o, this.f6684r, kVar);
                                if (a != 0) {
                                    if (a == -3) {
                                        this.f6679m = null;
                                        this.f6675i = 9;
                                    }
                                    this.f6670b = i13;
                                    this.f6669a = i12;
                                    kVar.f6763c = i11;
                                    kVar.f6764d += (long) (i46 - kVar.f6762b);
                                    kVar.f6762b = i46;
                                    this.f6674f = i25;
                                    return mo7303b(kVar, a);
                                }
                                this.f6678l = 0;
                                this.f6675i = 5;
                                i5 = i11;
                                i4 = i46;
                                i3 = i12;
                                i2 = i13;
                            }
                            break;
                        }
                        while (true) {
                            i6 = this.f6677k;
                            if (this.f6678l >= ((i6 >> 5) & 31) + (i6 & 31) + 258) {
                                this.f6681o[0] = -1;
                                int[] iArr9 = new int[1];
                                int[] iArr10 = new int[1];
                                int[] iArr11 = {9};
                                int[] iArr12 = {6};
                                int i49 = this.f6677k;
                                int a2 = this.f6687u.mo7306a((i49 & 31) + 257, ((i49 >> 5) & 31) + 1, this.f6679m, iArr11, iArr12, iArr9, iArr10, this.f6684r, kVar);
                                if (a2 == 0) {
                                    this.f6682p.mo7305a(iArr11[0], iArr12[0], this.f6684r, iArr9[0], this.f6684r, iArr10[0]);
                                    this.f6675i = 6;
                                    break;
                                } else {
                                    if (a2 == -3) {
                                        this.f6679m = null;
                                        this.f6675i = 9;
                                    }
                                    this.f6670b = i2;
                                    this.f6669a = i3;
                                    kVar.f6763c = i5;
                                    kVar.f6764d += (long) (i4 - kVar.f6762b);
                                    kVar.f6762b = i4;
                                    this.f6674f = i25;
                                    return mo7303b(kVar, a2);
                                }
                            } else {
                                int i50 = this.f6680n[0];
                                i7 = i5;
                                i8 = i4;
                                int i51 = i3;
                                int i52 = i2;
                                while (i51 < i50) {
                                    if (i7 != 0) {
                                        i = 0;
                                        i7--;
                                        i52 |= (kVar.f6761a[i8] & 255) << i51;
                                        i51 += 8;
                                        i8++;
                                    } else {
                                        this.f6670b = i52;
                                        this.f6669a = i51;
                                        kVar.f6763c = i7;
                                        kVar.f6764d += (long) (i8 - kVar.f6762b);
                                        kVar.f6762b = i8;
                                        this.f6674f = i25;
                                        return mo7303b(kVar, i);
                                    }
                                }
                                if (this.f6681o[0] == -1) {
                                }
                                int i53 = this.f6684r[(((f6667g[i50] & i52) + this.f6681o[0]) * 3) + 1];
                                int i54 = this.f6684r[((this.f6681o[0] + (f6667g[i53] & i52)) * 3) + 2];
                                if (i54 < 16) {
                                    i9 = i52 >>> i53;
                                    i10 = i51 - i53;
                                    int[] iArr13 = this.f6679m;
                                    int i55 = this.f6678l;
                                    this.f6678l = i55 + 1;
                                    iArr13[i55] = i54;
                                } else {
                                    int i56 = i54 == 18 ? 7 : i54 - 14;
                                    int i57 = i54 == 18 ? 11 : 3;
                                    int i58 = i52;
                                    int i59 = i51;
                                    while (i59 < i53 + i56) {
                                        if (i7 != 0) {
                                            i = 0;
                                            i7--;
                                            i58 |= (kVar.f6761a[i8] & 255) << i59;
                                            i59 += 8;
                                            i8++;
                                        } else {
                                            this.f6670b = i58;
                                            this.f6669a = i59;
                                            kVar.f6763c = i7;
                                            kVar.f6764d += (long) (i8 - kVar.f6762b);
                                            kVar.f6762b = i8;
                                            this.f6674f = i25;
                                            return mo7303b(kVar, i);
                                        }
                                    }
                                    int i60 = i58 >>> i53;
                                    int i61 = (f6667g[i56] & i60) + i57;
                                    i9 = i60 >>> i56;
                                    i10 = (i59 - i53) - i56;
                                    int i62 = this.f6678l;
                                    int i63 = this.f6677k;
                                    if (i62 + i61 > ((i63 >> 5) & 31) + (i63 & 31) + 258 || (i54 == 16 && i62 < 1)) {
                                        this.f6679m = null;
                                        this.f6675i = 9;
                                        kVar.f6769i = "invalid bit length repeat";
                                        this.f6670b = i9;
                                        this.f6669a = i10;
                                        kVar.f6763c = i7;
                                        kVar.f6764d += (long) (i8 - kVar.f6762b);
                                        kVar.f6762b = i8;
                                        this.f6674f = i25;
                                        break;
                                    } else {
                                        int i64 = i54 == 16 ? this.f6679m[i62 - 1] : 0;
                                        while (true) {
                                            int i65 = i62 + 1;
                                            this.f6679m[i62] = i64;
                                            i61--;
                                            if (i61 == 0) {
                                                this.f6678l = i65;
                                            } else {
                                                i62 = i65;
                                            }
                                        }
                                    }
                                }
                                i5 = i7;
                                i4 = i8;
                                i3 = i10;
                                i2 = i9;
                            }
                        }
                    }
                    break;
                case 4:
                    while (true) {
                        int i462 = i27;
                        i12 = i22;
                        i13 = i21;
                        if (this.f6678l >= (this.f6677k >>> 10) + 4) {
                        }
                        int[] iArr52 = this.f6679m;
                        int[] iArr62 = f6668h;
                        int i472 = this.f6678l;
                        this.f6678l = i472 + 1;
                        iArr52[iArr62[i472]] = i13 & 7;
                        i21 = i13 >>> 3;
                        i22 = i12 - 3;
                        break;
                    }
                    while (true) {
                        i6 = this.f6677k;
                        if (this.f6678l >= ((i6 >> 5) & 31) + (i6 & 31) + 258) {
                        }
                        i5 = i7;
                        i4 = i8;
                        i3 = i10;
                        i2 = i9;
                    }
                  //  break;
                case 5:
                    i5 = i26;
                    i4 = i27;
                    i3 = i22;
                    i2 = i21;
                    while (true) {
                        i6 = this.f6677k;
                        if (this.f6678l >= ((i6 >> 5) & 31) + (i6 & 31) + 258) {
                        }
                        i5 = i7;
                        i4 = i8;
                        i3 = i10;
                        i2 = i9;
                    }
                 //   break;
                case 6:
                    i5 = i26;
                    i4 = i27;
                    i3 = i22;
                    i2 = i21;
                    this.f6670b = i2;
                    this.f6669a = i3;
                    kVar.f6763c = i5;
                    kVar.f6764d += (long) (i4 - kVar.f6762b);
                    kVar.f6762b = i4;
                    this.f6674f = i25;
                    int a3 = this.f6682p.mo7304a(this, kVar, i);
                    if (a3 == 1) {
                        i = 0;
                        i15 = kVar.f6762b;
                        i14 = kVar.f6763c;
                        i21 = this.f6670b;
                        i22 = this.f6669a;
                        i16 = this.f6674f;
                        int i66 = i16 < this.f6673e ? (this.f6673e - i16) - 1 : this.f6672d - i16;
                        if (this.f6683q != 0) {
                            this.f6675i = 7;
                            break;
                        } else {
                            this.f6675i = 0;
                            i24 = i66;
                            i25 = i16;
                            i26 = i14;
                            i27 = i15;
                            break;
                        }
                    } else {
                        return mo7303b(kVar, a3);
                    }
                case 7:
                    i14 = i26;
                    i15 = i27;
                    i16 = i25;
                    break;
                case 8:
                    i14 = i26;
                    i15 = i27;
                    break;
                case 9:
                    this.f6670b = i21;
                    this.f6669a = i22;
                    kVar.f6763c = i26;
                    kVar.f6764d += (long) (i27 - kVar.f6762b);
                    kVar.f6762b = i27;
                    this.f6674f = i25;
                    return mo7303b(kVar, -3);
                default:
                    this.f6670b = i21;
                    this.f6669a = i22;
                    kVar.f6763c = i26;
                    kVar.f6764d += (long) (i27 - kVar.f6762b);
                    kVar.f6762b = i27;
                    this.f6674f = i25;
                    return mo7303b(kVar, -2);
            }
        }
        /*this.f6679m = null;
        this.f6675i = 9;
        kVar.f6769i = "invalid bit length repeat";
        this.f6670b = i9;
        this.f6669a = i10;
        kVar.f6763c = i7;
        kVar.f6764d += (long) (i8 - kVar.f6762b);
        kVar.f6762b = i8;
        this.f6674f = i25;
        return mo7303b(kVar, -3);*/
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo7300a(C2514k kVar) {
        mo7301a(kVar, (long[]) null);
        this.f6671c = null;
        this.f6684r = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo7301a(C2514k kVar, long[] jArr) {
        if (jArr != null) {
            jArr[0] = this.f6686t;
        }
        this.f6675i = 0;
        this.f6669a = 0;
        this.f6670b = 0;
        this.f6674f = 0;
        this.f6673e = 0;
        if (this.f6685s != null) {
            long a = C2500a.m9955a(0, null, 0, 0);
            this.f6686t = a;
            kVar.f6772l = a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo7302a(byte[] bArr, int i, int i2) {
        System.arraycopy(bArr, i, this.f6671c, 0, i2);
        this.f6674f = i2;
        this.f6673e = i2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo7303b(C2514k kVar, int i) {
        int i2;
        int i3 = kVar.f6766f;
        int i4 = this.f6673e;
        int i5 = (i4 <= this.f6674f ? this.f6674f : this.f6672d) - i4;
        if (i5 > kVar.f6767g) {
            i5 = kVar.f6767g;
        }
        if (i5 != 0 && i == -5) {
            i = 0;
        }
        kVar.f6767g -= i5;
        kVar.f6768h += (long) i5;
        if (this.f6685s != null) {
            long a = C2500a.m9955a(this.f6686t, this.f6671c, i4, i5);
            this.f6686t = a;
            kVar.f6772l = a;
        }
        System.arraycopy(this.f6671c, i4, kVar.f6765e, i3, i5);
        int i6 = i3 + i5;
        int i7 = i5 + i4;
        if (i7 == this.f6672d) {
            if (this.f6674f == this.f6672d) {
                this.f6674f = 0;
            }
            int i8 = this.f6674f - 0;
            if (i8 > kVar.f6767g) {
                i8 = kVar.f6767g;
            }
            if (i8 != 0 && i == -5) {
                i = 0;
            }
            kVar.f6767g -= i8;
            kVar.f6768h += (long) i8;
            if (this.f6685s != null) {
                long a2 = C2500a.m9955a(this.f6686t, this.f6671c, 0, i8);
                this.f6686t = a2;
                kVar.f6772l = a2;
            }
            System.arraycopy(this.f6671c, 0, kVar.f6765e, i6, i8);
            int i9 = i6 + i8;
            i7 = i8 + 0;
            i2 = i9;
        } else {
            i2 = i6;
        }
        kVar.f6766f = i2;
        this.f6673e = i7;
        return i;
    }
}
