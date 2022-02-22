package org.p035a.p036a.p054f.p055a;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/* renamed from: org.a.a.f.a.g */
public final class C2534g extends AbstractQueuedSynchronizer implements Lock {

    /* renamed from: a */
    private Thread f6814a;

    /* renamed from: a */
    public boolean mo7392a() {
        return isHeldExclusively();
    }

    /* access modifiers changed from: protected */
    public boolean isHeldExclusively() {
        return getState() != 0 && this.f6814a == Thread.currentThread();
    }

    public void lock() {
        acquire(1);
    }

    @Override // java.util.concurrent.locks.Lock
    public void lockInterruptibly() {
        try {
            acquireInterruptibly(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public Condition newCondition() {
        return new ConditionObject();
    }

    /* access modifiers changed from: protected */
    public boolean tryAcquire(int i) {
        if (!compareAndSetState(0, 1)) {
            return false;
        }
        this.f6814a = Thread.currentThread();
        return true;
    }

    public boolean tryLock() {
        return tryAcquire(1);
    }

    @Override // java.util.concurrent.locks.Lock
    public boolean tryLock(long j, TimeUnit timeUnit) {
        try {
            return tryAcquireNanos(1, timeUnit.toNanos(j));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean tryRelease(int i) {
        if (Thread.currentThread() != this.f6814a) {
            throw new IllegalMonitorStateException();
        }
        this.f6814a = null;
        setState(0);
        return true;
    }

    public void unlock() {
        release(1);
    }
}
