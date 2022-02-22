package org.p035a.p036a.p039c.p041b.p042a;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import org.p035a.p036a.p039c.p041b.p042a.C2344c;
import org.p035a.p036a.p054f.C2541c;
import org.p035a.p036a.p054f.p055a.C2533f;

/* renamed from: org.a.a.c.b.a.d */
public abstract class C2345d<E extends C2344c> implements C2372t<E>, C2541c {

    /* renamed from: a */
    private final C2344c[] f6254a;

    /* renamed from: b */
    private final AtomicInteger f6255b;

    /* renamed from: c */
    private final Executor f6256c;

    /* renamed from: d */
    private final boolean f6257d;

    C2345d(Executor executor, int i) {
        this(executor, i, false);
    }

    C2345d(Executor executor, int i, boolean z) {
        this.f6255b = new AtomicInteger();
        if (executor == null) {
            throw new NullPointerException("workerExecutor");
        } else if (i <= 0) {
            throw new IllegalArgumentException("workerCount (" + i + ") " + "must be a positive integer.");
        } else {
            this.f6254a = new C2344c[i];
            for (int i2 = 0; i2 < this.f6254a.length; i2++) {
                this.f6254a[i2] = mo7102a(executor);
            }
            this.f6257d = z;
            this.f6256c = executor;
        }
    }

    /* renamed from: a */
    public E mo7104b() {
        return (E) this.f6254a[Math.abs(this.f6255b.getAndIncrement() % this.f6254a.length)];
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public E mo7102a(Executor executor) {
        return mo7103a(executor, this.f6257d);
    }

    /* access modifiers changed from: protected */
    @Deprecated
    /* renamed from: a */
    public abstract E mo7103a(Executor executor, boolean z);

    @Override // org.p035a.p036a.p054f.C2541c
    /* renamed from: d */
    public void mo6810d() {
        C2533f.m10060a(this.f6256c);
    }
}
