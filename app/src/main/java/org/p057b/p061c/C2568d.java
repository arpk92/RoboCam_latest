package org.p057b.p061c;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.p035a.p036a.p039c.C2329au;
import org.p035a.p036a.p039c.C2396p;
import org.p035a.p036a.p039c.C2403w;
import org.p035a.p036a.p039c.p040a.C2298a;
import org.p035a.p036a.p039c.p040a.C2302e;

/* renamed from: org.b.c.d */
public class C2568d extends C2329au {

    /* renamed from: a */
    private final C2298a f6859a = new C2302e();

    /* renamed from: b */
    private final ReadWriteLock f6860b = new ReentrantReadWriteLock();

    /* renamed from: c */
    private volatile boolean f6861c = false;

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public void mo7441a() {
        this.f6860b.writeLock().lock();
        try {
            this.f6861c = true;
            this.f6860b.writeLock().unlock();
            this.f6859a.mo6913b();
        } catch (Throwable th) {
            this.f6860b.writeLock().unlock();
            throw th;
        }
    }

    @Override // org.p035a.p036a.p039c.C2329au
    /* renamed from: a */
    public void mo7020a(C2396p pVar, C2403w wVar) {
        this.f6860b.readLock().lock();
        try {
            if (this.f6861c) {
                wVar.mo6990a().mo6905i();
            } else {
                this.f6859a.add(wVar.mo6990a());
            }
        } finally {
            this.f6860b.readLock().unlock();
        }
    }
}
