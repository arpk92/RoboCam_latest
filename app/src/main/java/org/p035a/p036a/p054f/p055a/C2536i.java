package org.p035a.p036a.p054f.p055a;

import java.util.ArrayList;
import java.util.regex.Pattern;
import org.p035a.p036a.p054f.C2540b;

/* renamed from: org.a.a.f.a.i */
public final class C2536i {

    /* renamed from: a */
    private static final boolean f6815a = (!C2540b.m10069a());

    /* renamed from: b */
    private static final Pattern f6816b = Pattern.compile("^org\\.jboss\\.netty\\.(util\\.(ThreadRenamingRunnable|internal\\.DeadLockProofWorker)|channel\\.(SimpleChannel(Upstream|Downstream)?Handler|(Default|Static)ChannelPipeline.*))(\\$.*)?$");

    /* renamed from: a */
    public static void m10062a(Throwable th) {
        if (f6815a) {
            if (th.getCause() != null) {
                m10062a(th.getCause());
            }
            StackTraceElement[] stackTrace = th.getStackTrace();
            if (stackTrace != null && stackTrace.length != 0 && !f6816b.matcher(stackTrace[0].getClassName()).matches()) {
                ArrayList arrayList = new ArrayList(stackTrace.length);
                arrayList.add(stackTrace[0]);
                for (int i = 1; i < stackTrace.length; i++) {
                    if (!f6816b.matcher(stackTrace[i].getClassName()).matches()) {
                        arrayList.add(stackTrace[i]);
                    }
                }
                th.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[arrayList.size()]));
            }
        }
    }
}
