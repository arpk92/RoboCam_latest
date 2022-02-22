package org.p035a.p036a.p038b;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.util.ArrayList;
import java.util.List;
import org.p035a.p036a.p054f.C2496a;

@SuppressWarnings("ALL")
/* renamed from: org.a.a.b.f */
public final class C2286f {

    /* renamed from: a */
    public static final ByteOrder f6095a = ByteOrder.BIG_ENDIAN;

    /* renamed from: b */
    public static final ByteOrder f6096b = ByteOrder.LITTLE_ENDIAN;

    /* renamed from: c */
    public static final C2284d f6097c = new C2283c(0);

    /* renamed from: d */
    private static final char[] f6098d = new char[1024];

    static {
        char[] charArray = "0123456789abcdef".toCharArray();
        for (int i = 0; i < 256; i++) {
            f6098d[i << 1] = charArray[(i >>> 4) & 15];
            f6098d[(i << 1) + 1] = charArray[i & 15];
        }
    }

    /* renamed from: a */
    public static int m8917a(C2284d dVar, int i, int i2, byte b) {
        return i <= i2 ? m8941b(dVar, i, i2, b) : m8948c(dVar, i, i2, b);
    }

    /* renamed from: a */
    public static long m8918a(long j) {
        return (((long) m8940b((int) j)) << 32) | (((long) m8940b((int) (j >>> 32))) & 4294967295L);
    }

    /* renamed from: a */
    static String m8919a(ByteBuffer byteBuffer, Charset charset) {
        CharsetDecoder b = C2496a.m9951b(charset);
        CharBuffer allocate = CharBuffer.allocate((int) (((double) byteBuffer.remaining()) * ((double) b.maxCharsPerByte())));
        try {
            CoderResult decode = b.decode(byteBuffer, allocate, true);
            if (!decode.isUnderflow()) {
                decode.throwException();
            }
            CoderResult flush = b.flush(allocate);
            if (!flush.isUnderflow()) {
                flush.throwException();
            }
            return allocate.flip().toString();
        } catch (CharacterCodingException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: a */
    public static String m8920a(C2284d dVar, int i, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("length: " + i2);
        } else if (i2 == 0) {
            return "";
        } else {
            int i3 = i + i2;
            char[] cArr = new char[(i2 << 1)];
            int i4 = 0;
            while (i < i3) {
                System.arraycopy(f6098d, dVar.mo6839d(i) << 1, cArr, i4, 2);
                i++;
                i4 += 2;
            }
            return new String(cArr);
        }
    }

    /* renamed from: a */
    static ByteBuffer m8921a(CharBuffer charBuffer, Charset charset) {
        CharsetEncoder a = C2496a.m9950a(charset);
        ByteBuffer allocate = ByteBuffer.allocate((int) (((double) charBuffer.remaining()) * ((double) a.maxBytesPerChar())));
        try {
            CoderResult encode = a.encode(charBuffer, allocate, true);
            if (!encode.isUnderflow()) {
                encode.throwException();
            }
            CoderResult flush = a.flush(allocate);
            if (!flush.isUnderflow()) {
                flush.throwException();
            }
            allocate.flip();
            return allocate;
        } catch (CharacterCodingException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: a */
    public static C2284d m8922a() {
        return m8944b(f6095a, 256);
    }

    /* renamed from: a */
    public static C2284d m8923a(int i) {
        return m8926a(f6095a, i);
    }

    /* renamed from: a */
    public static C2284d m8924a(int i, C2285e eVar) {
        if (eVar != null) {
            return new C2289i(eVar.mo6859a(), i, eVar);
        }
        throw new NullPointerException("factory");
    }

    /* renamed from: a */
    public static C2284d m8925a(CharSequence charSequence, Charset charset) {
        return m8928a(f6095a, charSequence, charset);
    }

    /* renamed from: a */
    public static C2284d m8926a(ByteOrder byteOrder, int i) {
        if (byteOrder == f6095a) {
            return i == 0 ? f6097c : new C2283c(i);
        }
        if (byteOrder == f6096b) {
            return i == 0 ? f6097c : new C2292l(i);
        }
        throw new NullPointerException("endianness");
    }

    /* renamed from: a */
    public static C2284d m8927a(ByteOrder byteOrder, int i, C2285e eVar) {
        return new C2289i(byteOrder, i, eVar);
    }

    /* renamed from: a */
    public static C2284d m8928a(ByteOrder byteOrder, CharSequence charSequence, Charset charset) {
        if (charSequence != null) {
            return charSequence instanceof CharBuffer ? m8929a(byteOrder, (CharBuffer) charSequence, charset) : m8929a(byteOrder, CharBuffer.wrap(charSequence), charset);
        }
        throw new NullPointerException("string");
    }

    /* renamed from: a */
    private static C2284d m8929a(ByteOrder byteOrder, CharBuffer charBuffer, Charset charset) {
        ByteBuffer a = m8921a(charBuffer, charset);
        C2284d a2 = m8931a(byteOrder, a.array());
        a2.mo6831b(a.remaining());
        return a2;
    }

    /* renamed from: a */
    private static C2284d m8930a(ByteOrder byteOrder, List<C2284d> list, boolean z) {
        switch (list.size()) {
            case 0:
                return f6097c;
            case 1:
                return list.get(0);
            default:
                return new C2287g(byteOrder, list, z);
        }
    }

    /* renamed from: a */
    public static C2284d m8931a(ByteOrder byteOrder, byte[] bArr) {
        if (byteOrder == f6095a) {
            return bArr.length == 0 ? f6097c : new C2283c(bArr);
        }
        if (byteOrder == f6096b) {
            return bArr.length == 0 ? f6097c : new C2292l(bArr);
        }
        throw new NullPointerException("endianness");
    }

    /* renamed from: a */
    public static C2284d m8932a(ByteOrder byteOrder, byte[] bArr, int i, int i2) {
        if (byteOrder != null) {
            return i == 0 ? i2 == bArr.length ? m8931a(byteOrder, bArr) : i2 == 0 ? f6097c : new C2294n(m8931a(byteOrder, bArr), i2) : i2 == 0 ? f6097c : new C2293m(m8931a(byteOrder, bArr), i, i2);
        }
        throw new NullPointerException("endianness");
    }

    /* renamed from: a */
    public static C2284d m8933a(C2284d dVar) {
        return dVar.mo6836c() ? dVar.mo6855l() : f6097c;
    }

    /* renamed from: a */
    public static C2284d m8934a(C2285e eVar) {
        if (eVar != null) {
            return new C2289i(eVar.mo6859a(), 256, eVar);
        }
        throw new NullPointerException("factory");
    }

    /* renamed from: a */
    public static C2284d m8935a(boolean z, C2284d... dVarArr) {
        ByteOrder byteOrder;
        switch (dVarArr.length) {
            case 0:
                break;
            default:
                ArrayList arrayList = new ArrayList(dVarArr.length);
                int length = dVarArr.length;
                int i = 0;
                ByteOrder byteOrder2 = null;
                while (i < length) {
                    C2284d dVar = dVarArr[i];
                    if (dVar == null) {
                        return m8930a(byteOrder2, arrayList, z);
                    }
                    if (dVar.mo6836c()) {
                        if (byteOrder2 == null) {
                            byteOrder = dVar.mo6870p();
                        } else if (!byteOrder2.equals(dVar.mo6870p())) {
                            throw new IllegalArgumentException("inconsistent byte order");
                        } else {
                            byteOrder = byteOrder2;
                        }
                        if (dVar instanceof C2287g) {
                            arrayList.addAll(((C2287g) dVar).mo6887i(dVar.mo6816a(), dVar.mo6838d()));
                        } else {
                            arrayList.add(dVar.mo6855l());
                        }
                    } else {
                        byteOrder = byteOrder2;
                    }
                    i++;
                    byteOrder2 = byteOrder;
                }
                return m8930a(byteOrder2, arrayList, z);
            case 1:
                if (dVarArr[0].mo6836c()) {
                    return m8933a(dVarArr[0]);
                }
                break;
        }
        return f6097c;
    }

    /* renamed from: a */
    public static C2284d m8936a(byte[] bArr) {
        return m8931a(f6095a, bArr);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: org.a.a.b.f.a(boolean, org.a.a.b.d[]):org.a.a.b.d
     arg types: [int, org.a.a.b.d[]]
     candidates:
      org.a.a.b.f.a(java.nio.ByteBuffer, java.nio.charset.Charset):java.lang.String
      org.a.a.b.f.a(java.nio.CharBuffer, java.nio.charset.Charset):java.nio.ByteBuffer
      org.a.a.b.f.a(int, org.a.a.b.e):org.a.a.b.d
      org.a.a.b.f.a(java.lang.CharSequence, java.nio.charset.Charset):org.a.a.b.d
      org.a.a.b.f.a(java.nio.ByteOrder, int):org.a.a.b.d
      org.a.a.b.f.a(java.nio.ByteOrder, byte[]):org.a.a.b.d
      org.a.a.b.f.a(org.a.a.b.d, org.a.a.b.d):boolean
      org.a.a.b.f.a(boolean, org.a.a.b.d[]):org.a.a.b.d */
    /* renamed from: a */
    public static C2284d m8937a(C2284d... dVarArr) {
        return m8935a(false, dVarArr);
    }

    /* renamed from: a */
    public static short m8938a(short s) {
        return (short) ((s << 8) | ((s >>> 8) & 255));
    }

    /* renamed from: a */
    public static boolean m8939a(C2284d dVar, C2284d dVar2) {
        int i = 0;
        int i2 = 0;
        int d = dVar.mo6838d();
        if (d != dVar2.mo6838d()) {
            return false;
        }
        int i3 = d >>> 3;
        int i4 = d & 7;
        int a = dVar.mo6816a();
        int a2 = dVar2.mo6816a();
        if (dVar.mo6870p() == dVar2.mo6870p()) {
            i2 = a2;
            i = a;
            int i5 = i3;
            while (i5 > 0) {
                if (dVar.mo6868m(i) != dVar2.mo6868m(i2)) {
                    return false;
                }
                i5--;
                i2 += 8;
                i += 8;
            }
        } else {
            int i6 = a2;
            int i7 = a;
            int i8 = i3;
            while (i8 > 0) {
                if (dVar.mo6868m(i) != m8918a(dVar2.mo6868m(i2))) {
                    return false;
                }
                i8--;
                i6 = i2 + 8;
                i7 = i + 8;
            }
        }
        int i9 = i;
        int i10 = i2;
        for (int i11 = i4; i11 > 0; i11--) {
            if (dVar.mo6881n(i9) != dVar2.mo6881n(i10)) {
                return false;
            }
            i9++;
            i10++;
        }
        return true;
    }

    /* renamed from: b */
    public static int m8940b(int i) {
        return (m8938a((short) i) << 16) | (m8938a((short) (i >>> 16)) & 65535);
    }

    /* renamed from: b */
    private static int m8941b(C2284d dVar, int i, int i2, byte b) {
        int max = Math.max(i, 0);
        if (max >= i2 || dVar.mo6882r() == 0) {
            return -1;
        }
        while (max < i2) {
            if (dVar.mo6881n(max) == b) {
                return max;
            }
            max++;
        }
        return -1;
    }

    /* renamed from: b */
    public static int m8942b(C2284d dVar, C2284d dVar2) {
        int i = 0;
        int i2 = 0;
        int d = dVar.mo6838d();
        int d2 = dVar2.mo6838d();
        int min = Math.min(d, d2);
        int i3 = min >>> 2;
        int i4 = min & 3;
        int a = dVar.mo6816a();
        int a2 = dVar2.mo6816a();
        if (dVar.mo6870p() == dVar2.mo6870p()) {
            i2 = a2;
            i = a;
            int i5 = i3;
            while (i5 > 0) {
                long e = dVar.mo6841e(i);
                long e2 = dVar2.mo6841e(i2);
                if (e > e2) {
                    return 1;
                }
                if (e < e2) {
                    return -1;
                }
                i5--;
                i2 += 4;
                i += 4;
            }
        } else {
            int i6 = a2;
            int i7 = a;
            int i8 = i3;
            while (i8 > 0) {
                long e3 = dVar.mo6841e(i);
                long b = ((long) m8940b(dVar2.mo6867l(i2))) & 4294967295L;
                if (e3 > b) {
                    return 1;
                }
                if (e3 < b) {
                    return -1;
                }
                i8--;
                i6 = i2 + 4;
                i7 = i + 4;
            }
        }
        int i9 = i;
        int i10 = i2;
        for (int i11 = i4; i11 > 0; i11--) {
            short d3 = dVar.mo6839d(i9);
            short d4 = dVar2.mo6839d(i10);
            if (d3 > d4) {
                return 1;
            }
            if (d3 < d4) {
                return -1;
            }
            i9++;
            i10++;
        }
        return d - d2;
    }

    /* renamed from: b */
    public static String m8943b(C2284d dVar) {
        return m8920a(dVar, dVar.mo6816a(), dVar.mo6838d());
    }

    /* renamed from: b */
    public static C2284d m8944b(ByteOrder byteOrder, int i) {
        return new C2289i(byteOrder, i);
    }

    /* renamed from: b */
    public static C2284d m8945b(ByteOrder byteOrder, byte[] bArr) {
        if (byteOrder == f6095a) {
            return bArr.length == 0 ? f6097c : new C2283c((byte[]) bArr.clone());
        }
        if (byteOrder == f6096b) {
            return bArr.length == 0 ? f6097c : new C2292l((byte[]) bArr.clone());
        }
        throw new NullPointerException("endianness");
    }

    /* renamed from: b */
    public static C2284d m8946b(byte[] bArr) {
        return m8945b(f6095a, bArr);
    }

    /* renamed from: c */
    public static int m8947c(C2284d dVar) {
        int i = 0;
        int i2 = 0;
        int d = dVar.mo6838d();
        int i3 = d >>> 2;
        int i4 = d & 3;
        int a = dVar.mo6816a();
        if (dVar.mo6870p() == f6095a) {
            int i5 = i3;
            i2 = a;
            i = 1;
            while (i5 > 0) {
                int l = dVar.mo6867l(i2) + (i * 31);
                i5--;
                i2 += 4;
                i = l;
            }
        } else {
            int i6 = i3;
            int i7 = a;
            int i8 = 1;
            while (i6 > 0) {
                int b = m8940b(dVar.mo6867l(i2)) + (i * 31);
                i6--;
                i7 = i2 + 4;
                i8 = b;
            }
        }
        int i9 = i2;
        int i10 = i;
        int i11 = i4;
        while (i11 > 0) {
            i11--;
            i10 = dVar.mo6881n(i9) + (i10 * 31);
            i9++;
        }
        if (i10 == 0) {
            return 1;
        }
        return i10;
    }

    /* renamed from: c */
    private static int m8948c(C2284d dVar, int i, int i2, byte b) {
        int min = Math.min(i, dVar.mo6882r());
        if (min < 0 || dVar.mo6882r() == 0) {
            return -1;
        }
        for (int i3 = min - 1; i3 >= i2; i3--) {
            if (dVar.mo6881n(i3) == b) {
                return i3;
            }
        }
        return -1;
    }
}
