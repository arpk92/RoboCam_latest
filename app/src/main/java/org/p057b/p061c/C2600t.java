package org.p057b.p061c;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;
import org.p035a.p036a.p039c.C2324ap;
import org.p035a.p036a.p039c.C2329au;
import org.p035a.p036a.p039c.C2384f;
import org.p035a.p036a.p039c.C2396p;
import org.p035a.p036a.p039c.C2403w;

/* renamed from: org.b.c.t */
public class C2600t extends C2329au {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Map<C2384f, Long> f6990a = new HashMap();

    /* renamed from: b */
    private final long f6991b;

    /* renamed from: c */
    private final Executor f6992c;

    public C2600t(long j, Executor executor) {
        this.f6991b = j;
        this.f6992c = executor;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean m10237a(Long l) {
        return System.currentTimeMillis() - l.longValue() > this.f6991b;
    }

    /* renamed from: b */
    private void m10239b(final C2384f fVar) {
        this.f6992c.execute(new Runnable() {
            /* class org.p057b.p061c.C2600t.C26011 */

            public void run() {
                C2600t.this.f6990a.put(fVar, Long.valueOf(System.currentTimeMillis()));
            }
        });
    }

    /* renamed from: a */
    public void mo7500a() {
        this.f6992c.execute(new Runnable() {
            /* class org.p057b.p061c.C2600t.C26022 */

            public void run() {
                Iterator it = C2600t.this.f6990a.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    if (C2600t.this.m10237a((Long) entry.getValue())) {
                        ((C2384f) entry.getKey()).mo6905i();
                        it.remove();
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public void mo7501a(final C2384f fVar) {
        this.f6992c.execute(new Runnable() {
            /* class org.p057b.p061c.C2600t.C26033 */

            public void run() {
                C2600t.this.f6990a.remove(fVar);
            }
        });
    }

    @Override // org.p035a.p036a.p039c.C2329au
    /* renamed from: a */
    public void mo7017a(C2396p pVar, C2324ap apVar) {
        m10239b(apVar.mo6990a());
        super.mo7017a(pVar, apVar);
    }

    @Override // org.p035a.p036a.p039c.C2329au
    /* renamed from: a */
    public void mo7020a(C2396p pVar, C2403w wVar) {
        m10239b(wVar.mo6990a());
        super.mo7020a(pVar, wVar);
    }
}
