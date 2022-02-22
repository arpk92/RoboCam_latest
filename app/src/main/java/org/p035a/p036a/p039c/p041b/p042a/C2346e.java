package org.p035a.p036a.p039c.p041b.p042a;

import java.net.Socket;
import java.util.Map;
import org.p035a.p036a.p039c.C2325aq;
import org.p035a.p036a.p039c.C2326ar;
import org.p035a.p036a.p039c.C2383e;
import org.p035a.p036a.p039c.C2388j;
import org.p035a.p036a.p039c.p041b.C2374c;
import org.p035a.p036a.p053e.C2491b;
import org.p035a.p036a.p053e.C2492c;
import org.p035a.p036a.p054f.p055a.C2528c;

/* renamed from: org.a.a.c.b.a.e */
class C2346e extends C2374c implements C2357n {

    /* renamed from: a */
    private static final C2491b f6258a = C2492c.m9929a(C2346e.class);

    /* renamed from: b */
    private static final C2326ar f6259b = new C2383e();

    /* renamed from: c */
    private volatile int f6260c = 65536;

    /* renamed from: d */
    private volatile int f6261d = 32768;

    /* renamed from: e */
    private volatile C2325aq f6262e;

    /* renamed from: f */
    private volatile C2326ar f6263f = f6259b;

    /* renamed from: g */
    private volatile int f6264g = 16;

    C2346e(Socket socket) {
        super(socket);
    }

    /* renamed from: g */
    private void m9356g(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("writeBufferHighWaterMark: " + i);
        }
        this.f6260c = i;
    }

    /* renamed from: h */
    private void m9357h(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("writeBufferLowWaterMark: " + i);
        }
        this.f6261d = i;
    }

    @Override // org.p035a.p036a.p039c.C2307ab, org.p035a.p036a.p039c.C2385g
    /* renamed from: a */
    public void mo6944a(Map<String, Object> map) {
        super.mo6944a(map);
        if (mo7107c() < mo7108d()) {
            m9357h(mo7107c() >>> 1);
            if (f6258a.mo7288c()) {
                f6258a.mo7287c("writeBufferLowWaterMark cannot be greater than writeBufferHighWaterMark; setting to the half of the writeBufferHighWaterMark.");
            }
        }
    }

    /* renamed from: a */
    public void mo7105a(C2325aq aqVar) {
        if (aqVar == null) {
            throw new NullPointerException("predictor");
        }
        this.f6262e = aqVar;
    }

    /* renamed from: a */
    public void mo7106a(C2326ar arVar) {
        if (arVar == null) {
            throw new NullPointerException("predictorFactory");
        }
        this.f6263f = arVar;
    }

    @Override // org.p035a.p036a.p039c.p041b.C2374c, org.p035a.p036a.p039c.C2307ab
    /* renamed from: a */
    public boolean mo6947a(String str, Object obj) {
        if (super.mo6947a(str, obj)) {
            return true;
        }
        if (str.equals("writeBufferHighWaterMark")) {
            m9356g(C2528c.m10051a(obj));
            return true;
        } else if (str.equals("writeBufferLowWaterMark")) {
            m9357h(C2528c.m10051a(obj));
            return true;
        } else if (str.equals("writeSpinCount")) {
            mo7111f(C2528c.m10051a(obj));
            return true;
        } else if (str.equals("receiveBufferSizePredictorFactory")) {
            mo7106a((C2326ar) obj);
            return true;
        } else if (!str.equals("receiveBufferSizePredictor")) {
            return false;
        } else {
            mo7105a((C2325aq) obj);
            return true;
        }
    }

    @Override // org.p035a.p036a.p039c.p041b.p042a.C2348g
    /* renamed from: c */
    public int mo7107c() {
        return this.f6260c;
    }

    @Override // org.p035a.p036a.p039c.p041b.p042a.C2348g
    /* renamed from: d */
    public int mo7108d() {
        return this.f6261d;
    }

    @Override // org.p035a.p036a.p039c.p041b.p042a.C2348g
    /* renamed from: e */
    public int mo7109e() {
        return this.f6264g;
    }

    @Override // org.p035a.p036a.p039c.p041b.p042a.C2357n
    /* renamed from: f */
    public C2325aq mo7110f() {
        C2325aq aqVar = this.f6262e;
        if (aqVar != null) {
            return aqVar;
        }
        try {
            C2325aq a = mo7112g().mo7015a();
            this.f6262e = a;
            return a;
        } catch (Exception e) {
            throw new C2388j("Failed to create a new " + C2325aq.class.getSimpleName() + '.', e);
        }
    }

    /* renamed from: f */
    public void mo7111f(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("writeSpinCount must be a positive integer.");
        }
        this.f6264g = i;
    }

    /* renamed from: g */
    public C2326ar mo7112g() {
        return this.f6263f;
    }
}
