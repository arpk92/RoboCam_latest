package org.p035a.p036a.p038b;

import java.nio.ByteOrder;

/* renamed from: org.a.a.b.b */
public abstract class C2282b implements C2285e {

    /* renamed from: a */
    private final ByteOrder f6094a;

    protected C2282b() {
        this(ByteOrder.BIG_ENDIAN);
    }

    protected C2282b(ByteOrder byteOrder) {
        if (byteOrder == null) {
            throw new NullPointerException("defaultOrder");
        }
        this.f6094a = byteOrder;
    }

    @Override // org.p035a.p036a.p038b.C2285e
    /* renamed from: a */
    public ByteOrder mo6859a() {
        return this.f6094a;
    }

    @Override // org.p035a.p036a.p038b.C2285e
    /* renamed from: a */
    public C2284d mo6860a(int i) {
        return mo6885a(mo6859a(), i);
    }

    @Override // org.p035a.p036a.p038b.C2285e
    /* renamed from: a */
    public C2284d mo6861a(byte[] bArr, int i, int i2) {
        return mo6886a(mo6859a(), bArr, i, i2);
    }
}
