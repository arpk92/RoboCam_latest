package org.p035a.p036a.p043d.p044a.p045a;

import org.p035a.p036a.p054f.p055a.p056a.C2510h;
import org.p035a.p036a.p054f.p055a.p056a.C2514k;

/* renamed from: org.a.a.d.a.a.e */
final class C2423e {
    /* renamed from: a */
    static Enum<?> m9588a(C2425f fVar) {
        switch (fVar) {
            case NONE:
                return C2510h.f6731a;
            case ZLIB:
                return C2510h.f6732b;
            case GZIP:
                return C2510h.f6733c;
            case ZLIB_OR_NONE:
                return C2510h.f6734d;
            default:
                throw new Error();
        }
    }

    /* renamed from: a */
    static void m9589a(C2514k kVar, String str, int i) {
        throw m9590b(kVar, str, i);
    }

    /* renamed from: b */
    static C2415a m9590b(C2514k kVar, String str, int i) {
        return new C2415a(str + " (" + i + ")" + (kVar.f6769i != null ? ": " + kVar.f6769i : ""));
    }
}
