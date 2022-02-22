package ru.proghouse.robocam;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import ru.proghouse.robocam.p063a.C2677a;

/* renamed from: ru.proghouse.robocam.k */
public class C2709k {

    /* renamed from: a */
    public static boolean f7588a = false;

    /* renamed from: b */
    private static List<C2710a> f7589b = new ArrayList();

    /* renamed from: c */
    private static volatile Date f7590c = new Date();

    /* renamed from: ru.proghouse.robocam.k$a */
    public interface C2710a {
        /* renamed from: l */
        void mo7572l();
    }

    /* renamed from: a */
    public static void m10912a() {
        synchronized (HttpServer.f7136a) {
            for (int i = 0; i < f7589b.size(); i++) {
                f7589b.get(i).mo7572l();
            }
        }
    }

    /* renamed from: a */
    public static void m10913a(Date date) {
        f7590c = date;
    }

    /* renamed from: a */
    public static void m10914a(HashSet<Integer> hashSet) {
        C2677a.m10590q().mo7671a(hashSet);
    }

    /* renamed from: a */
    public static void m10915a(Hashtable<String, Integer> hashtable) {
        C2677a.m10590q().mo7672a(hashtable);
    }

    /* renamed from: a */
    public static void m10916a(C2710a aVar) {
        synchronized (HttpServer.f7136a) {
            if (f7589b.indexOf(aVar) < 0) {
                f7589b.add(aVar);
            }
        }
    }

    /* renamed from: b */
    public static Date m10917b() {
        return f7590c;
    }

    /* renamed from: b */
    public static void m10918b(C2710a aVar) {
        synchronized (HttpServer.f7136a) {
            f7589b.remove(aVar);
        }
    }

    /* renamed from: c */
    public static void m10919c() {
        HttpServer.m10339a();
        LocalControllersActivity.m10424j();
    }
}
