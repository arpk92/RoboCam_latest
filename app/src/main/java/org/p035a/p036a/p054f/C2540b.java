package org.p035a.p036a.p054f;

import org.p035a.p036a.p054f.p055a.C2538k;

/* renamed from: org.a.a.f.b */
public final class C2540b {
    /* renamed from: a */
    public static boolean m10069a() {
        String str;
        try {
            str = C2538k.m10066a("org.jboss.netty.debug");
        } catch (Exception e) {
            str = null;
        }
        if (str == null) {
            return false;
        }
        String upperCase = str.trim().toUpperCase();
        return !upperCase.startsWith("N") && !upperCase.startsWith("F") && !upperCase.equals("0");
    }
}
