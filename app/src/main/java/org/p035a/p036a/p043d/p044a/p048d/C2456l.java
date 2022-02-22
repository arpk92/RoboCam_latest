package org.p035a.p036a.p043d.p044a.p048d;

import org.p035a.p036a.p038b.C2284d;
import org.p035a.p036a.p043d.p044a.p045a.C2419c;
import org.p035a.p036a.p043d.p044a.p045a.C2425f;
import org.p035a.p036a.p043d.p044a.p046b.C2430c;

/* renamed from: org.a.a.d.a.d.l */
public class C2456l extends C2455k {
    /* access modifiers changed from: protected */
    @Override // org.p035a.p036a.p043d.p044a.p048d.C2455k
    /* renamed from: a */
    public C2430c<C2284d> mo7214a(String str) {
        if ("gzip".equalsIgnoreCase(str) || "x-gzip".equalsIgnoreCase(str)) {
            return new C2430c<>(new C2419c(C2425f.GZIP));
        } else if (!"deflate".equalsIgnoreCase(str) && !"x-deflate".equalsIgnoreCase(str)) {
            return null;
        } else {
            return new C2430c<>(new C2419c(C2425f.ZLIB_OR_NONE));
        }
    }
}
