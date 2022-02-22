package org.p035a.p036a.p054f.p055a;

import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.zip.Deflater;

/* renamed from: org.a.a.f.a.e */
public final class C2531e {

    /* renamed from: a */
    private static final int f6810a = m10057b();

    /* renamed from: b */
    private static final boolean f6811b = m10056a(AtomicInteger.class.getClassLoader());

    /* renamed from: c */
    private static final boolean f6812c = (System.getProperty("os.name").toLowerCase().indexOf("win") >= 0);

    /* renamed from: a */
    public static int m10054a() {
        return f6810a;
    }

    /* renamed from: a */
    private static boolean m10055a(final Class<?> cls) {
        try {
            return ((Boolean) AccessController.doPrivileged(new PrivilegedExceptionAction<Boolean>() {
                /* class org.p035a.p036a.p054f.p055a.C2531e.C25321 */

                /* renamed from: a */
                public Boolean run() {
                    try {
                        cls.getDeclaredField("theUnsafe");
                    } catch (NoSuchFieldException e) {
                        e.printStackTrace();
                    }
                    return true;
                }
            })).booleanValue();
        } catch (PrivilegedActionException e) {
            e.printStackTrace();
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m10056a(ClassLoader classLoader) {
        if (!Boolean.valueOf(C2538k.m10067a("org.jboss.netty.tryUnsafe", "true")).booleanValue()) {
            return false;
        }
        try {
            return m10055a(Class.forName("sun.misc.Unsafe", true, classLoader));
        } catch (Exception e) {
            return false;
        }
    }

    /* renamed from: b */
    private static int m10057b() {
        try {
            Class.forName("android.app.Application");
            return 6;
        } catch (ClassNotFoundException e) {
            try {
                Deflater.class.getDeclaredField("SYNC_FLUSH");
                return 7;
            } catch (Exception e2) {
                try {
                    Double.class.getDeclaredField("MIN_NORMAL");
                    return 6;
                } catch (Exception e3) {
                    return 5;
                }
            }
        }
    }
}
