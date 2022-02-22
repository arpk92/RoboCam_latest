package org.p057b.p058a;

import java.net.URI;
import java.util.regex.Pattern;
import org.p057b.C2608d;
import org.p057b.C2609e;
import org.p057b.C2610f;
import org.p057b.C2611g;

/* renamed from: org.b.a.c */
public class C2551c implements C2609e {

    /* renamed from: a */
    private final Pattern f6827a;

    /* renamed from: b */
    private final C2609e f6828b;

    public C2551c(String str, C2609e eVar) {
        this(Pattern.compile(str), eVar);
    }

    public C2551c(Pattern pattern, C2609e eVar) {
        this.f6827a = pattern;
        this.f6828b = eVar;
    }

    @Override // org.p057b.C2609e
    /* renamed from: a */
    public void mo7412a(C2610f fVar, C2611g gVar, C2608d dVar) {
        if (this.f6827a.matcher(URI.create(fVar.mo7459a()).getPath()).matches()) {
            this.f6828b.mo7412a(fVar, gVar, dVar);
        } else {
            dVar.mo7453a();
        }
    }
}
