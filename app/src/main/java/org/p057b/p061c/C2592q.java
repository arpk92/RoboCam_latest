package org.p057b.p061c;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.Thread;
import java.nio.charset.Charset;
import java.util.Date;
import org.p035a.p036a.p038b.C2284d;
import org.p035a.p036a.p038b.C2286f;
import org.p035a.p036a.p039c.C2390l;
import org.p035a.p036a.p039c.C2391m;
import org.p035a.p036a.p039c.C2396p;
import org.p035a.p036a.p043d.p044a.p047c.C2437c;
import org.p035a.p036a.p043d.p044a.p048d.C2438a;
import org.p035a.p036a.p043d.p044a.p048d.C2468u;
import org.p035a.p036a.p043d.p044a.p048d.C2470w;
import org.p057b.C2611g;
import org.p057b.C2616l;
import org.p057b.p060b.C2555b;

/* renamed from: org.b.c.q */
public class C2592q implements C2611g {

    /* renamed from: a */
    private static final Charset f6957a = Charset.forName("UTF-8");

    /* renamed from: b */
    private final C2396p f6958b;

    /* renamed from: c */
    private final C2468u f6959c;

    /* renamed from: d */
    private final boolean f6960d;

    /* renamed from: e */
    private final Thread.UncaughtExceptionHandler f6961e;

    /* renamed from: f */
    private final C2284d f6962f = C2286f.m8922a();

    /* renamed from: g */
    private Charset f6963g = f6957a;

    public C2592q(C2396p pVar, C2468u uVar, boolean z, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f6958b = pVar;
        this.f6959c = uVar;
        this.f6960d = z;
        this.f6961e = uncaughtExceptionHandler;
    }

    /* renamed from: a */
    private C2592q m10170a(C2284d dVar) {
        if (this.f6959c.mo7194a()) {
            throw new UnsupportedOperationException();
        }
        this.f6962f.mo6824a(dVar);
        return this;
    }

    /* renamed from: b */
    private C2390l m10171b(C2284d dVar) {
        this.f6959c.mo7191a(dVar);
        return this.f6958b.mo6977a().mo6892a(this.f6959c);
    }

    /* renamed from: c */
    private String m10172c(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        return stringWriter.toString();
    }

    /* renamed from: d */
    private void m10173d() {
        try {
            mo7465a("Content-Length", (String) null);
            mo7462a("Content-Length", (long) this.f6962f.mo6838d());
            C2390l a = this.f6959c.mo7194a() ? this.f6958b.mo6977a().mo6892a(new C2438a(C2286f.f6097c)) : m10171b(this.f6962f);
            if (!this.f6960d) {
                a.mo6936a(C2391m.f6335a);
            }
        } catch (Exception e) {
            this.f6961e.uncaughtException(Thread.currentThread(), C2616l.m10277a(e, this.f6958b.mo6977a()));
        }
    }

    /* renamed from: a */
    public C2592q mo7462a(String str, long j) {
        this.f6959c.mo7189a(str, Long.valueOf(j));
        return this;
    }

    @Override // org.p057b.C2611g
    /* renamed from: a */
    public boolean mo7468a(String str) {
        return this.f6959c.mo7201d(str);
    }

    /* renamed from: b */
    public Charset mo7469b() {
        return this.f6963g;
    }

    /* renamed from: b */
    public C2592q mo7464a(int i) {
        this.f6959c.mo7209a(C2470w.m9802a(i));
        return this;
    }

    /* renamed from: b */
    public C2592q mo7471b(String str) {
        return m10170a(C2286f.m8925a(str, mo7469b()));
    }

    /* renamed from: b */
    public C2592q mo7465a(String str, String str2) {
        if (str2 == null) {
            this.f6959c.mo7187a(str);
        } else {
            this.f6959c.mo7189a(str, str2);
        }
        return this;
    }

    /* renamed from: b */
    public C2592q mo7466a(String str, Date date) {
        this.f6959c.mo7189a(str, C2555b.m10089a(date));
        return this;
    }

    /* renamed from: b */
    public C2592q mo7467a(Throwable th) {
        if (th instanceof C2437c) {
            this.f6959c.mo7209a(C2470w.f6479F);
        } else {
            this.f6959c.mo7209a(C2470w.f6489P);
        }
        String c = m10172c(th);
        mo7465a("Content-Type", "text/plain");
        mo7471b(c);
        m10173d();
        this.f6961e.uncaughtException(Thread.currentThread(), C2616l.m10277a(th, this.f6958b.mo6977a()));
        return this;
    }

    /* renamed from: c */
    public C2592q mo7463a() {
        m10173d();
        return this;
    }
}
