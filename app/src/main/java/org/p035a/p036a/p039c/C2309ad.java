package org.p035a.p036a.p039c;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.RejectedExecutionException;
import org.p035a.p036a.p053e.C2491b;
import org.p035a.p036a.p053e.C2492c;

/* renamed from: org.a.a.c.ad */
public class C2309ad implements C2398r {

    /* renamed from: a */
    static final C2491b f6165a = C2492c.m9929a(C2309ad.class);

    /* renamed from: b */
    static final C2401u f6166b = new C2311b();

    /* renamed from: c */
    private volatile C2384f f6167c;

    /* renamed from: d */
    private volatile C2401u f6168d;

    /* renamed from: e */
    private volatile C2310a f6169e;

    /* renamed from: f */
    private volatile C2310a f6170f;

    /* renamed from: g */
    private final Map<String, C2310a> f6171g = new HashMap(4);

    /* renamed from: org.a.a.c.ad$a */
    private final class C2310a implements C2396p {

        /* renamed from: a */
        volatile C2310a f6172a;

        /* renamed from: b */
        volatile C2310a f6173b;

        /* renamed from: d */
        private final String f6175d;

        /* renamed from: e */
        private final C2395o f6176e;

        /* renamed from: f */
        private final boolean f6177f;

        /* renamed from: g */
        private final boolean f6178g;

        /* renamed from: h */
        private volatile Object f6179h;

        C2310a(C2310a aVar, C2310a aVar2, String str, C2395o oVar) {
            if (str == null) {
                throw new NullPointerException("name");
            } else if (oVar == null) {
                throw new NullPointerException("handler");
            } else {
                this.f6177f = oVar instanceof C2404x;
                this.f6178g = oVar instanceof C2386h;
                if (this.f6177f || this.f6178g) {
                    this.f6173b = aVar;
                    this.f6172a = aVar2;
                    this.f6175d = str;
                    this.f6176e = oVar;
                    return;
                }
                throw new IllegalArgumentException("handler must be either " + C2404x.class.getName() + " or " + C2386h.class.getName() + '.');
            }
        }

        @Override // org.p035a.p036a.p039c.C2396p
        /* renamed from: a */
        public C2384f mo6977a() {
            return mo6980b().mo6965b();
        }

        @Override // org.p035a.p036a.p039c.C2396p
        /* renamed from: a */
        public void mo6978a(Object obj) {
            this.f6179h = obj;
        }

        @Override // org.p035a.p036a.p039c.C2396p
        /* renamed from: a */
        public void mo6979a(C2387i iVar) {
            C2310a a = C2309ad.this.mo6953a(this.f6172a);
            if (a != null) {
                C2309ad.this.mo6959a(a, iVar);
            }
        }

        @Override // org.p035a.p036a.p039c.C2396p
        /* renamed from: b */
        public C2398r mo6980b() {
            return C2309ad.this;
        }

        @Override // org.p035a.p036a.p039c.C2396p
        /* renamed from: b */
        public void mo6981b(C2387i iVar) {
            C2310a b = C2309ad.this.mo6964b(this.f6173b);
            if (b == null) {
                try {
                    C2309ad.this.mo6973d().mo6988a(C2309ad.this, iVar);
                } catch (Throwable th) {
                    C2309ad.this.mo6962a(iVar, th);
                }
            } else {
                C2309ad.this.mo6970b(b, iVar);
            }
        }

        @Override // org.p035a.p036a.p039c.C2396p
        /* renamed from: c */
        public String mo6982c() {
            return this.f6175d;
        }

        @Override // org.p035a.p036a.p039c.C2396p
        /* renamed from: d */
        public C2395o mo6983d() {
            return this.f6176e;
        }

        @Override // org.p035a.p036a.p039c.C2396p
        /* renamed from: e */
        public Object mo6984e() {
            return this.f6179h;
        }

        /* renamed from: f */
        public boolean mo6985f() {
            return this.f6178g;
        }

        /* renamed from: g */
        public boolean mo6986g() {
            return this.f6177f;
        }
    }

    /* renamed from: org.a.a.c.ad$b */
    private static final class C2311b implements C2401u {
        C2311b() {
        }

        /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
         method: org.a.a.c.y.a(org.a.a.c.f, java.lang.Throwable):org.a.a.c.l
         arg types: [org.a.a.c.f, java.util.concurrent.RejectedExecutionException]
         candidates:
          org.a.a.c.y.a(org.a.a.c.f, long):org.a.a.c.l
          org.a.a.c.y.a(org.a.a.c.f, boolean):org.a.a.c.l
          org.a.a.c.y.a(org.a.a.c.p, java.lang.Throwable):org.a.a.c.l
          org.a.a.c.y.a(org.a.a.c.f, java.lang.Object):void
          org.a.a.c.y.a(org.a.a.c.f, java.net.SocketAddress):void
          org.a.a.c.y.a(org.a.a.c.f, org.a.a.c.f):void
          org.a.a.c.y.a(org.a.a.c.p, org.a.a.c.l):void
          org.a.a.c.y.a(org.a.a.c.f, java.lang.Throwable):org.a.a.c.l */
        @Override // org.p035a.p036a.p039c.C2401u
        /* renamed from: a */
        public C2390l mo6987a(C2398r rVar, Runnable runnable) {
            if (C2309ad.f6165a.mo7288c()) {
                C2309ad.f6165a.mo7287c("Not attached yet; rejecting: " + runnable);
            }
            return C2405y.m9536a(rVar.mo6965b(), (Throwable) new RejectedExecutionException("Not attached yet"));
        }

        @Override // org.p035a.p036a.p039c.C2401u
        /* renamed from: a */
        public void mo6988a(C2398r rVar, C2387i iVar) {
            if (C2309ad.f6165a.mo7288c()) {
                C2309ad.f6165a.mo7287c("Not attached yet; discarding: " + iVar);
            }
        }

        @Override // org.p035a.p036a.p039c.C2401u
        /* renamed from: a */
        public void mo6989a(C2398r rVar, C2387i iVar, C2399s sVar) {
            throw sVar;
        }
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [org.a.a.c.ad] */
    /* renamed from: a */
    private C2395o m9173a(C2310a aVar, String str, C2395o oVar) {
        C2397q qVar;
        boolean z;
        C2397q e = null;
        boolean z2 = true;
        if (aVar == ((C2309ad) this).f6169e) {
            mo6974e();
            mo6969b(str, oVar);
        } else if (aVar == ((C2309ad) this).f6170f) {
            mo6975f();
            mo6958a(str, oVar);
        } else {
            boolean equals = aVar.mo6982c().equals(str);
            if (!equals) {
                m9178c(str);
            }
            C2310a aVar2 = aVar.f6173b;
            C2310a aVar3 = aVar.f6172a;
            C2310a aVar4 = new C2310a(aVar2, aVar3, str, oVar);
            m9180c((C2396p) aVar);
            m9174a((C2396p) aVar4);
            aVar2.f6172a = aVar4;
            aVar3.f6173b = aVar4;
            if (!equals) {
                ((C2309ad) this).f6171g.remove(aVar.mo6982c());
            }
            ((C2309ad) this).f6171g.put(str, aVar4);
            try {
                m9182d(aVar);
                z = true;
                qVar = null;
            } catch (C2397q e2) {
                qVar = e2;
                z = false;
            }
            try {
                m9175b(aVar4);
            } catch (C2397q e3) {
                e = e3;
                z2 = false;
            }
            if (!z && !z2) {
                f6165a.mo7285b(qVar.getMessage(), qVar);
                f6165a.mo7285b(e.getMessage(), e);
                throw new C2397q("Both " + aVar.mo6983d().getClass().getName() + ".afterRemove() and " + aVar4.mo6983d().getClass().getName() + ".afterAdd() failed; see logs.");
            } else if (!z) {
                throw qVar;
            } else if (!z2) {
                throw e;
            }
        }
        return aVar.mo6983d();
    }

    /* renamed from: a */
    private static void m9174a(C2396p pVar) {
        if (pVar.mo6983d() instanceof C2323ao) {
            C2323ao aoVar = (C2323ao) pVar.mo6983d();
            try {
                aoVar.mo7009a(pVar);
            } catch (Throwable th) {
                throw new C2397q(aoVar.getClass().getName() + ".beforeAdd() has thrown an exception; not adding.", th);
            }
        }
    }

    /* renamed from: b */
    private void m9175b(C2396p pVar) {
        C2323ao aoVar;
        boolean z;
        if (pVar.mo6983d() instanceof C2323ao) {
            aoVar = (C2323ao) pVar.mo6983d();
            try {
                aoVar.mo7010b(pVar);
                return;
            } catch (Throwable th) {
                if (f6165a.mo7288c()) {
                    f6165a.mo7285b("Failed to remove a handler: " + pVar.mo6982c(), th);
                }
                z = false;
            }
        } else {
            return;
        }
        if (z) {
          //  throw new C2397q(aoVar.getClass().getName() + ".afterAdd() has thrown an exception; removed.", th);
        }
      //  throw new C2397q(aoVar.getClass().getName() + ".afterAdd() has thrown an exception; also failed to remove.", th);
    }

    /* renamed from: c */
    private C2310a m9176c(C2310a aVar) {
        if (this.f6169e == this.f6170f) {
            this.f6170f = null;
            this.f6169e = null;
            this.f6171g.clear();
        } else if (aVar == this.f6169e) {
            mo6974e();
        } else if (aVar == this.f6170f) {
            mo6975f();
        } else {
            m9180c((C2396p) aVar);
            C2310a aVar2 = aVar.f6173b;
            C2310a aVar3 = aVar.f6172a;
            aVar2.f6172a = aVar3;
            aVar3.f6173b = aVar2;
            this.f6171g.remove(aVar.mo6982c());
            m9182d(aVar);
        }
        return aVar;
    }

    /* renamed from: c */
    private C2310a m9177c(C2395o oVar) {
        C2310a aVar = (C2310a) mo6968b(oVar);
        if (aVar != null) {
            return aVar;
        }
        throw new NoSuchElementException(oVar.getClass().getName());
    }

    /* renamed from: c */
    private void m9178c(String str) {
        if (this.f6171g.containsKey(str)) {
            throw new IllegalArgumentException("Duplicate handler name: " + str);
        }
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [org.a.a.c.ad] */
    /* renamed from: c */
    private void m9179c(String str, C2395o oVar) {
        C2310a aVar = new C2310a(null, null, str, oVar);
        m9174a((C2396p) aVar);
        ((C2309ad) this).f6170f = aVar;
        ((C2309ad) this).f6169e = aVar;
        ((C2309ad) this).f6171g.clear();
        ((C2309ad) this).f6171g.put(str, aVar);
        m9175b(aVar);
    }

    /* renamed from: c */
    private static void m9180c(C2396p pVar) {
        if (pVar.mo6983d() instanceof C2323ao) {
            C2323ao aoVar = (C2323ao) pVar.mo6983d();
            try {
                aoVar.mo7011c(pVar);
            } catch (Throwable th) {
                throw new C2397q(aoVar.getClass().getName() + ".beforeRemove() has thrown an exception; not removing.", th);
            }
        }
    }

    /* renamed from: d */
    private C2310a m9181d(String str) {
        C2310a aVar = (C2310a) mo6967b(str);
        if (aVar != null) {
            return aVar;
        }
        throw new NoSuchElementException(str);
    }

    /* renamed from: d */
    private static void m9182d(C2396p pVar) {
        if (pVar.mo6983d() instanceof C2323ao) {
            C2323ao aoVar = (C2323ao) pVar.mo6983d();
            try {
                aoVar.mo7012d(pVar);
            } catch (Throwable th) {
                throw new C2397q(aoVar.getClass().getName() + ".afterRemove() has thrown an exception.", th);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C2310a mo6953a(C2310a aVar) {
        if (aVar == null) {
            return null;
        }
        while (!aVar.mo6986g()) {
            aVar = aVar.f6172a;
            if (aVar == null) {
                return null;
            }
        }
        return aVar;
    }

    @Override // org.p035a.p036a.p039c.C2398r
    /* renamed from: a */
    public C2390l mo6954a(Runnable runnable) {
        return mo6973d().mo6987a(this, runnable);
    }

    @Override // org.p035a.p036a.p039c.C2398r
    /* renamed from: a */
    public synchronized C2395o mo6955a() {
        C2310a aVar;
        aVar = this.f6170f;
        return aVar == null ? null : aVar.mo6983d();
    }

    @Override // org.p035a.p036a.p039c.C2398r
    /* renamed from: a */
    public synchronized C2395o mo6956a(String str) {
        return m9176c(m9181d(str)).mo6983d();
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [org.a.a.c.ad] */
    @Override // org.p035a.p036a.p039c.C2398r
    /* renamed from: a */
    public synchronized void mo6957a(String str, String str2, C2395o oVar) {
        C2310a d = m9181d(str);
        if (d == ((C2309ad) this).f6170f) {
            mo6958a(str2, oVar);
        } else {
            m9178c(str2);
            C2310a aVar = new C2310a(d, d.f6172a, str2, oVar);
            m9174a((C2396p) aVar);
            d.f6172a.f6173b = aVar;
            d.f6172a = aVar;
            ((C2309ad) this).f6171g.put(str2, aVar);
            m9175b(aVar);
        }
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [org.a.a.c.ad] */
    @Override // org.p035a.p036a.p039c.C2398r
    /* renamed from: a */
    public synchronized void mo6958a(String str, C2395o oVar) {
        if (((C2309ad) this).f6171g.isEmpty()) {
            m9179c(str, oVar);
        } else {
            m9178c(str);
            C2310a aVar = ((C2309ad) this).f6170f;
            C2310a aVar2 = new C2310a(aVar, null, str, oVar);
            m9174a((C2396p) aVar2);
            aVar.f6172a = aVar2;
            ((C2309ad) this).f6170f = aVar2;
            ((C2309ad) this).f6171g.put(str, aVar2);
            m9175b(aVar2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo6959a(C2310a aVar, C2387i iVar) {
        try {
            ((C2404x) aVar.mo6983d()).mo7023b(aVar, iVar);
        } catch (Throwable th) {
            mo6962a(iVar, th);
        }
    }

    @Override // org.p035a.p036a.p039c.C2398r
    /* renamed from: a */
    public void mo6960a(C2384f fVar, C2401u uVar) {
        if (fVar == null) {
            throw new NullPointerException("channel");
        } else if (uVar == null) {
            throw new NullPointerException("sink");
        } else if (this.f6167c == null && this.f6168d == null) {
            this.f6167c = fVar;
            this.f6168d = uVar;
        } else {
            throw new IllegalStateException("attached already");
        }
    }

    @Override // org.p035a.p036a.p039c.C2398r
    /* renamed from: a */
    public void mo6961a(C2387i iVar) {
        C2310a a = mo6953a(this.f6169e);
        if (a != null) {
            mo6959a(a, iVar);
        } else if (f6165a.mo7288c()) {
            f6165a.mo7287c("The pipeline contains no upstream handlers; discarding: " + iVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6962a(C2387i iVar, Throwable th) {
        if (!(iVar instanceof C2320al)) {
            try {
                this.f6168d.mo6989a(this, iVar, th instanceof C2399s ? (C2399s) th : new C2399s(th));
            } catch (Exception e) {
                if (f6165a.mo7288c()) {
                    f6165a.mo7285b("An exception was thrown by an exception handler.", e);
                }
            }
        } else if (f6165a.mo7288c()) {
            f6165a.mo7285b("An exception was thrown by a user handler while handling an exception event (" + iVar + ")", th);
        }
    }

    @Override // org.p035a.p036a.p039c.C2398r
    /* renamed from: a */
    public synchronized void mo6963a(C2395o oVar) {
        m9176c(m9177c(oVar));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C2310a mo6964b(C2310a aVar) {
        if (aVar == null) {
            return null;
        }
        while (!aVar.mo6985f()) {
            aVar = aVar.f6173b;
            if (aVar == null) {
                return null;
            }
        }
        return aVar;
    }

    @Override // org.p035a.p036a.p039c.C2398r
    /* renamed from: b */
    public C2384f mo6965b() {
        return this.f6167c;
    }

    @Override // org.p035a.p036a.p039c.C2398r
    /* renamed from: b */
    public synchronized C2395o mo6966b(String str, String str2, C2395o oVar) {
        return m9173a(m9181d(str), str2, oVar);
    }

    /* renamed from: b */
    public synchronized C2396p mo6967b(String str) {
        if (str == null) {
            throw new NullPointerException("name");
        }
        return this.f6171g.get(str);
    }

    /* renamed from: b */
    public synchronized C2396p mo6968b(C2395o oVar) {
        C2310a aVar = null;
        synchronized (this) {
            if (oVar == null) {
                throw new NullPointerException("handler");
            } else if (!this.f6171g.isEmpty()) {
                C2310a aVar2 = this.f6169e;
                while (true) {
                    if (aVar2.mo6983d() != oVar) {
                        aVar2 = aVar2.f6172a;
                        if (aVar2 == null) {
                            break;
                        }
                    } else {
                        aVar = aVar2;
                        break;
                    }
                }
            }
        }
        return aVar;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [org.a.a.c.ad] */
    /* renamed from: b */
    public synchronized void mo6969b(String str, C2395o oVar) {
        if (((C2309ad) this).f6171g.isEmpty()) {
            m9179c(str, oVar);
        } else {
            m9178c(str);
            C2310a aVar = ((C2309ad) this).f6169e;
            C2310a aVar2 = new C2310a(null, aVar, str, oVar);
            m9174a((C2396p) aVar2);
            aVar.f6173b = aVar2;
            ((C2309ad) this).f6169e = aVar2;
            ((C2309ad) this).f6171g.put(str, aVar2);
            m9175b(aVar2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo6970b(C2310a aVar, C2387i iVar) {
        if (iVar instanceof C2336ay) {
            throw new IllegalArgumentException("cannot send an upstream event to downstream");
        }
        try {
            ((C2386h) aVar.mo6983d()).mo7019a(aVar, iVar);
        } catch (Throwable th) {
            iVar.mo6991b().mo6910a(th);
            mo6962a(iVar, th);
        }
    }

    @Override // org.p035a.p036a.p039c.C2398r
    /* renamed from: b */
    public void mo6971b(C2387i iVar) {
        C2310a b = mo6964b(this.f6170f);
        if (b == null) {
            try {
                mo6973d().mo6988a(this, iVar);
            } catch (Throwable th) {
                mo6962a(iVar, th);
            }
        } else {
            mo6970b(b, iVar);
        }
    }

    @Override // org.p035a.p036a.p039c.C2398r
    /* renamed from: c */
    public Map<String, C2395o> mo6972c() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (this.f6171g.isEmpty()) {
            return linkedHashMap;
        }
        C2310a aVar = this.f6169e;
        do {
            linkedHashMap.put(aVar.mo6982c(), aVar.mo6983d());
            aVar = aVar.f6172a;
        } while (aVar != null);
        return linkedHashMap;
    }

    /* renamed from: d */
    public C2401u mo6973d() {
        C2401u uVar = this.f6168d;
        return uVar == null ? f6166b : uVar;
    }

    /* renamed from: e */
    public synchronized C2395o mo6974e() {
        C2310a aVar;
        if (this.f6171g.isEmpty()) {
            throw new NoSuchElementException();
        }
        aVar = this.f6169e;
        if (aVar == null) {
            throw new NoSuchElementException();
        }
        m9180c((C2396p) aVar);
        if (aVar.f6172a == null) {
            this.f6170f = null;
            this.f6169e = null;
            this.f6171g.clear();
        } else {
            aVar.f6172a.f6173b = null;
            this.f6169e = aVar.f6172a;
            this.f6171g.remove(aVar.mo6982c());
        }
        m9182d(aVar);
        return aVar.mo6983d();
    }

    /* renamed from: f */
    public synchronized C2395o mo6975f() {
        C2310a aVar;
        if (this.f6171g.isEmpty()) {
            throw new NoSuchElementException();
        }
        aVar = this.f6170f;
        if (aVar == null) {
            throw new NoSuchElementException();
        }
        m9180c((C2396p) aVar);
        if (aVar.f6173b == null) {
            this.f6170f = null;
            this.f6169e = null;
            this.f6171g.clear();
        } else {
            aVar.f6173b.f6172a = null;
            this.f6170f = aVar.f6173b;
            this.f6171g.remove(aVar.mo6982c());
        }
        m9180c((C2396p) aVar);
        return aVar.mo6983d();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('{');
        C2310a aVar = this.f6169e;
        if (aVar != null) {
            while (true) {
                sb.append('(');
                sb.append(aVar.mo6982c());
                sb.append(" = ");
                sb.append(aVar.mo6983d().getClass().getName());
                sb.append(')');
                aVar = aVar.f6172a;
                if (aVar == null) {
                    break;
                }
                sb.append(", ");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
