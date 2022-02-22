package org.p035a.p036a.p054f;

import org.p035a.p036a.p053e.C2491b;
import org.p035a.p036a.p053e.C2492c;

/* renamed from: org.a.a.f.e */
public class C2545e implements Runnable {

    /* renamed from: a */
    private static final C2491b f6821a = C2492c.m9929a(C2545e.class);

    /* renamed from: b */
    private static volatile C2542d f6822b = C2542d.f6819a;

    /* renamed from: c */
    private final Runnable f6823c;

    /* renamed from: d */
    private final String f6824d;

    public C2545e(Runnable runnable, String str) {
        if (runnable == null) {
            throw new NullPointerException("runnable");
        } else if (str == null) {
            throw new NullPointerException("proposedThreadName");
        } else {
            this.f6823c = runnable;
            this.f6824d = str;
        }
    }

    /* renamed from: a */
    private String m10074a(String str) {
        String str2;
        try {
            str2 = m10075a().mo7404a(str, this.f6824d);
        } catch (Throwable th) {
            f6821a.mo7285b("Failed to determine the thread name", th);
            str2 = null;
        }
        return str2 == null ? str : str2;
    }

    /* renamed from: a */
    public static C2542d m10075a() {
        return f6822b;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [org.a.a.f.e] */
    /* JADX WARNING: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f A[DONT_GENERATE] */
    public void run() {
        boolean z = false;
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        String a = m10074a(name);
        if (!name.equals(a)) {
            try {
                currentThread.setName(a);
                z = true;
            } catch (SecurityException e) {
                f6821a.mo7282a("Failed to rename a thread due to security restriction.", e);
            }
            ((C2545e) this).f6823c.run();
            if (z) {
                return;
            }
            return;
        }
        z = false;
        try {
            ((C2545e) this).f6823c.run();
        } finally {
            if (z) {
                currentThread.setName(name);
            }
        }
    }
}
