package org.p057b.p060b;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/* renamed from: org.b.b.b */
public class C2555b {

    /* renamed from: a */
    private static final ThreadLocal<DateFormat> f6832a = new ThreadLocal<DateFormat>() {
        /* class org.p057b.p060b.C2555b.C25561 */

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public DateFormat initialValue() {
            return new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz");
        }
    };

    /* renamed from: a */
    public static String m10089a(Date date) {
        return f6832a.get().format(date);
    }
}
