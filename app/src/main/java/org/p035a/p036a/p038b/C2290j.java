package org.p035a.p036a.p038b;

import java.nio.ByteBuffer;

/* renamed from: org.a.a.b.j */
public abstract class C2290j extends C2281a {

    /* renamed from: a */
    protected final byte[] f6109a;

    public C2290j(int i) {
        this(new byte[i], 0, 0);
    }

    public C2290j(byte[] bArr) {
        this(bArr, 0, bArr.length);
    }

    protected C2290j(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new NullPointerException("array");
        }
        this.f6109a = bArr;
        mo6821a(i, i2);
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: a */
    public void mo6872a(int i, ByteBuffer byteBuffer) {
        byteBuffer.put(this.f6109a, i, Math.min(mo6882r() - i, byteBuffer.remaining()));
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: a */
    public void mo6873a(int i, C2284d dVar, int i2, int i3) {
        if (dVar instanceof C2290j) {
            mo6874a(i, ((C2290j) dVar).f6109a, i2, i3);
        } else {
            dVar.mo6877b(i2, this.f6109a, i, i3);
        }
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: a */
    public void mo6874a(int i, byte[] bArr, int i2, int i3) {
        System.arraycopy(this.f6109a, i, bArr, i2, i3);
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: b */
    public void mo6875b(int i, ByteBuffer byteBuffer) {
        byteBuffer.get(this.f6109a, i, byteBuffer.remaining());
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: b */
    public void mo6876b(int i, C2284d dVar, int i2, int i3) {
        if (dVar instanceof C2290j) {
            mo6877b(i, ((C2290j) dVar).f6109a, i2, i3);
        } else {
            dVar.mo6874a(i2, this.f6109a, i, i3);
        }
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: b */
    public void mo6877b(int i, byte[] bArr, int i2, int i3) {
        System.arraycopy(bArr, i2, this.f6109a, i, i3);
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: f */
    public void mo6878f(int i, int i2) {
        this.f6109a[i] = (byte) i2;
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: g */
    public C2284d mo6879g(int i, int i2) {
        if (i != 0) {
            return i2 == 0 ? C2286f.f6097c : new C2293m(this, i, i2);
        }
        if (i2 == 0) {
            return C2286f.f6097c;
        }
        if (i2 != this.f6109a.length) {
            return new C2294n(this, i2);
        }
        C2284d q = mo6871q();
        q.mo6821a(0, i2);
        return q;
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: h */
    public ByteBuffer mo6880h(int i, int i2) {
        return ByteBuffer.wrap(this.f6109a, i, i2).order(mo6870p());
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: n */
    public byte mo6881n(int i) {
        return this.f6109a[i];
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: r */
    public int mo6882r() {
        return this.f6109a.length;
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: s */
    public boolean mo6883s() {
        return false;
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: t */
    public byte[] mo6884t() {
        return this.f6109a;
    }
}
