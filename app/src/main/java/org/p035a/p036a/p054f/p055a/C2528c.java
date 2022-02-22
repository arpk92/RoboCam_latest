package org.p035a.p036a.p054f.p055a;



/* renamed from: org.a.a.f.a.c */
public final class C2528c {

    /* renamed from: a */
    private static final String[] f6806a = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15"};

    /* renamed from: a */
    public static int m10051a(Object obj) {
        return obj instanceof Number ? ((Number) obj).intValue() : Integer.parseInt(String.valueOf(obj));
    }

    /* renamed from: b */
    public static boolean m10052b(Object obj) {
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        if (obj instanceof Number) {
            return ((Number) obj).intValue() != 0;
        }
        String valueOf = String.valueOf(obj);
        if (valueOf.length() == 0) {
            return false;
        }
        try {
            return Integer.parseInt(valueOf) != 0;
        } catch (NumberFormatException e) {
            switch (Character.toUpperCase(valueOf.charAt(0))) {
                case 84:
                case 89:
                    return true;
                default:
                    return false;
            }
        }
    }
}
