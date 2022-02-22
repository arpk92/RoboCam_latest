package org.p035a.p036a.p039c;

import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;
import org.p035a.p036a.p053e.C2491b;
import org.p035a.p036a.p053e.C2492c;

/* renamed from: org.a.a.c.ag */
public class C2314ag implements C2322an {

    /* renamed from: a */
    private static final C2491b f6184a = C2492c.m9929a(C2314ag.class);

    /* renamed from: b */
    private FileChannel f6185b;

    /* renamed from: c */
    private long f6186c;

    /* renamed from: d */
    private long f6187d;

    /* renamed from: e */
    private boolean f6188e;

    @Override // org.p035a.p036a.p039c.C2322an
    /* renamed from: a */
    public long mo6996a() {
        return this.f6187d;
    }

    @Override // org.p035a.p036a.p039c.C2322an
    /* renamed from: a */
    public long mo6997a(WritableByteChannel writableByteChannel, long j) {
        long j2 = this.f6187d - j;
        if (j2 < 0 || j < 0) {
            throw new IllegalArgumentException("position out of range: " + j + " (expected: 0 - " + (this.f6187d - 1) + ")");
        } else if (j2 == 0) {
            return 0;
        } else {
            try {
                return this.f6185b.transferTo(this.f6186c + j, j2, writableByteChannel);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return j2;
    }

    /* renamed from: b */
    public boolean mo6998b() {
        return this.f6188e;
    }

    @Override // org.p035a.p036a.p054f.C2541c
    /* renamed from: d */
    public void mo6810d() {
        try {
            this.f6185b.close();
        } catch (IOException e) {
            if (f6184a.mo7288c()) {
                f6184a.mo7285b("Failed to close a file.", e);
            }
        }
    }
}
