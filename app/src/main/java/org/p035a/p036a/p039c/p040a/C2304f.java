package org.p035a.p036a.p039c.p040a;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.p035a.p036a.p039c.C2390l;
import org.p035a.p036a.p039c.C2391m;
import org.p035a.p036a.p053e.C2491b;
import org.p035a.p036a.p053e.C2492c;

/* renamed from: org.a.a.c.a.f */
public class C2304f implements C2299b {

    /* renamed from: d */
    private static final C2491b f6138d = C2492c.m9929a(C2304f.class);

    /* renamed from: a */
    final Map<Integer, C2390l> f6139a;

    /* renamed from: b */
    int f6140b;

    /* renamed from: c */
    int f6141c;

    /* renamed from: e */
    private final C2298a f6142e;

    /* renamed from: f */
    private C2300c f6143f;

    /* renamed from: g */
    private List<C2300c> f6144g;

    /* renamed from: h */
    private boolean f6145h;

    /* renamed from: i */
    private int f6146i;

    /* renamed from: j */
    private final C2391m f6147j = new C2391m() {
        /* class org.p035a.p036a.p039c.p040a.C2304f.C23051 */

        /* renamed from: c */
        final /* synthetic */ boolean f6148c = (!C2304f.class.desiredAssertionStatus());

        @Override // org.p035a.p036a.p039c.C2391m
        /* renamed from: a */
        public void mo6933a(C2390l lVar) {
            boolean z;
            boolean d = lVar.mo6949d();
            synchronized (C2304f.this) {
                if (d) {
                    C2304f.this.f6140b++;
                } else {
                    C2304f.this.f6141c++;
                }
                z = C2304f.this.f6140b + C2304f.this.f6141c == C2304f.this.f6139a.size();
                if (!f6148c && C2304f.this.f6140b + C2304f.this.f6141c > C2304f.this.f6139a.size()) {
                    throw new AssertionError();
                }
            }
            if (z) {
                C2304f.this.mo6934a();
            }
        }
    };

    C2304f(C2298a aVar, Map<Integer, C2390l> map) {
        this.f6142e = aVar;
        this.f6139a = Collections.unmodifiableMap(map);
        for (C2390l lVar : this.f6139a.values()) {
            lVar.mo6936a(this.f6147j);
        }
        if (this.f6139a.isEmpty()) {
            mo6934a();
        }
    }

    /* renamed from: a */
    private void m9137a(C2300c cVar) {
        try {
            cVar.mo6914a(this);
        } catch (Throwable th) {
            if (f6138d.mo7288c()) {
                f6138d.mo7285b("An exception was thrown by " + C2391m.class.getSimpleName() + ".", th);
            }
        }
    }

    /* renamed from: b */
    private void m9138b() {
        if (this.f6143f != null) {
            m9137a(this.f6143f);
            this.f6143f = null;
            if (this.f6144g != null) {
                for (C2300c cVar : this.f6144g) {
                    m9137a(cVar);
                }
                this.f6144g = null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo6934a() {
        boolean z = true;
        synchronized (this) {
            if (this.f6145h) {
                z = false;
            } else {
                this.f6145h = true;
                if (this.f6146i > 0) {
                    notifyAll();
                }
                m9138b();
            }
        }
        return z;
    }

    @Override // java.lang.Iterable
    public Iterator<C2390l> iterator() {
        return this.f6139a.values().iterator();
    }
}
