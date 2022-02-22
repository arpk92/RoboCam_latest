package org.p035a.p036a.p043d.p044a.p051f;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import org.p035a.p036a.p038b.C2284d;
import org.p035a.p036a.p038b.C2285e;

/* renamed from: org.a.a.d.a.f.c */
class C2476c implements C2284d {

    /* renamed from: a */
    private static final Error f6538a = new C2474a();

    /* renamed from: b */
    private final C2475b<?> f6539b;

    /* renamed from: c */
    private boolean f6540c;

    C2476c(C2475b<?> bVar) {
        this.f6539b = bVar;
    }

    /* renamed from: b */
    private void m9828b(int i, int i2) {
        if (i + i2 > m9830h().mo6829b()) {
            throw f6538a;
        }
    }

    /* renamed from: c */
    private void m9829c(int i) {
        if (m9830h().mo6838d() < i) {
            throw f6538a;
        }
    }

    /* renamed from: h */
    private C2284d m9830h() {
        return this.f6539b.mo7170c();
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: a */
    public int mo6816a() {
        return m9830h().mo6816a();
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: a */
    public int mo6817a(int i, int i2, byte b) {
        int a = m9830h().mo6817a(i, i2, b);
        if (a >= 0) {
            return a;
        }
        throw f6538a;
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: a */
    public String mo6819a(Charset charset) {
        throw new C2477d();
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: a */
    public void mo6820a(int i) {
        m9830h().mo6820a(i);
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: a */
    public void mo6821a(int i, int i2) {
        throw new C2477d();
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: a */
    public void mo6862a(int i, long j) {
        throw new C2477d();
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: a */
    public void mo6872a(int i, ByteBuffer byteBuffer) {
        throw new C2477d();
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: a */
    public void mo6873a(int i, C2284d dVar, int i2, int i3) {
        m9828b(i, i3);
        m9830h().mo6873a(i, dVar, i2, i3);
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: a */
    public void mo6874a(int i, byte[] bArr, int i2, int i3) {
        m9828b(i, i3);
        m9830h().mo6874a(i, bArr, i2, i3);
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: a */
    public void mo6822a(long j) {
        throw new C2477d();
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: a */
    public void mo6823a(ByteBuffer byteBuffer) {
        throw new C2477d();
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: a */
    public void mo6824a(C2284d dVar) {
        throw new C2477d();
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: a */
    public void mo6826a(C2284d dVar, int i, int i2) {
        throw new C2477d();
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: a */
    public void mo6827a(byte[] bArr) {
        m9829c(bArr.length);
        m9830h().mo6827a(bArr);
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: b */
    public int mo6829b() {
        return m9830h().mo6829b();
    }

    /* renamed from: b */
    public int compareTo(C2284d dVar) {
        throw new C2477d();
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: b */
    public void mo6831b(int i) {
        throw new C2477d();
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: b */
    public void mo6875b(int i, ByteBuffer byteBuffer) {
        throw new C2477d();
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: b */
    public void mo6876b(int i, C2284d dVar, int i2, int i3) {
        throw new C2477d();
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: b */
    public void mo6877b(int i, byte[] bArr, int i2, int i3) {
        throw new C2477d();
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: b */
    public void mo6832b(byte[] bArr) {
        throw new C2477d();
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: b */
    public void mo6833b(byte[] bArr, int i, int i2) {
        throw new C2477d();
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: c */
    public void mo6863c(int i, int i2) {
        throw new C2477d();
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: c */
    public boolean mo6836c() {
        if (this.f6540c) {
            return m9830h().mo6836c();
        }
        return true;
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: d */
    public int mo6838d() {
        return this.f6540c ? m9830h().mo6838d() : Integer.MAX_VALUE - m9830h().mo6816a();
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: d */
    public short mo6839d(int i) {
        m9828b(i, 1);
        return m9830h().mo6839d(i);
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: d */
    public void mo6864d(int i, int i2) {
        throw new C2477d();
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: e */
    public long mo6841e(int i) {
        m9828b(i, 4);
        return m9830h().mo6841e(i);
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: e */
    public C2284d mo6865e(int i, int i2) {
        m9828b(i, i2);
        return m9830h().mo6865e(i, i2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo7268e() {
        this.f6540c = true;
    }

    public boolean equals(Object obj) {
        return this == obj;
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: f */
    public byte mo6843f() {
        m9829c(1);
        return m9830h().mo6843f();
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: f */
    public C2284d mo6844f(int i) {
        m9829c(i);
        return m9830h().mo6844f(i);
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: f */
    public void mo6878f(int i, int i2) {
        throw new C2477d();
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: g */
    public C2284d mo6879g(int i, int i2) {
        m9828b(i, i2);
        return m9830h().mo6879g(i, i2);
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: g */
    public short mo6845g() {
        m9829c(1);
        return m9830h().mo6845g();
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: g */
    public void mo6846g(int i) {
        m9829c(i);
        m9830h().mo6846g(i);
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: h */
    public ByteBuffer mo6880h(int i, int i2) {
        m9828b(i, i2);
        return m9830h().mo6880h(i, i2);
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: h */
    public void mo6848h(int i) {
        throw new C2477d();
    }

    public int hashCode() {
        throw new C2477d();
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: i */
    public int mo6850i() {
        m9829c(2);
        return m9830h().mo6850i();
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: i */
    public void mo6851i(int i) {
        throw new C2477d();
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: j */
    public long mo6852j() {
        m9829c(8);
        return m9830h().mo6852j();
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: k */
    public short mo6866k(int i) {
        m9828b(i, 2);
        return m9830h().mo6866k(i);
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: l */
    public int mo6867l(int i) {
        m9828b(i, 4);
        return m9830h().mo6867l(i);
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: l */
    public C2284d mo6855l() {
        throw new C2477d();
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: m */
    public long mo6868m(int i) {
        m9828b(i, 8);
        return m9830h().mo6868m(i);
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: m */
    public ByteBuffer mo6856m() {
        throw new C2477d();
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: n */
    public byte mo6881n(int i) {
        m9828b(i, 1);
        return m9830h().mo6881n(i);
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: n */
    public ByteBuffer[] mo6857n() {
        throw new C2477d();
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: o */
    public C2285e mo6869o() {
        return m9830h().mo6869o();
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: p */
    public ByteOrder mo6870p() {
        return m9830h().mo6870p();
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: q */
    public C2284d mo6871q() {
        throw new C2477d();
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: r */
    public int mo6882r() {
        if (this.f6540c) {
            return m9830h().mo6882r();
        }
        return Integer.MAX_VALUE;
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: s */
    public boolean mo6883s() {
        return m9830h().mo6883s();
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: t */
    public byte[] mo6884t() {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + "ridx=" + mo6816a() + ", " + "widx=" + mo6829b() + ')';
    }
}
