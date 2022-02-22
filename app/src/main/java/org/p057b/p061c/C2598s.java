package org.p057b.p061c;

import java.util.concurrent.Executor;
import org.p035a.p036a.p038b.C2286f;
import org.p035a.p036a.p039c.C2390l;
import org.p035a.p036a.p039c.C2391m;
import org.p035a.p036a.p039c.C2396p;
import org.p035a.p036a.p043d.p044a.p048d.p049a.C2439a;
import org.p035a.p036a.p054f.C2496a;
import org.p057b.C2614j;

/* renamed from: org.b.c.s */
public class C2598s extends C2562a implements C2614j {

    /* renamed from: a */
    private final byte[] f6986a;

    /* renamed from: b */
    private String f6987b;

    /* renamed from: c */
    private boolean f6988c;

    public C2598s(Executor executor, C2591p pVar, C2396p pVar2, byte[] bArr) {
        super(pVar2, pVar, executor);
        this.f6986a = bArr;
    }

    /* renamed from: a */
    public void mo7494a(int i) {
        mo7498c("Sec-WebSocket-Version-" + i);
        this.f6988c = true;
    }

    /* renamed from: b */
    public C2598s mo7492a(String str) {
        if (this.f6988c) {
            mo7427a(new C2574f(1, true, 0, this.f6986a, C2286f.m8925a(str, C2496a.f6592d)));
        } else {
            mo7427a(new C2439a(str));
        }
        return this;
    }

    /* renamed from: b */
    public C2598s mo7493a(byte[] bArr) {
        mo7427a(new C2574f(10, true, 0, this.f6986a, C2286f.m8946b(bArr)));
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo7498c(String str) {
        this.f6987b = str;
    }

    /* renamed from: f */
    public C2598s mo7497b() {
        if (this.f6988c) {
            mo7427a(new C2574f(8, true, 0, this.f6986a, C2286f.m8923a(0))).mo6936a(new C2391m() {
                /* class org.p057b.p061c.C2598s.C25991 */

                @Override // org.p035a.p036a.p039c.C2391m
                /* renamed from: a */
                public void mo6933a(C2390l lVar) {
                    C2598s.this.mo7428c();
                }
            });
        } else {
            mo7428c();
        }
        return this;
    }
}
