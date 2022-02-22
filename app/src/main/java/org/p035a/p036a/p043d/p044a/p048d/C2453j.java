package org.p035a.p036a.p043d.p044a.p048d;

import org.p035a.p036a.p043d.p044a.p045a.C2416b;
import org.p035a.p036a.p043d.p044a.p045a.C2420d;
import org.p035a.p036a.p043d.p044a.p045a.C2425f;
import org.p035a.p036a.p043d.p044a.p046b.C2434g;
import org.p035a.p036a.p054f.p055a.C2531e;

/* renamed from: org.a.a.d.a.d.j */
public class C2453j extends C2457m {

    /* renamed from: b */
    private final int f6421b;

    /* renamed from: c */
    private final int f6422c;

    /* renamed from: d */
    private final int f6423d;

    public C2453j() {
        this(6);
    }

    public C2453j(int i) {
        this(i, 15, 8);
    }

    public C2453j(int i, int i2, int i3) {
        if (i < 0 || i > 9) {
            throw new IllegalArgumentException("compressionLevel: " + i + " (expected: 0-9)");
        } else if (i2 < 9 || i2 > 15) {
            throw new IllegalArgumentException("windowBits: " + i2 + " (expected: 9-15)");
        } else if (i3 < 1 || i3 > 9) {
            throw new IllegalArgumentException("memLevel: " + i3 + " (expected: 1-9)");
        } else {
            this.f6421b = i;
            this.f6422c = i2;
            this.f6423d = i3;
        }
    }

    /* renamed from: b */
    private static C2425f m9705b(String str) {
        float f;
        float f2;
        String[] split = str.split(",");
        int length = split.length;
        int i = 0;
        float f3 = -1.0f;
        float f4 = -1.0f;
        float f5 = -1.0f;
        while (i < length) {
            String str2 = split[i];
            float f6 = 1.0f;
            int indexOf = str2.indexOf(61);
            if (indexOf != -1) {
                try {
                    f6 = Float.valueOf(str2.substring(indexOf + 1)).floatValue();
                } catch (NumberFormatException e) {
                    f6 = 0.0f;
                }
            }
            if (str2.indexOf("*") >= 0) {
                f = f4;
                f2 = f6;
                f6 = f3;
            } else if (str2.indexOf("gzip") >= 0 && f6 > f4) {
                f2 = f5;
                f6 = f3;
                f = f6;
            } else if (str2.indexOf("deflate") < 0 || f6 <= f3) {
                f6 = f3;
                f = f4;
                f2 = f5;
            } else {
                f = f4;
                f2 = f5;
            }
            i++;
            f5 = f2;
            f4 = f;
            f3 = f6;
        }
        if (f4 > 0.0f || f3 > 0.0f) {
            return f4 >= f3 ? C2425f.GZIP : C2425f.ZLIB;
        }
        if (f5 > 0.0f) {
            if (f4 == -1.0f) {
                return C2425f.GZIP;
            }
            if (f3 == -1.0f) {
                return C2425f.ZLIB;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    @Override // org.p035a.p036a.p043d.p044a.p048d.C2457m
    /* renamed from: a */
    public String mo7212a(String str) {
        C2425f b = m9705b(str);
        if (b == null) {
            return null;
        }
        switch (b) {
            case GZIP:
                return "gzip";
            case ZLIB:
                return "deflate";
            default:
                throw new Error();
        }
    }

    /* access modifiers changed from: protected */
    @Override // org.p035a.p036a.p043d.p044a.p048d.C2457m
    /* renamed from: a */
    public C2434g<Object> mo7213a(C2460o oVar, String str) {
        C2425f b;
        String b2 = oVar.mo7195b("Content-Encoding");
        if ((b2 == null || "identity".equalsIgnoreCase(b2)) && (b = m9705b(str)) != null) {
            return C2531e.m10054a() >= 7 ? new C2434g<>(new C2416b(b, this.f6421b)) : new C2434g<>(new C2420d(b, this.f6421b, this.f6422c, this.f6423d));
        }
        return null;
    }
}
