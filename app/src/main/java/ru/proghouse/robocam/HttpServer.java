package ru.proghouse.robocam;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.AssetManager;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URI;
import java.net.URLDecoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Enumeration;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Locale;
import java.util.UUID;
import java.util.zip.ZipFile;

import org.p057b.C2546a;
import org.p057b.C2612h;
import org.p057b.C2613i;
import org.p057b.C2614j;

import ru.proghouse.robocam.p063a.C2677a;
import ru.proghouse.robocam.C2671a;
import ru.proghouse.robocam.C2709k;
import ru.proghouse.robocam.C2714o;
import ru.proghouse.robocam.R;

@SuppressWarnings("ALL")
/* renamed from: ru.proghouse.robocam.HttpServer */
public class HttpServer extends IntentService {
    /* access modifiers changed from: private */

    /* renamed from: A */
    public static volatile String f7133A = "guest";
    /* access modifiers changed from: private */

    /* renamed from: B */
    public static volatile String f7134B = "123";
    /* access modifiers changed from: private */

    /* renamed from: C */
    public static volatile boolean f7135C = true;

    /* renamed from: a */
    public static Object f7136a = new Object();

    /* renamed from: b */
    private static int f7137b = 0;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static Hashtable f7138e = new Hashtable();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static String f7139f = new String(new char[]{File.separatorChar});
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static HashSet<String> f7140g = new HashSet<>();
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static HashSet<String> f7141h = new HashSet<>();
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static HashSet<String> f7142i = new HashSet<>();
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static Hashtable<String, String> f7143j = new Hashtable<>();
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static Hashtable<String, Date> f7144k = new Hashtable<>();
    /* access modifiers changed from: private */

    /* renamed from: l */
    public static Hashtable<String, Date> f7145l = new Hashtable<>();
    /* access modifiers changed from: private */

    /* renamed from: m */
    public static int f7146m = 30;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public static int f7147n = 4;

    /* renamed from: o */
    private static int f7148o = 8088;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public static int f7149p = 8089;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public static volatile File f7150s = null;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public static HttpServer f7151t = null;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public static Hashtable<C2614j, String> f7152u = new Hashtable<>();
    /* access modifiers changed from: private */

    /* renamed from: v */
    public static Hashtable<C2614j, String> f7153v = new Hashtable<>();
    /* access modifiers changed from: private */

    /* renamed from: w */
    public static Hashtable<C2614j, Date> f7154w = new Hashtable<>();
    /* access modifiers changed from: private */

    /* renamed from: x */
    public static Hashtable<String, Socket> f7155x = new Hashtable<>();
    /* access modifiers changed from: private */

    /* renamed from: y */
    public static volatile String f7156y = "admin";
    /* access modifiers changed from: private */

    /* renamed from: z */
    public static volatile String f7157z = "123";

    /* renamed from: c */
    private volatile ServerSocket f7158c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public volatile boolean f7159d;

    /* renamed from: q */
    private volatile C2612h f7160q = null;

    /* renamed from: r */
    private volatile C2633a f7161r = null;

    /* renamed from: ru.proghouse.robocam.HttpServer$a */
    class C2633a extends C2546a {
        C2633a() {
        }

        /* renamed from: a */
        public void mo7548a() {
            synchronized (HttpServer.f7136a) {
                Enumeration keys = HttpServer.f7152u.keys();
                while (keys.hasMoreElements()) {
                    C2614j jVar = (C2614j) keys.nextElement();
                    if (HttpServer.f7144k.containsKey((String) HttpServer.f7152u.get(jVar))) {
                        jVar.mo7492a("<msg><name>updateJoysticks</name><jb>" + (C2677a.m10590q().mo7686j() ? C2677a.m10590q().mo7676b() : "00000000") + "</jb>" + "<js>" + (C2677a.m10590q().mo7686j() ? C2677a.m10590q().mo7677c() : "----") + "</js>" + "<kb>" + (C2677a.m10590q().mo7686j() ? C2677a.m10590q().mo7678d() : "") + "</kb>" + "<hj>" + ((!C2677a.m10590q().mo7686j() || !C2677a.m10590q().mo7680e()) ? "0" : "1") + "</hj>" + "<di>" + ((!C2677a.m10590q().mo7686j() || !C2677a.m10590q().mo7693t()) ? "0" : "1") + "</di>" + "</msg>");
                    }
                }
            }
        }

        /* renamed from: a */
        public void mo7549a(String str) {
            synchronized (HttpServer.f7136a) {
                Enumeration keys = HttpServer.f7152u.keys();
                while (keys.hasMoreElements()) {
                    ((C2614j) keys.nextElement()).mo7492a(str);
                }
            }
        }

        /* renamed from: a */
        public void mo7406a(C2614j jVar) {
            synchronized (HttpServer.f7136a) {
                String str = "";
                String a = jVar.mo7426a().mo7460a("sk");
                if (HttpServer.f7143j.containsKey(a)) {
                    str = (String) HttpServer.f7143j.get(a);
                    HttpServer.f7143j.remove(a);
                }
                HttpServer.f7152u.put(jVar, str);
            }
        }

        /* renamed from: a */
        public void mo7407a(C2614j jVar, String str) {
            synchronized (HttpServer.f7136a) {
                if (HttpServer.f7144k.containsKey((String) HttpServer.f7152u.get(jVar))) {
                    String[] split = str.split(":", 2);
                    if (split.length != 2 || !split[0].equalsIgnoreCase("tst")) {
                        if (split.length == 2 && split[0].equalsIgnoreCase("jv")) {
                            String[] split2 = split[1].split(";");
                            Hashtable hashtable = new Hashtable();
                            for (String str2 : split2) {
                                if (str2 != null && !str2.equalsIgnoreCase("")) {
                                    String[] split3 = str2.split("=");
                                    if (split3.length == 2) {
                                        try {
                                            hashtable.put(split3[0], Integer.valueOf(Integer.parseInt(split3[1])));
                                        } catch (NumberFormatException e) {
                                        }
                                    }
                                }
                            }
                            if (hashtable.size() > 0) {
                                C2709k.m10915a((Hashtable<String, Integer>) hashtable);
                            }
                        } else if (split.length == 2 && split[0].equalsIgnoreCase("kp")) {
                            try {
                                HashSet hashSet = new HashSet();
                                for (int i = 0; i < split[1].length() / 3; i++) {
                                    int parseInt = Integer.parseInt(split[1].substring(i * 3, (i * 3) + 3));
                                    if (parseInt > 0 && parseInt <= 255) {
                                        hashSet.add(Integer.valueOf(parseInt));
                                    }
                                }
                                C2709k.m10914a((HashSet<Integer>) hashSet);
                            } catch (NumberFormatException e2) {
                            }
                        }
                    } else if (!HttpServer.f7153v.containsKey(jVar) || !((String) HttpServer.f7153v.get(jVar)).equals(split[1])) {
                        HttpServer.f7153v.put(jVar, split[1]);
                        HttpServer.f7154w.put(jVar, new Date());
                    }
                }
            }
        }

        /* renamed from: b */
        public void mo7409b(C2614j jVar) {
            synchronized (HttpServer.f7136a) {
                HttpServer.f7152u.remove(jVar);
                HttpServer.f7153v.remove(jVar);
                HttpServer.f7154w.remove(jVar);
                if (HttpServer.f7144k.containsKey((String) HttpServer.f7152u.get(jVar))) {
                    C2677a.m10590q().mo7690n();
                }
            }
        }
    }

    /* renamed from: ru.proghouse.robocam.HttpServer$b */
    private static class C2634b implements Runnable {

        /* renamed from: h */
        private static String f7163h = "web";

        /* renamed from: a */
        private HttpServer f7164a;

        /* renamed from: b */
        private Socket f7165b;

        /* renamed from: c */
        private InputStream f7166c;

        /* renamed from: d */
        private OutputStream f7167d;

        /* renamed from: e */
        private OutputStreamWriter f7168e;

        /* renamed from: f */
        private AssetManager f7169f;

        /* renamed from: g */
        private String f7170g;

        /* renamed from: i */
        private String f7171i;

        /* renamed from: j */
        private Integer f7172j;

        /* renamed from: k */
        private Hashtable<String, String> f7173k;

        /* renamed from: l */
        private Hashtable<String, String> f7174l;

        /* renamed from: m */
        private String f7175m;

        /* renamed from: n */
        private String f7176n;

        /* renamed from: o */
        private String f7177o;

        /* renamed from: p */
        private String f7178p;

        private C2634b(HttpServer httpServer, Socket socket, AssetManager assetManager, String str, String str2) {
            this.f7172j = null;
            this.f7173k = new Hashtable<>();
            this.f7174l = new Hashtable<>();
            this.f7175m = "none";
            this.f7176n = "";
            this.f7177o = "";
            this.f7178p = "";
            this.f7164a = httpServer;
            this.f7171i = str2;
            this.f7170g = str;
            this.f7165b = socket;
            this.f7169f = assetManager;
            try {
                this.f7166c = socket.getInputStream();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                this.f7167d = socket.getOutputStream();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                this.f7168e = new OutputStreamWriter(this.f7167d, "UTF-8");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }

        /* renamed from: a */
        private int m10380a() {
            if (this.f7172j == null) {
                try {
                    return this.f7166c.read();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            int intValue = this.f7172j.intValue();
            this.f7172j = null;
            return intValue;
        }

        /* renamed from: a */
        private String m10381a(String str) {
            int lastIndexOf = str.lastIndexOf(46);
            if (lastIndexOf > 0) {
                String lowerCase = str.substring(lastIndexOf).toLowerCase();
                if (HttpServer.f7138e.containsKey(lowerCase)) {
                    return (String) HttpServer.f7138e.get(lowerCase);
                }
            }
            return "content/unknown";
        }

        /* renamed from: a */
        private String m10382a(String str, String str2, String str3) {
            if (!(this.f7177o == null || this.f7177o.compareTo("") == 0 || this.f7176n == null || this.f7176n.compareTo("") == 0)) {
                this.f7175m = "block";
            }
            return str.replace("$$systemMessageDisplay$$", this.f7175m).replace("$$systemMessageText$$", this.f7177o).replace("$$systemMessageTitle$$", this.f7176n).replace("$$loginWrongUsername$$", this.f7178p).replace("<html manifest=\"offline.appcache\">", "<html>");
        }

        /* renamed from: a */
        private void m10383a(int i, String str, String[] strArr, boolean z, boolean z2) {
            try {
                try {
                    this.f7168e.write("HTTP/1.1 " + i + " " + str + "\r\n");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (strArr != null) {
                    for (int i2 = 0; i2 < strArr.length; i2++) {
                        try {
                            this.f7168e.write(strArr[i2] + "\r\n");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
                if (z2) {
                    try {
                        this.f7168e.write("Content-type: text/html\r\n\r\n" + str);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                try {
                    this.f7168e.flush();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } finally {
                if (z) {
                    try {
                        this.f7165b.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

        private void m10384a(java.lang.String r22, java.lang.String r23, java.net.URI r24) {
            throw new UnsupportedOperationException("Method not decompiled: ru.proghouse.robocam.HttpServer.C2634b.m10384a(java.lang.String, java.lang.String, java.net.URI):void");
        }

        /* renamed from: a */
        private void m10385a(Hashtable<String, Date> hashtable) {
            synchronized (HttpServer.f7136a) {
                Calendar instance = GregorianCalendar.getInstance();
                instance.add(12, -HttpServer.f7146m);
                ArrayList arrayList = new ArrayList();
                Enumeration<String> keys = hashtable.keys();
                while (keys.hasMoreElements()) {
                    String nextElement = keys.nextElement();
                    if (hashtable.get(nextElement).before(instance.getTime())) {
                        arrayList.add(nextElement);
                    }
                }
                for (int i = 0; i < arrayList.size(); i++) {
                    hashtable.remove(arrayList.get(i));
                }
            }
        }

        /* renamed from: a */
        private boolean m10386a(String[] strArr, String str) {
            for (String lowerCase : strArr) {
                if (lowerCase.toLowerCase().compareTo(str) == 0) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: b */
        private String m10387b() {
            int a = 0;
            ArrayList arrayList = new ArrayList();
            try {
                while (true) {
                    a = m10380a();
                    if (a < 0) {
                        break;
                    } else if (a == 13 || a == 10) {
                        int a2 = m10380a();
                        break;
                    } else {
                        arrayList.add(new Byte((byte) a));
                    }
                }

                int a22 = m10380a();
                if (a22 >= 0 && !((a == 13 && a22 == 10) || (a == 10 && a22 == 13))) {
                    this.f7172j = new Integer(a22);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            byte[] bArr = new byte[arrayList.size()];
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= arrayList.size()) {
                    try {
                        return new String(bArr, "UTF-8");
                    } catch (UnsupportedEncodingException e) {
                        e.printStackTrace();
                    }
                }
                bArr[i2] = ((Byte) arrayList.get(i2)).byteValue();
                i = i2 + 1;
            }
        }

        /* renamed from: b */
        private Hashtable<String, String> m10388b(String str) {
            Hashtable<String, String> hashtable = new Hashtable<>();
            String[] split = str.split("&");
            for (String split2 : split) {
                String[] split3 = split2.split("=", 2);
                if (split3.length > 0) {
                    try {
                        hashtable.put(split3[0], split3.length > 1 ? URLDecoder.decode(split3[1], "UTF-8") : "");
                    } catch (UnsupportedEncodingException e) {
                        e.printStackTrace();
                    }
                }
            }
            return hashtable;
        }

        /* renamed from: c */
        private void m10389c() {
            if (this.f7173k.containsKey("Cookie:")) {
                String[] split = this.f7173k.get("Cookie:").split(";");
                for (String split2 : split) {
                    String[] split3 = split2.split("=", 2);
                    this.f7174l.put(split3[0], split3.length > 1 ? split3[1] : "");
                }
            }
        }

        /* JADX INFO: finally extract failed */
        /* renamed from: c */
        private void m10390c(String str) {
            try {
                C2671a a = C2671a.m10540a();
                m10383a(200, "OK", new String[]{"Server: RoboCam Server", "Connection: close", "Max-Age: 0", "Expires: 0", "Cache-Control: no-store, no-cache, must-revalidate, pre-check=0, post-check=0, max-age=0", "Pragma: no-cache", "Content-Type: multipart/x-mixed-replace; boundary=" + "This is the frame!"}, false, false);
                this.f7168e.write("\r\n");
                this.f7168e.write("--" + "This is the frame!" + "\r\n");
                this.f7168e.flush();
                HttpServer.f7155x.put(str, this.f7165b);
                try {
                    a.mo7650h();
                    int i = 0;
                    while (true) {
                        try {
                            int a2 = a.mo7634a(this.f7167d, "This is the frame!", i);
                            if (!this.f7164a.f7159d && !this.f7165b.isClosed()) {
                                if (a2 != i && a2 != 0) {
                                    this.f7167d.write(("--" + "This is the frame!" + "\r\n").getBytes());
                                } else if (!a.mo7653k()) {
                                    Thread.sleep(100);
                                }
                                i = a2;
                            } else if (!(a2 == i || a2 == 0)) {
                                this.f7167d.write(("--" + "This is the frame!" + "--\r\n").getBytes());
                            }
                        } finally {
                            a.mo7651i();
                            //ToDo: break here.
                            break;
                        }
                    }
                    this.f7167d.write(("--" + "This is the frame!" + "--\r\n").getBytes());
                    HttpServer.f7155x.remove(str);
                    this.f7165b.close();
                } catch (Throwable th) {
                    HttpServer.f7155x.remove(str);
                    throw th;
                }
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }

        /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
        public void run() {
            String str;
            String str2;
            InputStream fileInputStream;
            InputStream inputStream;
            byte[] bArr;
            int i;
            byte[] bArr2;
            boolean z = true;
            try {
                String b = m10387b();
                if (b == null || b.trim().length() == 0) {
                    m10383a(405, "empty method type", new String[]{"Allow: GET, HEAD, POST"}, true, true);
                    return;
                }
                String[] split = b.split(" ", 3);
                if (split.length < 2) {
                    m10383a(405, "unknown method type", new String[]{"Allow: GET, HEAD, POST"}, true, true);
                } else if (split[0].compareTo("GET") == 0 || split[0].compareTo("HEAD") == 0 || split[0].compareTo("POST") == 0) {
                    while (true) {
                        //String b2 = b;
                        String[] split2 = b.split(" ", 2);
                        if (b == null || b.trim().length() == 0) {
                            m10389c();
                            break;
                        } else {
                            this.f7173k.put(split2[0], (split2.length < 2 || split2[1] == null) ? "" : split2[1]);
                            break;
                        }
                    }
                    m10389c();
                    if (this.f7174l.containsKey("sess")) {
                        m10385a((Hashtable<String, Date>) HttpServer.f7144k);
                        m10385a((Hashtable<String, Date>) HttpServer.f7145l);
                        synchronized (HttpServer.f7136a) {
                            if (HttpServer.f7144k.containsKey(this.f7174l.get("sess"))) {
                                String str3 = this.f7174l.get("sess");
                                HttpServer.f7144k.put(str3, new Date());
                                str = null;
                                str2 = str3;
                            } else if (HttpServer.f7145l.containsKey(this.f7174l.get("sess"))) {
                                String str4 = this.f7174l.get("sess");
                                HttpServer.f7145l.put(str4, new Date());
                                str = str4;
                                str2 = null;
                            } else {
                                str = null;
                                str2 = null;
                            }
                        }
                    } else {
                        str = null;
                        str2 = null;
                    }
                    if (C2709k.f7588a && str2 == null) {
                        str2 = UUID.randomUUID().toString();
                        HttpServer.f7144k.put(str2, new Date());
                    }
                    if (split[0].compareTo("POST") == 0) {
                        int parseInt = this.f7173k.containsKey("Content-Length:") ? Integer.parseInt(this.f7173k.get("Content-Length:")) : 0;
                        if (parseInt > 0) {
                            bArr2 = new byte[parseInt];
                            i = this.f7166c.read(bArr2);
                        } else {
                            i = parseInt;
                            bArr2 = null;
                        }
                        if (i > 0 && split[1].compareTo("/login.html") == 0) {
                            Hashtable<String, String> b3 = m10388b(new String(bArr2, 0, i, "UTF-8"));
                            if (b3.get("username").compareTo(HttpServer.f7156y) == 0 && b3.get("password").compareTo(HttpServer.f7157z) == 0) {
                                String uuid = UUID.randomUUID().toString();
                                synchronized (HttpServer.f7136a) {
                                    HttpServer.f7144k.put(uuid, new Date());
                                }
                                Calendar instance = GregorianCalendar.getInstance();
                                instance.setTime(new Date());
                                instance.add(1, 1);
                                m10383a(302, "moved temporarily", new String[]{"Location: /", "Set-Cookie: sess=" + uuid + "; expires=" + HttpServer.m10347b(instance.getTime()) + "; path=/"}, true, false);
                                return;
                            } else if (HttpServer.f7135C && b3.get("username").compareTo(HttpServer.f7133A) == 0 && b3.get("password").compareTo(HttpServer.f7134B) == 0) {
                                String uuid2 = UUID.randomUUID().toString();
                                synchronized (HttpServer.f7136a) {
                                    HttpServer.f7145l.put(uuid2, new Date());
                                }
                                Calendar instance2 = GregorianCalendar.getInstance();
                                instance2.setTime(new Date());
                                instance2.add(1, 1);
                                m10383a(302, "moved temporarily", new String[]{"Location: /", "Set-Cookie: sess=" + uuid2 + "; expires=" + HttpServer.m10347b(instance2.getTime()) + "; path=/"}, true, false);
                                return;
                            } else {
                                if (b3.get("username").compareTo("") == 0) {
                                    this.f7177o = this.f7164a.getString(R.string.enter_your_username);
                                } else {
                                    this.f7177o = this.f7164a.getString(R.string.username_and_password_are_wrong);
                                }
                                this.f7176n = this.f7164a.getString(R.string.error);
                                this.f7178p = b3.get("username");
                            }
                        }
                        return;
                    }
                    split[1] = HttpServer.m10351c(split[1]);
                    if (split[1].substring(0, 1).compareTo(HttpServer.f7139f) != 0) {
                        m10383a(404, "path not found", (String[]) null, true, true);
                        return;
                    }
                    URI uri = new URI(split[1]);
                    if (split[1].compareTo(HttpServer.f7139f) == 0) {
                        String[] list = this.f7169f.list(f7163h + HttpServer.f7139f + this.f7171i);
                        if (m10386a(list, "index.html")) {
                            split[1] = HttpServer.f7139f + "index.html";
                        } else if (m10386a(list, "index.htm")) {
                            split[1] = HttpServer.f7139f + "index.htm";
                        } else if (this.f7171i.compareTo("def") != 0) {
                            if (m10386a(this.f7169f.list(f7163h + HttpServer.f7139f + "def"), "index.html")) {
                                split[1] = HttpServer.f7139f + "index.html";
                            } else {
                                split[1] = HttpServer.f7139f + "index.htm";
                            }
                        }
                    }
                    if (str2 == null && str == null && HttpServer.f7140g.contains(split[1])) {
                        m10383a(302, "moved temporarily", new String[]{"Location: /login.html"}, true, false);
                        return;
                    }
                    if (!HttpServer.f7141h.contains(split[1])) {
                        z = false;
                    }
                    try {
                        if (split[1].compareTo("/cam") == 0) {
                            m10390c(str2 != null ? str2 : str);
                        } else if (uri.getPath().equals("/settings")) {
                            m10384a(str2, str, uri);
                        } else {
                            boolean contains = HttpServer.f7142i.contains(split[1]);
                            try {
                                InputStream open = this.f7169f.open(f7163h + HttpServer.f7139f + this.f7171i + split[1]);
                                split[1] = f7163h + HttpServer.f7139f + this.f7171i + split[1];
                                inputStream = open;
                            } catch (FileNotFoundException e) {
                                try {
                                    fileInputStream = this.f7169f.open(f7163h + HttpServer.f7139f + "def" + split[1]);
                                    split[1] = f7163h + HttpServer.f7139f + "def" + split[1];
                                } catch (FileNotFoundException e2) {
                                    try {
                                        File file = new File(C2714o.m10956b(this.f7164a), split[1]);
                                        fileInputStream = new FileInputStream(file);
                                        split[1] = file.getName();
                                    } catch (FileNotFoundException e3) {
                                        m10383a(404, "file not found", (String[]) null, true, true);
                                        return;
                                    }
                                }
                                inputStream = fileInputStream;
                            } catch (IOException e4) {
                                m10383a(500, e4.getMessage(), (String[]) null, true, true);
                                return;
                            }
                            if (contains) {
                                byte[] bArr3 = new byte[inputStream.available()];
                                bArr = m10382a(new String(bArr3, 0, inputStream.read(bArr3, 0, bArr3.length), "UTF-8"), str2, str).getBytes("UTF-8");
                            } else {
                                bArr = null;
                            }
                            if (z) {
                                String[] strArr = new String[7];
                                strArr[0] = "Server: RoboCam Server";
                                strArr[1] = "Content-length: " + (contains ? bArr.length : inputStream.available());
                                strArr[2] = "Content-type: " + m10381a(split[1]);
                                strArr[3] = "Max-Age: 0";
                                strArr[4] = "Expires: 0";
                                strArr[5] = "Cache-Control: no-store, no-cache, must-revalidate, pre-check=0, post-check=0, max-age=0";
                                strArr[6] = "Pragma: no-cache";
                                m10383a(200, "OK", strArr, false, false);
                            } else {
                                String[] strArr2 = new String[5];
                                strArr2[0] = "Server: RoboCam Server";
                                strArr2[1] = "Date: " + HttpServer.m10347b(new Date());
                                strArr2[2] = "Content-length: " + (contains ? bArr.length : inputStream.available());
                                strArr2[3] = "Last Modified: " + this.f7170g;
                                strArr2[4] = "Content-type: " + m10381a(split[1]);
                                m10383a(200, "OK", strArr2, false, false);
                            }
                            if (split[0].compareTo("GET") == 0 || split[0].compareTo("POST") == 0) {
                                this.f7168e.write("\r\n");
                            }
                            this.f7168e.flush();
                            if (split[0].compareTo("GET") == 0 || split[0].compareTo("POST") == 0) {
                                if (!contains) {
                                    byte[] bArr4 = new byte[2048];
                                    while (true) {
                                        int read = inputStream.read(bArr4);
                                        if (read < 0) {
                                            break;
                                        }
                                        this.f7167d.write(bArr4, 0, read);
                                    }
                                } else {
                                    this.f7167d.write(bArr, 0, bArr.length);
                                }
                                this.f7167d.flush();
                            }
                            this.f7165b.close();
                            inputStream.close();
                        }
                    } catch (IOException e5) {
                        m10383a(500, e5.getMessage(), (String[]) null, true, true);
                    }
                } else {
                    m10383a(405, "unsupported method type: " + split[0], new String[]{"Allow: GET, HEAD, POST"}, true, true);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* renamed from: ru.proghouse.robocam.HttpServer$c */
    class C2635c implements Runnable {
        C2635c() {
        }

        public void run() {
            ArrayList<C2614j> arrayList = new ArrayList<>();
            do {
                synchronized (HttpServer.f7136a) {
                    arrayList.clear();
                    Calendar instance = GregorianCalendar.getInstance();
                    instance.add(13, -HttpServer.f7147n);
                    Enumeration keys = HttpServer.f7152u.keys();
                    while (keys.hasMoreElements()) {
                        C2614j jVar = (C2614j) keys.nextElement();
                        if (HttpServer.f7144k.containsKey((String) HttpServer.f7152u.get(jVar))) {
                            if (!HttpServer.f7154w.containsKey(jVar)) {
                                HttpServer.f7154w.put(jVar, new Date());
                            }
                            if (instance.getTime().after((Date) HttpServer.f7154w.get(jVar))) {
                                arrayList.add(jVar);
                            }
                        }
                    }
                    if (arrayList.size() > 0) {
                        for (C2614j jVar2 : arrayList) {
                            HttpServer.m10349b(jVar2, HttpServer.this.getString(R.string.error_poor_connection_quality));
                            jVar2.mo7497b();
                        }
                    }
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } while (HttpServer.f7151t != null);
        }
    }

    static {
        m10374z();
        m10334A();
        m10335B();
        m10336C();
    }

    public HttpServer() {
        super("RoboCamServer");
    }

    /* renamed from: A */
    private static void m10334A() {
        f7140g.add(m10351c("/index.html"));
    }

    /* renamed from: B */
    private static void m10335B() {
        f7141h.add(m10351c("/index.html"));
    }

    /* renamed from: C */
    private static void m10336C() {
        f7142i.add(m10351c("/login.html"));
        f7142i.add(m10351c("/index.html"));
    }

    /* renamed from: D */
    private String m10337D() {
        Exception e;
        String str;
        ZipFile zipFile = null;
        try {
            zipFile = new ZipFile(getPackageManager().getApplicationInfo(getPackageName(), 0).sourceDir);
            str = m10347b(new Date(zipFile.getEntry("classes.dex").getTime()));
            try {
                zipFile.close();
            } catch (Exception e2) {
                e = e2;
                e.printStackTrace();
                return str;
            }
        } catch (Exception e3) {
            Exception exc = e3;
            str = "";
            e = exc;
            e.printStackTrace();
            return str;
        } catch (Throwable th) {
            try {
                zipFile.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            throw th;
        }
        return str;
    }

    /* renamed from: a */
    public static void m10339a() {
        synchronized (f7136a) {
            if (f7151t != null) {
                f7151t.f7161r.mo7548a();
            }
        }
    }

    /* renamed from: a */
    public static void m10340a(Context context) {
        synchronized (f7136a) {
            f7137b = 2;
        }
        C2709k.m10912a();
        context.startService(new Intent(context, HttpServer.class));
    }

    /* renamed from: a */
    public static void m10341a(Context context, boolean z) {
        synchronized (f7136a) {
            SharedPreferences sharedPreferences = context.getSharedPreferences("RoboCamSettings", 0);
            String str = f7156y;
            String str2 = f7157z;
            f7156y = sharedPreferences.getString("driver_name", "admin");
            f7157z = sharedPreferences.getString("driver_pswd", "123");
            String str3 = f7133A;
            String str4 = f7134B;
            f7133A = sharedPreferences.getString("spectator_name", "guest");
            f7134B = sharedPreferences.getString("spectator_pswd", "123");
            boolean z2 = f7135C;
            f7135C = sharedPreferences.getBoolean("allow_spectators", true);
            boolean z3 = sharedPreferences.getBoolean("use_local_controls", false);
            ArrayList<C2614j> arrayList = new ArrayList<>();
            ArrayList<Socket> arrayList2 = new ArrayList<>();
            if (z || z3 || !((!z2 || f7135C) && str3 == f7133A && str4 == f7134B)) {
                Enumeration<C2614j> keys = f7152u.keys();
                while (keys.hasMoreElements()) {
                    C2614j nextElement = keys.nextElement();
                    if (f7145l.containsKey(f7152u.get(nextElement))) {
                        arrayList.add(nextElement);
                    }
                }
                Enumeration<String> keys2 = f7155x.keys();
                while (keys2.hasMoreElements()) {
                    String nextElement2 = keys2.nextElement();
                    if (f7145l.containsKey(nextElement2)) {
                        arrayList2.add(f7155x.get(nextElement2));
                    }
                }
                f7145l.clear();
            }
            if (z || z3 || str != f7156y || str2 != f7157z) {
                Enumeration<C2614j> keys3 = f7152u.keys();
                while (keys3.hasMoreElements()) {
                    C2614j nextElement3 = keys3.nextElement();
                    if (f7144k.containsKey(f7152u.get(nextElement3))) {
                        arrayList.add(nextElement3);
                    }
                }
                Enumeration<String> keys4 = f7155x.keys();
                while (keys4.hasMoreElements()) {
                    String nextElement4 = keys4.nextElement();
                    if (f7144k.containsKey(nextElement4)) {
                        arrayList2.add(f7155x.get(nextElement4));
                    }
                }
                f7144k.clear();
                C2677a.m10590q().mo7690n();
            }
            if (arrayList.size() > 0) {
                for (C2614j jVar : arrayList) {
                    if (z) {
                        m10349b(jVar, context.getString(R.string.error_server_has_been_turned_off));
                    } else if (z3) {
                        m10349b(jVar, context.getString(R.string.error_local_controls_have_been_activated));
                    } else {
                        m10349b(jVar, context.getString(R.string.error_security_settings_have_been_changed));
                    }
                    jVar.mo7497b();
                }
            }
            if (arrayList2.size() > 0) {
                for (Socket close : arrayList2) {
                    try {
                        close.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static void m10342a(String str) {
        synchronized (f7136a) {
            if (f7151t != null) {
                f7151t.f7161r.mo7549a(str);
            }
        }
    }

    /* renamed from: b */
    public static int m10345b() {
        int i;
        synchronized (f7136a) {
            i = f7148o;
        }
        return i;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static String m10347b(Date date) {
        return new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.ENGLISH).format(date);
    }

    /* renamed from: b */
    public static void m10348b(Context context) {
        context.stopService(new Intent(context, HttpServer.class));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m10349b(C2614j jVar, String str) {
        jVar.mo7492a("<msg><name>connectionWasBroken</name><reason>" + str + "</reason>" + "</msg>");
    }

    /* renamed from: c */
    public static int m10350c() {
        int i;
        synchronized (f7136a) {
            i = f7137b;
        }
        return i;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static String m10351c(String str) {
        return str.replace("/", f7139f).replace("\\", f7139f);
    }

    /* renamed from: z */
    private static void m10374z() {
        f7138e.put(".htm", "text/html; charset=UTF-8");
        f7138e.put(".html", "text/html; charset=UTF-8");
        f7138e.put(".text", "text/plain");
        f7138e.put(".txt", "text/plain");
        f7138e.put(".js", "text/javascript; charset=UTF-8");
        f7138e.put(".xml", "text/xml; charset=UTF-8");
        f7138e.put(".css", "text/css");
        f7138e.put(".json", "application/json");
        f7138e.put(".ogg", "audio/ogg");
        f7138e.put(".m4a", "audio/mp4");
        f7138e.put(".wav", "audio/x-wav");
        f7138e.put(".png", "image/png");
        f7138e.put(".jpg", "image/jpeg");
        f7138e.put(".jpeg", "image/jpeg");
        f7138e.put(".gif", "image/gif");
        f7138e.put(".appcache", "text/cache-manifest");
    }

    public void onDestroy() {
        try {
            synchronized (f7136a) {
                f7137b = 3;
                f7151t = null;
            }
            C2709k.m10912a();
            this.f7159d = true;
            if (this.f7158c != null) {
                try {
                    this.f7158c.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (this.f7160q != null) {
                this.f7160q.mo7416b();
            }
            try {
                super.onDestroy();
                //return;
            } catch (Throwable th) {
                synchronized (f7136a) {
                    f7137b = 0;
                    C2709k.m10912a();
                    throw th;
                }
            }
            synchronized (f7136a) {
                f7137b = 0;
            }
            C2709k.m10912a();
        } finally {
            C2677a.m10590q().mo7690n();
        }
    }

    /* access modifiers changed from: protected */
    public void onHandleIntent(Intent intent) {
        try {
            f7150s = C2714o.m10956b(this);
            this.f7161r = new C2633a();
            this.f7160q = C2613i.m10267a(f7149p).mo7479a("/channel", this.f7161r);
            this.f7160q.mo7415a();
            String D = m10337D();
            this.f7159d = false;
            this.f7158c = new ServerSocket(f7148o);
            synchronized (f7136a) {
                f7151t = this;
                f7137b = 1;
            }
            new Thread(new C2635c()).start();
            C2709k.m10912a();
            while (!this.f7158c.isClosed() && !this.f7159d) {
                try {
                    new Thread(new C2634b(this, this.f7158c.accept(), getAssets(), D, getString(R.string.local_web_path))).start();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }
}