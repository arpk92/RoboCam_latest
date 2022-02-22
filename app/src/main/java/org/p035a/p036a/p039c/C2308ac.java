package org.p035a.p036a.p039c;

import java.util.ArrayList;
import java.util.List;
import org.p035a.p036a.p053e.C2491b;
import org.p035a.p036a.p053e.C2492c;
import org.p035a.p036a.p054f.p055a.C2529d;

/* renamed from: org.a.a.c.ac */
public class C2308ac implements C2390l {

    /* renamed from: a */
    private static final C2491b f6154a = C2492c.m9929a(C2308ac.class);

    /* renamed from: b */
    private static final Throwable f6155b = new Throwable();

    /* renamed from: c */
    private static volatile boolean f6156c = true;

    /* renamed from: d */
    private final C2384f f6157d;

    /* renamed from: e */
    private final boolean f6158e;

    /* renamed from: f */
    private C2391m f6159f;

    /* renamed from: g */
    private List<C2391m> f6160g;

    /* renamed from: h */
    private List<C2394n> f6161h;

    /* renamed from: i */
    private boolean f6162i;

    /* renamed from: j */
    private Throwable f6163j;

    /* renamed from: k */
    private int f6164k;

    public C2308ac(C2384f fVar, boolean z) {
        this.f6157d = fVar;
        this.f6158e = z;
    }

    /* renamed from: a */
    private void m9156a(C2394n nVar, long j, long j2, long j3) {
        try {
            nVar.mo7143a(this, j, j2, j3);
        } catch (Throwable th) {
            if (f6154a.mo7288c()) {
                f6154a.mo7285b("An exception was thrown by " + C2394n.class.getSimpleName() + ".", th);
            }
        }
    }

    /* renamed from: b */
    private static void mo6911b() {
        if (m9159h() && C2529d.f6807a.get() != null) {
            throw new IllegalStateException("await*() in I/O thread causes a dead lock or sudden performance drop. Use addListener() instead or call await*() from a different thread.");
        }
    }

    /* renamed from: c */
    private void m9158c(C2391m mVar) {
        try {
            mVar.mo6933a(this);
        } catch (Throwable th) {
            if (f6154a.mo7288c()) {
                f6154a.mo7285b("An exception was thrown by " + C2391m.class.getSimpleName() + ".", th);
            }
        }
    }

    /* renamed from: h */
    public static boolean m9159h() {
        return f6156c;
    }

    /* renamed from: k */
    private void m9160k() {
        if (this.f6159f != null) {
            m9158c(this.f6159f);
            this.f6159f = null;
            if (this.f6160g != null) {
                for (C2391m mVar : this.f6160g) {
                    m9158c(mVar);
                }
                this.f6160g = null;
            }
        }
    }

    @Override // org.p035a.p036a.p039c.C2390l
    /* renamed from: a */
    public void mo6936a(C2391m mVar) {
        boolean z = true;
        if (mVar == null) {
            throw new NullPointerException("listener");
        }
        synchronized (this) {
            if (!this.f6162i) {
                if (this.f6159f == null) {
                    this.f6159f = mVar;
                } else {
                    if (this.f6160g == null) {
                        this.f6160g = new ArrayList(1);
                    }
                    this.f6160g.add(mVar);
                }
                if (mVar instanceof C2394n) {
                    if (this.f6161h == null) {
                        this.f6161h = new ArrayList(1);
                    }
                    this.f6161h.add((C2394n) mVar);
                }
                z = false;
            }
        }
        if (z) {
            m9158c(mVar);
        }
    }

    @Override // org.p035a.p036a.p039c.C2390l
    /* renamed from: a */
    public boolean mo6909a() {
        boolean z = true;
        synchronized (this) {
            if (this.f6162i) {
                z = false;
            } else {
                this.f6162i = true;
                if (this.f6164k > 0) {
                    notifyAll();
                }
                m9160k();
            }
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0027, code lost:
        r12 = r0.length;
        r11 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002a, code lost:
        if (r11 >= r12) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002c, code lost:
        m9156a(r0[r11], r14, r16, r18);
        r11 = r11 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003b, code lost:
        return true;
     */
    @Override // org.p035a.p036a.p039c.C2390l
    /* renamed from: a */
    public boolean mo6937a(long j, long j2, long j3) {
        synchronized (this) {
            if (this.f6162i) {
                return false;
            }
            List<C2394n> list = this.f6161h;
            if (list == null || list.isEmpty()) {
                return true;
            }
            C2394n[] nVarArr = (C2394n[]) list.toArray(new C2394n[list.size()]);
        }
        return false;
    }

    @Override // org.p035a.p036a.p039c.C2390l
    /* renamed from: a */
    public boolean mo6910a(Throwable th) {
        boolean z = true;
        synchronized (this) {
            if (this.f6162i) {
                z = false;
            } else {
                this.f6163j = th;
                this.f6162i = true;
                if (this.f6164k > 0) {
                    notifyAll();
                }
                m9160k();
            }
        }
        return z;
    }

    @Override // org.p035a.p036a.p039c.C2390l
    /* renamed from: b */
    public void mo6938b(C2391m mVar) {
        if (mVar == null) {
            throw new NullPointerException("listener");
        }
        synchronized (this) {
            if (!this.f6162i) {
                if (mVar == this.f6159f) {
                    if (this.f6160g == null || this.f6160g.isEmpty()) {
                        this.f6159f = null;
                    } else {
                        this.f6159f = this.f6160g.remove(0);
                    }
                } else if (this.f6160g != null) {
                    this.f6160g.remove(mVar);
                }
                if (mVar instanceof C2394n) {
                    this.f6161h.remove(mVar);
                }
            }
        }
    }

    @Override // org.p035a.p036a.p039c.C2390l
    /* renamed from: c */
    public C2384f mo6939c() {
        return this.f6157d;
    }

    @Override // org.p035a.p036a.p039c.C2390l
    /* renamed from: d */
    public synchronized boolean mo6949d() {
        return this.f6162i && this.f6163j == null;
    }

    @Override // org.p035a.p036a.p039c.C2390l
    /* renamed from: e */
    public synchronized Throwable mo6950e() {
        return this.f6163j != f6155b ? this.f6163j : null;
    }

    @Override // org.p035a.p036a.p039c.C2390l
    /* renamed from: f */
    public C2390l mo6940f() {
        if (Thread.interrupted()) {
            try {
                throw new InterruptedException();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        synchronized (this) {
            while (!this.f6162i) {
                mo6911b();
                this.f6164k++;
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    this.f6164k--;
                }
            }
        }
        return this;
    }

    @Override // org.p035a.p036a.p039c.C2390l
    /* renamed from: g */
    public C2390l mo6941g() {
        boolean z = false;
        synchronized (this) {
            while (!this.f6162i) {
                mo6911b();
                this.f6164k++;
                try {
                    wait();
                } catch (InterruptedException e) {
                    z = true;
                } finally {
                    this.f6164k--;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return this;
    }

    /* renamed from: i */
    public synchronized boolean mo6951i() {
        return this.f6162i;
    }

    /* renamed from: j */
    public synchronized boolean mo6952j() {
        return this.f6163j == f6155b;
    }
}
