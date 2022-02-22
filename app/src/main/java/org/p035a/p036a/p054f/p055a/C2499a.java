package org.p035a.p036a.p054f.p055a;

import java.lang.reflect.Method;
import java.nio.ByteBuffer;

/* renamed from: org.a.a.f.a.a */
public final class C2499a {

    /* renamed from: a */
    private static boolean f6597a;

    /* renamed from: b */
    private static Method f6598b;

    /* renamed from: c */
    private static Method f6599c;

    static {
        Method method;
        Method method2;
        Method method3 = null;
        Method method4 = null;
        boolean z = true;
        try {
            Method method5 = Class.forName("java.nio.DirectByteBuffer").getMethod("cleaner", new Class[0]);
            try {
                method5.setAccessible(true);
                method3 = Class.forName("sun.misc.Cleaner").getMethod("clean", new Class[0]);
            } catch (Exception e) {
                method = null;
                method4 = method5;
                method2 = method;
                z = false;
                f6597a = z;
                f6598b = method4;
                f6599c = method2;
            }
            try {
                method3.setAccessible(true);
                method2 = method3;
                method4 = method5;
            } catch (Exception e2) {
                method = method3;
                method4 = method5;
                method2 = method;
                z = false;
                f6597a = z;
                f6598b = method4;
                f6599c = method2;
            }
        } catch (Exception e3) {
            method = null;
            method2 = method;
            z = false;
            f6597a = z;
            f6598b = method4;
            f6599c = method2;
        }
        f6597a = z;
        f6598b = method4;
        f6599c = method2;
    }

    /* renamed from: a */
    public static void m9954a(ByteBuffer byteBuffer) {
        if (f6597a && byteBuffer.isDirect()) {
            try {
                f6599c.invoke(f6598b.invoke(byteBuffer, new Object[0]), new Object[0]);
            } catch (Exception e) {
            }
        }
    }
}
