package org.p035a.p036a.p043d.p044a.p048d.p049a;

import android.support.v8.renderscript.Allocation;
import org.p035a.p036a.p038b.C2284d;
import org.p035a.p036a.p038b.C2286f;
import org.p035a.p036a.p054f.C2496a;

@Deprecated
/* renamed from: org.a.a.d.a.d.a.a */
public class C2439a implements C2440b {

    /* renamed from: b */
    private int f6401b;

    /* renamed from: c */
    private C2284d f6402c;

    public C2439a() {
        this(0, C2286f.f6097c);
    }

    public C2439a(int i, C2284d dVar) {
        mo7176a(i, dVar);
    }

    public C2439a(String str) {
        this(0, C2286f.m8925a(str, C2496a.f6592d));
    }

    @Override // org.p035a.p036a.p043d.p044a.p048d.p049a.C2440b
    /* renamed from: a */
    public int mo7175a() {
        return this.f6401b;
    }

    /* renamed from: a */
    public void mo7176a(int i, C2284d dVar) {
        if (dVar == null) {
            throw new NullPointerException("binaryData");
        } else if ((i & Allocation.USAGE_SHARED) != 0 || dVar.mo6817a(dVar.mo6816a(), dVar.mo6829b(), (byte) -1) < 0) {
            this.f6401b = i & 255;
            this.f6402c = dVar;
        } else {
            throw new IllegalArgumentException("a text frame should not contain 0xFF.");
        }
    }

    @Override // org.p035a.p036a.p043d.p044a.p048d.p049a.C2440b
    /* renamed from: b */
    public boolean mo7177b() {
        return (mo7175a() & Allocation.USAGE_SHARED) == 0;
    }

    @Override // org.p035a.p036a.p043d.p044a.p048d.p049a.C2440b
    /* renamed from: c */
    public C2284d mo7178c() {
        return this.f6402c;
    }

    @Override // org.p035a.p036a.p043d.p044a.p048d.p049a.C2440b
    /* renamed from: d */
    public String mo7179d() {
        return mo7178c().mo6819a(C2496a.f6592d);
    }

    public String toString() {
        return getClass().getSimpleName() + "(type: " + mo7175a() + ", " + "data: " + mo7178c() + ')';
    }
}
