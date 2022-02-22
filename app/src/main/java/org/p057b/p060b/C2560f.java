package org.p057b.p060b;


/* renamed from: org.b.b.f */
public class C2560f {

    /* renamed from: a */
    private static final byte[] f6839a = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 8, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 10, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 3, 3, 11, 6, 6, 6, 5, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8};

    /* renamed from: b */
    private static final byte[] f6840b;

    /* renamed from: c */
    private int f6841c = 0;

    /* renamed from: d */
    private int f6842d = 0;

    /* renamed from: e */
    private final StringBuilder f6843e = new StringBuilder();

    static {
        byte[] bArr = new byte[108];
        // fill-array-data instruction
        bArr[0] = 0;
        bArr[1] = 12;
        bArr[2] = 24;
        bArr[3] = 36;
        bArr[4] = 60;
        bArr[5] = 96;
        bArr[6] = 84;
        bArr[7] = 12;
        bArr[8] = 12;
        bArr[9] = 12;
        bArr[10] = 48;
        bArr[11] = 72;
        bArr[12] = 12;
        bArr[13] = 12;
        bArr[14] = 12;
        bArr[15] = 12;
        bArr[16] = 12;
        bArr[17] = 12;
        bArr[18] = 12;
        bArr[19] = 12;
        bArr[20] = 12;
        bArr[21] = 12;
        bArr[22] = 12;
        bArr[23] = 12;
        bArr[24] = 12;
        bArr[25] = 0;
        bArr[26] = 12;
        bArr[27] = 12;
        bArr[28] = 12;
        bArr[29] = 12;
        bArr[30] = 12;
        bArr[31] = 0;
        bArr[32] = 12;
        bArr[33] = 0;
        bArr[34] = 12;
        bArr[35] = 12;
        bArr[36] = 12;
        bArr[37] = 24;
        bArr[38] = 12;
        bArr[39] = 12;
        bArr[40] = 12;
        bArr[41] = 12;
        bArr[42] = 12;
        bArr[43] = 24;
        bArr[44] = 12;
        bArr[45] = 24;
        bArr[46] = 12;
        bArr[47] = 12;
        bArr[48] = 12;
        bArr[49] = 12;
        bArr[50] = 12;
        bArr[51] = 12;
        bArr[52] = 12;
        bArr[53] = 12;
        bArr[54] = 12;
        bArr[55] = 24;
        bArr[56] = 12;
        bArr[57] = 12;
        bArr[58] = 12;
        bArr[59] = 12;
        bArr[60] = 12;
        bArr[61] = 24;
        bArr[62] = 12;
        bArr[63] = 12;
        bArr[64] = 12;
        bArr[65] = 12;
        bArr[66] = 12;
        bArr[67] = 12;
        bArr[68] = 12;
        bArr[69] = 24;
        bArr[70] = 12;
        bArr[71] = 12;
        bArr[72] = 12;
        bArr[73] = 12;
        bArr[74] = 12;
        bArr[75] = 12;
        bArr[76] = 12;
        bArr[77] = 12;
        bArr[78] = 12;
        bArr[79] = 36;
        bArr[80] = 12;
        bArr[81] = 36;
        bArr[82] = 12;
        bArr[83] = 12;
        bArr[84] = 12;
        bArr[85] = 36;
        bArr[86] = 12;
        bArr[87] = 12;
        bArr[88] = 12;
        bArr[89] = 12;
        bArr[90] = 12;
        bArr[91] = 36;
        bArr[92] = 12;
        bArr[93] = 36;
        bArr[94] = 12;
        bArr[95] = 12;
        bArr[96] = 12;
        bArr[97] = 36;
        bArr[98] = 12;
        bArr[99] = 12;
        bArr[100] = 12;
        bArr[101] = 12;
        bArr[102] = 12;
        bArr[103] = 12;
        bArr[104] = 12;
        bArr[105] = 12;
        bArr[106] = 12;
        bArr[107] = 12;
        f6840b = bArr;
    }

    /* renamed from: a */
    public String mo7423a() {
        if (this.f6841c == 0) {
            String sb = this.f6843e.toString();
            this.f6843e.setLength(0);
            return sb;
        }
        try {
            throw new C2559e("bytes are not UTF-8");
        } catch (C2559e c2559e) {
            c2559e.printStackTrace();
        }
        return null;
    }

    /* renamed from: a */
    public void mo7424a(int i) {
        byte b = f6839a[i & 255];
        this.f6842d = this.f6841c != 0 ? (i & 63) | (this.f6842d << 6) : (255 >> b) & i;
        this.f6841c = f6840b[b + this.f6841c];
        if (this.f6841c == 0) {
            if (this.f6842d < 55296) {
                this.f6843e.append((char) this.f6842d);
                return;
            }
            for (char c : Character.toChars(this.f6842d)) {
                this.f6843e.append(c);
            }
        } else if (this.f6841c == 12) {
            try {
                throw new C2559e("bytes are not UTF-8");
            } catch (C2559e c2559e) {
                c2559e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public void mo7425a(byte[] bArr) {
        for (byte b : bArr) {
            mo7424a(b);
        }
    }
}
