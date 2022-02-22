package org.p035a.p036a.p054f.p055a.p056a;

import org.p035a.p036a.p054f.p055a.p056a.C2510h;

/* renamed from: org.a.a.f.a.a.k */
public final class C2514k {

    /* renamed from: a */
    public byte[] f6761a;

    /* renamed from: b */
    public int f6762b;

    /* renamed from: c */
    public int f6763c;

    /* renamed from: d */
    public long f6764d;

    /* renamed from: e */
    public byte[] f6765e;

    /* renamed from: f */
    public int f6766f;

    /* renamed from: g */
    public int f6767g;

    /* renamed from: h */
    public long f6768h;

    /* renamed from: i */
    public String f6769i;

    /* renamed from: j */
    C2502c f6770j;

    /* renamed from: k */
    C2508g f6771k;

    /* renamed from: l */
    long f6772l;

    /* renamed from: m */
    int f6773m;

    /* renamed from: a */
    public int mo7312a() {
        if (this.f6771k == null) {
            return -2;
        }
        int a = this.f6771k.mo7308a(this);
        this.f6771k = null;
        return a;
    }

    /* renamed from: a */
    public int mo7313a(int i) {
        if (this.f6771k == null) {
            return -2;
        }
        return this.f6771k.mo7309a(this, i);
    }

    /* renamed from: a */
    public int mo7314a(int i, int i2, int i3, Enum enumR) {
        this.f6770j = new C2502c();
        return this.f6770j.mo7297a(this, i, i2, i3, (C2510h.C2511a) enumR);
    }

    /* renamed from: a */
    public int mo7315a(int i, Enum enumR) {
        this.f6771k = new C2508g();
        return this.f6771k.mo7310a(this, i, (C2510h.C2511a) enumR);
    }

    /* renamed from: a */
    public int mo7316a(Enum<?> enumR) {
        return mo7315a(15, enumR);
    }

    /* renamed from: a */
    public int mo7317a(byte[] bArr, int i) {
        if (this.f6771k == null) {
            return -2;
        }
        return C2508g.m10005a(this, bArr, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo7318a(byte[] bArr, int i, int i2) {
        int i3 = this.f6763c;
        if (i3 > i2) {
            i3 = i2;
        }
        if (i3 == 0) {
            return 0;
        }
        this.f6763c -= i3;
        switch (this.f6770j.f6641g) {
            case ZLIB:
                this.f6772l = C2500a.m9955a(this.f6772l, this.f6761a, this.f6762b, i3);
                break;
            case GZIP:
                this.f6773m = C2501b.m9956a(this.f6773m, this.f6761a, this.f6762b, i3);
                break;
        }
        System.arraycopy(this.f6761a, this.f6762b, bArr, i, i3);
        this.f6762b += i3;
        this.f6764d += (long) i3;
        return i3;
    }

    /* renamed from: b */
    public int mo7319b() {
        if (this.f6770j == null) {
            return -2;
        }
        int a = this.f6770j.mo7295a();
        this.f6770j = null;
        return a;
    }

    /* renamed from: b */
    public int mo7320b(int i) {
        if (this.f6770j == null) {
            return -2;
        }
        return this.f6770j.mo7296a(this, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo7321c() {
        int i = this.f6770j.f6640f;
        if (i > this.f6767g) {
            i = this.f6767g;
        }
        if (i != 0) {
            if (this.f6770j.f6637c.length <= this.f6770j.f6639e || this.f6765e.length <= this.f6766f || this.f6770j.f6637c.length < this.f6770j.f6639e + i || this.f6765e.length < this.f6766f + i) {
                System.out.println(this.f6770j.f6637c.length + ", " + this.f6770j.f6639e + ", " + this.f6765e.length + ", " + this.f6766f + ", " + i);
                System.out.println("avail_out=" + this.f6767g);
            }
            System.arraycopy(this.f6770j.f6637c, this.f6770j.f6639e, this.f6765e, this.f6766f, i);
            this.f6766f += i;
            this.f6770j.f6639e += i;
            this.f6768h += (long) i;
            this.f6767g -= i;
            this.f6770j.f6640f -= i;
            if (this.f6770j.f6640f == 0) {
                this.f6770j.f6639e = 0;
            }
        }
    }
}
