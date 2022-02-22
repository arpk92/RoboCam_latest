package org.p035a.p036a.p038b;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: org.a.a.b.a */
public abstract class C2281a implements C2284d {

    /* renamed from: a */
    private int f6092a;

    /* renamed from: b */
    private int f6093b;

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: a */
    public int mo6816a() {
        return this.f6092a;
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: a */
    public int mo6817a(int i, int i2, byte b) {
        return C2286f.m8917a(this, i, i2, b);
    }

    /* renamed from: a */
    public String mo6818a(int i, int i2, Charset charset) {
        return i2 == 0 ? "" : C2286f.m8919a(mo6880h(i, i2), charset);
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: a */
    public String mo6819a(Charset charset) {
        return mo6818a(this.f6092a, mo6838d(), charset);
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: a */
    public void mo6820a(int i) {
        if (i < 0 || i > this.f6093b) {
            throw new IndexOutOfBoundsException();
        }
        this.f6092a = i;
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: a */
    public void mo6821a(int i, int i2) {
        if (i < 0 || i > i2 || i2 > mo6882r()) {
            throw new IndexOutOfBoundsException("Invalid writerIndex: " + i2 + " - Maximum is " + i + " or " + mo6882r());
        }
        this.f6092a = i;
        this.f6093b = i2;
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: a */
    public void mo6822a(long j) {
        mo6862a(this.f6093b, j);
        this.f6093b += 8;
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: a */
    public void mo6823a(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        mo6875b(this.f6093b, byteBuffer);
        this.f6093b = remaining + this.f6093b;
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: a */
    public void mo6824a(C2284d dVar) {
        mo6825a(dVar, dVar.mo6838d());
    }

    /* renamed from: a */
    public void mo6825a(C2284d dVar, int i) {
        if (i > dVar.mo6838d()) {
            throw new IndexOutOfBoundsException("Too many bytes to write - Need " + i + ", maximum is " + dVar.mo6838d());
        }
        mo6826a(dVar, dVar.mo6816a(), i);
        dVar.mo6820a(dVar.mo6816a() + i);
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: a */
    public void mo6826a(C2284d dVar, int i, int i2) {
        mo6876b(this.f6093b, dVar, i, i2);
        this.f6093b += i2;
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: a */
    public void mo6827a(byte[] bArr) {
        mo6828a(bArr, 0, bArr.length);
    }

    /* renamed from: a */
    public void mo6828a(byte[] bArr, int i, int i2) {
        mo6853j(i2);
        mo6874a(this.f6092a, bArr, i, i2);
        this.f6092a += i2;
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: b */
    public int mo6829b() {
        return this.f6093b;
    }

    /* renamed from: b */
    public int compareTo(C2284d dVar) {
        return C2286f.m8942b(this, dVar);
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: b */
    public void mo6831b(int i) {
        if (i < this.f6092a || i > mo6882r()) {
            throw new IndexOutOfBoundsException("Invalid readerIndex: " + this.f6092a + " - Maximum is " + i);
        }
        this.f6093b = i;
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: b */
    public void mo6832b(byte[] bArr) {
        mo6833b(bArr, 0, bArr.length);
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: b */
    public void mo6833b(byte[] bArr, int i, int i2) {
        mo6877b(this.f6093b, bArr, i, i2);
        this.f6093b += i2;
    }

    /* renamed from: b */
    public ByteBuffer[] mo6834b(int i, int i2) {
        return new ByteBuffer[]{mo6880h(i, i2)};
    }

    /* renamed from: c */
    public void mo6835c(int i) {
        if (i > mo6840e()) {
            throw new IndexOutOfBoundsException("Writable bytes exceeded: Got " + i + ", maximum is " + mo6840e());
        }
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: c */
    public boolean mo6836c() {
        return mo6838d() > 0;
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: d */
    public int mo6838d() {
        return this.f6093b - this.f6092a;
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: d */
    public short mo6839d(int i) {
        return (short) (mo6881n(i) & 255);
    }

    /* renamed from: e */
    public int mo6840e() {
        return mo6882r() - this.f6093b;
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: e */
    public long mo6841e(int i) {
        return ((long) mo6867l(i)) & 4294967295L;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C2284d)) {
            return false;
        }
        return C2286f.m8939a(this, (C2284d) obj);
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: f */
    public byte mo6843f() {
        if (this.f6092a == this.f6093b) {
            throw new IndexOutOfBoundsException("Readable byte limit exceeded: " + this.f6092a);
        }
        int i = this.f6092a;
        this.f6092a = i + 1;
        return mo6881n(i);
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: f */
    public C2284d mo6844f(int i) {
        mo6853j(i);
        if (i == 0) {
            return C2286f.f6097c;
        }
        C2284d a = mo6869o().mo6885a(mo6870p(), i);
        a.mo6826a(this, this.f6092a, i);
        this.f6092a += i;
        return a;
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: g */
    public short mo6845g() {
        return (short) (mo6843f() & 255);
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: g */
    public void mo6846g(int i) {
        int i2 = this.f6092a + i;
        if (i2 > this.f6093b) {
            throw new IndexOutOfBoundsException("Readable bytes exceeded - Need " + i2 + ", maximum is " + this.f6093b);
        }
        this.f6092a = i2;
    }

    /* renamed from: h */
    public short mo6847h() {
        mo6853j(2);
        short k = mo6866k(this.f6092a);
        this.f6092a += 2;
        return k;
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: h */
    public void mo6848h(int i) {
        int i2 = this.f6093b;
        this.f6093b = i2 + 1;
        mo6878f(i2, i);
    }

    public int hashCode() {
        return C2286f.m8947c(this);
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: i */
    public int mo6850i() {
        return mo6847h() & 65535;
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: i */
    public void mo6851i(int i) {
        mo6864d(this.f6093b, i);
        this.f6093b += 4;
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: j */
    public long mo6852j() {
        mo6853j(8);
        long m = mo6868m(this.f6092a);
        this.f6092a += 8;
        return m;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo6853j(int i) {
        if (mo6838d() < i) {
            throw new IndexOutOfBoundsException("Not enough readable bytes - Need " + i + ", maximum is " + mo6838d());
        }
    }

    /* renamed from: k */
    public C2284d mo6854k() {
        return mo6865e(this.f6092a, mo6838d());
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: l */
    public C2284d mo6855l() {
        return mo6879g(this.f6092a, mo6838d());
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: m */
    public ByteBuffer mo6856m() {
        return mo6880h(this.f6092a, mo6838d());
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: n */
    public ByteBuffer[] mo6857n() {
        return mo6834b(this.f6092a, mo6838d());
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + "ridx=" + this.f6092a + ", " + "widx=" + this.f6093b + ", " + "cap=" + mo6882r() + ')';
    }
}
