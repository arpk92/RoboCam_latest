package org.p057b.p061c;

import android.support.v8.renderscript.Allocation;
import org.p035a.p036a.p038b.C2284d;
import org.p035a.p036a.p038b.C2286f;
import org.p035a.p036a.p043d.p044a.p047c.C2437c;

/* renamed from: org.b.c.f */
public class C2574f {

    /* renamed from: a */
    private final int f6882a;

    /* renamed from: b */
    private final boolean f6883b;

    /* renamed from: c */
    private final int f6884c;

    /* renamed from: d */
    private byte[] f6885d;

    /* renamed from: e */
    private final C2284d f6886e;

    public C2574f(int i, boolean z, int i2, byte[] bArr, C2284d dVar) {
        this.f6882a = i;
        this.f6883b = z;
        this.f6884c = i2;
        this.f6885d = bArr;
        this.f6886e = dVar;
    }

    /* renamed from: a */
    private C2284d m10119a(int i) {
        return C2286f.m8923a(i);
    }

    /* renamed from: a */
    public C2284d mo7444a() {
        C2284d a = null;
        int i = Allocation.USAGE_SHARED;
        int i2 = (this.f6882a % Allocation.USAGE_SHARED) | (this.f6883b ? 128 : 0) | ((this.f6884c % 8) << 4);
        if (this.f6885d == null) {
            i = 0;
        }
        int i3 = this.f6885d != null ? 6 : 2;
        int d = this.f6886e.mo6838d();
        if (this.f6882a != 9 || d <= 125) {
            if (d <= 125) {
                a = m10119a(i3 + d);
                a.mo6848h(i2);
                a.mo6848h(i | (d & 127));
            } else if (d <= 65535) {
                a = m10119a(i3 + 2 + d);
                a.mo6848h(i2);
                a.mo6848h(i | 126);
                a.mo6848h((d >>> 8) & 255);
                a.mo6848h(d & 255);
            } else {
                a = m10119a(i3 + 8 + d);
                a.mo6848h(i2);
                a.mo6848h(i | 127);
                a.mo6822a((long) d);
            }
            if (this.f6885d != null) {
                a.mo6832b(this.f6885d);
                C2581l.m10145a(this.f6886e, this.f6885d);
            }
            return C2286f.m8937a(a, this.f6886e);
        }
        try {
            throw new C2437c("invalid payload for PING (payload length must be <= 125, was " + d);
        } catch (C2437c c2437c) {
            c2437c.printStackTrace();
        }
        return a;
    }
}
