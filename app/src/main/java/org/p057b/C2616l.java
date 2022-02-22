package org.p057b;

import org.p035a.p036a.p039c.C2320al;
import org.p035a.p036a.p039c.C2384f;

/* renamed from: org.b.l */
public class C2616l extends RuntimeException {
    public C2616l(String str, Throwable th) {
        super(str, th);
    }

    public C2616l(Throwable th) {
        super(th);
    }

    /* renamed from: a */
    public static C2616l m10277a(Throwable th, C2384f fVar) {
        return new C2616l(String.format("%s on %s", th != null ? th.getMessage() : "[null throwable]", fVar != null ? fVar.toString() : "[null channel]"), th);
    }

    /* renamed from: a */
    public static C2616l m10278a(C2320al alVar) {
        return m10277a(alVar.mo6994c(), alVar.mo6990a());
    }
}
