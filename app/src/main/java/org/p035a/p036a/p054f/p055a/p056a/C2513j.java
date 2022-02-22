package org.p035a.p036a.p054f.p055a.p056a;

import android.support.v8.renderscript.Allocation;

/* renamed from: org.a.a.f.a.a.j */
final class C2513j {

    /* renamed from: a */
    static final int[] f6750a = {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 0};

    /* renamed from: b */
    static final int[] f6751b = {0, 0, 0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10, 11, 11, 12, 12, 13, 13};

    /* renamed from: c */
    static final int[] f6752c = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 3, 7};

    /* renamed from: d */
    static final byte[] f6753d = {16, 17, 18, 0, 8, 7, 9, 6, 10, 5, 11, 4, 12, 3, 13, 2, 14, 1, 15};

    /* renamed from: e */
    static final byte[] f6754e = {0, 1, 2, 3, 4, 4, 5, 5, 6, 6, 6, 6, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8, 9, 9, 9, 9, 9, 9, 9, 9, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 0, 0, 16, 17, 18, 18, 19, 19, 20, 20, 20, 20, 21, 21, 21, 21, 22, 22, 22, 22, 22, 22, 22, 22, 23, 23, 23, 23, 23, 23, 23, 23, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29};

    /* renamed from: f */
    static final byte[] f6755f = {0, 1, 2, 3, 4, 5, 6, 7, 8, 8, 9, 9, 10, 10, 11, 11, 12, 12, 12, 12, 13, 13, 13, 13, 14, 14, 14, 14, 15, 15, 15, 15, 16, 16, 16, 16, 16, 16, 16, 16, 17, 17, 17, 17, 17, 17, 17, 17, 18, 18, 18, 18, 18, 18, 18, 18, 19, 19, 19, 19, 19, 19, 19, 19, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 28};

    /* renamed from: g */
    static final int[] f6756g = {0, 1, 2, 3, 4, 5, 6, 7, 8, 10, 12, 14, 16, 20, 24, 28, 32, 40, 48, 56, 64, 80, 96, 112, Allocation.USAGE_SHARED, 160, 192, 224, 0};

    /* renamed from: h */
    static final int[] f6757h = {0, 1, 2, 3, 4, 6, 8, 12, 16, 24, 32, 48, 64, 96, Allocation.USAGE_SHARED, 192, 256, 384, 512, 768, 1024, 1536, 2048, 3072, 4096, 6144, 8192, 12288, 16384, 24576};

    /* renamed from: i */
    short[] f6758i;

    /* renamed from: j */
    int f6759j;

    /* renamed from: k */
    C2512i f6760k;

    C2513j() {
    }

    /* renamed from: a */
    static int m10010a(int i) {
        return i < 256 ? f6754e[i] : f6754e[(i >>> 7) + 256];
    }

    /* renamed from: a */
    private static int m10011a(int i, int i2) {
        int i3 = 0;
        do {
            i >>>= 1;
            i3 = (i3 | (i & 1)) << 1;
            i2--;
        } while (i2 > 0);
        return i3 >>> 1;
    }

    /* renamed from: a */
    private static void m10012a(short[] sArr, int i, short[] sArr2) {
        short[] sArr3 = new short[16];
        short s = 0;
        for (int i2 = 1; i2 <= 15; i2++) {
            s = (short) ((s + sArr2[i2 - 1]) << 1);
            sArr3[i2] = s;
        }
        for (int i3 = 0; i3 <= i; i3++) {
            short s2 = sArr[(i3 * 2) + 1];
            if (s2 != 0) {
                short s3 = sArr3[s2];
                sArr3[s2] = (short) (s3 + 1);
                sArr[i3 * 2] = (short) m10011a(s3, s2);
            }
        }
    }

    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:48:0x00b9 */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:46:0x00b9 */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:49:0x00b9 */
    /* renamed from: b */
    private void m10013b(C2502c cVar) {
        short[] sArr = this.f6758i;
        short[] sArr2 = this.f6760k.f6745f;
        int[] iArr = this.f6760k.f6746g;
        int i = this.f6760k.f6747h;
        int i2 = this.f6760k.f6749j;
        for (int i3 = 0; i3 <= 15; i3++) {
            cVar.f6618P[i3] = 0;
        }
        sArr[(cVar.f6619Q[cVar.f6621S] * 2) + 1] = 0;
        int i4 = cVar.f6621S + 1;
        int i5 = 0;
        while (i4 < 573) {
            int i6 = cVar.f6619Q[i4];
            int i7 = sArr[(sArr[(i6 * 2) + 1] * 2) + 1] + 1;
            if (i7 > i2) {
                i5++;
                i7 = i2;
            }
            sArr[(i6 * 2) + 1] = (short) i7;
            if (i6 <= this.f6759j) {
                short[] sArr3 = cVar.f6618P;
                sArr3[i7] = (short) (sArr3[i7] + 1);
                int i8 = i6 >= i ? iArr[i6 - i] : 0;
                short s = sArr[i6 * 2];
                cVar.f6627Y = ((i7 + i8) * s) + cVar.f6627Y;
                if (sArr2 != null) {
                    cVar.f6628Z += (i8 + sArr2[(i6 * 2) + 1]) * s;
                }
            }
            i4++;
        }
        if (i5 != 0) {
            do {
                int i9 = i2 - 1;
                while (cVar.f6618P[i9] == 0) {
                    i9--;
                }
                short[] sArr4 = cVar.f6618P;
                sArr4[i9] = (short) (sArr4[i9] - 1);
                short[] sArr5 = cVar.f6618P;
                int i10 = i9 + 1;
                sArr5[i10] = (short) (sArr5[i10] + 2);
                short[] sArr6 = cVar.f6618P;
                sArr6[i2] = (short) (sArr6[i2] - 1);
                i5 -= 2;
            } while (i5 > 0);
            int i11 = i4;
            while (i2 != 0) {
                int i12 = cVar.f6618P[i2];
                while (i12 != 0) {
                    i11--;
                    int i13 = cVar.f6619Q[i11];
                    if (i13 <= this.f6759j) {
                        if (sArr[(i13 * 2) + 1] != i2) {
                            cVar.f6627Y = (int) (((long) cVar.f6627Y) + ((((long) i2) - ((long) sArr[(i13 * 2) + 1])) * ((long) sArr[i13 * 2])));
                            sArr[(i13 * 2) + 1] = (short) i2;
                        }
                        i12--;
                    }
                }
                i2--;
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.max(int, int):int}
     arg types: [byte, byte]
     candidates:
      ClspMth{java.lang.Math.max(double, double):double}
      ClspMth{java.lang.Math.max(float, float):float}
      ClspMth{java.lang.Math.max(long, long):long}
      ClspMth{java.lang.Math.max(int, int):int} */
    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo7311a(C2502c cVar) {
        int i;
        short[] sArr = this.f6758i;
        short[] sArr2 = this.f6760k.f6745f;
        int i2 = this.f6760k.f6748i;
        int i3 = -1;
        cVar.f6620R = 0;
        cVar.f6621S = 573;
        for (int i4 = 0; i4 < i2; i4++) {
            if (sArr[i4 * 2] != 0) {
                int[] iArr = cVar.f6619Q;
                int i5 = cVar.f6620R + 1;
                cVar.f6620R = i5;
                iArr[i5] = i4;
                cVar.f6622T[i4] = 0;
                i3 = i4;
            } else {
                sArr[(i4 * 2) + 1] = 0;
            }
        }
        while (cVar.f6620R < 2) {
            int[] iArr2 = cVar.f6619Q;
            int i6 = cVar.f6620R + 1;
            cVar.f6620R = i6;
            if (i3 < 2) {
                i3++;
                i = i3;
            } else {
                i = 0;
            }
            iArr2[i6] = i;
            sArr[i * 2] = 1;
            cVar.f6622T[i] = 0;
            cVar.f6627Y--;
            if (sArr2 != null) {
                cVar.f6628Z -= sArr2[(i * 2) + 1];
            }
        }
        this.f6759j = i3;
        for (int i7 = cVar.f6620R / 2; i7 >= 1; i7--) {
            cVar.mo7298a(sArr, i7);
        }
        int i8 = i2;
        while (true) {
            int i9 = cVar.f6619Q[1];
            int[] iArr3 = cVar.f6619Q;
            int[] iArr4 = cVar.f6619Q;
            int i10 = cVar.f6620R;
            cVar.f6620R = i10 - 1;
            iArr3[1] = iArr4[i10];
            cVar.mo7298a(sArr, 1);
            int i11 = cVar.f6619Q[1];
            int[] iArr5 = cVar.f6619Q;
            int i12 = cVar.f6621S - 1;
            cVar.f6621S = i12;
            iArr5[i12] = i9;
            int[] iArr6 = cVar.f6619Q;
            int i13 = cVar.f6621S - 1;
            cVar.f6621S = i13;
            iArr6[i13] = i11;
            sArr[i8 * 2] = (short) (sArr[i9 * 2] + sArr[i11 * 2]);
            cVar.f6622T[i8] = (byte) (Math.max((int) cVar.f6622T[i9], (int) cVar.f6622T[i11]) + 1);
            short s = (short) i8;
            sArr[(i11 * 2) + 1] = s;
            sArr[(i9 * 2) + 1] = s;
            int i14 = i8 + 1;
            cVar.f6619Q[1] = i8;
            cVar.mo7298a(sArr, 1);
            if (cVar.f6620R < 2) {
                int[] iArr7 = cVar.f6619Q;
                int i15 = cVar.f6621S - 1;
                cVar.f6621S = i15;
                iArr7[i15] = cVar.f6619Q[1];
                m10013b(cVar);
                m10012a(sArr, i3, cVar.f6618P);
                return;
            }
            i8 = i14;
        }
    }
}
