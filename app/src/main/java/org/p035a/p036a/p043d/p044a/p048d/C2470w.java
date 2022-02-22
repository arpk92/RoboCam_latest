package org.p035a.p036a.p043d.p044a.p048d;


/* renamed from: org.a.a.d.a.d.w */
public class C2470w implements Comparable<C2470w> {

    /* renamed from: A */
    public static final C2470w f6474A = new C2470w(408, "Request Timeout");

    /* renamed from: B */
    public static final C2470w f6475B = new C2470w(409, "Conflict");

    /* renamed from: C */
    public static final C2470w f6476C = new C2470w(410, "Gone");

    /* renamed from: D */
    public static final C2470w f6477D = new C2470w(411, "Length Required");

    /* renamed from: E */
    public static final C2470w f6478E = new C2470w(412, "Precondition Failed");

    /* renamed from: F */
    public static final C2470w f6479F = new C2470w(413, "Request Entity Too Large");

    /* renamed from: G */
    public static final C2470w f6480G = new C2470w(414, "Request-URI Too Long");

    /* renamed from: H */
    public static final C2470w f6481H = new C2470w(415, "Unsupported Media Type");

    /* renamed from: I */
    public static final C2470w f6482I = new C2470w(416, "Requested Range Not Satisfiable");

    /* renamed from: J */
    public static final C2470w f6483J = new C2470w(417, "Expectation Failed");

    /* renamed from: K */
    public static final C2470w f6484K = new C2470w(422, "Unprocessable Entity");

    /* renamed from: L */
    public static final C2470w f6485L = new C2470w(423, "Locked");

    /* renamed from: M */
    public static final C2470w f6486M = new C2470w(424, "Failed Dependency");

    /* renamed from: N */
    public static final C2470w f6487N = new C2470w(425, "Unordered Collection");

    /* renamed from: O */
    public static final C2470w f6488O = new C2470w(426, "Upgrade Required");

    /* renamed from: P */
    public static final C2470w f6489P = new C2470w(500, "Internal Server Error");

    /* renamed from: Q */
    public static final C2470w f6490Q = new C2470w(501, "Not Implemented");

    /* renamed from: R */
    public static final C2470w f6491R = new C2470w(502, "Bad Gateway");

    /* renamed from: S */
    public static final C2470w f6492S = new C2470w(503, "Service Unavailable");

    /* renamed from: T */
    public static final C2470w f6493T = new C2470w(504, "Gateway Timeout");

    /* renamed from: U */
    public static final C2470w f6494U = new C2470w(505, "HTTP Version Not Supported");

    /* renamed from: V */
    public static final C2470w f6495V = new C2470w(506, "Variant Also Negotiates");

    /* renamed from: W */
    public static final C2470w f6496W = new C2470w(507, "Insufficient Storage");

    /* renamed from: X */
    public static final C2470w f6497X = new C2470w(510, "Not Extended");

    /* renamed from: a */
    public static final C2470w f6498a = new C2470w(100, "Continue");

    /* renamed from: b */
    public static final C2470w f6499b = new C2470w(101, "Switching Protocols");

    /* renamed from: c */
    public static final C2470w f6500c = new C2470w(102, "Processing");

    /* renamed from: d */
    public static final C2470w f6501d = new C2470w(200, "OK");

    /* renamed from: e */
    public static final C2470w f6502e = new C2470w(201, "Created");

    /* renamed from: f */
    public static final C2470w f6503f = new C2470w(202, "Accepted");

    /* renamed from: g */
    public static final C2470w f6504g = new C2470w(203, "Non-Authoritative Information");

    /* renamed from: h */
    public static final C2470w f6505h = new C2470w(204, "No Content");

    /* renamed from: i */
    public static final C2470w f6506i = new C2470w(205, "Reset Content");

    /* renamed from: j */
    public static final C2470w f6507j = new C2470w(206, "Partial Content");

    /* renamed from: k */
    public static final C2470w f6508k = new C2470w(207, "Multi-Status");

    /* renamed from: l */
    public static final C2470w f6509l = new C2470w(300, "Multiple Choices");

    /* renamed from: m */
    public static final C2470w f6510m = new C2470w(301, "Moved Permanently");

    /* renamed from: n */
    public static final C2470w f6511n = new C2470w(302, "Found");

    /* renamed from: o */
    public static final C2470w f6512o = new C2470w(303, "See Other");

    /* renamed from: p */
    public static final C2470w f6513p = new C2470w(304, "Not Modified");

    /* renamed from: q */
    public static final C2470w f6514q = new C2470w(305, "Use Proxy");

    /* renamed from: r */
    public static final C2470w f6515r = new C2470w(307, "Temporary Redirect");

    /* renamed from: s */
    public static final C2470w f6516s = new C2470w(400, "Bad Request");

    /* renamed from: t */
    public static final C2470w f6517t = new C2470w(401, "Unauthorized");

    /* renamed from: u */
    public static final C2470w f6518u = new C2470w(402, "Payment Required");

    /* renamed from: v */
    public static final C2470w f6519v = new C2470w(403, "Forbidden");

    /* renamed from: w */
    public static final C2470w f6520w = new C2470w(404, "Not Found");

    /* renamed from: x */
    public static final C2470w f6521x = new C2470w(405, "Method Not Allowed");

    /* renamed from: y */
    public static final C2470w f6522y = new C2470w(406, "Not Acceptable");

    /* renamed from: z */
    public static final C2470w f6523z = new C2470w(407, "Proxy Authentication Required");

    /* renamed from: Y */
    private final int f6524Y;

    /* renamed from: Z */
    private final String f6525Z;

    public C2470w(int i, String str) {
        if (i < 0) {
            throw new IllegalArgumentException("code: " + i + " (expected: 0+)");
        } else if (str == null) {
            throw new NullPointerException("reasonPhrase");
        } else {
            int i2 = 0;
            while (i2 < str.length()) {
                switch (str.charAt(i2)) {
                    case 10:
                    case 13:
                        throw new IllegalArgumentException("reasonPhrase contains one of the following prohibited characters: \\r\\n: " + str);
                    case 11:
                    case 12:
                    default:
                        i2++;
                }
            }
            this.f6524Y = i;
            this.f6525Z = str;
        }
    }

    /* renamed from: a */
    public static C2470w m9802a(int i) {
        switch (i) {
            case 100:
                return f6498a;
            case 101:
                return f6499b;
            case 102:
                return f6500c;
            case 200:
                return f6501d;
            case 201:
                return f6502e;
            case 202:
                return f6503f;
            case 203:
                return f6504g;
            case 204:
                return f6505h;
            case 205:
                return f6506i;
            case 206:
                return f6507j;
            case 207:
                return f6508k;
            case 300:
                return f6509l;
            case 301:
                return f6510m;
            case 302:
                return f6511n;
            case 303:
                return f6512o;
            case 304:
                return f6513p;
            case 305:
                return f6514q;
            case 307:
                return f6515r;
            case 400:
                return f6516s;
            case 401:
                return f6517t;
            case 402:
                return f6518u;
            case 403:
                return f6519v;
            case 404:
                return f6520w;
            case 405:
                return f6521x;
            case 406:
                return f6522y;
            case 407:
                return f6523z;
            case 408:
                return f6474A;
            case 409:
                return f6475B;
            case 410:
                return f6476C;
            case 411:
                return f6477D;
            case 412:
                return f6478E;
            case 413:
                return f6479F;
            case 414:
                return f6480G;
            case 415:
                return f6481H;
            case 416:
                return f6482I;
            case 417:
                return f6483J;
            case 422:
                return f6484K;
            case 423:
                return f6485L;
            case 424:
                return f6486M;
            case 425:
                return f6487N;
            case 426:
                return f6488O;
            case 500:
                return f6489P;
            case 501:
                return f6490Q;
            case 502:
                return f6491R;
            case 503:
                return f6492S;
            case 504:
                return f6493T;
            case 505:
                return f6494U;
            case 506:
                return f6495V;
            case 507:
                return f6496W;
            case 510:
                return f6497X;
            default:
                return new C2470w(i, (i < 100 ? "Unknown Status" : i < 200 ? "Informational" : i < 300 ? "Successful" : i < 400 ? "Redirection" : i < 500 ? "Client Error" : i < 600 ? "Server Error" : "Unknown Status") + " (" + i + ')');
        }
    }

    /* renamed from: a */
    public int mo7245a() {
        return this.f6524Y;
    }

    /* renamed from: a */
    public int compareTo(C2470w wVar) {
        return mo7245a() - wVar.mo7245a();
    }

    /* renamed from: b */
    public String mo7247b() {
        return this.f6525Z;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C2470w) && mo7245a() == ((C2470w) obj).mo7245a();
    }

    public int hashCode() {
        return mo7245a();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(this.f6525Z.length() + 5);
        sb.append(this.f6524Y);
        sb.append(' ');
        sb.append(this.f6525Z);
        return sb.toString();
    }
}
