package org.p035a.p036a.p054f.p055a.p056a;

@SuppressWarnings("ALL")
/* renamed from: org.a.a.f.a.a.e */
final class C2506e {

    /* renamed from: a */
    private static final int[] f6688a = {0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535};

    /* renamed from: b */
    private int f6689b;

    /* renamed from: c */
    private int f6690c;

    /* renamed from: d */
    private int[] f6691d;

    /* renamed from: e */
    private int f6692e;

    /* renamed from: f */
    private int f6693f;

    /* renamed from: g */
    private int f6694g;

    /* renamed from: h */
    private int f6695h;

    /* renamed from: i */
    private int f6696i;

    /* renamed from: j */
    private byte f6697j;

    /* renamed from: k */
    private byte f6698k;

    /* renamed from: l */
    private int[] f6699l;

    /* renamed from: m */
    private int f6700m;

    /* renamed from: n */
    private int[] f6701n;

    /* renamed from: o */
    private int f6702o;

    C2506e() {
    }

    /* renamed from: a */
    static int m9997a(int i, int i2, int[] iArr, int i3, int[] iArr2, int i4, C2505d dVar, C2514k kVar) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = 0;
        int i10;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = kVar.f6762b;
        int i16 = kVar.f6763c;
        int i17 = dVar.f6670b;
        int i18 = dVar.f6669a;
        int i19 = dVar.f6674f;
        int i20 = i19 < dVar.f6673e ? (dVar.f6673e - i19) - 1 : dVar.f6672d - i19;
        int i21 = f6688a[i];
        int i22 = f6688a[i2];
        int i23 = i20;
        while (true) {
            if (i18 < 20) {
                i16--;
                i17 |= (kVar.f6761a[i15] & 255) << i18;
                i18 += 8;
                i15++;
            } else {
                int i24 = i17 & i21;
                int i25 = (i3 + i24) * 3;
                int i26 = iArr[i25];
                if (i26 == 0) {
                    int i27 = i17 >> iArr[i25 + 1];
                    int i28 = i18 - iArr[i25 + 1];
                    i9 = i19 + 1;
                    dVar.f6671c[i19] = (byte) iArr[i25 + 2];
                    i10 = i23 - 1;
                    i13 = i28;
                    i14 = i27;
                    i11 = i16;
                    i12 = i15;
                } else {
                    while (true) {
                        i17 >>= iArr[i25 + 1];
                        i18 -= iArr[i25 + 1];
                        if ((i26 & 16) != 0) {
                            int i29 = i26 & 15;
                            int i30 = iArr[i25 + 2] + (f6688a[i29] & i17);
                            int i31 = i17 >> i29;
                            int i32 = i18 - i29;
                            int i33 = i15;
                            int i34 = i16;
                            while (i32 < 15) {
                                i34--;
                                i31 |= (kVar.f6761a[i33] & 255) << i32;
                                i32 += 8;
                                i33++;
                            }
                            int i35 = i31 & i22;
                            int i36 = (i4 + i35) * 3;
                            int i37 = iArr2[i36];
                            while (true) {
                                i31 >>= iArr2[i36 + 1];
                                i32 -= iArr2[i36 + 1];
                                if ((i37 & 16) != 0) {
                                    int i38 = i37 & 15;
                                    int i39 = i31;
                                    int i40 = i32;
                                    while (i40 < i38) {
                                        i34--;
                                        i39 |= (kVar.f6761a[i33] & 255) << i40;
                                        i40 += 8;
                                        i33++;
                                    }
                                    int i41 = iArr2[i36 + 2] + (f6688a[i38] & i39);
                                    int i42 = i39 >> i38;
                                    int i43 = i40 - i38;
                                    int i44 = i23 - i30;
                                    if (i19 >= i41) {
                                        int i45 = i19 - i41;
                                        if (i19 - i45 <= 0 || 2 <= i19 - i45) {
                                            System.arraycopy(dVar.f6671c, i45, dVar.f6671c, i19, 2);
                                            i7 = i19 + 2;
                                            i5 = i45 + 2;
                                            i6 = i30 - 2;
                                        } else {
                                            int i46 = i19 + 1;
                                            int i47 = i45 + 1;
                                            dVar.f6671c[i19] = dVar.f6671c[i45];
                                            i7 = i46 + 1;
                                            i5 = i47 + 1;
                                            dVar.f6671c[i46] = dVar.f6671c[i47];
                                            i6 = i30 - 2;
                                        }
                                    } else {
                                        i5 = i19 - i41;
                                        do {
                                            i5 += dVar.f6672d;
                                        } while (i5 < 0);
                                        int i48 = dVar.f6672d - i5;
                                        if (i30 > i48) {
                                            int i49 = i30 - i48;
                                            if (i19 - i5 <= 0 || i48 <= i19 - i5) {
                                                System.arraycopy(dVar.f6671c, i5, dVar.f6671c, i19, i48);
                                                i8 = i19 + i48;
                                                int i50 = i5 + i48;
                                            } else {
                                                int i51 = i19;
                                                int i52 = i48;
                                                while (true) {
                                                    i8 = i51 + 1;
                                                    int i53 = i5 + 1;
                                                    dVar.f6671c[i51] = dVar.f6671c[i5];
                                                    int i54 = i52 - 1;
                                                    if (i54 == 0) {
                                                        break;
                                                    }
                                                    i51 = i8;
                                                    i52 = i54;
                                                    i5 = i53;
                                                }
                                            }
                                            i5 = 0;
                                            i6 = i49;
                                            i7 = i8;
                                        } else {
                                            i6 = i30;
                                            i7 = i19;
                                        }
                                    }
                                    if (i7 - i5 <= 0 || i6 <= i7 - i5) {
                                        System.arraycopy(dVar.f6671c, i5, dVar.f6671c, i7, i6);
                                        i9 = i7 + i6;
                                        int i55 = i5 + i6;
                                        i10 = i44;
                                        i11 = i34;
                                        i12 = i33;
                                        i13 = i43;
                                        i14 = i42;
                                    } else {
                                        int i56 = i7;
                                        int i57 = i6;
                                        while (true) {
                                            i9 = i56 + 1;
                                            int i58 = i5 + 1;
                                            dVar.f6671c[i56] = dVar.f6671c[i5];
                                            int i59 = i57 - 1;
                                            if (i59 == 0) {
                                                break;
                                            }
                                            i57 = i59;
                                            i56 = i9;
                                            i5 = i58;
                                        }
                                        i10 = i44;
                                        i11 = i34;
                                        i12 = i33;
                                        i13 = i43;
                                        i14 = i42;
                                    }
                                } else if (i37 == 0 || !true) {
                                    i35 = iArr2[i36 + 2] + i35 + (f6688a[i37] & i31);
                                    i36 = (i4 + i35) * 3;
                                    i37 = iArr2[i36];
                                } else {
                                    kVar.f6769i = "invalid distance code";
                                    int i60 = kVar.f6763c - i34;
                                    if ((i32 >> 3) < i60) {
                                        i60 = i32 >> 3;
                                    }
                                    int i61 = i33 - i60;
                                    dVar.f6670b = i31;
                                    dVar.f6669a = i32 - (i60 << 3);
                                    kVar.f6763c = i34 + i60;
                                    kVar.f6764d += (long) (i61 - kVar.f6762b);
                                    kVar.f6762b = i61;
                                    dVar.f6674f = i19;
                                    return -3;
                                }
                            }
                        } else if ((i26 & 64) == 0) {
                            i24 = iArr[i25 + 2] + i24 + (f6688a[i26] & i17);
                            i25 = (i3 + i24) * 3;
                            i26 = iArr[i25];
                            if (i26 == 0) {
                                int i62 = i17 >> iArr[i25 + 1];
                                int i63 = i18 - iArr[i25 + 1];
                                i9 = i19 + 1;
                                dVar.f6671c[i19] = (byte) iArr[i25 + 2];
                                i10 = i23 - 1;
                                i13 = i63;
                                i14 = i62;
                                i11 = i16;
                                i12 = i15;
                                break;
                            }
                        } else if ((i26 & 32) != 0) {
                            int i64 = kVar.f6763c - i16;
                            if ((i18 >> 3) < i64) {
                                i64 = i18 >> 3;
                            }
                            int i65 = i15 - i64;
                            dVar.f6670b = i17;
                            dVar.f6669a = i18 - (i64 << 3);
                            kVar.f6763c = i16 + i64;
                            kVar.f6764d += (long) (i65 - kVar.f6762b);
                            kVar.f6762b = i65;
                            dVar.f6674f = i19;
                            return 1;
                        } else {
                            kVar.f6769i = "invalid literal/length code";
                            int i66 = kVar.f6763c - i16;
                            if ((i18 >> 3) < i66) {
                                i66 = i18 >> 3;
                            }
                            int i67 = i15 - i66;
                            dVar.f6670b = i17;
                            dVar.f6669a = i18 - (i66 << 3);
                            kVar.f6763c = i16 + i66;
                            kVar.f6764d += (long) (i67 - kVar.f6762b);
                            kVar.f6762b = i67;
                            dVar.f6674f = i19;
                            return -3;
                        }
                    }
                }
                if (i10 < 258 || i11 < 10) {
                    int i68 = kVar.f6763c - i11;
                } else {
                    i23 = i10;
                    i16 = i11;
                    i15 = i12;
                    i18 = i13;
                    i17 = i14;
                    i19 = i9;
                }
            }
            break;
        }
        int i682 = kVar.f6763c - i11;
        if ((i13 >> 3) < i682) {
            i682 = i13 >> 3;
        }
        int i69 = i12 - i682;
        dVar.f6670b = i14;
        dVar.f6669a = i13 - (i682 << 3);
        kVar.f6763c = i11 + i682;
        kVar.f6764d += (long) (i69 - kVar.f6762b);
        kVar.f6762b = i69;
        dVar.f6674f = i9;
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11, types: [int] */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r3v18, types: [int] */
    /* JADX WARN: Type inference failed for: r3v24, types: [int] */
    /* JADX WARN: Type inference failed for: r3v31, types: [int] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Unknown variable types count: 4 */
    /* renamed from: a */
    public int mo7304a(C2505d dVar, C2514k kVar, int i) {
        int i2 = kVar.f6762b;
        int i3 = kVar.f6763c;
        int i4 = dVar.f6670b;
        int i5 = dVar.f6669a;
        int i6 = dVar.f6674f;
        int i7 = i6 < dVar.f6673e ? (dVar.f6673e - i6) - 1 : dVar.f6672d - i6;
        while (true) {
            switch (this.f6689b) {
                case 0:
                    if (i7 >= 258 && i3 >= 10) {
                        dVar.f6670b = i4;
                        dVar.f6669a = i5;
                        kVar.f6763c = i3;
                        kVar.f6764d += (long) (i2 - kVar.f6762b);
                        kVar.f6762b = i2;
                        dVar.f6674f = i6;
                        i = m9997a(this.f6697j, this.f6698k, this.f6699l, this.f6700m, this.f6701n, this.f6702o, dVar, kVar);
                        i2 = kVar.f6762b;
                        i3 = kVar.f6763c;
                        i4 = dVar.f6670b;
                        i5 = dVar.f6669a;
                        i6 = dVar.f6674f;
                        i7 = i6 < dVar.f6673e ? (dVar.f6673e - i6) - 1 : dVar.f6672d - i6;
                        if (i != 0) {
                            this.f6689b = i == 1 ? 7 : 9;
                            break;
                        }
                    }
                    this.f6693f = this.f6697j;
                    this.f6691d = this.f6699l;
                    this.f6692e = this.f6700m;
                    this.f6689b = 1;
                case 1:
                    int i8 = this.f6693f;
                    byte b = (byte) i5;
                    while (b < i8) {
                        if (i3 != 0) {
                            i = 0;
                            i3--;
                            i4 |= (kVar.f6761a[i2] & 255) << b;
                            b += 8;
                            i2++;
                        } else {
                            dVar.f6670b = i4;
                            dVar.f6669a = b;
                            kVar.f6763c = i3;
                            kVar.f6764d += (long) (i2 - kVar.f6762b);
                            kVar.f6762b = i2;
                            dVar.f6674f = i6;
                            return dVar.mo7303b(kVar, i);
                        }
                    }
                    int i9 = (this.f6692e + (f6688a[i8] & i4)) * 3;
                    i4 >>>= this.f6691d[i9 + 1];
                    i5 = b - this.f6691d[i9 + 1];
                    int i10 = this.f6691d[i9];
                    if (i10 == 0) {
                        this.f6694g = this.f6691d[i9 + 2];
                        this.f6689b = 6;
                        break;
                    } else if ((i10 & 16) != 0) {
                        this.f6695h = i10 & 15;
                        this.f6690c = this.f6691d[i9 + 2];
                        this.f6689b = 2;
                        break;
                    } else if ((i10 & 64) == 0) {
                        this.f6693f = i10;
                        this.f6692e = (i9 / 3) + this.f6691d[i9 + 2];
                        break;
                    } else if ((i10 & 32) != 0) {
                        this.f6689b = 7;
                        break;
                    } else {
                        this.f6689b = 9;
                        kVar.f6769i = "invalid literal/length code";
                        dVar.f6670b = i4;
                        dVar.f6669a = i5;
                        kVar.f6763c = i3;
                        kVar.f6764d += (long) (i2 - kVar.f6762b);
                        kVar.f6762b = i2;
                        dVar.f6674f = i6;
                        return dVar.mo7303b(kVar, -3);
                    }
                case 2:
                    int i11 = this.f6695h;
                    byte b2 = (byte) i5;
                    while (b2 < i11) {
                        if (i3 != 0) {
                            i = 0;
                            i3--;
                            i4 |= (kVar.f6761a[i2] & 255) << b2;
                            b2 += 8;
                            i2++;
                        } else {
                            dVar.f6670b = i4;
                            dVar.f6669a = b2;
                            kVar.f6763c = i3;
                            kVar.f6764d += (long) (i2 - kVar.f6762b);
                            kVar.f6762b = i2;
                            dVar.f6674f = i6;
                            return dVar.mo7303b(kVar, i);
                        }
                    }
                    this.f6690c += f6688a[i11] & i4;
                    i4 >>= i11;
                    i5 = b2 - i11;
                    this.f6693f = this.f6698k;
                    this.f6691d = this.f6701n;
                    this.f6692e = this.f6702o;
                    this.f6689b = 3;
                case 3:
                    int i12 = this.f6693f;
                    byte b3 = (byte) i5;
                    while (b3 < i12) {
                        if (i3 != 0) {
                            i = 0;
                            i3--;
                            i4 |= (kVar.f6761a[i2] & 255) << b3;
                            b3 += 8;
                            i2++;
                        } else {
                            dVar.f6670b = i4;
                            dVar.f6669a = b3;
                            kVar.f6763c = i3;
                            kVar.f6764d += (long) (i2 - kVar.f6762b);
                            kVar.f6762b = i2;
                            dVar.f6674f = i6;
                            return dVar.mo7303b(kVar, i);
                        }
                    }
                    int i13 = (this.f6692e + (f6688a[i12] & i4)) * 3;
                    i4 >>= this.f6691d[i13 + 1];
                    i5 = b3 - this.f6691d[i13 + 1];
                    int i14 = this.f6691d[i13];
                    if ((i14 & 16) != 0) {
                        this.f6695h = i14 & 15;
                        this.f6696i = this.f6691d[i13 + 2];
                        this.f6689b = 4;
                        break;
                    } else if ((i14 & 64) == 0) {
                        this.f6693f = i14;
                        this.f6692e = (i13 / 3) + this.f6691d[i13 + 2];
                        break;
                    } else {
                        this.f6689b = 9;
                        kVar.f6769i = "invalid distance code";
                        dVar.f6670b = i4;
                        dVar.f6669a = i5;
                        kVar.f6763c = i3;
                        kVar.f6764d += (long) (i2 - kVar.f6762b);
                        kVar.f6762b = i2;
                        dVar.f6674f = i6;
                        return dVar.mo7303b(kVar, -3);
                    }
                case 4:
                    int i15 = this.f6695h;
                    byte b4 = (byte) i5;
                    while (b4 < i15) {
                        if (i3 != 0) {
                            i = 0;
                            i3--;
                            i4 |= (kVar.f6761a[i2] & 255) << b4;
                            b4 += 8;
                            i2++;
                        } else {
                            dVar.f6670b = i4;
                            dVar.f6669a = b4;
                            kVar.f6763c = i3;
                            kVar.f6764d += (long) (i2 - kVar.f6762b);
                            kVar.f6762b = i2;
                            dVar.f6674f = i6;
                            return dVar.mo7303b(kVar, i);
                        }
                    }
                    this.f6696i += f6688a[i15] & i4;
                    i4 >>= i15;
                    i5 = b4 - i15;
                    this.f6689b = 5;
                case 5:
                    int i16 = i6 - this.f6696i;
                    while (i16 < 0) {
                        i16 += dVar.f6672d;
                    }
                    while (this.f6690c != 0) {
                        if (i7 == 0) {
                            if (i6 == dVar.f6672d && dVar.f6673e != 0) {
                                i6 = 0;
                                i6 = 0;
                                i7 = 0 < dVar.f6673e ? (dVar.f6673e - 0) - 1 : dVar.f6672d - 0;
                            }
                            if (i7 == 0) {
                                dVar.f6674f = i6;
                                i = dVar.mo7303b(kVar, i);
                                i6 = dVar.f6674f;
                                int i17 = i6 < dVar.f6673e ? (dVar.f6673e - i6) - 1 : dVar.f6672d - i6;
                                if (i6 == dVar.f6672d && dVar.f6673e != 0) {
                                    i6 = 0;
                                    i6 = 0;
                                    i17 = 0 < dVar.f6673e ? (dVar.f6673e - 0) - 1 : dVar.f6672d - 0;
                                }
                                if (i7 == 0) {
                                    dVar.f6670b = i4;
                                    dVar.f6669a = i5;
                                    kVar.f6763c = i3;
                                    kVar.f6764d += (long) (i2 - kVar.f6762b);
                                    kVar.f6762b = i2;
                                    dVar.f6674f = i6;
                                    return dVar.mo7303b(kVar, i);
                                }
                            }
                        }
                        int i18 = i6 + 1;
                        int i19 = i16 + 1;
                        dVar.f6671c[i6] = dVar.f6671c[i16];
                        int i20 = i7 - 1;
                        this.f6690c--;
                        i16 = i19 == dVar.f6672d ? 0 : i19;
                        i7 = i20;
                        i6 = i18;
                    }
                    this.f6689b = 0;
                    break;
                case 6:
                    if (i7 == 0) {
                        if (i6 == dVar.f6672d && dVar.f6673e != 0) {
                            i6 = 0;
                            i6 = 0;
                            i7 = 0 < dVar.f6673e ? (dVar.f6673e - 0) - 1 : dVar.f6672d - 0;
                        }
                        if (i7 == 0) {
                            dVar.f6674f = i6;
                            int b5 = dVar.mo7303b(kVar, i);
                            int i21 = dVar.f6674f;
                            int i22 = i21 < dVar.f6673e ? (dVar.f6673e - i21) - 1 : dVar.f6672d - i21;
                            if (i21 == dVar.f6672d && dVar.f6673e != 0) {
                                i21 = 0;
                                i21 = 0;
                                i22 = 0 < dVar.f6673e ? (dVar.f6673e - 0) - 1 : dVar.f6672d - 0;
                            }
                            if (i7 == 0) {
                                dVar.f6670b = i4;
                                dVar.f6669a = i5;
                                kVar.f6763c = i3;
                                kVar.f6764d += (long) (i2 - kVar.f6762b);
                                kVar.f6762b = i2;
                                dVar.f6674f = i6;
                                return dVar.mo7303b(kVar, b5);
                            }
                        }
                    }
                    i = 0;
                    i6++;
                    dVar.f6671c[i6] = (byte) this.f6694g;
                    i7--;
                    this.f6689b = 0;
                    break;
                case 7:
                    if (i5 > 7) {
                        i5 -= 8;
                        i3++;
                        i2--;
                    }
                    dVar.f6674f = i6;
                    int b6 = dVar.mo7303b(kVar, i);
                    i6 = dVar.f6674f;
                    if (dVar.f6673e == dVar.f6674f) {
                        this.f6689b = 8;
                        break;
                    } else {
                        dVar.f6670b = i4;
                        dVar.f6669a = i5;
                        kVar.f6763c = i3;
                        kVar.f6764d += (long) (i2 - kVar.f6762b);
                        kVar.f6762b = i2;
                        dVar.f6674f = i6;
                        return dVar.mo7303b(kVar, b6);
                    }
                case 8:
                    break;
                case 9:
                    dVar.f6670b = i4;
                    dVar.f6669a = i5;
                    kVar.f6763c = i3;
                    kVar.f6764d += (long) (i2 - kVar.f6762b);
                    kVar.f6762b = i2;
                    dVar.f6674f = i6;
                    return dVar.mo7303b(kVar, -3);
                default:
                    dVar.f6670b = i4;
                    dVar.f6669a = i5;
                    kVar.f6763c = i3;
                    kVar.f6764d += (long) (i2 - kVar.f6762b);
                    kVar.f6762b = i2;
                    dVar.f6674f = i6;
                    return dVar.mo7303b(kVar, -2);
            }
            break;
        }
        dVar.f6670b = i4;
        dVar.f6669a = i5;
        kVar.f6763c = i3;
        kVar.f6764d += (long) (i2 - kVar.f6762b);
        kVar.f6762b = i2;
        dVar.f6674f = i6;
        return dVar.mo7303b(kVar, 1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo7305a(int i, int i2, int[] iArr, int i3, int[] iArr2, int i4) {
        this.f6689b = 0;
        this.f6697j = (byte) i;
        this.f6698k = (byte) i2;
        this.f6699l = iArr;
        this.f6700m = i3;
        this.f6701n = iArr2;
        this.f6702o = i4;
        this.f6691d = null;
    }
}
