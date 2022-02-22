package org.p035a.p036a.p043d.p044a.p048d.p049a;

import org.p035a.p036a.p038b.C2284d;
import org.p035a.p036a.p039c.C2384f;
import org.p035a.p036a.p039c.C2396p;
import org.p035a.p036a.p043d.p044a.p047c.C2437c;
import org.p035a.p036a.p043d.p044a.p051f.C2475b;
import org.p035a.p036a.p043d.p044a.p051f.C2478e;

@Deprecated
/* renamed from: org.a.a.d.a.d.a.c */
public class C2441c extends C2475b<C2478e> {

    /* renamed from: c */
    private final int f6404c;

    /* renamed from: d */
    private boolean f6405d;

    public C2441c() {
        this(16384);
    }

    public C2441c(int i) {
        this.f6404c = i;
    }

    /* renamed from: a */
    private C2440b m9647a(int i, C2284d dVar) throws C2437c {
        byte f;
        int i2 = 0;
        long j = 0;
        do {
            f = dVar.mo6843f();
            j = (j << 7) | ((long) (f & Byte.MAX_VALUE));
            if (j > ((long) this.f6404c)) {
                throw new C2437c();
            }
            i2++;
            if (i2 > 8) {
                throw new C2437c();
            }
        } while ((f & 128) == 128);
        if (i == 255 && j == 0) {
            this.f6405d = true;
        }
        return new C2439a(i, dVar.mo6844f((int) j));
    }

    /* renamed from: b */
    private C2440b m9648b(int i, C2284d dVar) throws C2437c {
        int a = dVar.mo6816a();
        int b = mo7168b();
        int a2 = dVar.mo6817a(a, a + b, (byte) -1);
        if (a2 != -1) {
            int i2 = a2 - a;
            if (i2 > this.f6404c) {
                throw new C2437c();
            }
            C2284d f = dVar.mo6844f(i2);
            dVar.mo6846g(1);
            return new C2439a(i, f);
        } else if (b <= this.f6404c) {
            return null;
        } else {
            throw new C2437c();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Object mo7181a(C2396p pVar, C2384f fVar, C2284d dVar, C2478e eVar) {
        if (this.f6405d) {
            dVar.mo6846g(mo7168b());
            return null;
        }
        byte f = dVar.mo6843f();
        try {
            return (f & 128) == 128 ? m9647a(f, dVar) : m9648b(f, dVar);
        } catch (C2437c c2437c) {
            c2437c.printStackTrace();
        }
        return null;
    }
}
