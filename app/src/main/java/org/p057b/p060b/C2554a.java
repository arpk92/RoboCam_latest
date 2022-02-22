package org.p057b.p060b;

/* renamed from: org.b.b.a */
public class C2554a {

    /* renamed from: a */
    private static final char[] f6830a = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".toCharArray();

    /* renamed from: b */
    private static final int[] f6831b = new int[123];

    static {
        for (int i = 0; i < f6830a.length; i++) {
            f6831b[f6830a[i]] = i + 1;
        }
    }

    /* renamed from: a */
    public static String m10088a(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (int i2 = 0; i2 < bArr.length; i2 += 3) {
            int min = Math.min(3, bArr.length - i2);
            byte b = (byte) (((bArr[i2] & 255) << 16) | ((min <= 1 ? 0 : bArr[i2 + 1] & 255) << 8) | (min <= 2 ? 0 : bArr[i2 + 2] & 255));
            int i3 = 0;
            while (i3 < 4) {
                sb.append(min + 1 > i3 ? f6830a[(b >> ((3 - i3) * 6)) & 63] : '=');
                i3++;
            }
            i += 4;
            if (i % 76 == 0) {
                sb.append(10);
            }
        }
        return sb.toString();
    }
}
