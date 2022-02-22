package org.p035a.p036a.p054f.p055a;

import java.util.regex.Pattern;

/* renamed from: org.a.a.f.a.k */
public final class C2538k {
    /* renamed from: a */
    public static int m10065a(String str, int i) {
        String a = m10066a(str);
        return (a != null && Pattern.matches("-?[0-9]+", a)) ? Integer.parseInt(a) : i;
    }

    /* renamed from: a */
    public static String m10066a(String str) {
        try {
            return System.getProperty(str);
        } catch (Exception e) {
            return null;
        }
    }

    /* renamed from: a */
    public static String m10067a(String str, String str2) {
        String a = m10066a(str);
        return a == null ? str2 : a;
    }
}
