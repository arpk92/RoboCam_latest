package org.p035a.p036a.p043d.p044a.p048d;

import java.util.List;

/* renamed from: org.a.a.d.a.d.i */
final class C2452i {
    /* renamed from: a */
    static void m9700a(String str) {
        if (str == null) {
            throw new NullPointerException("name");
        }
        int i = 0;
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (charAt > 127) {
                throw new IllegalArgumentException("name contains non-ascii character: " + str);
            }
            switch (charAt) {
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case ' ':
                /*case C0497a.C0507j.AppCompatTheme_dialogPreferredPadding:
                case C0497a.C0507j.AppCompatTheme_activityChooserViewStyle:
                case C0497a.C0507j.AppCompatTheme_toolbarStyle:
                case C0497a.C0507j.AppCompatTheme_popupMenuStyle:
                    throw new IllegalArgumentException("name contains one of the following prohibited characters: =,;: \\t\\r\\n\\v\\f: " + str);
                */default:
                    i++;
            }
        }
    }

    /* renamed from: a */
    static boolean m9701a(C2460o oVar) {
        List<String> c = oVar.mo7198c("Transfer-Encoding");
        if (c.isEmpty()) {
            return false;
        }
        for (String str : c) {
            if (str.equalsIgnoreCase("chunked")) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    static void m9702b(String str) {
        if (str == null) {
            throw new NullPointerException("value");
        }
        int i = 0;
        boolean z = false;
        while (i < str.length()) {
            char charAt = str.charAt(i);
            switch (charAt) {
                case 11:
                    throw new IllegalArgumentException("value contains a prohibited character '\\v': " + str);
                case 12:
                    throw new IllegalArgumentException("value contains a prohibited character '\\f': " + str);
                default:
                    if (z == false) {
                        switch (charAt) {
                            case 10:
                                z = true;
                                continue;
                            case 13:
                                z = true;
                                continue;
                        }

                        switch (charAt) {
                            default:
                                throw new IllegalArgumentException("Only '\\n' is allowed after '\\r': " + str);
                            case 10:
                                z = true;
                                continue;
                        }
                    } else if (z == true) {
                        switch (charAt) {
                            default:
                                throw new IllegalArgumentException("Only '\\n' is allowed after '\\r': " + str);
                            case 10:
                                z = true;
                                continue;
                        }
                    } else if (z == true) {
                        switch (charAt) {
                            default:
                                throw new IllegalArgumentException("Only ' ' and '\\t' are allowed after '\\n': " + str);
                            case 9:
                            case ' ':
                                z = false;
                                continue;
                        }
                    }
                    i++;
                    break;
            }
        }
        if (z) {
            throw new IllegalArgumentException("value must not end with '\\r' or '\\n':" + str);
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [org.a.a.d.a.d.o] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: b */
    static void m9703b(C2460o r2) {
        List<String> c = r2.mo7198c("Transfer-Encoding");
        c.remove("chunked");
        r2.mo7188a("Transfer-Encoding", c);
    }

    /* renamed from: c */
    static boolean m9704c(C2460o oVar) {
        return !oVar.mo7198c("Content-Length").isEmpty();
    }
}
