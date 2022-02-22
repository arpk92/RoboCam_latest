package org.p035a.p036a.p043d.p044a.p048d;

import org.p035a.p036a.p038b.C2284d;

import java.io.UnsupportedEncodingException;

/* renamed from: org.a.a.d.a.d.v */
public class C2469v extends C2464q {
    /* access modifiers changed from: protected */
    @Override // org.p035a.p036a.p043d.p044a.p048d.C2464q
    /* renamed from: a */
    public void mo7238a(C2284d dVar, C2460o oVar) {
        C2468u uVar = (C2468u) oVar;
        try {
            dVar.mo6832b(uVar.mo7202e().toString().getBytes("ASCII"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        dVar.mo6848h(32);
        try {
            dVar.mo6832b(String.valueOf(uVar.mo7210g().mo7245a()).getBytes("ASCII"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        dVar.mo6848h(32);
        try {
            dVar.mo6832b(String.valueOf(uVar.mo7210g().mo7247b()).getBytes("ASCII"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        dVar.mo6848h(13);
        dVar.mo6848h(10);
    }
}
