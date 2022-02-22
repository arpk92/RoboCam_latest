package org.p035a.p036a.p043d.p044a.p048d;

import java.util.HashMap;
import java.util.Map;

/* renamed from: org.a.a.d.a.d.r */
public class C2465r implements Comparable<C2465r> {

    /* renamed from: a */
    public static final C2465r f6463a = new C2465r("OPTIONS");

    /* renamed from: b */
    public static final C2465r f6464b = new C2465r("GET");

    /* renamed from: c */
    public static final C2465r f6465c = new C2465r("HEAD");

    /* renamed from: d */
    public static final C2465r f6466d = new C2465r("POST");

    /* renamed from: e */
    public static final C2465r f6467e = new C2465r("PUT");

    /* renamed from: f */
    public static final C2465r f6468f = new C2465r("PATCH");

    /* renamed from: g */
    public static final C2465r f6469g = new C2465r("DELETE");

    /* renamed from: h */
    public static final C2465r f6470h = new C2465r("TRACE");

    /* renamed from: i */
    public static final C2465r f6471i = new C2465r("CONNECT");

    /* renamed from: j */
    private static final Map<String, C2465r> f6472j = new HashMap();

    /* renamed from: k */
    private final String f6473k;

    static {
        f6472j.put(f6463a.toString(), f6463a);
        f6472j.put(f6464b.toString(), f6464b);
        f6472j.put(f6465c.toString(), f6465c);
        f6472j.put(f6466d.toString(), f6466d);
        f6472j.put(f6467e.toString(), f6467e);
        f6472j.put(f6468f.toString(), f6468f);
        f6472j.put(f6469g.toString(), f6469g);
        f6472j.put(f6470h.toString(), f6470h);
        f6472j.put(f6471i.toString(), f6471i);
    }

    public C2465r(String str) {
        if (str == null) {
            throw new NullPointerException("name");
        }
        String upperCase = str.trim().toUpperCase();
        if (upperCase.length() == 0) {
            throw new IllegalArgumentException("empty name");
        }
        for (int i = 0; i < upperCase.length(); i++) {
            if (Character.isISOControl(upperCase.charAt(i)) || Character.isWhitespace(upperCase.charAt(i))) {
                throw new IllegalArgumentException("invalid character in name");
            }
        }
        this.f6473k = upperCase;
    }

    /* renamed from: a */
    public static C2465r m9792a(String str) {
        if (str == null) {
            throw new NullPointerException("name");
        }
        String upperCase = str.trim().toUpperCase();
        if (upperCase.length() == 0) {
            throw new IllegalArgumentException("empty name");
        }
        C2465r rVar = f6472j.get(upperCase);
        return rVar != null ? rVar : new C2465r(upperCase);
    }

    /* renamed from: a */
    public int compareTo(C2465r rVar) {
        return mo7240a().compareTo(rVar.mo7240a());
    }

    /* renamed from: a */
    public String mo7240a() {
        return this.f6473k;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C2465r)) {
            return false;
        }
        return mo7240a().equals(((C2465r) obj).mo7240a());
    }

    public int hashCode() {
        return mo7240a().hashCode();
    }

    public String toString() {
        return mo7240a();
    }
}
