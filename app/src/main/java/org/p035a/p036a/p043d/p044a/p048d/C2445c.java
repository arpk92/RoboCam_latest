package org.p035a.p036a.p043d.p044a.p048d;

import java.util.List;
import java.util.Map;
import org.p035a.p036a.p038b.C2284d;
import org.p035a.p036a.p038b.C2286f;
import org.p035a.p036a.p054f.p055a.C2537j;

/* renamed from: org.a.a.d.a.d.c */
public class C2445c implements C2460o {

    /* renamed from: a */
    private final C2458n f6408a = new C2458n();

    /* renamed from: b */
    private C2471x f6409b;

    /* renamed from: c */
    private C2284d f6410c = C2286f.f6097c;

    /* renamed from: d */
    private boolean f6411d;

    protected C2445c(C2471x xVar) {
        mo7192a(xVar);
    }

    @Override // org.p035a.p036a.p043d.p044a.p048d.C2460o
    /* renamed from: a */
    public void mo7187a(String str) {
        this.f6408a.mo7220b(str);
    }

    @Override // org.p035a.p036a.p043d.p044a.p048d.C2460o
    /* renamed from: a */
    public void mo7188a(String str, Iterable<?> iterable) {
        this.f6408a.mo7217a(str, iterable);
    }

    @Override // org.p035a.p036a.p043d.p044a.p048d.C2460o
    /* renamed from: a */
    public void mo7189a(String str, Object obj) {
        this.f6408a.mo7218a(str, obj);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo7190a(StringBuilder sb) {
        for (Map.Entry<String, String> entry : mo7200d()) {
            sb.append(entry.getKey());
            sb.append(": ");
            sb.append(entry.getValue());
            sb.append(C2537j.f6817a);
        }
    }

    @Override // org.p035a.p036a.p043d.p044a.p048d.C2460o
    /* renamed from: a */
    public void mo7191a(C2284d dVar) {
        if (dVar == null) {
            dVar = C2286f.f6097c;
        }
        if (!dVar.mo6836c() || !mo7194a()) {
            this.f6410c = dVar;
            return;
        }
        throw new IllegalArgumentException("non-empty content disallowed if this.chunked == true");
    }

    /* renamed from: a */
    public void mo7192a(C2471x xVar) {
        if (xVar == null) {
            throw new NullPointerException("version");
        }
        this.f6409b = xVar;
    }

    @Override // org.p035a.p036a.p043d.p044a.p048d.C2460o
    /* renamed from: a */
    public void mo7193a(boolean z) {
        this.f6411d = z;
        if (z) {
            mo7191a(C2286f.f6097c);
        }
    }

    @Override // org.p035a.p036a.p043d.p044a.p048d.C2460o
    /* renamed from: a */
    public boolean mo7194a() {
        if (this.f6411d) {
            return true;
        }
        return C2452i.m9701a(this);
    }

    @Override // org.p035a.p036a.p043d.p044a.p048d.C2460o
    /* renamed from: b */
    public String mo7195b(String str) {
        return this.f6408a.mo7222c(str);
    }

    @Override // org.p035a.p036a.p043d.p044a.p048d.C2460o
    /* renamed from: b */
    public void mo7196b(String str, Object obj) {
        this.f6408a.mo7221b(str, obj);
    }

    @Deprecated
    /* renamed from: b */
    public boolean mo7197b() {
        return C2458n.m9736a((C2460o) this);
    }

    @Override // org.p035a.p036a.p043d.p044a.p048d.C2460o
    /* renamed from: c */
    public List<String> mo7198c(String str) {
        return this.f6408a.mo7223d(str);
    }

    @Override // org.p035a.p036a.p043d.p044a.p048d.C2460o
    /* renamed from: c */
    public void mo7199c() {
        this.f6408a.mo7216a();
    }

    @Override // org.p035a.p036a.p043d.p044a.p048d.C2460o
    /* renamed from: d */
    public List<Map.Entry<String, String>> mo7200d() {
        return this.f6408a.mo7219b();
    }

    @Override // org.p035a.p036a.p043d.p044a.p048d.C2460o
    /* renamed from: d */
    public boolean mo7201d(String str) {
        return this.f6408a.mo7224e(str);
    }

    @Override // org.p035a.p036a.p043d.p044a.p048d.C2460o
    /* renamed from: e */
    public C2471x mo7202e() {
        return this.f6409b;
    }

    @Override // org.p035a.p036a.p043d.p044a.p048d.C2460o
    /* renamed from: f */
    public C2284d mo7203f() {
        return this.f6410c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(version: ");
        sb.append(mo7202e().mo7257d());
        sb.append(", keepAlive: ");
        sb.append(mo7197b());
        sb.append(", chunked: ");
        sb.append(mo7194a());
        sb.append(')');
        sb.append(C2537j.f6817a);
        mo7190a(sb);
        sb.setLength(sb.length() - C2537j.f6817a.length());
        return sb.toString();
    }
}
