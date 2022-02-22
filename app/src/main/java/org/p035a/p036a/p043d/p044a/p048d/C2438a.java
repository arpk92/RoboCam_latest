package org.p035a.p036a.p043d.p044a.p048d;

import org.p035a.p036a.p038b.C2284d;

/* renamed from: org.a.a.d.a.d.a */
public class C2438a implements C2448f {

    /* renamed from: b */
    private C2284d f6399b;

    /* renamed from: c */
    private boolean f6400c;

    public C2438a(C2284d dVar) {
        mo7173a(dVar);
    }

    @Override // org.p035a.p036a.p043d.p044a.p048d.C2448f
    /* renamed from: a */
    public C2284d mo7172a() {
        return this.f6399b;
    }

    @Override // org.p035a.p036a.p043d.p044a.p048d.C2448f
    /* renamed from: a */
    public void mo7173a(C2284d dVar) {
        if (dVar == null) {
            throw new NullPointerException("content");
        }
        this.f6400c = !dVar.mo6836c();
        this.f6399b = dVar;
    }

    @Override // org.p035a.p036a.p043d.p044a.p048d.C2448f
    /* renamed from: b */
    public boolean mo7174b() {
        return this.f6400c;
    }
}
