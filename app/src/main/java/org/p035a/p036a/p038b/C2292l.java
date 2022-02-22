package org.p035a.p036a.p038b;

import java.nio.ByteOrder;

/* renamed from: org.a.a.b.l */
public class C2292l extends C2290j {
    public C2292l(int i) {
        super(i);
    }

    public C2292l(byte[] bArr) {
        super(bArr);
    }

    private C2292l(byte[] bArr, int i, int i2) {
        super(bArr, i, i2);
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: a */
    public void mo6862a(int i, long j) {
        this.f6109a[i] = (byte) ((int) j);
        this.f6109a[i + 1] = (byte) ((int) (j >>> 8));
        this.f6109a[i + 2] = (byte) ((int) (j >>> 16));
        this.f6109a[i + 3] = (byte) ((int) (j >>> 24));
        this.f6109a[i + 4] = (byte) ((int) (j >>> 32));
        this.f6109a[i + 5] = (byte) ((int) (j >>> 40));
        this.f6109a[i + 6] = (byte) ((int) (j >>> 48));
        this.f6109a[i + 7] = (byte) ((int) (j >>> 56));
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: c */
    public void mo6863c(int i, int i2) {
        this.f6109a[i] = (byte) i2;
        this.f6109a[i + 1] = (byte) (i2 >>> 8);
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: d */
    public void mo6864d(int i, int i2) {
        this.f6109a[i] = (byte) i2;
        this.f6109a[i + 1] = (byte) (i2 >>> 8);
        this.f6109a[i + 2] = (byte) (i2 >>> 16);
        this.f6109a[i + 3] = (byte) (i2 >>> 24);
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: e */
    public C2284d mo6865e(int i, int i2) {
        if (i < 0 || i2 < 0 || i + i2 > this.f6109a.length) {
            throw new IndexOutOfBoundsException("Too many bytes to copy - Need " + (i + i2) + ", maximum is " + this.f6109a.length);
        }
        byte[] bArr = new byte[i2];
        System.arraycopy(this.f6109a, i, bArr, 0, i2);
        return new C2292l(bArr);
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: k */
    public short mo6866k(int i) {
        return (short) ((this.f6109a[i] & 255) | (this.f6109a[i + 1] << 8));
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: l */
    public int mo6867l(int i) {
        return (this.f6109a[i] & 255) | ((this.f6109a[i + 1] & 255) << 8) | ((this.f6109a[i + 2] & 255) << 16) | ((this.f6109a[i + 3] & 255) << 24);
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: m */
    public long mo6868m(int i) {
        return (((long) this.f6109a[i]) & 255) | ((((long) this.f6109a[i + 1]) & 255) << 8) | ((((long) this.f6109a[i + 2]) & 255) << 16) | ((((long) this.f6109a[i + 3]) & 255) << 24) | ((((long) this.f6109a[i + 4]) & 255) << 32) | ((((long) this.f6109a[i + 5]) & 255) << 40) | ((((long) this.f6109a[i + 6]) & 255) << 48) | ((((long) this.f6109a[i + 7]) & 255) << 56);
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: o */
    public C2285e mo6869o() {
        return C2291k.m9045a(ByteOrder.LITTLE_ENDIAN);
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: p */
    public ByteOrder mo6870p() {
        return ByteOrder.LITTLE_ENDIAN;
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: q */
    public C2284d mo6871q() {
        return new C2292l(this.f6109a, mo6816a(), mo6829b());
    }
}
