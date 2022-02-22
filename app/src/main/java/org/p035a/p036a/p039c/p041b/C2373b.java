package org.p035a.p036a.p039c.p041b;

import java.net.ServerSocket;
import java.net.SocketException;
import org.p035a.p036a.p039c.C2315ah;
import org.p035a.p036a.p039c.C2388j;
import org.p035a.p036a.p054f.p055a.C2528c;

/* renamed from: org.a.a.c.b.b */
public class C2373b extends C2315ah implements C2376e {

    /* renamed from: a */
    private final ServerSocket f6323a;

    /* renamed from: b */
    private volatile int f6324b;

    public C2373b(ServerSocket serverSocket) {
        if (serverSocket == null) {
            throw new NullPointerException("socket");
        }
        this.f6323a = serverSocket;
    }

    /* renamed from: a */
    public void mo7132a(int i) {
        try {
            this.f6323a.setReceiveBufferSize(i);
        } catch (SocketException e) {
            throw new C2388j(e);
        }
    }

    /* renamed from: a */
    public void mo7133a(boolean z) {
        try {
            this.f6323a.setReuseAddress(z);
        } catch (SocketException e) {
            throw new C2388j(e);
        }
    }

    @Override // org.p035a.p036a.p039c.C2315ah
    /* renamed from: a */
    public boolean mo7000a(String str, Object obj) {
        if (super.mo7000a(str, obj)) {
            return true;
        }
        if (str.equals("receiveBufferSize")) {
            mo7132a(C2528c.m10051a(obj));
            return true;
        } else if (str.equals("reuseAddress")) {
            mo7133a(C2528c.m10052b(obj));
            return true;
        } else if (!str.equals("backlog")) {
            return false;
        } else {
            mo7134b(C2528c.m10051a(obj));
            return true;
        }
    }

    /* renamed from: b */
    public void mo7134b(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("backlog: " + i);
        }
        this.f6324b = i;
    }

    @Override // org.p035a.p036a.p039c.p041b.C2376e
    /* renamed from: c */
    public int mo7135c() {
        return this.f6324b;
    }
}
