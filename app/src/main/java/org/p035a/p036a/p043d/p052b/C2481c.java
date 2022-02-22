package org.p035a.p036a.p043d.p052b;

import java.nio.ByteBuffer;

/* renamed from: org.a.a.d.b.c */
public class C2481c {

    /* renamed from: a */
    private final ByteBuffer[] f6543a;

    /* renamed from: b */
    private final int f6544b;

    /* renamed from: c */
    private int f6545c;

    public C2481c() {
        this(19162112);
    }

    public C2481c(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("maxPoolSize: " + i);
        }
        int i2 = i / 18713;
        i2 = i % 18713 != 0 ? i2 + 1 : i2;
        this.f6543a = new ByteBuffer[i2];
        this.f6544b = i2;
    }

    /* renamed from: a */
    public ByteBuffer mo7273a() {
        return mo7275b();
    }

    /* renamed from: a */
    public void mo7274a(ByteBuffer byteBuffer) {
        mo7276b(byteBuffer);
    }

    /* access modifiers changed from: package-private */
    @Deprecated
    /* renamed from: b */
    public synchronized ByteBuffer mo7275b() {
        ByteBuffer byteBuffer;
        if (this.f6545c == 0) {
            byteBuffer = ByteBuffer.allocate(18713);
        } else {
            ByteBuffer[] byteBufferArr = this.f6543a;
            int i = this.f6545c - 1;
            this.f6545c = i;
            byteBuffer = (ByteBuffer) byteBufferArr[i].clear();
        }
        return byteBuffer;
    }

    /* access modifiers changed from: package-private */
    @Deprecated
    /* renamed from: b */
    public synchronized void mo7276b(ByteBuffer byteBuffer) {
        if (this.f6545c < this.f6544b) {
            ByteBuffer[] byteBufferArr = this.f6543a;
            int i = this.f6545c;
            this.f6545c = i + 1;
            byteBufferArr[i] = byteBuffer;
        }
    }
}
