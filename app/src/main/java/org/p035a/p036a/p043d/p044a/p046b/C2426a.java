package org.p035a.p036a.p043d.p044a.p046b;

import java.lang.reflect.Array;
import java.util.LinkedList;
import java.util.Queue;
import org.p035a.p036a.p039c.C2309ad;
import org.p035a.p036a.p039c.C2320al;
import org.p035a.p036a.p039c.C2324ap;
import org.p035a.p036a.p039c.C2384f;
import org.p035a.p036a.p039c.C2387i;
import org.p035a.p036a.p039c.C2390l;
import org.p035a.p036a.p039c.C2395o;
import org.p035a.p036a.p039c.C2396p;
import org.p035a.p036a.p039c.C2398r;
import org.p035a.p036a.p039c.C2399s;
import org.p035a.p036a.p039c.C2401u;
import org.p035a.p036a.p039c.C2404x;
import org.p035a.p036a.p039c.C2405y;

/* renamed from: org.a.a.d.a.b.a */
abstract class C2426a<E> {

    /* renamed from: a */
    final Queue<Object> f6382a = new LinkedList();

    /* renamed from: b */
    private final C2384f f6383b;

    /* renamed from: c */
    private final C2398r f6384c = new C2427a();

    /* renamed from: d */
    private final C2426a<E>.C2428b f6385d = new C2428b();

    /* renamed from: org.a.a.d.a.b.a$a */
    private static final class C2427a extends C2309ad {
        C2427a() {
        }

        /* access modifiers changed from: protected */
        @Override // org.p035a.p036a.p039c.C2309ad
        /* renamed from: a */
        public void mo6962a(C2387i iVar, Throwable th) {
            Throwable th2 = th;
            while ((th2 instanceof C2399s) && th2.getCause() != null) {
                th2 = th2.getCause();
            }
            if (th2 instanceof C2429b) {
                throw ((C2429b) th2);
            }
            throw new C2429b(th2);
        }
    }

    /* renamed from: org.a.a.d.a.b.a$b */
    private final class C2428b implements C2401u, C2404x {

        /* renamed from: a */
        final /* synthetic */ boolean f6386a = (!C2426a.class.desiredAssertionStatus());

        C2428b() {
        }

        /* renamed from: a */
        private void m9600a(C2387i iVar) {
            if (iVar instanceof C2324ap) {
                boolean offer = C2426a.this.f6382a.offer(((C2324ap) iVar).mo7006c());
                if (!f6386a && !offer) {
                    throw new AssertionError();
                }
            } else if (iVar instanceof C2320al) {
                throw new C2429b(((C2320al) iVar).mo6994c());
            }
        }

        @Override // org.p035a.p036a.p039c.C2401u
        /* renamed from: a */
        public C2390l mo6987a(C2398r rVar, Runnable runnable) {
            try {
                runnable.run();
                return C2405y.m9549b(rVar.mo6965b());
            } catch (Throwable th) {
                return C2405y.m9536a(rVar.mo6965b(), th);
            }
        }

        @Override // org.p035a.p036a.p039c.C2401u
        /* renamed from: a */
        public void mo6988a(C2398r rVar, C2387i iVar) {
            m9600a(iVar);
        }

        @Override // org.p035a.p036a.p039c.C2401u
        /* renamed from: a */
        public void mo6989a(C2398r rVar, C2387i iVar, C2399s sVar) {
            Throwable cause = sVar.getCause();
            if (cause != null) {
                sVar = (C2399s) cause;
            }
            throw new C2429b(sVar);
        }

        @Override // org.p035a.p036a.p039c.C2404x
        /* renamed from: b */
        public void mo7023b(C2396p pVar, C2387i iVar) {
            m9600a(iVar);
        }
    }

    protected C2426a(C2395o... oVarArr) {
        m9591a(oVarArr);
        this.f6383b = new C2431d(this.f6384c, this.f6385d);
        m9592f();
    }

    /* renamed from: a */
    private void m9591a(C2395o... oVarArr) {
        if (oVarArr == null) {
            throw new NullPointerException("handlers");
        } else if (oVarArr.length == 0) {
            throw new IllegalArgumentException("handlers should contain at least one " + C2395o.class.getSimpleName() + '.');
        } else {
            for (int i = 0; i < oVarArr.length; i++) {
                if (oVarArr[i] == null) {
                    throw new NullPointerException("handlers[" + i + "]");
                }
                this.f6384c.mo6958a(String.valueOf(i), oVarArr[i]);
            }
            this.f6384c.mo6958a("SINK", this.f6385d);
        }
    }

    /* renamed from: f */
    private void m9592f() {
        C2405y.m9558c(this.f6383b);
        C2405y.m9543a(this.f6383b, this.f6383b.mo7052o());
        C2405y.m9555b(this.f6383b, this.f6383b.mo7053p());
    }

    /* renamed from: a */
    public boolean mo7154a() {
        C2405y.m9568l(this.f6383b);
        C2405y.m9563g(this.f6383b);
        C2405y.m9565i(this.f6383b);
        C2405y.m9567k(this.f6383b);
        return !this.f6382a.isEmpty();
    }

    /* renamed from: a */
    public final <T> T[] mo7155a(T[] tArr) {
        if (tArr == null) {
            throw new NullPointerException("a");
        }
        int e = mo7159e();
        T[] tArr2 = tArr.length < e ? (T[]) (Object[]) Array.newInstance(tArr.getClass().getComponentType(), e) : tArr;
        int i = 0;
        while (true) {
            T d = (T) mo7158d();
            if (d == null) {
                break;
            }
            tArr2[i] = d;
            i++;
        }
        if (tArr2.length > e) {
            tArr2[e] = null;
        }
        return tArr2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C2384f mo7156b() {
        return this.f6383b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final boolean mo7157c() {
        return this.f6382a.isEmpty();
    }

    /* renamed from: d */
    public final E mo7158d() {
        return (E) this.f6382a.poll();
    }

    /* renamed from: e */
    public final int mo7159e() {
        return this.f6382a.size();
    }
}
