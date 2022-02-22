package org.p035a.p036a.p043d.p044a.p048d.p049a;

import android.support.v8.renderscript.Allocation;
import org.p035a.p036a.p038b.C2284d;
import org.p035a.p036a.p039c.C2384f;
import org.p035a.p036a.p039c.C2396p;
import org.p035a.p036a.p043d.p044a.p050e.C2473b;

@Deprecated
/* renamed from: org.a.a.d.a.d.a.d */
public class C2442d extends C2473b {
    /* access modifiers changed from: protected */
    @Override // org.p035a.p036a.p043d.p044a.p050e.C2473b
    /* renamed from: a */
    public Object mo7152a(C2396p pVar, C2384f fVar, Object obj) {
        if (!(obj instanceof C2440b)) {
            return obj;
        }
        C2440b bVar = (C2440b) obj;
        int a = bVar.mo7175a();
        if (bVar.mo7177b()) {
            C2284d c = bVar.mo7178c();
            C2284d a2 = fVar.mo7051m().mo6942a().mo6885a(c.mo6870p(), c.mo6838d() + 2);
            a2.mo6848h((byte) a);
            a2.mo6826a(c, c.mo6816a(), c.mo6838d());
            a2.mo6848h(-1);
            return a2;
        }
        C2284d c2 = bVar.mo7178c();
        int d = c2.mo6838d();
        C2284d a3 = fVar.mo7051m().mo6942a().mo6885a(c2.mo6870p(), d + 5);
        a3.mo6848h((byte) a);
        int i = (d >>> 28) & 127;
        int i2 = (d >>> 14) & 127;
        int i3 = (d >>> 7) & 127;
        int i4 = d & 127;
        if (i != 0) {
            a3.mo6848h(i | Allocation.USAGE_SHARED);
            a3.mo6848h(i2 | Allocation.USAGE_SHARED);
            a3.mo6848h(i3 | Allocation.USAGE_SHARED);
            a3.mo6848h(i4);
        } else if (i2 != 0) {
            a3.mo6848h(i2 | Allocation.USAGE_SHARED);
            a3.mo6848h(i3 | Allocation.USAGE_SHARED);
            a3.mo6848h(i4);
        } else if (i3 == 0) {
            a3.mo6848h(i4);
        } else {
            a3.mo6848h(i3 | Allocation.USAGE_SHARED);
            a3.mo6848h(i4);
        }
        a3.mo6826a(c2, c2.mo6816a(), d);
        return a3;
    }
}
