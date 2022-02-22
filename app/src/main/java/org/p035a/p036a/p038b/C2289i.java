package org.p035a.p036a.p038b;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: org.a.a.b.i */
public class C2289i extends C2281a {

    /* renamed from: a */
    private final C2285e f6106a;

    /* renamed from: b */
    private final ByteOrder f6107b;

    /* renamed from: c */
    private C2284d f6108c;

    public C2289i(ByteOrder byteOrder, int i) {
        this(byteOrder, i, C2291k.m9045a(byteOrder));
    }

    public C2289i(ByteOrder byteOrder, int i, C2285e eVar) {
        if (i < 0) {
            throw new IllegalArgumentException("estimatedLength: " + i);
        } else if (byteOrder == null) {
            throw new NullPointerException("endianness");
        } else if (eVar == null) {
            throw new NullPointerException("factory");
        } else {
            this.f6106a = eVar;
            this.f6107b = byteOrder;
            this.f6108c = eVar.mo6885a(mo6870p(), i);
        }
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: a */
    public void mo6862a(int i, long j) {
        this.f6108c.mo6862a(i, j);
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: a */
    public void mo6872a(int i, ByteBuffer byteBuffer) {
        this.f6108c.mo6872a(i, byteBuffer);
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: a */
    public void mo6873a(int i, C2284d dVar, int i2, int i3) {
        this.f6108c.mo6873a(i, dVar, i2, i3);
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: a */
    public void mo6874a(int i, byte[] bArr, int i2, int i3) {
        this.f6108c.mo6874a(i, bArr, i2, i3);
    }

    @Override // org.p035a.p036a.p038b.C2284d, org.p035a.p036a.p038b.C2281a
    /* renamed from: a */
    public void mo6822a(long j) {
        mo6835c(8);
        super.mo6822a(j);
    }

    @Override // org.p035a.p036a.p038b.C2284d, org.p035a.p036a.p038b.C2281a
    /* renamed from: a */
    public void mo6823a(ByteBuffer byteBuffer) {
        mo6835c(byteBuffer.remaining());
        super.mo6823a(byteBuffer);
    }

    @Override // org.p035a.p036a.p038b.C2284d, org.p035a.p036a.p038b.C2281a
    /* renamed from: a */
    public void mo6826a(C2284d dVar, int i, int i2) {
        mo6835c(i2);
        super.mo6826a(dVar, i, i2);
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: b */
    public void mo6875b(int i, ByteBuffer byteBuffer) {
        this.f6108c.mo6875b(i, byteBuffer);
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: b */
    public void mo6876b(int i, C2284d dVar, int i2, int i3) {
        this.f6108c.mo6876b(i, dVar, i2, i3);
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: b */
    public void mo6877b(int i, byte[] bArr, int i2, int i3) {
        this.f6108c.mo6877b(i, bArr, i2, i3);
    }

    @Override // org.p035a.p036a.p038b.C2284d, org.p035a.p036a.p038b.C2281a
    /* renamed from: b */
    public void mo6833b(byte[] bArr, int i, int i2) {
        mo6835c(i2);
        super.mo6833b(bArr, i, i2);
    }

    @Override // org.p035a.p036a.p038b.C2281a
    /* renamed from: c */
    public void mo6835c(int i) {
        if (i > mo6840e()) {
            int r = mo6882r() == 0 ? 1 : mo6882r();
            int b = mo6829b() + i;
            while (r < b) {
                r <<= 1;
                if (r == 0) {
                    throw new IllegalStateException("Maximum size of 2gb exceeded");
                }
            }
            C2284d a = mo6869o().mo6885a(mo6870p(), r);
            a.mo6826a(this.f6108c, 0, mo6829b());
            this.f6108c = a;
        }
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: c */
    public void mo6863c(int i, int i2) {
        this.f6108c.mo6863c(i, i2);
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: d */
    public void mo6864d(int i, int i2) {
        this.f6108c.mo6864d(i, i2);
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: e */
    public C2284d mo6865e(int i, int i2) {
        C2289i iVar = new C2289i(mo6870p(), Math.max(i2, 64), mo6869o());
        iVar.f6108c = this.f6108c.mo6865e(i, i2);
        iVar.mo6821a(0, i2);
        return iVar;
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: f */
    public void mo6878f(int i, int i2) {
        this.f6108c.mo6878f(i, i2);
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: g */
    public C2284d mo6879g(int i, int i2) {
        return i == 0 ? i2 == 0 ? C2286f.f6097c : new C2294n(this, i2) : i2 == 0 ? C2286f.f6097c : new C2293m(this, i, i2);
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: h */
    public ByteBuffer mo6880h(int i, int i2) {
        return this.f6108c.mo6880h(i, i2);
    }

    @Override // org.p035a.p036a.p038b.C2284d, org.p035a.p036a.p038b.C2281a
    /* renamed from: h */
    public void mo6848h(int i) {
        mo6835c(1);
        super.mo6848h(i);
    }

    @Override // org.p035a.p036a.p038b.C2284d, org.p035a.p036a.p038b.C2281a
    /* renamed from: i */
    public void mo6851i(int i) {
        mo6835c(4);
        super.mo6851i(i);
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: k */
    public short mo6866k(int i) {
        return this.f6108c.mo6866k(i);
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: l */
    public int mo6867l(int i) {
        return this.f6108c.mo6867l(i);
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: m */
    public long mo6868m(int i) {
        return this.f6108c.mo6868m(i);
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: n */
    public byte mo6881n(int i) {
        return this.f6108c.mo6881n(i);
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: o */
    public C2285e mo6869o() {
        return this.f6106a;
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: p */
    public ByteOrder mo6870p() {
        return this.f6107b;
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: q */
    public C2284d mo6871q() {
        return new C2288h(this);
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: r */
    public int mo6882r() {
        return this.f6108c.mo6882r();
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: s */
    public boolean mo6883s() {
        return this.f6108c.mo6883s();
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: t */
    public byte[] mo6884t() {
        return this.f6108c.mo6884t();
    }
}
