package org.p035a.p036a.p038b;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.p035a.p036a.p054f.p055a.C2531e;

/* renamed from: org.a.a.b.g */
public class C2287g extends C2281a {

    /* renamed from: a */
    static final /* synthetic */ boolean f6099a = (!C2287g.class.desiredAssertionStatus());

    /* renamed from: b */
    private final ByteOrder f6100b;

    /* renamed from: c */
    private C2284d[] f6101c;

    /* renamed from: d */
    private int[] f6102d;

    /* renamed from: e */
    private int f6103e;

    /* renamed from: f */
    private final boolean f6104f;

    public C2287g(ByteOrder byteOrder, List<C2284d> list, boolean z) {
        this.f6100b = byteOrder;
        this.f6104f = z;
        m8950a(list);
    }

    private C2287g(C2287g gVar) {
        this.f6100b = gVar.f6100b;
        this.f6104f = gVar.f6104f;
        this.f6101c = (C2284d[]) gVar.f6101c.clone();
        this.f6102d = (int[]) gVar.f6102d.clone();
        mo6821a(gVar.mo6816a(), gVar.mo6829b());
    }

    /* renamed from: a */
    private void m8949a(int i, int i2, int i3, C2284d dVar) {
        int i4 = 0;
        while (i2 > 0) {
            C2284d dVar2 = this.f6101c[i3];
            int i5 = this.f6102d[i3];
            int min = Math.min(i2, dVar2.mo6882r() - (i - i5));
            dVar2.mo6873a(i - i5, dVar, i4, min);
            i += min;
            i4 += min;
            i2 -= min;
            i3++;
        }
        dVar.mo6831b(dVar.mo6882r());
    }

    /* renamed from: a */
    private void m8950a(List<C2284d> list) {
        if (f6099a || !list.isEmpty()) {
            this.f6103e = 0;
            this.f6101c = new C2284d[list.size()];
            int i = 0;
            while (i < this.f6101c.length) {
                C2284d dVar = list.get(i);
                if (dVar.mo6870p() != mo6870p()) {
                    throw new IllegalArgumentException("All buffers must have the same endianness.");
                } else if (!f6099a && dVar.mo6816a() != 0) {
                    throw new AssertionError();
                } else if (f6099a || dVar.mo6829b() == dVar.mo6882r()) {
                    this.f6101c[i] = dVar;
                    i++;
                } else {
                    throw new AssertionError();
                }
            }
            this.f6102d = new int[(this.f6101c.length + 1)];
            this.f6102d[0] = 0;
            for (int i2 = 1; i2 <= this.f6101c.length; i2++) {
                this.f6102d[i2] = this.f6102d[i2 - 1] + this.f6101c[i2 - 1].mo6882r();
            }
            mo6821a(0, mo6882r());
            return;
        }
        throw new AssertionError();
    }

    /* renamed from: o */
    private int m8951o(int i) {
        int i2 = this.f6103e;
        if (i < this.f6102d[i2]) {
            i2--;
            while (i2 >= 0) {
                if (i >= this.f6102d[i2]) {
                    this.f6103e = i2;
                } else {
                    i2--;
                }
            }
            throw new IndexOutOfBoundsException("Invalid index: " + i + ", maximum: " + this.f6102d.length);
        } else if (i >= this.f6102d[i2 + 1]) {
            while (true) {
                i2++;
                if (i2 >= this.f6101c.length) {
                    break;
                } else if (i < this.f6102d[i2 + 1]) {
                    this.f6103e = i2;
                    break;
                }
            }
        }
        return i2;
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: a */
    public void mo6862a(int i, long j) {
        int o = m8951o(i);
        if (i + 8 <= this.f6102d[o + 1]) {
            this.f6101c[o].mo6862a(i - this.f6102d[o], j);
        } else if (mo6870p() == ByteOrder.BIG_ENDIAN) {
            mo6864d(i, (int) (j >>> 32));
            mo6864d(i + 4, (int) j);
        } else {
            mo6864d(i, (int) j);
            mo6864d(i + 4, (int) (j >>> 32));
        }
    }

    /* JADX INFO: finally extract failed */
    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: a */
    public void mo6872a(int i, ByteBuffer byteBuffer) {
        int o = m8951o(i);
        int limit = byteBuffer.limit();
        int remaining = byteBuffer.remaining();
        if (i > mo6882r() - remaining) {
            throw new IndexOutOfBoundsException("Too many bytes to be read - Needs " + (remaining + i) + ", maximum is " + mo6882r());
        }
        while (remaining > 0) {
            try {
                C2284d dVar = this.f6101c[o];
                int i2 = this.f6102d[o];
                int min = Math.min(remaining, dVar.mo6882r() - (i - i2));
                byteBuffer.limit(byteBuffer.position() + min);
                dVar.mo6872a(i - i2, byteBuffer);
                i += min;
                remaining -= min;
                o++;
            } catch (Throwable th) {
                byteBuffer.limit(limit);
                throw th;
            }
        }
        byteBuffer.limit(limit);
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: a */
    public void mo6873a(int i, C2284d dVar, int i2, int i3) {
        int o = m8951o(i);
        if (i > mo6882r() - i3 || i2 > dVar.mo6882r() - i3) {
            throw new IndexOutOfBoundsException("Too many bytes to be read - Needs " + (i + i3) + " or " + (i2 + i3) + ", maximum is " + mo6882r() + " or " + dVar.mo6882r());
        }
        while (i3 > 0) {
            C2284d dVar2 = this.f6101c[o];
            int i4 = this.f6102d[o];
            int min = Math.min(i3, dVar2.mo6882r() - (i - i4));
            dVar2.mo6873a(i - i4, dVar, i2, min);
            i += min;
            i2 += min;
            i3 -= min;
            o++;
        }
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: a */
    public void mo6874a(int i, byte[] bArr, int i2, int i3) {
        int o = m8951o(i);
        if (i > mo6882r() - i3 || i2 > bArr.length - i3) {
            throw new IndexOutOfBoundsException("Too many bytes to read - Needs " + (i + i3) + ", maximum is " + mo6882r() + " or " + bArr.length);
        }
        while (i3 > 0) {
            C2284d dVar = this.f6101c[o];
            int i4 = this.f6102d[o];
            int min = Math.min(i3, dVar.mo6882r() - (i - i4));
            dVar.mo6874a(i - i4, bArr, i2, min);
            i += min;
            i2 += min;
            i3 -= min;
            o++;
        }
    }

    /* JADX INFO: finally extract failed */
    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: b */
    public void mo6875b(int i, ByteBuffer byteBuffer) {
        int o = m8951o(i);
        int limit = byteBuffer.limit();
        int remaining = byteBuffer.remaining();
        if (i > mo6882r() - remaining) {
            throw new IndexOutOfBoundsException("Too many bytes to be written - Needs " + (remaining + i) + ", maximum is " + mo6882r());
        }
        while (remaining > 0) {
            try {
                C2284d dVar = this.f6101c[o];
                int i2 = this.f6102d[o];
                int min = Math.min(remaining, dVar.mo6882r() - (i - i2));
                byteBuffer.limit(byteBuffer.position() + min);
                dVar.mo6875b(i - i2, byteBuffer);
                i += min;
                remaining -= min;
                o++;
            } catch (Throwable th) {
                byteBuffer.limit(limit);
                throw th;
            }
        }
        byteBuffer.limit(limit);
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: b */
    public void mo6876b(int i, C2284d dVar, int i2, int i3) {
        int o = m8951o(i);
        if (i > mo6882r() - i3 || i2 > dVar.mo6882r() - i3) {
            throw new IndexOutOfBoundsException("Too many bytes to be written - Needs " + (i + i3) + " or " + (i2 + i3) + ", maximum is " + mo6882r() + " or " + dVar.mo6882r());
        }
        while (i3 > 0) {
            C2284d dVar2 = this.f6101c[o];
            int i4 = this.f6102d[o];
            int min = Math.min(i3, dVar2.mo6882r() - (i - i4));
            dVar2.mo6876b(i - i4, dVar, i2, min);
            i += min;
            i2 += min;
            i3 -= min;
            o++;
        }
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: b */
    public void mo6877b(int i, byte[] bArr, int i2, int i3) {
        int o = m8951o(i);
        if (i > mo6882r() - i3 || i2 > bArr.length - i3) {
            throw new IndexOutOfBoundsException("Too many bytes to read - needs " + (i + i3) + " or " + (i2 + i3) + ", maximum is " + mo6882r() + " or " + bArr.length);
        }
        while (i3 > 0) {
            C2284d dVar = this.f6101c[o];
            int i4 = this.f6102d[o];
            int min = Math.min(i3, dVar.mo6882r() - (i - i4));
            dVar.mo6877b(i - i4, bArr, i2, min);
            i += min;
            i2 += min;
            i3 -= min;
            o++;
        }
    }

    @Override // org.p035a.p036a.p038b.C2281a
    /* renamed from: b */
    public ByteBuffer[] mo6834b(int i, int i2) {
        int o = m8951o(i);
        if (i + i2 > mo6882r()) {
            throw new IndexOutOfBoundsException("Too many bytes to convert - Needs" + (i + i2) + ", maximum is " + mo6882r());
        }
        ArrayList arrayList = new ArrayList(this.f6101c.length);
        while (i2 > 0) {
            C2284d dVar = this.f6101c[o];
            int i3 = this.f6102d[o];
            int min = Math.min(i2, dVar.mo6882r() - (i - i3));
            arrayList.add(dVar.mo6880h(i - i3, min));
            i += min;
            i2 -= min;
            o++;
        }
        return (ByteBuffer[]) arrayList.toArray(new ByteBuffer[arrayList.size()]);
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: c */
    public void mo6863c(int i, int i2) {
        int o = m8951o(i);
        if (i + 2 <= this.f6102d[o + 1]) {
            this.f6101c[o].mo6863c(i - this.f6102d[o], i2);
        } else if (mo6870p() == ByteOrder.BIG_ENDIAN) {
            mo6878f(i, (byte) (i2 >>> 8));
            mo6878f(i + 1, (byte) i2);
        } else {
            mo6878f(i, (byte) i2);
            mo6878f(i + 1, (byte) (i2 >>> 8));
        }
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: d */
    public void mo6864d(int i, int i2) {
        int o = m8951o(i);
        if (i + 4 <= this.f6102d[o + 1]) {
            this.f6101c[o].mo6864d(i - this.f6102d[o], i2);
        } else if (mo6870p() == ByteOrder.BIG_ENDIAN) {
            mo6863c(i, (short) (i2 >>> 16));
            mo6863c(i + 2, (short) i2);
        } else {
            mo6863c(i, (short) i2);
            mo6863c(i + 2, (short) (i2 >>> 16));
        }
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: e */
    public C2284d mo6865e(int i, int i2) {
        int o = m8951o(i);
        if (i > mo6882r() - i2) {
            throw new IndexOutOfBoundsException("Too many bytes to copy - Needs " + (i + i2) + ", maximum is " + mo6882r());
        }
        C2284d a = mo6869o().mo6885a(mo6870p(), i2);
        m8949a(i, i2, o, a);
        return a;
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: f */
    public void mo6878f(int i, int i2) {
        int o = m8951o(i);
        this.f6101c[o].mo6878f(i - this.f6102d[o], i2);
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: g */
    public C2284d mo6879g(int i, int i2) {
        if (i == 0) {
            if (i2 == 0) {
                return C2286f.f6097c;
            }
        } else if (i < 0 || i > mo6882r() - i2) {
            throw new IndexOutOfBoundsException("Invalid index: " + i + " - Bytes needed: " + (i + i2) + ", maximum is " + mo6882r());
        } else if (i2 == 0) {
            return C2286f.f6097c;
        }
        List<C2284d> i3 = mo6887i(i, i2);
        switch (i3.size()) {
            case 0:
                return C2286f.f6097c;
            case 1:
                return i3.get(0);
            default:
                return new C2287g(mo6870p(), i3, this.f6104f);
        }
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: h */
    public ByteBuffer mo6880h(int i, int i2) {
        if (this.f6101c.length == 1) {
            return this.f6101c[0].mo6880h(i, i2);
        }
        ByteBuffer[] b = mo6834b(i, i2);
        ByteBuffer order = ByteBuffer.allocate(i2).order(mo6870p());
        for (ByteBuffer byteBuffer : b) {
            order.put(byteBuffer);
        }
        order.flip();
        return order;
    }

    /* renamed from: i */
    public List<C2284d> mo6887i(int i, int i2) {
        if (i2 == 0) {
            return Collections.emptyList();
        }
        if (i + i2 > mo6882r()) {
            throw new IndexOutOfBoundsException("Too many bytes to decompose - Need " + (i + i2) + ", capacity is " + mo6882r());
        }
        int o = m8951o(i);
        ArrayList arrayList = new ArrayList(this.f6101c.length);
        C2284d q = this.f6101c[o].mo6871q();
        q.mo6820a(i - this.f6102d[o]);
        while (true) {
            int d = q.mo6838d();
            if (i2 > d) {
                arrayList.add(q);
                i2 -= d;
                o++;
                q = this.f6101c[o].mo6871q();
                if (i2 <= 0) {
                    break;
                }
            } else {
                q.mo6831b(q.mo6816a() + i2);
                arrayList.add(q);
                break;
            }
        }
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            arrayList.set(i3, ((C2284d) arrayList.get(i3)).mo6855l());
        }
        return arrayList;
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: k */
    public short mo6866k(int i) {
        int o = m8951o(i);
        return i + 2 <= this.f6102d[o + 1] ? this.f6101c[o].mo6866k(i - this.f6102d[o]) : mo6870p() == ByteOrder.BIG_ENDIAN ? (short) (((mo6881n(i) & 255) << 8) | (mo6881n(i + 1) & 255)) : (short) ((mo6881n(i) & 255) | ((mo6881n(i + 1) & 255) << 8));
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: l */
    public int mo6867l(int i) {
        int o = m8951o(i);
        return i + 4 <= this.f6102d[o + 1] ? this.f6101c[o].mo6867l(i - this.f6102d[o]) : mo6870p() == ByteOrder.BIG_ENDIAN ? ((mo6866k(i) & 65535) << 16) | (mo6866k(i + 2) & 65535) : (mo6866k(i) & 65535) | ((mo6866k(i + 2) & 65535) << 16);
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: m */
    public long mo6868m(int i) {
        int o = m8951o(i);
        return i + 8 <= this.f6102d[o + 1] ? this.f6101c[o].mo6868m(i - this.f6102d[o]) : mo6870p() == ByteOrder.BIG_ENDIAN ? ((((long) mo6867l(i)) & 4294967295L) << 32) | (((long) mo6867l(i + 4)) & 4294967295L) : (((long) mo6867l(i)) & 4294967295L) | ((((long) mo6867l(i + 4)) & 4294967295L) << 32);
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: n */
    public byte mo6881n(int i) {
        int o = m8951o(i);
        return this.f6101c[o].mo6881n(i - this.f6102d[o]);
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: o */
    public C2285e mo6869o() {
        return C2291k.m9045a(mo6870p());
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: p */
    public ByteOrder mo6870p() {
        return this.f6100b;
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: q */
    public C2284d mo6871q() {
        C2287g gVar = new C2287g(this);
        gVar.mo6821a(mo6816a(), mo6829b());
        return gVar;
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: r */
    public int mo6882r() {
        return this.f6102d[this.f6101c.length];
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: s */
    public boolean mo6883s() {
        return false;
    }

    @Override // org.p035a.p036a.p038b.C2284d
    /* renamed from: t */
    public byte[] mo6884t() {
        throw new UnsupportedOperationException();
    }

    @Override // org.p035a.p036a.p038b.C2281a
    public String toString() {
        String aVar = super.toString();
        return aVar.substring(0, aVar.length() - 1) + ", components=" + this.f6101c.length + ")";
    }

    /* renamed from: u */
    public boolean mo6888u() {
        return this.f6104f && C2531e.m10054a() >= 7;
    }

    /* renamed from: v */
    public int mo6889v() {
        return this.f6101c.length;
    }
}
