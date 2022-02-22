package org.p035a.p036a.p039c.p040a;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: org.a.a.c.a.d */
final class C2301d<E> implements Iterator<E> {

    /* renamed from: a */
    private final Iterator<E> f6129a;

    /* renamed from: b */
    private final Iterator<E> f6130b;

    /* renamed from: c */
    private Iterator<E> f6131c;

    C2301d(Iterator<E> it, Iterator<E> it2) {
        if (it == null) {
            throw new NullPointerException("i1");
        } else if (it2 == null) {
            throw new NullPointerException("i2");
        } else {
            this.f6129a = it;
            this.f6130b = it2;
            this.f6131c = it;
        }
    }

    public boolean hasNext() {
        if (this.f6131c.hasNext()) {
            return true;
        }
        if (this.f6131c != this.f6129a) {
            return false;
        }
        this.f6131c = this.f6130b;
        return hasNext();
    }

    @Override // java.util.Iterator
    public E next() {
        try {
            return this.f6131c.next();
        } catch (NoSuchElementException e) {
            if (this.f6131c == this.f6129a) {
                this.f6131c = this.f6130b;
                return next();
            }
            throw e;
        }
    }

    public void remove() {
        this.f6131c.remove();
    }
}
