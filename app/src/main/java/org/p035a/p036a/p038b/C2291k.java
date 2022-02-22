package org.p035a.p036a.p038b;

import java.nio.ByteOrder;

/* renamed from: org.a.a.b.k */
public class C2291k extends C2282b {

    /* renamed from: a */
    private static final C2291k f6110a = new C2291k(ByteOrder.BIG_ENDIAN);

    /* renamed from: b */
    private static final C2291k f6111b = new C2291k(ByteOrder.LITTLE_ENDIAN);

    public C2291k() {
    }

    public C2291k(ByteOrder byteOrder) {
        super(byteOrder);
    }

    /* renamed from: a */
    public static C2285e m9045a(ByteOrder byteOrder) {
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            return f6110a;
        }
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            return f6111b;
        }
        if (byteOrder == null) {
            throw new NullPointerException("endianness");
        }
        throw new IllegalStateException("Should not reach here");
    }

    /* renamed from: b */
    public static C2285e m9046b() {
        return f6110a;
    }

    @Override // org.p035a.p036a.p038b.C2285e
    /* renamed from: a */
    public C2284d mo6885a(ByteOrder byteOrder, int i) {
        return C2286f.m8926a(byteOrder, i);
    }

    @Override // org.p035a.p036a.p038b.C2285e
    /* renamed from: a */
    public C2284d mo6886a(ByteOrder byteOrder, byte[] bArr, int i, int i2) {
        return C2286f.m8932a(byteOrder, bArr, i, i2);
    }
}
