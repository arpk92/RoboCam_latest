package org.p035a.p036a.p053e;

import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: org.a.a.e.d */
class C2494d extends C2490a {

    /* renamed from: a */
    private final Logger f6587a;

    /* renamed from: b */
    private final String f6588b;

    C2494d(Logger logger, String str) {
        this.f6587a = logger;
        this.f6588b = str;
    }

    @Override // org.p035a.p036a.p053e.C2491b
    /* renamed from: a */
    public void mo7281a(String str) {
        this.f6587a.logp(Level.FINE, this.f6588b, (String) null, str);
    }

    @Override // org.p035a.p036a.p053e.C2491b
    /* renamed from: a */
    public void mo7282a(String str, Throwable th) {
        this.f6587a.logp(Level.FINE, this.f6588b, (String) null, str, th);
    }

    @Override // org.p035a.p036a.p053e.C2491b
    /* renamed from: a */
    public boolean mo7283a() {
        return this.f6587a.isLoggable(Level.FINE);
    }

    @Override // org.p035a.p036a.p053e.C2491b
    /* renamed from: b */
    public void mo7284b(String str) {
        this.f6587a.logp(Level.INFO, this.f6588b, (String) null, str);
    }

    @Override // org.p035a.p036a.p053e.C2491b
    /* renamed from: b */
    public void mo7285b(String str, Throwable th) {
        this.f6587a.logp(Level.WARNING, this.f6588b, (String) null, str, th);
    }

    @Override // org.p035a.p036a.p053e.C2491b
    /* renamed from: b */
    public boolean mo7286b() {
        return this.f6587a.isLoggable(Level.INFO);
    }

    @Override // org.p035a.p036a.p053e.C2491b
    /* renamed from: c */
    public void mo7287c(String str) {
        this.f6587a.logp(Level.WARNING, this.f6588b, (String) null, str);
    }

    @Override // org.p035a.p036a.p053e.C2491b
    /* renamed from: c */
    public boolean mo7288c() {
        return this.f6587a.isLoggable(Level.WARNING);
    }

    public String toString() {
        return this.f6588b;
    }
}
