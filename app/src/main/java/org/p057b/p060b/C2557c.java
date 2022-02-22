package org.p057b.p060b;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: org.b.b.c */
public class C2557c implements ThreadFactory {

    /* renamed from: a */
    private static final AtomicInteger f6833a = new AtomicInteger();

    /* renamed from: b */
    private final AtomicInteger f6834b;

    /* renamed from: c */
    private final ThreadFactory f6835c;

    /* renamed from: d */
    private final String f6836d;

    public C2557c(String str) {
        this(Executors.defaultThreadFactory(), str);
    }

    public C2557c(ThreadFactory threadFactory, String str) {
        this.f6834b = new AtomicInteger();
        this.f6835c = threadFactory;
        this.f6836d = str;
        f6833a.incrementAndGet();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo7419a() {
        return String.format("%s-%d-%d-thread", this.f6836d, Integer.valueOf(f6833a.intValue()), Integer.valueOf(this.f6834b.intValue()));
    }

    public Thread newThread(Runnable runnable) {
        this.f6834b.incrementAndGet();
        Thread newThread = this.f6835c.newThread(runnable);
        newThread.setName(mo7419a());
        return newThread;
    }
}
