package org.p035a.p036a.p043d.p044a.p048d;

import java.util.List;
import java.util.Map;
import org.p035a.p036a.p038b.C2284d;
import org.p035a.p036a.p038b.C2286f;

/* renamed from: org.a.a.d.a.d.b */
public class C2443b implements C2451h {

    /* renamed from: b */
    private final C2458n f6406b = new C2458n() {
        /* class org.p035a.p036a.p043d.p044a.p048d.C2443b.C24441 */

        /* access modifiers changed from: package-private */
        @Override // org.p035a.p036a.p043d.p044a.p048d.C2458n
        /* renamed from: a */
        public void mo7186a(String str) {
            super.mo7186a(str);
            if (str.equalsIgnoreCase("Content-Length") || str.equalsIgnoreCase("Transfer-Encoding") || str.equalsIgnoreCase("Trailer")) {
                throw new IllegalArgumentException("prohibited trailing header: " + str);
            }
        }
    };

    @Override // org.p035a.p036a.p043d.p044a.p048d.C2451h
    /* renamed from: a */
    public List<String> mo7183a(String str) {
        return this.f6406b.mo7223d(str);
    }

    @Override // org.p035a.p036a.p043d.p044a.p048d.C2448f
    /* renamed from: a */
    public C2284d mo7172a() {
        return C2286f.f6097c;
    }

    @Override // org.p035a.p036a.p043d.p044a.p048d.C2451h
    /* renamed from: a */
    public void mo7184a(String str, Object obj) {
        this.f6406b.mo7218a(str, obj);
    }

    @Override // org.p035a.p036a.p043d.p044a.p048d.C2448f
    /* renamed from: a */
    public void mo7173a(C2284d dVar) {
        throw new IllegalStateException("read-only");
    }

    @Override // org.p035a.p036a.p043d.p044a.p048d.C2448f
    /* renamed from: b */
    public boolean mo7174b() {
        return true;
    }

    @Override // org.p035a.p036a.p043d.p044a.p048d.C2451h
    /* renamed from: c */
    public List<Map.Entry<String, String>> mo7185c() {
        return this.f6406b.mo7219b();
    }
}
