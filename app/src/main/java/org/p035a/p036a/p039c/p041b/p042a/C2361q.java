package org.p035a.p036a.p039c.p041b.p042a;

import java.io.IOException;
import java.nio.channels.CancelledKeyException;
import java.nio.channels.Selector;
import org.p035a.p036a.p053e.C2491b;
import org.p035a.p036a.p053e.C2492c;

/* renamed from: org.a.a.c.b.a.q */
final class C2361q {

    /* renamed from: a */
    static final int f6296a = (Runtime.getRuntime().availableProcessors() * 2);

    /* renamed from: b */
    private static final C2491b f6297b = C2492c.m9929a(C2361q.class);

    static {
        try {
            if (System.getProperty("sun.nio.ch.bugLevel") == null) {
                System.setProperty("sun.nio.ch.bugLevel", "");
            }
        } catch (SecurityException e) {
            if (f6297b.mo7283a()) {
                f6297b.mo7282a("Unable to get/set System Property '" + "sun.nio.ch.bugLevel" + "'", e);
            }
        }
    }

    private C2361q() {
    }

    /* renamed from: a */
    static void m9412a(Selector selector) {
        try {
            selector.select(10);
        } catch (CancelledKeyException | IOException e) {
            if (f6297b.mo7283a()) {
                f6297b.mo7282a(CancelledKeyException.class.getSimpleName() + " raised by a Selector - JDK bug?", e);
            }
        }
    }
}
