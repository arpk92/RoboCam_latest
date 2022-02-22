package org.p035a.p036a.p039c;

import org.p035a.p036a.p053e.C2491b;
import org.p035a.p036a.p053e.C2492c;

/* renamed from: org.a.a.c.aa */
public abstract class C2306aa implements C2390l {

    /* renamed from: a */
    private static final C2491b f6150a = C2492c.m9929a(C2306aa.class);

    /* renamed from: b */
    private final C2384f f6151b;

    protected C2306aa(C2384f fVar) {
        if (fVar == null) {
            throw new NullPointerException("channel");
        }
        this.f6151b = fVar;
    }

    @Override // org.p035a.p036a.p039c.C2390l
    /* renamed from: a */
    public void mo6936a(C2391m mVar) {
        try {
            mVar.mo6933a(this);
        } catch (Throwable th) {
            if (f6150a.mo7288c()) {
                f6150a.mo7285b("An exception was thrown by " + C2391m.class.getSimpleName() + ".", th);
            }
        }
    }

    @Override // org.p035a.p036a.p039c.C2390l
    /* renamed from: a */
    public boolean mo6909a() {
        return false;
    }

    @Override // org.p035a.p036a.p039c.C2390l
    /* renamed from: a */
    public boolean mo6937a(long j, long j2, long j3) {
        return false;
    }

    @Override // org.p035a.p036a.p039c.C2390l
    /* renamed from: a */
    public boolean mo6910a(Throwable th) {
        return false;
    }

    @Override // org.p035a.p036a.p039c.C2390l
    /* renamed from: b */
    public void mo6938b(C2391m mVar) {
    }

    @Override // org.p035a.p036a.p039c.C2390l
    /* renamed from: c */
    public C2384f mo6939c() {
        return this.f6151b;
    }

    @Override // org.p035a.p036a.p039c.C2390l
    /* renamed from: f */
    public C2390l mo6940f() {
        if (!Thread.interrupted()) {
            return this;
        }
        try {
            throw new InterruptedException();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override // org.p035a.p036a.p039c.C2390l
    /* renamed from: g */
    public C2390l mo6941g() {
        return this;
    }
}
