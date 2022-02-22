package org.p035a.p036a.p043d.p044a.p050e;

import org.p035a.p036a.p039c.C2324ap;
import org.p035a.p036a.p039c.C2384f;
import org.p035a.p036a.p039c.C2386h;
import org.p035a.p036a.p039c.C2387i;
import org.p035a.p036a.p039c.C2396p;
import org.p035a.p036a.p039c.C2405y;

/* renamed from: org.a.a.d.a.e.b */
public abstract class C2473b implements C2386h {
    protected C2473b() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo7152a(C2396p pVar, C2384f fVar, Object obj);

    @Override // org.p035a.p036a.p039c.C2386h
    /* renamed from: a */
    public void mo7019a(C2396p pVar, C2387i iVar) {
        if (!(iVar instanceof C2324ap)) {
            pVar.mo6981b(iVar);
            return;
        }
        C2324ap apVar = (C2324ap) iVar;
        Object c = apVar.mo7006c();
        Object a = mo7152a(pVar, apVar.mo6990a(), c);
        if (c == a) {
            pVar.mo6981b(iVar);
        } else if (a != null) {
            C2405y.m9548a(pVar, apVar.mo6991b(), a, apVar.mo7007d());
        }
    }
}
