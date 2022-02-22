package org.p035a.p036a.p039c.p041b.p042a;

import java.net.InetSocketAddress;
import java.nio.channels.SelectableChannel;
import java.nio.channels.WritableByteChannel;
import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.p035a.p036a.p038b.C2284d;
import org.p035a.p036a.p039c.C2296a;
import org.p035a.p036a.p039c.C2324ap;
import org.p035a.p036a.p039c.C2384f;
import org.p035a.p036a.p039c.C2389k;
import org.p035a.p036a.p039c.C2398r;
import org.p035a.p036a.p039c.C2401u;
import org.p035a.p036a.p039c.C2405y;
import org.p035a.p036a.p039c.p041b.p042a.C2363s;
import org.p035a.p036a.p054f.p055a.C2539l;

/* renamed from: org.a.a.c.b.a.a */
abstract class C2340a<C extends SelectableChannel & WritableByteChannel> extends C2296a {

    /* renamed from: c */
    final C2344c f6216c;

    /* renamed from: d */
    final Object f6217d = new Object();

    /* renamed from: e */
    final Object f6218e = new Object();

    /* renamed from: f */
    final Runnable f6219f = new C2342b();

    /* renamed from: g */
    final AtomicBoolean f6220g = new AtomicBoolean();

    /* renamed from: h */
    final Queue<C2324ap> f6221h = new C2341a();

    /* renamed from: i */
    final AtomicInteger f6222i = new AtomicInteger();

    /* renamed from: j */
    final AtomicInteger f6223j = new AtomicInteger();

    /* renamed from: k */
    C2324ap f6224k;

    /* renamed from: l */
    C2363s.C2370g f6225l;

    /* renamed from: m */
    boolean f6226m;

    /* renamed from: n */
    boolean f6227n;

    /* renamed from: o */
    volatile InetSocketAddress f6228o;

    /* renamed from: p */
    final C f6229p;

    /* renamed from: q */
    private volatile InetSocketAddress f6230q;

    /* renamed from: org.a.a.c.b.a.a$a */
    private final class C2341a implements Queue<C2324ap> {

        /* renamed from: a */
        final /* synthetic */ boolean f6231a = (!C2340a.class.desiredAssertionStatus());

        /* renamed from: c */
        private final C2539l f6233c = new C2539l();

        /* renamed from: d */
        private final Queue<C2324ap> f6234d = new ConcurrentLinkedQueue();

        public C2341a() {
        }

        /* renamed from: c */
        private int m9319c(C2324ap apVar) {
            Object c = apVar.mo7006c();
            if (c instanceof C2284d) {
                return ((C2284d) c).mo6838d();
            }
            return 0;
        }

        /* renamed from: a */
        public C2324ap remove() {
            return this.f6234d.remove();
        }

        /* renamed from: a */
        public boolean add(C2324ap apVar) {
            return this.f6234d.add(apVar);
        }

        @Override // java.util.Collection
        public boolean addAll(Collection<? extends C2324ap> collection) {
            return this.f6234d.addAll(collection);
        }

        /* renamed from: b */
        public C2324ap element() {
            return this.f6234d.element();
        }

        /* renamed from: b */
        public boolean offer(C2324ap apVar) {
            boolean offer = this.f6234d.offer(apVar);
            if (f6231a || offer) {
                int c = m9319c(apVar);
                int addAndGet = C2340a.this.f6222i.addAndGet(c);
                int c2 = C2340a.this.mo7051m().mo7107c();
                if (addAndGet < c2 || addAndGet - c >= c2) {
                    return true;
                }
                C2340a.this.f6223j.incrementAndGet();
                if (((Boolean) this.f6233c.get()).booleanValue()) {
                    return true;
                }
                this.f6233c.set(Boolean.TRUE);
                C2405y.m9561e(C2340a.this);
                this.f6233c.set(Boolean.FALSE);
                return true;
            }
            throw new AssertionError();
        }

        /* renamed from: c */
        public C2324ap peek() {
            return this.f6234d.peek();
        }

        public void clear() {
            this.f6234d.clear();
        }

        public boolean contains(Object obj) {
            return this.f6234d.contains(obj);
        }

        @Override // java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            return this.f6234d.containsAll(collection);
        }

        /* renamed from: d */
        public C2324ap poll() {
            C2324ap poll = this.f6234d.poll();
            if (poll != null) {
                int c = m9319c(poll);
                int addAndGet = C2340a.this.f6222i.addAndGet(-c);
                int d = C2340a.this.mo7051m().mo7108d();
                if ((addAndGet == 0 || addAndGet < d) && c + addAndGet >= d) {
                    C2340a.this.f6223j.decrementAndGet();
                    if (C2340a.this.mo7120l() && !((Boolean) this.f6233c.get()).booleanValue()) {
                        this.f6233c.set(Boolean.TRUE);
                        C2405y.m9561e(C2340a.this);
                        this.f6233c.set(Boolean.FALSE);
                    }
                }
            }
            return poll;
        }

        public boolean isEmpty() {
            return this.f6234d.isEmpty();
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator<C2324ap> iterator() {
            return this.f6234d.iterator();
        }

        public boolean remove(Object obj) {
            return this.f6234d.remove(obj);
        }

        @Override // java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            return this.f6234d.removeAll(collection);
        }

        @Override // java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            return this.f6234d.retainAll(collection);
        }

        public int size() {
            return this.f6234d.size();
        }

        public Object[] toArray() {
            return this.f6234d.toArray();
        }

        @Override // java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return this.f6234d.toArray(tArr);
        }
    }

    /* renamed from: org.a.a.c.b.a.a$b */
    private final class C2342b implements Runnable {
        C2342b() {
        }

        public void run() {
            C2340a.this.f6220g.set(false);
            C2340a.this.f6216c.mo7091b(C2340a.this);
        }
    }

    protected C2340a(C2384f fVar, C2389k kVar, C2398r rVar, C2401u uVar, C2344c cVar, C c) {
        super(fVar, kVar, rVar, uVar);
        this.f6216c = cVar;
        this.f6229p = c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo7050b(int i) {
        super.mo6894a(i);
    }

    /* access modifiers changed from: protected */
    @Override // org.p035a.p036a.p039c.C2296a
    /* renamed from: h */
    public boolean mo6903h() {
        return super.mo6903h();
    }

    @Override // org.p035a.p036a.p039c.C2296a
    /* renamed from: k */
    public int mo6907k() {
        if (!mo6902g()) {
            return 4;
        }
        int t = mo7057t();
        int i = this.f6222i.get();
        return i != 0 ? this.f6223j.get() > 0 ? i >= mo7051m().mo7108d() ? t | 4 : t & -5 : i >= mo7051m().mo7107c() ? t | 4 : t & -5 : t & -5;
    }

    @Override // org.p035a.p036a.p039c.C2296a
    /* renamed from: q */
    public InetSocketAddress mo7052o() {
        InetSocketAddress inetSocketAddress = this.f6230q;
        if (inetSocketAddress != null) {
            return inetSocketAddress;
        }
        try {
            InetSocketAddress u = mo7058u();
            if (u.getAddress().isAnyLocalAddress()) {
                return u;
            }
            this.f6230q = u;
            return u;
        } catch (Throwable th) {
            return null;
        }
    }

    /* renamed from: r */
    public InetSocketAddress mo7053p() {
        InetSocketAddress inetSocketAddress = this.f6228o;
        if (inetSocketAddress != null) {
            return inetSocketAddress;
        }
        try {
            InetSocketAddress v = mo7059v();
            this.f6228o = v;
            return v;
        } catch (Throwable th) {
            return null;
        }
    }

    /* renamed from: s */
    public abstract C2348g mo7051m();

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public int mo7057t() {
        return super.mo6907k();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public abstract InetSocketAddress mo7058u();

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public abstract InetSocketAddress mo7059v();
}
