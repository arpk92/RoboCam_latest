package org.p035a.p036a.p043d.p044a.p048d;

import java.io.UnsupportedEncodingException;
import java.util.Map;
import org.p035a.p036a.p038b.C2284d;
import org.p035a.p036a.p038b.C2286f;
import org.p035a.p036a.p039c.C2384f;
import org.p035a.p036a.p039c.C2396p;
import org.p035a.p036a.p043d.p044a.p050e.C2473b;
import org.p035a.p036a.p054f.C2496a;

/* renamed from: org.a.a.d.a.d.q */
public abstract class C2464q extends C2473b {

    /* renamed from: a */
    private static final byte[] f6460a = {13, 10};

    /* renamed from: b */
    private static final C2284d f6461b = C2286f.m8925a("0\r\n\r\n", C2496a.f6594f);

    /* renamed from: c */
    private volatile boolean f6462c;

    protected C2464q() {
    }

    /* renamed from: a */
    private static void m9787a(C2284d dVar, String str, String str2) {
        try {
            dVar.mo6832b(str.getBytes("ASCII"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        dVar.mo6848h(58);
        dVar.mo6848h(32);
        try {
            dVar.mo6832b(str2.getBytes("ASCII"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        dVar.mo6848h(13);
        dVar.mo6848h(10);
    }

    /* renamed from: a */
    private static void m9788a(C2284d dVar, C2451h hVar) {
        for (Map.Entry<String, String> entry : hVar.mo7185c()) {
            m9787a(dVar, entry.getKey(), entry.getValue());
        }
    }

    /* renamed from: b */
    private static void m9789b(C2284d dVar, C2460o oVar) {
        for (Map.Entry<String, String> entry : oVar.mo7200d()) {
            m9787a(dVar, entry.getKey(), entry.getValue());
        }
    }

    /* access modifiers changed from: protected */
    @Override // org.p035a.p036a.p043d.p044a.p050e.C2473b
    /* renamed from: a */
    public Object mo7152a(C2396p pVar, C2384f fVar, Object obj) {
        boolean a;
        if (obj instanceof C2460o) {
            C2460o oVar = (C2460o) obj;
            if (!oVar.mo7194a()) {
                a = C2452i.m9701a(oVar);
                this.f6462c = a;
            } else if (C2452i.m9704c(oVar)) {
                this.f6462c = false;
                C2452i.m9703b(oVar);
                a = false;
            } else {
                if (!C2452i.m9701a(oVar)) {
                    oVar.mo7189a("Transfer-Encoding", "chunked");
                }
                this.f6462c = true;
                a = true;
            }
            C2284d a2 = C2286f.m8934a(fVar.mo7051m().mo6942a());
            mo7238a(a2, oVar);
            m9789b(a2, oVar);
            a2.mo6848h(13);
            a2.mo6848h(10);
            C2284d f = oVar.mo7203f();
            if (!f.mo6836c()) {
                return a2;
            }
            if (a) {
                throw new IllegalArgumentException("HttpMessage.content must be empty if Transfer-Encoding is chunked.");
            }
            return C2286f.m8937a(a2, f);
        } else if (!(obj instanceof C2448f)) {
            return obj;
        } else {
            C2448f fVar2 = (C2448f) obj;
            if (!this.f6462c) {
                return fVar2.mo7172a();
            }
            if (fVar2.mo7174b()) {
                this.f6462c = false;
                if (!(fVar2 instanceof C2451h)) {
                    return f6461b.mo6871q();
                }
                C2284d a3 = C2286f.m8934a(fVar.mo7051m().mo6942a());
                a3.mo6848h(48);
                a3.mo6848h(13);
                a3.mo6848h(10);
                m9788a(a3, (C2451h) fVar2);
                a3.mo6848h(13);
                a3.mo6848h(10);
                return a3;
            }
            C2284d a4 = fVar2.mo7172a();
            int d = a4.mo6838d();
            return C2286f.m8937a(C2286f.m8925a(Integer.toHexString(d), C2496a.f6594f), C2286f.m8936a(f6460a), a4.mo6879g(a4.mo6816a(), d), C2286f.m8936a(f6460a));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo7238a(C2284d dVar, C2460o oVar);
}
