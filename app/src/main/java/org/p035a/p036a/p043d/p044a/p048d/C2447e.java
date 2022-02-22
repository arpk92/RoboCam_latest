package org.p035a.p036a.p043d.p044a.p048d;

import org.p035a.p036a.p054f.p055a.C2537j;

/* renamed from: org.a.a.d.a.d.e */
public class C2447e extends C2445c implements C2468u {

    /* renamed from: a */
    private C2470w f6414a;

    public C2447e(C2471x xVar, C2470w wVar) {
        super(xVar);
        mo7209a(wVar);
    }

    @Override // org.p035a.p036a.p043d.p044a.p048d.C2468u
    /* renamed from: a */
    public void mo7209a(C2470w wVar) {
        if (wVar == null) {
            throw new NullPointerException("status");
        }
        this.f6414a = wVar;
    }

    @Override // org.p035a.p036a.p043d.p044a.p048d.C2468u
    /* renamed from: g */
    public C2470w mo7210g() {
        return this.f6414a;
    }

    @Override // org.p035a.p036a.p043d.p044a.p048d.C2445c
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(chunked: ");
        sb.append(mo7194a());
        sb.append(')');
        sb.append(C2537j.f6817a);
        sb.append(mo7202e().mo7257d());
        sb.append(' ');
        sb.append(mo7210g().toString());
        sb.append(C2537j.f6817a);
        mo7190a(sb);
        sb.setLength(sb.length() - C2537j.f6817a.length());
        return sb.toString();
    }
}
