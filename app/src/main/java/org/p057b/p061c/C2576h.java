package org.p057b.p061c;

import java.lang.Thread;
import java.util.concurrent.Executor;
import org.p035a.p036a.p038b.C2284d;
import org.p035a.p036a.p038b.C2286f;
import org.p035a.p036a.p039c.C2320al;
import org.p035a.p036a.p039c.C2324ap;
import org.p035a.p036a.p039c.C2331av;
import org.p035a.p036a.p039c.C2391m;
import org.p035a.p036a.p039c.C2396p;
import org.p035a.p036a.p054f.C2496a;

/* renamed from: org.b.c.h */
public class C2576h extends C2331av {

    /* renamed from: a */
    private final int f6892a;

    /* renamed from: b */
    private final C2564c f6893b;

    public C2576h(Executor executor, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, Thread.UncaughtExceptionHandler uncaughtExceptionHandler2, int i) {
        this.f6892a = i;
        this.f6893b = new C2564c(executor, uncaughtExceptionHandler, uncaughtExceptionHandler2) {
            /* class org.p057b.p061c.C2576h.C25771 */

            /* access modifiers changed from: protected */
            @Override // org.p057b.p061c.C2564c
            /* renamed from: a */
            public void mo7435a() {
                throw new UnsupportedOperationException();
            }
        };
    }

    /* renamed from: a */
    private C2284d m10122a() {
        return C2286f.m8925a("<?xml version=\"1.0\"?>\r\n<!DOCTYPE cross-domain-policy SYSTEM \"/xml/dtds/cross-domain-policy.dtd\">\r\n<cross-domain-policy>\r\n  <site-control permitted-cross-domain-policies=\"master-only\"/>\r\n  <allow-access-from domain=\"*\" to-ports=\"" + this.f6892a + "\" />\r\n" + "</cross-domain-policy>\r\n", C2496a.f6594f);
    }

    @Override // org.p035a.p036a.p039c.C2331av
    /* renamed from: a */
    public void mo6813a(C2396p pVar, C2320al alVar) {
        this.f6893b.mo7436a(alVar);
    }

    @Override // org.p035a.p036a.p039c.C2331av
    /* renamed from: a */
    public void mo7037a(C2396p pVar, C2324ap apVar) {
        apVar.mo6990a().mo6892a(m10122a()).mo6936a(C2391m.f6335a);
        pVar.mo6980b().mo6963a(this);
    }
}
