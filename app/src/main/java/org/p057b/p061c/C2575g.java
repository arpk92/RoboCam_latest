package org.p057b.p061c;

import java.lang.Thread;
import java.util.concurrent.Executor;
import org.p035a.p036a.p038b.C2284d;
import org.p035a.p036a.p038b.C2286f;
import org.p035a.p036a.p039c.C2384f;
import org.p035a.p036a.p039c.C2396p;
import org.p035a.p036a.p039c.C2398r;
import org.p035a.p036a.p043d.p044a.p047c.C2436b;
import org.p035a.p036a.p054f.C2496a;

/* renamed from: org.b.c.g */
public class C2575g extends C2436b {

    /* renamed from: c */
    private static final C2284d f6887c = C2286f.m8925a("<policy-file-request/>\u0000", C2496a.f6594f);

    /* renamed from: d */
    private final Executor f6888d;

    /* renamed from: e */
    private final Thread.UncaughtExceptionHandler f6889e;

    /* renamed from: f */
    private final Thread.UncaughtExceptionHandler f6890f;

    /* renamed from: g */
    private final int f6891g;

    public C2575g(Executor executor, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, Thread.UncaughtExceptionHandler uncaughtExceptionHandler2, int i) {
        super(true);
        this.f6891g = i;
        this.f6888d = executor;
        this.f6889e = uncaughtExceptionHandler;
        this.f6890f = uncaughtExceptionHandler2;
    }

    /* access modifiers changed from: protected */
    @Override // org.p035a.p036a.p043d.p044a.p047c.C2436b
    /* renamed from: a */
    public Object mo7163a(C2396p pVar, C2384f fVar, C2284d dVar) {
        if (dVar.mo6838d() < 23) {
            return dVar.mo6844f(dVar.mo6838d());
        }
        C2398r b = pVar.mo6980b();
        C2284d f = dVar.mo6844f(23);
        if (f6887c.equals(f)) {
            b.mo6957a("flashpolicydecoder", "flashpolicyhandler", new C2576h(this.f6888d, this.f6889e, this.f6890f, this.f6891g));
        }
        b.mo6963a(this);
        if (!dVar.mo6836c()) {
            return f;
        }
        return new Object[]{f, dVar.mo6844f(dVar.mo6838d())};
    }
}
