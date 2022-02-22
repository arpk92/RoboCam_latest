package org.p057b.p061c;

import java.lang.Thread;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import org.p035a.p036a.p038b.C2284d;
import org.p057b.C2615k;
import org.p057b.p060b.C2560f;

/* renamed from: org.b.c.e */
public class C2569e {

    /* renamed from: a */
    private final int f6862a;

    /* renamed from: b */
    private final C2560f f6863b;

    /* renamed from: c */
    private List<C2284d> f6864c = new ArrayList();

    /* renamed from: d */
    private int f6865d;

    public C2569e(int i, C2560f fVar, C2284d dVar) {
        this.f6862a = i;
        this.f6863b = fVar;
        mo7442a(dVar);
    }

    /* renamed from: a */
    private byte[] m10112a() {
        byte[] bArr = new byte[this.f6865d];
        int i = 0;
        for (C2284d dVar : this.f6864c) {
            byte[] t = dVar.mo6884t();
            System.arraycopy(t, 0, bArr, i, t.length);
            i = t.length + i;
        }
        return bArr;
    }

    /* renamed from: a */
    public void mo7442a(C2284d dVar) {
        this.f6865d += dVar.mo6838d();
        if (this.f6862a == 1) {
            this.f6863b.mo7425a(dVar.mo6884t());
        } else {
            this.f6864c.add(dVar);
        }
    }

    /* renamed from: a */
    public void mo7443a(final C2615k kVar, final C2598s sVar, Executor executor, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        switch (this.f6862a) {
            case 1:
                final String a = this.f6863b.mo7423a();
                executor.execute(new C2563b(uncaughtExceptionHandler) {
                    /* class org.p057b.p061c.C2569e.C25701 */

                    /* access modifiers changed from: protected */
                    @Override // org.p057b.p061c.C2563b
                    /* renamed from: a */
                    public void mo7432a() {
                        kVar.mo7407a(sVar, a);
                    }
                });
                return;
            case 2:
                final byte[] a2 = m10112a();
                executor.execute(new C2563b(uncaughtExceptionHandler) {
                    /* class org.p057b.p061c.C2569e.C25712 */

                    @Override // org.p057b.p061c.C2563b
                    /* renamed from: a */
                    public void mo7432a() {
                        kVar.mo7408a(sVar, a2);
                    }
                });
                return;
            case 9:
                final byte[] a3 = m10112a();
                executor.execute(new C2563b(uncaughtExceptionHandler) {
                    /* class org.p057b.p061c.C2569e.C25723 */

                    /* access modifiers changed from: protected */
                    @Override // org.p057b.p061c.C2563b
                    /* renamed from: a */
                    public void mo7432a() {
                        kVar.mo7410b(sVar, a3);
                    }
                });
                return;
            case 10:
                final byte[] a4 = m10112a();
                executor.execute(new C2563b(uncaughtExceptionHandler) {
                    /* class org.p057b.p061c.C2569e.C25734 */

                    /* access modifiers changed from: protected */
                    @Override // org.p057b.p061c.C2563b
                    /* renamed from: a */
                    public void mo7432a() {
                        kVar.mo7411c(sVar, a4);
                    }
                });
                return;
            default:
                throw new IllegalStateException("Unexpected opcode:" + this.f6862a);
        }
    }
}
