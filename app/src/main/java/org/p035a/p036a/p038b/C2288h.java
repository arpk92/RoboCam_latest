package org.p035a.p036a.p038b;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: org.a.a.b.h */
public class C2288h extends C2281a implements C2295o {

    /* renamed from: a */
    private final C2284d f6105a;

    public C2288h(C2284d dVar) {
        if (dVar == null) {
            throw new NullPointerException("buffer");
        }
        this.f6105a = dVar;
        mo6821a(dVar.mo6816a(), dVar.mo6829b());
    }

    private C2288h(C2288h hVar) {
        this.f6105a = hVar.f6105a;
        mo6821a(hVar.mo6816a(), hVar.mo6829b());
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: a */
    public void mo6862a(int i, long j) {
        this.f6105a.mo6862a(i, j);
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: a */
    public void mo6872a(int i, ByteBuffer byteBuffer) {
        this.f6105a.mo6872a(i, byteBuffer);
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: a */
    public void mo6873a(int i, C2284d dVar, int i2, int i3) {
        this.f6105a.mo6873a(i, dVar, i2, i3);
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: a */
    public void mo6874a(int i, byte[] bArr, int i2, int i3) {
        this.f6105a.mo6874a(i, bArr, i2, i3);
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: b */
    public void mo6875b(int i, ByteBuffer byteBuffer) {
        this.f6105a.mo6875b(i, byteBuffer);
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: b */
    public void mo6876b(int i, C2284d dVar, int i2, int i3) {
        this.f6105a.mo6876b(i, dVar, i2, i3);
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: b */
    public void mo6877b(int i, byte[] bArr, int i2, int i3) {
        this.f6105a.mo6877b(i, bArr, i2, i3);
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: c */
    public void mo6863c(int i, int i2) {
        this.f6105a.mo6863c(i, i2);
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: d */
    public void mo6864d(int i, int i2) {
        this.f6105a.mo6864d(i, i2);
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: e */
    public C2284d mo6865e(int i, int i2) {
        return this.f6105a.mo6865e(i, i2);
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: f */
    public void mo6878f(int i, int i2) {
        this.f6105a.mo6878f(i, i2);
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: g */
    public C2284d mo6879g(int i, int i2) {
        return this.f6105a.mo6879g(i, i2);
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: h */
    public ByteBuffer mo6880h(int i, int i2) {
        return this.f6105a.mo6880h(i, i2);
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: k */
    public short mo6866k(int i) {
        return this.f6105a.mo6866k(i);
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: l */
    public int mo6867l(int i) {
        return this.f6105a.mo6867l(i);
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: m */
    public long mo6868m(int i) {
        return this.f6105a.mo6868m(i);
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: n */
    public byte mo6881n(int i) {
        return this.f6105a.mo6881n(i);
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: o */
    public C2285e mo6869o() {
        return this.f6105a.mo6869o();
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: p */
    public ByteOrder mo6870p() {
        return this.f6105a.mo6870p();
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: q */
    public C2284d mo6871q() {
        return new C2288h(this);
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: r */
    public int mo6882r() {
        return this.f6105a.mo6882r();
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: s */
    public boolean mo6883s() {
        return this.f6105a.mo6883s();
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: t */
    public byte[] mo6884t() {
        return this.f6105a.mo6884t();
    }
}
