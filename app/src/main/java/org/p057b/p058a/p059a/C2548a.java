package org.p057b.p058a.p059a;

import java.io.PrintStream;
import java.lang.Thread;

/* renamed from: org.b.a.a.a */
public class C2548a implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    private final PrintStream f6825a;

    public C2548a() {
        this(System.err);
    }

    public C2548a(PrintStream printStream) {
        this.f6825a = printStream;
    }

    public void uncaughtException(Thread thread, Throwable th) {
        th.printStackTrace(this.f6825a);
    }
}
