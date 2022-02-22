package org.p035a.p036a.p053e;

import org.p035a.p036a.p054f.p055a.C2536i;

/* renamed from: org.a.a.e.c */
public abstract class C2492c {

    /* renamed from: a */
    private static volatile C2492c f6585a = new C2495e();

    static {
        C2536i.m10062a(new Exception());
    }

    /* renamed from: a */
    public static C2491b m9929a(Class<?> cls) {
        return m9930a(cls.getName());
    }

    /* renamed from: a */
    public static C2491b m9930a(String str) {
        final C2491b b = m9931a().mo7289b(str);
        return new C2491b() {
            /* class org.p035a.p036a.p053e.C2492c.C24931 */

            @Override // org.p035a.p036a.p053e.C2491b
            /* renamed from: a */
            public void mo7281a(String str) {
                b.mo7281a(str);
            }

            @Override // org.p035a.p036a.p053e.C2491b
            /* renamed from: a */
            public void mo7282a(String str, Throwable th) {
                C2536i.m10062a(th);
                b.mo7282a(str, th);
            }

            @Override // org.p035a.p036a.p053e.C2491b
            /* renamed from: a */
            public boolean mo7283a() {
                return b.mo7283a();
            }

            @Override // org.p035a.p036a.p053e.C2491b
            /* renamed from: b */
            public void mo7284b(String str) {
                b.mo7284b(str);
            }

            @Override // org.p035a.p036a.p053e.C2491b
            /* renamed from: b */
            public void mo7285b(String str, Throwable th) {
                C2536i.m10062a(th);
                b.mo7285b(str, th);
            }

            @Override // org.p035a.p036a.p053e.C2491b
            /* renamed from: b */
            public boolean mo7286b() {
                return b.mo7286b();
            }

            @Override // org.p035a.p036a.p053e.C2491b
            /* renamed from: c */
            public void mo7287c(String str) {
                b.mo7287c(str);
            }

            @Override // org.p035a.p036a.p053e.C2491b
            /* renamed from: c */
            public boolean mo7288c() {
                return b.mo7288c();
            }
        };
    }

    /* renamed from: a */
    public static C2492c m9931a() {
        return f6585a;
    }

    /* renamed from: b */
    public abstract C2491b mo7289b(String str);
}
