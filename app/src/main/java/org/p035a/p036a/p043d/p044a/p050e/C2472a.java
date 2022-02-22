package org.p035a.p036a.p043d.p044a.p050e;

import org.p035a.p036a.p039c.C2324ap;
import org.p035a.p036a.p039c.C2384f;
import org.p035a.p036a.p039c.C2387i;
import org.p035a.p036a.p039c.C2396p;
import org.p035a.p036a.p039c.C2404x;
import org.p035a.p036a.p039c.C2405y;

/* renamed from: org.a.a.d.a.e.a */
public abstract class C2472a implements C2404x {
    protected C2472a() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo7153a(C2396p pVar, C2384f fVar, Object obj);

    @Override // org.p035a.p036a.p039c.C2404x
    /* renamed from: b */
    public void mo7023b(C2396p pVar, C2387i iVar) {
        if (!(iVar instanceof C2324ap)) {
            pVar.mo6979a(iVar);
            return;
        }
        C2324ap apVar = (C2324ap) iVar;
        Object c = apVar.mo7006c();
        Object a = mo7153a(pVar, apVar.mo6990a(), c);
        if (c == a) {
            pVar.mo6979a(iVar);
        } else if (a != null) {
            C2405y.m9545a(pVar, a, apVar.mo7007d());
        }
    }
}
