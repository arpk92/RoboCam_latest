package org.p035a.p036a.p043d.p044a.p048d;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: org.a.a.d.a.d.x */
public class C2471x implements Comparable<C2471x> {

    /* renamed from: a */
    public static final C2471x f6526a = new C2471x("HTTP", 1, 0, false);

    /* renamed from: b */
    public static final C2471x f6527b = new C2471x("HTTP", 1, 1, true);

    /* renamed from: c */
    private static final Pattern f6528c = Pattern.compile("(\\S+)/(\\d+)\\.(\\d+)");

    /* renamed from: d */
    private final String f6529d;

    /* renamed from: e */
    private final int f6530e;

    /* renamed from: f */
    private final int f6531f;

    /* renamed from: g */
    private final String f6532g;

    /* renamed from: h */
    private final boolean f6533h;

    public C2471x(String str, int i, int i2, boolean z) {
        if (str == null) {
            throw new NullPointerException("protocolName");
        }
        String upperCase = str.trim().toUpperCase();
        if (upperCase.length() == 0) {
            throw new IllegalArgumentException("empty protocolName");
        }
        for (int i3 = 0; i3 < upperCase.length(); i3++) {
            if (Character.isISOControl(upperCase.charAt(i3)) || Character.isWhitespace(upperCase.charAt(i3))) {
                throw new IllegalArgumentException("invalid character in protocolName");
            }
        }
        if (i < 0) {
            throw new IllegalArgumentException("negative majorVersion");
        } else if (i2 < 0) {
            throw new IllegalArgumentException("negative minorVersion");
        } else {
            this.f6529d = upperCase;
            this.f6530e = i;
            this.f6531f = i2;
            this.f6532g = upperCase + '/' + i + '.' + i2;
            this.f6533h = z;
        }
    }

    public C2471x(String str, boolean z) {
        if (str == null) {
            throw new NullPointerException("text");
        }
        String upperCase = str.trim().toUpperCase();
        if (upperCase.length() == 0) {
            throw new IllegalArgumentException("empty text");
        }
        Matcher matcher = f6528c.matcher(upperCase);
        if (!matcher.matches()) {
            throw new IllegalArgumentException("invalid version format: " + upperCase);
        }
        this.f6529d = matcher.group(1);
        this.f6530e = Integer.parseInt(matcher.group(2));
        this.f6531f = Integer.parseInt(matcher.group(3));
        this.f6532g = this.f6529d + '/' + this.f6530e + '.' + this.f6531f;
        this.f6533h = z;
    }

    /* renamed from: a */
    public static C2471x m9806a(String str) {
        if (str == null) {
            throw new NullPointerException("text");
        }
        String upperCase = str.trim().toUpperCase();
        return upperCase.equals("HTTP/1.1") ? f6527b : upperCase.equals("HTTP/1.0") ? f6526a : new C2471x(upperCase, true);
    }

    /* renamed from: a */
    public int compareTo(C2471x xVar) {
        int compareTo = mo7253a().compareTo(xVar.mo7253a());
        if (compareTo != 0) {
            return compareTo;
        }
        int b = mo7254b() - xVar.mo7254b();
        return b == 0 ? mo7255c() - xVar.mo7255c() : b;
    }

    /* renamed from: a */
    public String mo7253a() {
        return this.f6529d;
    }

    /* renamed from: b */
    public int mo7254b() {
        return this.f6530e;
    }

    /* renamed from: c */
    public int mo7255c() {
        return this.f6531f;
    }

    /* renamed from: d */
    public String mo7257d() {
        return this.f6532g;
    }

    /* renamed from: e */
    public boolean mo7258e() {
        return this.f6533h;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C2471x)) {
            return false;
        }
        C2471x xVar = (C2471x) obj;
        return mo7255c() == xVar.mo7255c() && mo7254b() == xVar.mo7254b() && mo7253a().equals(xVar.mo7253a());
    }

    public int hashCode() {
        return (((mo7253a().hashCode() * 31) + mo7254b()) * 31) + mo7255c();
    }

    public String toString() {
        return mo7257d();
    }
}
