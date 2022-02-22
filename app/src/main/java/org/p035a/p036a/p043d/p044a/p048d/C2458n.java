package org.p035a.p036a.p043d.p044a.p048d;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* renamed from: org.a.a.d.a.d.n */
public class C2458n {

    /* renamed from: a */
    private final C2459a[] f6429a = new C2459a[17];

    /* renamed from: b */
    private final C2459a f6430b = new C2459a(-1, null, null);

    /* renamed from: org.a.a.d.a.d.n$a */
    private static final class C2459a implements Map.Entry<String, String> {

        /* renamed from: a */
        final int f6431a;

        /* renamed from: b */
        final String f6432b;

        /* renamed from: c */
        String f6433c;

        /* renamed from: d */
        C2459a f6434d;

        /* renamed from: e */
        C2459a f6435e;

        /* renamed from: f */
        C2459a f6436f;

        C2459a(int i, String str, String str2) {
            this.f6431a = i;
            this.f6432b = str;
            this.f6433c = str2;
        }

        /* renamed from: a */
        public String setValue(String str) {
            if (str == null) {
                throw new NullPointerException("value");
            }
            C2452i.m9702b(str);
            String str2 = this.f6433c;
            this.f6433c = str;
            return str2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo7226a() {
            this.f6435e.f6436f = this.f6436f;
            this.f6436f.f6435e = this.f6435e;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo7227a(C2459a aVar) {
            this.f6436f = aVar;
            this.f6435e = aVar.f6435e;
            this.f6435e.f6436f = this;
            this.f6436f.f6435e = this;
        }

        /* renamed from: b */
        public String getKey() {
            return this.f6432b;
        }

        /* renamed from: c */
        public String getValue() {
            return this.f6433c;
        }

        public String toString() {
            return this.f6432b + "=" + this.f6433c;
        }
    }

    C2458n() {
        C2459a aVar = this.f6430b;
        C2459a aVar2 = this.f6430b;
        C2459a aVar3 = this.f6430b;
        aVar2.f6436f = aVar3;
        aVar.f6435e = aVar3;
    }

    /* renamed from: a */
    private static int m9730a(int i) {
        return i % 17;
    }

    /* renamed from: a */
    public static long m9731a(C2460o oVar, long j) {
        String b = oVar.mo7195b("Content-Length");
        if (b != null) {
            return Long.parseLong(b);
        }
        if (oVar instanceof C2466s) {
            C2466s sVar = (C2466s) oVar;
            if (!C2465r.f6464b.equals(sVar.mo7207g()) || !sVar.mo7201d("Sec-WebSocket-Key1") || !sVar.mo7201d("Sec-WebSocket-Key2")) {
                return j;
            }
            return 8;
        } else if (!(oVar instanceof C2468u)) {
            return j;
        } else {
            C2468u uVar = (C2468u) oVar;
            if (uVar.mo7210g().mo7245a() != 101 || !uVar.mo7201d("Sec-WebSocket-Origin") || !uVar.mo7201d("Sec-WebSocket-Location")) {
                return j;
            }
            return 16;
        }
    }

    /* renamed from: a */
    private static String m9732a(Object obj) {
        if (obj == null) {
            return null;
        }
        return obj.toString();
    }

    /* JADX WARNING: CFG modification limit reached, blocks count: 125 */
    /* renamed from: a */
    private void m9733a(int i, int i2, String str) {
        C2459a aVar;
        C2459a aVar2 = this.f6429a[i2];
        if (aVar2 != null) {
            while (true) {
                if (aVar2.f6431a == i && m9735a(str, aVar2.f6432b)) {
                    aVar2.mo7226a();
                    aVar2 = aVar2.f6434d;
                    if (aVar2 == null) {
                        this.f6429a[i2] = null;
                        break;
                    }
                    this.f6429a[i2] = aVar2;
                }
            }
            loop1:
            while (true) {
                aVar = aVar2.f6434d;
                if (aVar == null) {
                    break loop1;
                } else if (aVar.f6431a != i || !m9735a(str, aVar.f6432b)) {
                    aVar2 = aVar;
                } else {
                    aVar2.f6434d = aVar.f6434d;
                    aVar.mo7226a();
                }
            }
            aVar2 = aVar;
        }
    }

    /* renamed from: a */
    private void m9734a(int i, int i2, String str, String str2) {
        C2459a aVar = this.f6429a[i2];
        C2459a[] aVarArr = this.f6429a;
        C2459a aVar2 = new C2459a(i, str, str2);
        aVarArr[i2] = aVar2;
        aVar2.f6434d = aVar;
        aVar2.mo7227a(this.f6430b);
    }

    /* renamed from: a */
    private static boolean m9735a(String str, String str2) {
        int length = str.length();
        if (length != str2.length()) {
            return false;
        }
        for (int i = length - 1; i >= 0; i--) {
            char charAt = str.charAt(i);
            char charAt2 = str2.charAt(i);
            if (charAt != charAt2) {
                if (charAt >= 'A' && charAt <= 'Z') {
                    charAt = (char) (charAt + ' ');
                }
                if (charAt2 >= 'A' && charAt2 <= 'Z') {
                    charAt2 = (char) (charAt2 + ' ');
                }
                if (charAt != charAt2) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m9736a(C2460o oVar) {
        String b = oVar.mo7195b("Connection");
        if ("close".equalsIgnoreCase(b)) {
            return false;
        }
        return oVar.mo7202e().mo7258e() ? !"close".equalsIgnoreCase(b) : "keep-alive".equalsIgnoreCase(b);
    }

    /* renamed from: b */
    public static boolean m9737b(C2460o oVar) {
        if (!(oVar instanceof C2466s)) {
            return false;
        }
        if (oVar.mo7202e().compareTo(C2471x.f6527b) < 0) {
            return false;
        }
        String b = oVar.mo7195b("Expect");
        if (b == null) {
            return false;
        }
        if ("100-continue".equalsIgnoreCase(b)) {
            return true;
        }
        for (String str : oVar.mo7198c("Expect")) {
            if ("100-continue".equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    private static int m9738f(String str) {
        int i = 0;
        for (int length = str.length() - 1; length >= 0; length--) {
            char charAt = str.charAt(length);
            if (charAt >= 'A' && charAt <= 'Z') {
                charAt = (char) (charAt + ' ');
            }
            i = (i * 31) + charAt;
        }
        if (i > 0) {
            return i;
        }
        if (i == Integer.MIN_VALUE) {
            return Integer.MAX_VALUE;
        }
        return -i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo7216a() {
        for (int i = 0; i < this.f6429a.length; i++) {
            this.f6429a[i] = null;
        }
        C2459a aVar = this.f6430b;
        C2459a aVar2 = this.f6430b;
        C2459a aVar3 = this.f6430b;
        aVar2.f6436f = aVar3;
        aVar.f6435e = aVar3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo7186a(String str) {
        C2452i.m9700a(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo7217a(String str, Iterable<?> iterable) {
        Object next;
        if (iterable == null) {
            throw new NullPointerException("values");
        }
        mo7186a(str);
        int f = m9738f(str);
        int a = m9730a(f);
        m9733a(f, a, str);
        Iterator<?> it = iterable.iterator();
        while (it.hasNext() && (next = it.next()) != null) {
            String a2 = m9732a(next);
            C2452i.m9702b(a2);
            m9734a(f, a, str, a2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo7218a(String str, Object obj) {
        mo7186a(str);
        String a = m9732a(obj);
        C2452i.m9702b(a);
        int f = m9738f(str);
        m9734a(f, m9730a(f), str, a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public List<Map.Entry<String, String>> mo7219b() {
        LinkedList linkedList = new LinkedList();
        for (C2459a aVar = this.f6430b.f6436f; aVar != this.f6430b; aVar = aVar.f6436f) {
            linkedList.add(aVar);
        }
        return linkedList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo7220b(String str) {
        if (str == null) {
            throw new NullPointerException("name");
        }
        int f = m9738f(str);
        m9733a(f, m9730a(f), str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo7221b(String str, Object obj) {
        mo7186a(str);
        String a = m9732a(obj);
        C2452i.m9702b(a);
        int f = m9738f(str);
        int a2 = m9730a(f);
        m9733a(f, a2, str);
        m9734a(f, a2, str, a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public String mo7222c(String str) {
        if (str == null) {
            throw new NullPointerException("name");
        }
        int f = m9738f(str);
        for (C2459a aVar = this.f6429a[m9730a(f)]; aVar != null; aVar = aVar.f6434d) {
            if (aVar.f6431a == f && m9735a(str, aVar.f6432b)) {
                return aVar.f6433c;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public List<String> mo7223d(String str) {
        if (str == null) {
            throw new NullPointerException("name");
        }
        LinkedList linkedList = new LinkedList();
        int f = m9738f(str);
        for (C2459a aVar = this.f6429a[m9730a(f)]; aVar != null; aVar = aVar.f6434d) {
            if (aVar.f6431a == f && m9735a(str, aVar.f6432b)) {
                linkedList.addFirst(aVar.f6433c);
            }
        }
        return linkedList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo7224e(String str) {
        return mo7222c(str) != null;
    }
}
