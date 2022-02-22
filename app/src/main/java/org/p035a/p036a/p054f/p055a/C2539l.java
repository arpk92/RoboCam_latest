package org.p035a.p036a.p054f.p055a;

/* renamed from: org.a.a.f.a.l */
public class C2539l extends ThreadLocal<Boolean> {

    /* renamed from: a */
    private final boolean f6818a;

    public C2539l() {
        this(false);
    }

    public C2539l(boolean z) {
        this.f6818a = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Boolean initialValue() {
        return this.f6818a ? Boolean.TRUE : Boolean.FALSE;
    }
}
