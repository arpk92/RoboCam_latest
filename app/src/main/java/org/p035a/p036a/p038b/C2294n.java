package org.p035a.p036a.p038b;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: org.a.a.b.n */
public class C2294n extends C2281a implements C2295o {

    /* renamed from: a */
    private final C2284d f6115a;

    /* renamed from: b */
    private final int f6116b;

    public C2294n(C2284d dVar, int i) {
        if (i > dVar.mo6882r()) {
            throw new IndexOutOfBoundsException("Length is too large, got " + i + " but can't go higher than " + dVar.mo6882r());
        }
        this.f6115a = dVar;
        this.f6116b = i;
        mo6831b(i);
    }

    /* renamed from: i */
    private void m9084i(int i, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("length is negative: " + i2);
        } else if (i + i2 > mo6882r()) {
            throw new IndexOutOfBoundsException("Invalid index of " + (i + i2) + ", maximum is " + mo6882r());
        }
    }

    /* renamed from: o */
    private void m9085o(int i) {
        if (i < 0 || i >= mo6882r()) {
            throw new IndexOutOfBoundsException("Invalid index of " + i + ", maximum is " + mo6882r());
        }
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: a */
    public void mo6862a(int i, long j) {
        m9084i(i, 8);
        this.f6115a.mo6862a(i, j);
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: a */
    public void mo6872a(int i, ByteBuffer byteBuffer) {
        m9084i(i, byteBuffer.remaining());
        this.f6115a.mo6872a(i, byteBuffer);
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: a */
    public void mo6873a(int i, C2284d dVar, int i2, int i3) {
        m9084i(i, i3);
        this.f6115a.mo6873a(i, dVar, i2, i3);
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: a */
    public void mo6874a(int i, byte[] bArr, int i2, int i3) {
        m9084i(i, i3);
        this.f6115a.mo6874a(i, bArr, i2, i3);
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: b */
    public void mo6875b(int i, ByteBuffer byteBuffer) {
        m9084i(i, byteBuffer.remaining());
        this.f6115a.mo6875b(i, byteBuffer);
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: b */
    public void mo6876b(int i, C2284d dVar, int i2, int i3) {
        m9084i(i, i3);
        this.f6115a.mo6876b(i, dVar, i2, i3);
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: b */
    public void mo6877b(int i, byte[] bArr, int i2, int i3) {
        m9084i(i, i3);
        this.f6115a.mo6877b(i, bArr, i2, i3);
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: c */
    public void mo6863c(int i, int i2) {
        m9084i(i, 2);
        this.f6115a.mo6863c(i, i2);
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: d */
    public void mo6864d(int i, int i2) {
        m9084i(i, 4);
        this.f6115a.mo6864d(i, i2);
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: e */
    public C2284d mo6865e(int i, int i2) {
        m9084i(i, i2);
        return this.f6115a.mo6865e(i, i2);
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: f */
    public void mo6878f(int i, int i2) {
        m9085o(i);
        this.f6115a.mo6878f(i, i2);
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: g */
    public C2284d mo6879g(int i, int i2) {
        m9084i(i, i2);
        return i2 == 0 ? C2286f.f6097c : this.f6115a.mo6879g(i, i2);
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: h */
    public ByteBuffer mo6880h(int i, int i2) {
        m9084i(i, i2);
        return this.f6115a.mo6880h(i, i2);
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: k */
    public short mo6866k(int i) {
        m9084i(i, 2);
        return this.f6115a.mo6866k(i);
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: l */
    public int mo6867l(int i) {
        m9084i(i, 4);
        return this.f6115a.mo6867l(i);
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: m */
    public long mo6868m(int i) {
        m9084i(i, 8);
        return this.f6115a.mo6868m(i);
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: n */
    public byte mo6881n(int i) {
        m9085o(i);
        return this.f6115a.mo6881n(i);
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: o */
    public C2285e mo6869o() {
        return this.f6115a.mo6869o();
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: p */
    public ByteOrder mo6870p() {
        return this.f6115a.mo6870p();
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: q */
    public C2284d mo6871q() {
        C2294n nVar = new C2294n(this.f6115a, this.f6116b);
        nVar.mo6821a(mo6816a(), mo6829b());
        return nVar;
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: r */
    public int mo6882r() {
        return this.f6116b;
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: s */
    public boolean mo6883s() {
        return this.f6115a.mo6883s();
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: t */
    public byte[] mo6884t() {
        return this.f6115a.mo6884t();
    }
}
