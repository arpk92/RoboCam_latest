package org.p035a.p036a.p039c.p041b.p042a;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import org.p035a.p036a.p039c.C2398r;
import org.p035a.p036a.p039c.C2401u;
import org.p035a.p036a.p039c.p041b.C2375d;
import org.p035a.p036a.p039c.p041b.C2377f;
import org.p035a.p036a.p054f.C2541c;
import org.p035a.p036a.p054f.p055a.C2533f;

/* renamed from: org.a.a.c.b.a.k */
public class C2352k implements C2377f {

    /* renamed from: a */
    final Executor f6275a;

    /* renamed from: b */
    private final C2372t<C2358o> f6276b;

    /* renamed from: c */
    private final C2401u f6277c;

    public C2352k() {
        this(Executors.newCachedThreadPool(), Executors.newCachedThreadPool());
    }

    public C2352k(Executor executor, Executor executor2) {
        this(executor, executor2, C2361q.f6296a);
    }

    public C2352k(Executor executor, Executor executor2, int i) {
        this(executor, new C2360p(executor2, i));
    }

    public C2352k(Executor executor, C2372t<C2358o> tVar) {
        if (executor == null) {
            throw new NullPointerException("bossExecutor");
        } else if (tVar == null) {
            throw new NullPointerException("workerPool");
        } else {
            this.f6275a = executor;
            this.f6276b = tVar;
            this.f6277c = new C2353l(tVar);
        }
    }

    /* renamed from: b */
    public C2375d mo7116a(C2398r rVar) {
        return new C2351j(this, rVar, this.f6277c);
    }

    @Override // org.p035a.p036a.p054f.C2541c, org.p035a.p036a.p039c.C2389k
    /* renamed from: d */
    public void mo6810d() {
        C2533f.m10060a(this.f6275a);
        if (this.f6276b instanceof C2541c) {
            ((C2541c) this.f6276b).mo6810d();
        }
    }
}
