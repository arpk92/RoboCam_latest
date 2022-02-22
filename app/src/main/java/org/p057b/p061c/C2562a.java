package org.p057b.p061c;

import java.util.concurrent.Executor;
import org.p035a.p036a.p038b.C2286f;
import org.p035a.p036a.p039c.C2390l;
import org.p035a.p036a.p039c.C2391m;
import org.p035a.p036a.p039c.C2396p;
import org.p057b.C2561c;

/* renamed from: org.b.c.a */
public abstract class C2562a implements C2561c {

    /* renamed from: a */
    private final Executor f6844a;

    /* renamed from: b */
    private final C2591p f6845b;

    /* renamed from: c */
    private final C2396p f6846c;

    public C2562a(C2396p pVar, C2591p pVar2, Executor executor) {
        this.f6846c = pVar;
        this.f6845b = pVar2;
        this.f6844a = executor;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C2390l mo7427a(Object obj) {
        C2390l a = this.f6846c.mo6977a().mo6892a(obj);
        a.mo6936a(C2391m.f6336b);
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo7428c() {
        this.f6846c.mo6977a().mo6892a(C2286f.f6097c).mo6936a(C2391m.f6335a);
    }

    /* renamed from: d */
    public C2591p mo7426a() {
        return this.f6845b;
    }

    /* renamed from: e */
    public Executor mo7430e() {
        return this.f6844a;
    }

    public void execute(Runnable runnable) {
        mo7430e().execute(runnable);
    }
}
