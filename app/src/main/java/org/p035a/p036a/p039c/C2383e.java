package org.p035a.p036a.p039c;

/* renamed from: org.a.a.c.e */
public class C2383e implements C2326ar {

    /* renamed from: a */
    private final int f6332a;

    /* renamed from: b */
    private final int f6333b;

    /* renamed from: c */
    private final int f6334c;

    public C2383e() {
        this(64, 1024, 65536);
    }

    public C2383e(int i, int i2, int i3) {
        if (i <= 0) {
            throw new IllegalArgumentException("minimum: " + i);
        } else if (i2 < i) {
            throw new IllegalArgumentException("initial: " + i2);
        } else if (i3 < i2) {
            throw new IllegalArgumentException("maximum: " + i3);
        } else {
            this.f6332a = i;
            this.f6333b = i2;
            this.f6334c = i3;
        }
    }

    @Override // org.p035a.p036a.p039c.C2326ar
    /* renamed from: a */
    public C2325aq mo7015a() {
        return new C2382d(this.f6332a, this.f6333b, this.f6334c);
    }
}
