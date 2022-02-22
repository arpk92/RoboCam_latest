package org.p035a.p036a.p043d.p044a.p048d;

import org.p035a.p036a.p054f.p055a.C2537j;

/* renamed from: org.a.a.d.a.d.d */
public class C2446d extends C2445c implements C2466s {

    /* renamed from: a */
    private C2465r f6412a;

    /* renamed from: b */
    private String f6413b;

    public C2446d(C2471x xVar, C2465r rVar, String str) {
        super(xVar);
        mo7205a(rVar);
        mo7206e(str);
    }

    /* renamed from: a */
    public void mo7205a(C2465r rVar) {
        if (rVar == null) {
            throw new NullPointerException("method");
        }
        this.f6412a = rVar;
    }

    /* renamed from: e */
    public void mo7206e(String str) {
        if (str == null) {
            throw new NullPointerException("uri");
        }
        this.f6413b = str;
    }

    @Override // org.p035a.p036a.p043d.p044a.p048d.C2466s
    /* renamed from: g */
    public C2465r mo7207g() {
        return this.f6412a;
    }

    @Override // org.p035a.p036a.p043d.p044a.p048d.C2466s
    /* renamed from: h */
    public String mo7208h() {
        return this.f6413b;
    }

    @Override // org.p035a.p036a.p043d.p044a.p048d.C2445c
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(chunked: ");
        sb.append(mo7194a());
        sb.append(')');
        sb.append(C2537j.f6817a);
        sb.append(mo7207g().toString());
        sb.append(' ');
        sb.append(mo7208h());
        sb.append(' ');
        sb.append(mo7202e().mo7257d());
        sb.append(C2537j.f6817a);
        mo7190a(sb);
        sb.setLength(sb.length() - C2537j.f6817a.length());
        return sb.toString();
    }
}
