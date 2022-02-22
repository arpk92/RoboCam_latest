package org.p035a.p036a.p039c;

import java.util.ArrayList;

/* renamed from: org.a.a.c.d */
public class C2382d implements C2325aq {

    /* renamed from: a */
    private static final int[] f6326a;

    /* renamed from: b */
    private final int f6327b;

    /* renamed from: c */
    private final int f6328c;

    /* renamed from: d */
    private int f6329d;

    /* renamed from: e */
    private int f6330e;

    /* renamed from: f */
    private boolean f6331f;

    static {
        ArrayList arrayList = new ArrayList();
        for (int i = 1; i <= 8; i++) {
            arrayList.add(Integer.valueOf(i));
        }
        for (int i2 = 4; i2 < 32; i2++) {
            long j = 1 << i2;
            long j2 = j >>> 4;
            long j3 = j - (j2 << 3);
            for (int i3 = 0; i3 < 8; i3++) {
                j3 += j2;
                if (j3 > 2147483647L) {
                    arrayList.add(Integer.MAX_VALUE);
                } else {
                    arrayList.add(Integer.valueOf((int) j3));
                }
            }
        }
        f6326a = new int[arrayList.size()];
        for (int i4 = 0; i4 < f6326a.length; i4++) {
            f6326a[i4] = ((Integer) arrayList.get(i4)).intValue();
        }
    }

    public C2382d() {
        this(64, 1024, 65536);
    }

    public C2382d(int i, int i2, int i3) {
        if (i <= 0) {
            throw new IllegalArgumentException("minimum: " + i);
        } else if (i2 < i) {
            throw new IllegalArgumentException("initial: " + i2);
        } else if (i3 < i2) {
            throw new IllegalArgumentException("maximum: " + i3);
        } else {
            int b = m9467b(i);
            if (f6326a[b] < i) {
                this.f6327b = b + 1;
            } else {
                this.f6327b = b;
            }
            int b2 = m9467b(i3);
            if (f6326a[b2] > i3) {
                this.f6328c = b2 - 1;
            } else {
                this.f6328c = b2;
            }
            this.f6329d = m9467b(i2);
            this.f6330e = f6326a[this.f6329d];
        }
    }

    /* renamed from: b */
    private static int m9467b(int i) {
        if (i <= 16) {
            return i - 1;
        }
        int i2 = 0;
        int i3 = i;
        do {
            i3 >>>= 1;
            i2++;
        } while (i3 != 0);
        int i4 = i2 << 3;
        int i5 = i4 - 25;
        for (int i6 = i4 - 18; i6 >= i5; i6--) {
            if (i >= f6326a[i6]) {
                return i6;
            }
        }
        throw new Error("shouldn't reach here; please file a bug report.");
    }

    @Override // org.p035a.p036a.p039c.C2325aq
    /* renamed from: a */
    public int mo7013a() {
        return this.f6330e;
    }

    @Override // org.p035a.p036a.p039c.C2325aq
    /* renamed from: a */
    public void mo7014a(int i) {
        if (i <= f6326a[Math.max(0, (this.f6329d - 1) - 1)]) {
            if (this.f6331f) {
                this.f6329d = Math.max(this.f6329d - 1, this.f6327b);
                this.f6330e = f6326a[this.f6329d];
                this.f6331f = false;
                return;
            }
            this.f6331f = true;
        } else if (i >= this.f6330e) {
            this.f6329d = Math.min(this.f6329d + 4, this.f6328c);
            this.f6330e = f6326a[this.f6329d];
            this.f6331f = false;
        }
    }
}
