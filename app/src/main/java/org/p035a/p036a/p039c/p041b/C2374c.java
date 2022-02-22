package org.p035a.p036a.p039c.p041b;

import java.net.Socket;
import java.net.SocketException;
import org.p035a.p036a.p039c.C2307ab;
import org.p035a.p036a.p039c.C2388j;
import org.p035a.p036a.p054f.p055a.C2528c;

/* renamed from: org.a.a.c.b.c */
public class C2374c extends C2307ab implements C2379h {

    /* renamed from: a */
    private final Socket f6325a;

    public C2374c(Socket socket) {
        if (socket == null) {
            throw new NullPointerException("socket");
        }
        this.f6325a = socket;
    }

    /* renamed from: a */
    public void mo7136a(boolean z) {
        try {
            this.f6325a.setKeepAlive(z);
        } catch (SocketException e) {
            throw new C2388j(e);
        }
    }

    @Override // org.p035a.p036a.p039c.C2307ab
    /* renamed from: a */
    public boolean mo6947a(String str, Object obj) {
        if (super.mo6947a(str, obj)) {
            return true;
        }
        if (str.equals("receiveBufferSize")) {
            mo7137b(C2528c.m10051a(obj));
            return true;
        } else if (str.equals("sendBufferSize")) {
            mo7139c(C2528c.m10051a(obj));
            return true;
        } else if (str.equals("tcpNoDelay")) {
            mo7140c(C2528c.m10052b(obj));
            return true;
        } else if (str.equals("keepAlive")) {
            mo7136a(C2528c.m10052b(obj));
            return true;
        } else if (str.equals("reuseAddress")) {
            mo7138b(C2528c.m10052b(obj));
            return true;
        } else if (str.equals("soLinger")) {
            mo7141d(C2528c.m10051a(obj));
            return true;
        } else if (!str.equals("trafficClass")) {
            return false;
        } else {
            mo7142e(C2528c.m10051a(obj));
            return true;
        }
    }

    /* renamed from: b */
    public void mo7137b(int i) {
        try {
            this.f6325a.setReceiveBufferSize(i);
        } catch (SocketException e) {
            throw new C2388j(e);
        }
    }

    /* renamed from: b */
    public void mo7138b(boolean z) {
        try {
            this.f6325a.setReuseAddress(z);
        } catch (SocketException e) {
            throw new C2388j(e);
        }
    }

    /* renamed from: c */
    public void mo7139c(int i) {
        try {
            this.f6325a.setSendBufferSize(i);
        } catch (SocketException e) {
            throw new C2388j(e);
        }
    }

    /* renamed from: c */
    public void mo7140c(boolean z) {
        try {
            this.f6325a.setTcpNoDelay(z);
        } catch (SocketException e) {
            throw new C2388j(e);
        }
    }

    /* renamed from: d */
    public void mo7141d(int i) {
        if (i < 0) {
            try {
                this.f6325a.setSoLinger(false, 0);
            } catch (SocketException e) {
                throw new C2388j(e);
            }
        } else {
            try {
                this.f6325a.setSoLinger(true, i);
            } catch (SocketException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: e */
    public void mo7142e(int i) {
        try {
            this.f6325a.setTrafficClass(i);
        } catch (SocketException e) {
            throw new C2388j(e);
        }
    }
}
