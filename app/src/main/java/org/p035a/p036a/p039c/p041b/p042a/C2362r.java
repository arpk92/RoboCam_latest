package org.p035a.p036a.p039c.p041b.p042a;

import java.nio.ByteBuffer;
import org.p035a.p036a.p054f.p055a.C2499a;

/* renamed from: org.a.a.c.b.a.r */
final class C2362r {

    /* renamed from: a */
    private ByteBuffer f6298a;

    /* renamed from: b */
    private int f6299b;

    /* renamed from: c */
    private final int f6300c;

    /* renamed from: d */
    private final int f6301d;

    C2362r() {
        this(16, 80);
    }

    C2362r(int i, int i2) {
        this.f6300c = i;
        this.f6301d = i2;
    }

    /* renamed from: b */
    private ByteBuffer m9413b(int i) {
        if (this.f6298a != null) {
            this.f6299b = 0;
            C2499a.m9954a(this.f6298a);
        }
        this.f6298a = ByteBuffer.allocateDirect(m9414c(i));
        return this.f6298a;
    }

    /* renamed from: c */
    private static int m9414c(int i) {
        int i2 = i >>> 10;
        if ((i & 1023) != 0) {
            i2++;
        }
        return i2 << 10;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public ByteBuffer mo7125a(int i) {
        if (this.f6298a == null) {
            return m9413b(i);
        }
        if (this.f6298a.capacity() < i) {
            return m9413b(i);
        }
        if ((this.f6298a.capacity() / 100) * this.f6301d > i) {
            int i2 = this.f6299b + 1;
            this.f6299b = i2;
            if (i2 == this.f6300c) {
                return m9413b(i);
            }
            this.f6298a.clear();
        } else {
            this.f6299b = 0;
            this.f6298a.clear();
        }
        return this.f6298a;
    }
}
