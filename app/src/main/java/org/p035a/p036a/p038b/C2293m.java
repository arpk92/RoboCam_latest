package org.p035a.p036a.p038b;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: org.a.a.b.m */
public class C2293m extends C2281a implements C2295o {

    /* renamed from: a */
    private final C2284d f6112a;

    /* renamed from: b */
    private final int f6113b;

    /* renamed from: c */
    private final int f6114c;

    public C2293m(C2284d dVar, int i, int i2) {
        if (i < 0 || i > dVar.mo6882r()) {
            throw new IndexOutOfBoundsException("Invalid index of " + i + ", maximum is " + dVar.mo6882r());
        } else if (i + i2 > dVar.mo6882r()) {
            throw new IndexOutOfBoundsException("Invalid combined index of " + (i + i2) + ", maximum is " + dVar.mo6882r());
        } else {
            this.f6112a = dVar;
            this.f6113b = i;
            this.f6114c = i2;
            mo6831b(i2);
        }
    }

    /* renamed from: i */
    private void m9059i(int i, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("length is negative: " + i2);
        } else if (i < 0) {
            throw new IndexOutOfBoundsException("startIndex cannot be negative");
        } else if (i + i2 > mo6882r()) {
            throw new IndexOutOfBoundsException("Index too big - Bytes needed: " + (i + i2) + ", maximum is " + mo6882r());
        }
    }

    /* renamed from: o */
    private void m9060o(int i) {
        if (i < 0 || i >= mo6882r()) {
            throw new IndexOutOfBoundsException("Invalid index: " + i + ", maximum is " + mo6882r());
        }
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: a */
    public void mo6862a(int i, long j) {
        m9059i(i, 8);
        this.f6112a.mo6862a(this.f6113b + i, j);
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: a */
    public void mo6872a(int i, ByteBuffer byteBuffer) {
        m9059i(i, byteBuffer.remaining());
        this.f6112a.mo6872a(this.f6113b + i, byteBuffer);
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: a */
    public void mo6873a(int i, C2284d dVar, int i2, int i3) {
        m9059i(i, i3);
        this.f6112a.mo6873a(this.f6113b + i, dVar, i2, i3);
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: a */
    public void mo6874a(int i, byte[] bArr, int i2, int i3) {
        m9059i(i, i3);
        this.f6112a.mo6874a(this.f6113b + i, bArr, i2, i3);
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: b */
    public void mo6875b(int i, ByteBuffer byteBuffer) {
        m9059i(i, byteBuffer.remaining());
        this.f6112a.mo6875b(this.f6113b + i, byteBuffer);
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: b */
    public void mo6876b(int i, C2284d dVar, int i2, int i3) {
        m9059i(i, i3);
        this.f6112a.mo6876b(this.f6113b + i, dVar, i2, i3);
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: b */
    public void mo6877b(int i, byte[] bArr, int i2, int i3) {
        m9059i(i, i3);
        this.f6112a.mo6877b(this.f6113b + i, bArr, i2, i3);
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: c */
    public void mo6863c(int i, int i2) {
        m9059i(i, 2);
        this.f6112a.mo6863c(this.f6113b + i, i2);
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: d */
    public void mo6864d(int i, int i2) {
        m9059i(i, 4);
        this.f6112a.mo6864d(this.f6113b + i, i2);
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: e */
    public C2284d mo6865e(int i, int i2) {
        m9059i(i, i2);
        return this.f6112a.mo6865e(this.f6113b + i, i2);
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: f */
    public void mo6878f(int i, int i2) {
        m9060o(i);
        this.f6112a.mo6878f(this.f6113b + i, i2);
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: g */
    public C2284d mo6879g(int i, int i2) {
        m9059i(i, i2);
        return i2 == 0 ? C2286f.f6097c : new C2293m(this.f6112a, this.f6113b + i, i2);
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: h */
    public ByteBuffer mo6880h(int i, int i2) {
        m9059i(i, i2);
        return this.f6112a.mo6880h(this.f6113b + i, i2);
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: k */
    public short mo6866k(int i) {
        m9059i(i, 2);
        return this.f6112a.mo6866k(this.f6113b + i);
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: l */
    public int mo6867l(int i) {
        m9059i(i, 4);
        return this.f6112a.mo6867l(this.f6113b + i);
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: m */
    public long mo6868m(int i) {
        m9059i(i, 8);
        return this.f6112a.mo6868m(this.f6113b + i);
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: n */
    public byte mo6881n(int i) {
        m9060o(i);
        return this.f6112a.mo6881n(this.f6113b + i);
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: o */
    public C2285e mo6869o() {
        return this.f6112a.mo6869o();
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: p */
    public ByteOrder mo6870p() {
        return this.f6112a.mo6870p();
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: q */
    public C2284d mo6871q() {
        C2293m mVar = new C2293m(this.f6112a, this.f6113b, this.f6114c);
        mVar.mo6821a(mo6816a(), mo6829b());
        return mVar;
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: r */
    public int mo6882r() {
        return this.f6114c;
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: s */
    public boolean mo6883s() {
        return this.f6112a.mo6883s();
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: t */
    public byte[] mo6884t() {
        return this.f6112a.mo6884t();
    }
}
