package org.p035a.p036a.p043d.p044a.p048d;

import java.util.List;
import org.p035a.p036a.p038b.C2284d;
import org.p035a.p036a.p038b.C2286f;
import org.p035a.p036a.p039c.C2384f;
import org.p035a.p036a.p039c.C2396p;
import org.p035a.p036a.p043d.p044a.p047c.C2437c;
import org.p035a.p036a.p043d.p044a.p051f.C2475b;

/* renamed from: org.a.a.d.a.d.p */
public abstract class C2461p extends C2475b<C2461p.C2463a> {

    /* renamed from: c */
    static final /* synthetic */ boolean f6437c = (!C2461p.class.desiredAssertionStatus());

    /* renamed from: d */
    private final int f6438d;

    /* renamed from: e */
    private final int f6439e;

    /* renamed from: f */
    private final int f6440f;

    /* renamed from: g */
    private C2460o f6441g;

    /* renamed from: h */
    private C2284d f6442h;

    /* renamed from: i */
    private long f6443i;

    /* renamed from: j */
    private int f6444j;

    /* renamed from: k */
    private int f6445k;

    /* renamed from: org.a.a.d.a.d.p$a */
    protected enum C2463a {
        SKIP_CONTROL_CHARS,
        READ_INITIAL,
        READ_HEADER,
        READ_VARIABLE_LENGTH_CONTENT,
        READ_VARIABLE_LENGTH_CONTENT_AS_CHUNKS,
        READ_FIXED_LENGTH_CONTENT,
        READ_FIXED_LENGTH_CONTENT_AS_CHUNKS,
        READ_CHUNK_SIZE,
        READ_CHUNKED_CONTENT,
        READ_CHUNKED_CONTENT_AS_CHUNKS,
        READ_CHUNK_DELIMITER,
        READ_CHUNK_FOOTER
    }

    protected C2461p() {
        this(4096, 8192, 8192);
    }

    protected C2461p(int i, int i2, int i3) {
        super(C2463a.SKIP_CONTROL_CHARS, true);
        if (i <= 0) {
            throw new IllegalArgumentException("maxInitialLineLength must be a positive integer: " + i);
        } else if (i2 <= 0) {
            throw new IllegalArgumentException("maxHeaderSize must be a positive integer: " + i2);
        } else if (i3 < 0) {
            throw new IllegalArgumentException("maxChunkSize must be a positive integer: " + i3);
        } else {
            this.f6438d = i;
            this.f6439e = i2;
            this.f6440f = i3;
        }
    }

    /* renamed from: a */
    private static int m9768a(String str) {
        String str2;
        String trim = str.trim();
        int i = 0;
        while (true) {
            if (i >= trim.length()) {
                str2 = trim;
                break;
            }
            char charAt = trim.charAt(i);
            if (charAt == ';' || Character.isWhitespace(charAt) || Character.isISOControl(charAt)) {
                str2 = trim.substring(0, i);
            } else {
                i++;
            }
        }
        str2 = trim.substring(0, i);
        return Integer.parseInt(str2, 16);
    }

    /* renamed from: a */
    private static int m9769a(String str, int i) {
        while (i < str.length() && Character.isWhitespace(str.charAt(i))) {
            i++;
        }
        return i;
    }

    /* renamed from: a */
    private C2284d m9770a(C2284d dVar, int i) {
        C2284d c = mo7170c();
        if (c.mo6838d() < i) {
            return dVar.mo6844f(i);
        }
        int a = c.mo6816a();
        C2284d g = c.mo6879g(a, i);
        dVar.mo6820a(a + i);
        return g;
    }

    /* renamed from: b */
    private static int m9771b(String str, int i) {
        while (i < str.length() && !Character.isWhitespace(str.charAt(i))) {
            i++;
        }
        return i;
    }

    /* renamed from: b */
    private static String m9772b(C2284d dVar, int i) {
        StringBuilder sb = new StringBuilder(64);
        int i2 = 0;
        while (true) {
            byte f = dVar.mo6843f();
            if (f == 13) {
                if (dVar.mo6843f() == 10) {
                    return sb.toString();
                }
            } else if (f == 10) {
                return sb.toString();
            } else {
                if (i2 >= i) {
                 //   throw new C2437c("An HTTP line is larger than " + i + " bytes.");
                }
                i2++;
                sb.append((char) f);
            }
        }
    }

    /* renamed from: b */
    private static void m9773b(C2284d dVar) {
        while (true) {
            char g = (char) dVar.mo6845g();
            if (!Character.isISOControl(g) && !Character.isWhitespace(g)) {
                dVar.mo6820a(dVar.mo6816a() - 1);
                return;
            }
        }
    }

    /* renamed from: b */
    private static String[] m9774b(String str) {
        int a = m9769a(str, 0);
        int b = m9771b(str, a);
        int a2 = m9769a(str, b);
        int b2 = m9771b(str, a2);
        int a3 = m9769a(str, b2);
        int d = m9777d(str);
        String[] strArr = new String[3];
        strArr[0] = str.substring(a, b);
        strArr[1] = str.substring(a2, b2);
        strArr[2] = a3 < d ? str.substring(a3, d) : "";
        return strArr;
    }

    /* renamed from: c */
    private Object m9775c(C2284d dVar) {
        long a = C2458n.m9731a(this.f6441g, -1);
        if (f6437c || a <= 2147483647L) {
            int i = ((int) a) - this.f6445k;
            if (i > mo7168b()) {
                i = mo7168b();
            }
            this.f6445k += i;
            if (a >= ((long) this.f6445k)) {
                if (this.f6442h == null) {
                    this.f6442h = m9770a(dVar, (int) a);
                } else {
                    this.f6442h.mo6824a(dVar.mo6844f((int) a));
                }
                return m9780f();
            } else if (this.f6441g.mo7194a()) {
                return new C2438a(m9770a(dVar, i));
            } else {
                this.f6441g.mo7193a(true);
                return new Object[]{this.f6441g, new C2438a(m9770a(dVar, i))};
            }
        } else {
            throw new AssertionError();
        }
    }

    /* renamed from: c */
    private static String[] m9776c(String str) {
        int length = str.length();
        int a = m9769a(str, 0);
        int i = a;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt == ':' || Character.isWhitespace(charAt)) {
                break;
            }
            i++;
        }
        int i2 = i;
        while (true) {
            if (i2 >= length) {
                break;
            } else if (str.charAt(i2) == ':') {
                i2++;
                break;
            } else {
                i2++;
            }
        }
        int a2 = m9769a(str, i2);
        if (a2 == length) {
            return new String[]{str.substring(a, i), ""};
        }
        return new String[]{str.substring(a, i), str.substring(a2, m9777d(str))};
    }

    /* renamed from: d */
    private static int m9777d(String str) {
        int length = str.length();
        while (length > 0 && Character.isWhitespace(str.charAt(length - 1))) {
            length--;
        }
        return length;
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [org.a.a.d.a.d.p] */
    /* renamed from: d */
    private C2463a m9778d(C2284d dVar) {
        String str = null;
        ((C2461p) this).f6444j = 0;
        C2460o oVar = ((C2461p) this).f6441g;
        String f = m9781f(dVar);
        if (f.length() != 0) {
            oVar.mo7199c();
            String str2 = f;
            String str3 = null;
            do {
                char charAt = str2.charAt(0);
                if (str3 == null || !(charAt == ' ' || charAt == 9)) {
                    if (str3 != null) {
                        oVar.mo7189a(str3, str);
                    }
                    String[] c = m9776c(str2);
                    str3 = c[0];
                    str = c[1];
                } else {
                    str = str + ' ' + str2.trim();
                }
                str2 = m9781f(dVar);
            } while (str2.length() != 0);
            if (str3 != null) {
                oVar.mo7189a(str3, str);
            }
        }
        return mo7236a(oVar) ? C2463a.SKIP_CONTROL_CHARS : oVar.mo7194a() ? C2463a.READ_CHUNK_SIZE : C2458n.m9731a(oVar, -1) >= 0 ? C2463a.READ_FIXED_LENGTH_CONTENT : C2463a.READ_VARIABLE_LENGTH_CONTENT;
    }

    /* renamed from: e */
    private C2451h m9779e(C2284d dVar) {
        String str;
        this.f6444j = 0;
        String f = m9781f(dVar);
        String str2 = null;
        if (f.length() == 0) {
            return C2448f.f6415a;
        }
        C2443b bVar = new C2443b();
        String str3 = f;
        while (true) {
            char charAt = str3.charAt(0);
            if (str2 == null || !(charAt == ' ' || charAt == 9)) {
                String[] c = m9776c(str3);
                str = c[0];
                if (!str.equalsIgnoreCase("Content-Length") && !str.equalsIgnoreCase("Transfer-Encoding") && !str.equalsIgnoreCase("Trailer")) {
                    bVar.mo7184a(str, c[1]);
                }
            } else {
                List<String> a = bVar.mo7183a(str2);
                if (a.size() != 0) {
                    int size = a.size() - 1;
                    a.set(size, a.get(size) + str3.trim());
                }
                str = str2;
            }
            String f2 = m9781f(dVar);
            if (f2.length() == 0) {
                return bVar;
            }
            str3 = f2;
            str2 = str;
        }
    }

    /* renamed from: f */
    private Object m9780f() {
        C2460o oVar = this.f6441g;
        C2284d dVar = this.f6442h;
        if (dVar != null) {
            oVar.mo7191a(dVar);
            this.f6442h = null;
        }
        this.f6441g = null;
        mo7262a(C2463a.SKIP_CONTROL_CHARS);
        return oVar;
    }

    /* renamed from: f */
    private String m9781f(C2284d dVar) {
        int i = 0;
        StringBuilder sb = new StringBuilder(64);
        int i2 = this.f6444j;
        while (true) {
            char f = (char) dVar.mo6843f();
            int i3 = i2 + 1;
            switch (f) {
                case 10:
                    i = i3;
                    break;
                case 11:
                case 12:
                default:
                    i2 = i3;
                    break;
                case 13:
                    char f2 = (char) dVar.mo6843f();
                    i = i3 + 1;
                    if (f2 != 10) {
                        i2 = i;
                        f = f2;
                        break;
                    } else {
                        break;
                    }
            }
            if (i2 >= this.f6439e) {
               // throw new C2437c("HTTP header is larger than " + this.f6439e + " bytes.");
            }
            sb.append(f);
            break;
        }
        this.f6444j = i;
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x025a  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x026a  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002c  */
    /* renamed from: a */
    public Object mo7181a(C2396p pVar, C2384f fVar, C2284d dVar, C2463a aVar) {
        byte f;
        C2463a d;
        String[] b;
        switch (aVar) {
            case READ_FIXED_LENGTH_CONTENT:
                return m9775c(dVar);
            case READ_VARIABLE_LENGTH_CONTENT:
                int b2 = mo7168b();
                if (b2 > this.f6440f) {
                    b2 = this.f6440f;
                }
                if (this.f6441g.mo7194a()) {
                    return new C2438a(dVar.mo6844f(b2));
                }
                this.f6441g.mo7193a(true);
                return new Object[]{this.f6441g, new C2438a(dVar.mo6844f(b2))};
            case SKIP_CONTROL_CHARS:
                try {
                    m9773b(dVar);
                    mo7262a(C2463a.READ_INITIAL);
                    b = m9774b(m9772b(dVar, this.f6438d));
                    if (b.length >= 3) {
                        mo7262a(C2463a.SKIP_CONTROL_CHARS);
                        return null;
                    }
                    this.f6441g = mo7235a(b);
                    mo7262a(C2463a.READ_HEADER);
                    d = m9778d(dVar);
                    mo7262a(d);
                    if (d != C2463a.READ_CHUNK_SIZE) {
                        this.f6441g.mo7193a(true);
                        return this.f6441g;
                    } else if (d == C2463a.SKIP_CONTROL_CHARS) {
                        this.f6441g.mo7187a("Transfer-Encoding");
                        return this.f6441g;
                    } else {
                        long a = C2458n.m9731a(this.f6441g, -1);
                        if (a == 0 || (a == -1 && mo7237d())) {
                            this.f6442h = C2286f.f6097c;
                            return m9780f();
                        }
                        switch (d) {
                            case READ_FIXED_LENGTH_CONTENT:
                                if (a > ((long) this.f6440f) || C2458n.m9737b(this.f6441g)) {
                                    mo7262a(C2463a.READ_FIXED_LENGTH_CONTENT_AS_CHUNKS);
                                    this.f6441g.mo7193a(true);
                                    this.f6443i = C2458n.m9731a(this.f6441g, -1);
                                    return this.f6441g;
                                }
                            case READ_VARIABLE_LENGTH_CONTENT:
                                if (dVar.mo6838d() > this.f6440f || C2458n.m9737b(this.f6441g)) {
                                    mo7262a(C2463a.READ_VARIABLE_LENGTH_CONTENT_AS_CHUNKS);
                                    this.f6441g.mo7193a(true);
                                    return this.f6441g;
                                }
                            default:
                                throw new IllegalStateException("Unexpected state: " + d);
                        }
                       // return null;
                    }
                } finally {
                    mo7265e();
                }
            case READ_INITIAL:
                b = m9774b(m9772b(dVar, this.f6438d));
                if (b.length >= 3) {
                }
                break;
            case READ_HEADER:
                d = m9778d(dVar);
                mo7262a(d);
                if (d != C2463a.READ_CHUNK_SIZE) {
                }
                break;
            case READ_VARIABLE_LENGTH_CONTENT_AS_CHUNKS:
                int b3 = mo7168b();
                if (b3 > this.f6440f) {
                    b3 = this.f6440f;
                }
                C2438a aVar2 = new C2438a(dVar.mo6844f(b3));
                if (!dVar.mo6836c()) {
                    m9780f();
                    if (!aVar2.mo7174b()) {
                        return new Object[]{aVar2, C2448f.f6415a};
                    }
                }
                return aVar2;
            case READ_FIXED_LENGTH_CONTENT_AS_CHUNKS:
                if (f6437c || this.f6443i <= 2147483647L) {
                    int i = (int) this.f6443i;
                    int b4 = mo7168b();
                    if (b4 == 0) {
                        return null;
                    }
                    int i2 = i > this.f6440f ? this.f6440f : i;
                    if (i2 <= b4) {
                        b4 = i2;
                    }
                    C2438a aVar3 = new C2438a(dVar.mo6844f(b4));
                    int i3 = i > b4 ? i - b4 : 0;
                    this.f6443i = (long) i3;
                    if (i3 == 0) {
                        m9780f();
                        if (!aVar3.mo7174b()) {
                            return new Object[]{aVar3, C2448f.f6415a};
                        }
                    }
                    return aVar3;
                }
                throw new AssertionError();
            case READ_CHUNK_SIZE:
                int a2 = m9768a(m9772b(dVar, this.f6438d));
                this.f6443i = (long) a2;
                if (a2 == 0) {
                    mo7262a(C2463a.READ_CHUNK_FOOTER);
                    return null;
                }
                if (a2 > this.f6440f) {
                    mo7262a(C2463a.READ_CHUNKED_CONTENT_AS_CHUNKS);
                } else {
                    mo7262a(C2463a.READ_CHUNKED_CONTENT);
                }
                if (!f6437c || this.f6443i <= 2147483647L) {
                    C2438a aVar4 = new C2438a(dVar.mo6844f((int) this.f6443i));
                    mo7262a(C2463a.READ_CHUNK_DELIMITER);
                    return aVar4;
                }
                throw new AssertionError();
            case READ_CHUNKED_CONTENT:
                if (!f6437c) {
                    break;
                }
                C2438a aVar42 = new C2438a(dVar.mo6844f((int) this.f6443i));
                mo7262a(C2463a.READ_CHUNK_DELIMITER);
                return aVar42;
            case READ_CHUNKED_CONTENT_AS_CHUNKS:
                if (f6437c || this.f6443i <= 2147483647L) {
                    int i4 = (int) this.f6443i;
                    int b5 = mo7168b();
                    if (b5 == 0) {
                        return null;
                    }
                    int i5 = i4 > this.f6440f ? this.f6440f : i4;
                    if (i5 <= b5) {
                        b5 = i5;
                    }
                    C2438a aVar5 = new C2438a(dVar.mo6844f(b5));
                    int i6 = i4 > b5 ? i4 - b5 : 0;
                    this.f6443i = (long) i6;
                    if (i6 == 0) {
                        mo7262a(C2463a.READ_CHUNK_DELIMITER);
                    }
                    if (!aVar5.mo7174b()) {
                        return aVar5;
                    }
                    while (true) {
                        f = dVar.mo6843f();
                        if (f != 13) {
                            if (dVar.mo6843f() == 10) {
                                mo7262a(C2463a.READ_CHUNK_SIZE);
                                return null;
                            }
                        } else if (f == 10) {
                            mo7262a(C2463a.READ_CHUNK_SIZE);
                            return null;
                        }
                    }
                } else {
                    throw new AssertionError();
                }
                //break;
            case READ_CHUNK_DELIMITER:
                while (true) {
                    f = dVar.mo6843f();
                    if (f != 13) {
                    }
                }
                //break;
            case READ_CHUNK_FOOTER:
                C2451h e = m9779e(dVar);
                if (this.f6440f == 0) {
                    return m9780f();
                }
                m9780f();
                return e;
            default:
                throw new Error("Shouldn't reach here.");
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C2460o mo7235a(String[] strArr);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo7236a(C2460o oVar) {
        if (!(oVar instanceof C2468u)) {
            return false;
        }
        C2468u uVar = (C2468u) oVar;
        int a = uVar.mo7210g().mo7245a();
        if (a >= 100 && a < 200) {
            return a != 101 || uVar.mo7201d("Sec-WebSocket-Accept");
        }
        switch (a) {
            case 204:
            case 205:
            case 304:
                return true;
            default:
                return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract boolean mo7237d();
}
