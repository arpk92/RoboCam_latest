package org.p035a.p036a.p054f.p055a;

import java.util.Formatter;

/* renamed from: org.a.a.f.a.j */
public final class C2537j {

    /* renamed from: a */
    public static final String f6817a;

    static {
        String str;
        try {
            str = new Formatter().format("%n", new Object[0]).toString();
        } catch (Exception e) {
            str = "\n";
        }
        f6817a = str;
    }

    /* renamed from: a */
    public static String m10063a(Object obj) {
        if (obj == null) {
            return null;
        }
        return m10064a(obj.toString());
    }

    /* renamed from: a */
    public static String m10064a(String str) {
        boolean z;
        if (str == null) {
            return null;
        }
        int length = str.length() - 1;
        while (true) {
            if (length < 0) {
                z = false;
                break;
            } else if (Character.isISOControl(str.charAt(length))) {
                z = true;
                break;
            } else {
                length--;
            }
        }
        if (!z) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str.length());
        int i = 0;
        while (i < str.length() && Character.isISOControl(str.charAt(i))) {
            i++;
        }
        boolean z2 = false;
        for (int i2 = i; i2 < str.length(); i2++) {
            if (Character.isISOControl(str.charAt(i2))) {
                z2 = true;
            } else {
                if (z2) {
                    sb.append(' ');
                    z2 = false;
                }
                sb.append(str.charAt(i2));
            }
        }
        return sb.toString();
    }
}
