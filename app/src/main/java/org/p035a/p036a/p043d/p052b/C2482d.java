package org.p035a.p036a.p043d.p052b;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.DatagramChannel;
import java.nio.channels.SocketChannel;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLEngineResult;
import javax.net.ssl.SSLException;
import org.p035a.p036a.p038b.C2284d;
import org.p035a.p036a.p038b.C2286f;
import org.p035a.p036a.p039c.C2308ac;
import org.p035a.p036a.p039c.C2319ak;
import org.p035a.p036a.p039c.C2320al;
import org.p035a.p036a.p039c.C2324ap;
import org.p035a.p036a.p039c.C2384f;
import org.p035a.p036a.p039c.C2386h;
import org.p035a.p036a.p039c.C2387i;
import org.p035a.p036a.p039c.C2390l;
import org.p035a.p036a.p039c.C2391m;
import org.p035a.p036a.p039c.C2396p;
import org.p035a.p036a.p039c.C2402v;
import org.p035a.p036a.p039c.C2403w;
import org.p035a.p036a.p039c.C2405y;
import org.p035a.p036a.p043d.p044a.p047c.C2436b;
import org.p035a.p036a.p053e.C2491b;
import org.p035a.p036a.p053e.C2492c;
import org.p035a.p036a.p054f.p055a.C2531e;
import org.p035a.p036a.p054f.p055a.C2534g;

@SuppressWarnings("ALL")
/* renamed from: org.a.a.d.b.d */
public class C2482d extends C2436b implements C2386h {

    /* renamed from: f */
    static final /* synthetic */ boolean f6546f = (!C2482d.class.desiredAssertionStatus());

    /* renamed from: g */
    private static final C2491b f6547g = C2492c.m9929a(C2482d.class);

    /* renamed from: h */
    private static final ByteBuffer f6548h = ByteBuffer.allocate(0);

    /* renamed from: i */
    private static final Pattern f6549i = Pattern.compile("^.*(Socket|DatagramChannel|SctpChannel).*$");

    /* renamed from: j */
    private static final Pattern f6550j = Pattern.compile("^.*(?:connection.*reset|connection.*closed|broken.*pipe).*$", 2);

    /* renamed from: k */
    private static C2481c f6551k;

    /* renamed from: A */
    private final C2489c f6552A;

    /* renamed from: B */
    private boolean f6553B;

    /* renamed from: c */
    final Object f6554c;

    /* renamed from: d */
    int f6555d;

    /* renamed from: e */
    final Object f6556e;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public volatile C2396p f6557l;

    /* renamed from: m */
    private final SSLEngine f6558m;

    /* renamed from: n */
    private final C2481c f6559n;

    /* renamed from: o */
    private final Executor f6560o;

    /* renamed from: p */
    private final boolean f6561p;

    /* renamed from: q */
    private volatile boolean f6562q;

    /* renamed from: r */
    private boolean f6563r;

    /* renamed from: s */
    private volatile boolean f6564s;

    /* renamed from: t */
    private volatile C2390l f6565t;

    /* renamed from: u */
    private final AtomicBoolean f6566u;

    /* renamed from: v */
    private final AtomicBoolean f6567v;

    /* renamed from: w */
    private final Queue<C2488b> f6568w;

    /* renamed from: x */
    private final Queue<C2324ap> f6569x;

    /* renamed from: y */
    private final C2534g f6570y;

    /* renamed from: z */
    private volatile boolean f6571z;

    /* renamed from: org.a.a.d.b.d$4 */
    static /* synthetic */ class C24864 {

        /* renamed from: b */
        static final /* synthetic */ int[] f6579b = new int[SSLEngineResult.HandshakeStatus.values().length];

        static {
            try {
                f6579b[SSLEngineResult.HandshakeStatus.NEED_WRAP.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                f6579b[SSLEngineResult.HandshakeStatus.NEED_UNWRAP.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                f6579b[SSLEngineResult.HandshakeStatus.NEED_TASK.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                f6579b[SSLEngineResult.HandshakeStatus.FINISHED.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                f6579b[SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
            }
            int[] f6578a = new int[C2402v.values().length];
            try {
                f6578a[C2402v.OPEN.ordinal()] = 1;
            } catch (NoSuchFieldError e6) {
            }
            try {
                f6578a[C2402v.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError e7) {
            }
            try {
                f6578a[C2402v.BOUND.ordinal()] = 3;
            } catch (NoSuchFieldError e8) {
            }
        }
    }

    /* renamed from: org.a.a.d.b.d$a */
    private static final class C2487a implements C2391m {

        /* renamed from: c */
        private final C2396p f6580c;

        /* renamed from: d */
        private final C2403w f6581d;

        C2487a(C2396p pVar, C2403w wVar) {
            this.f6580c = pVar;
            this.f6581d = wVar;
        }

        @Override // org.p035a.p036a.p039c.C2391m
        /* renamed from: a */
        public void mo6933a(C2390l lVar) {
            if (!(lVar.mo6950e() instanceof ClosedChannelException)) {
                C2405y.m9546a(this.f6580c, this.f6581d.mo6991b());
            } else {
                this.f6581d.mo6991b().mo6909a();
            }
        }
    }

    /* renamed from: org.a.a.d.b.d$b */
    private static final class C2488b {

        /* renamed from: a */
        final C2390l f6582a;

        /* renamed from: b */
        final ByteBuffer f6583b;

        C2488b(C2390l lVar, ByteBuffer byteBuffer) {
            this.f6582a = lVar;
            this.f6583b = byteBuffer;
        }
    }

    /* renamed from: org.a.a.d.b.d$c */
    private final class C2489c extends C2308ac {
        public C2489c() {
            super(null, true);
        }

        @Override // org.p035a.p036a.p039c.C2308ac, org.p035a.p036a.p039c.C2390l
        /* renamed from: a */
        public boolean mo6909a() {
            return false;
        }

        @Override // org.p035a.p036a.p039c.C2308ac, org.p035a.p036a.p039c.C2390l
        /* renamed from: a */
        public boolean mo6910a(Throwable th) {
            return false;
        }

        /* access modifiers changed from: package-private */
        //@Override // org.p035a.p036a.p039c.C2308ac
        /* renamed from: b */
        public void mo6911b() {
            super.mo6909a();
        }

        @Override // org.p035a.p036a.p039c.C2308ac, org.p035a.p036a.p039c.C2390l
        /* renamed from: c */
        public C2384f mo6939c() {
            if (C2482d.this.f6557l == null) {
                return null;
            }
            return C2482d.this.f6557l.mo6977a();
        }
    }

    public C2482d(SSLEngine sSLEngine) {
        this(sSLEngine, m9899d(), C2479a.f6542a);
    }

    public C2482d(SSLEngine sSLEngine, C2481c cVar, Executor executor) {
        this(sSLEngine, cVar, false, executor);
    }

    public C2482d(SSLEngine sSLEngine, C2481c cVar, boolean z, Executor executor) {
        this.f6562q = true;
        this.f6554c = new Object();
        this.f6566u = new AtomicBoolean();
        this.f6567v = new AtomicBoolean();
        this.f6556e = new Object();
        this.f6568w = new LinkedList();
        this.f6569x = new ConcurrentLinkedQueue();
        this.f6570y = new C2534g();
        this.f6552A = new C2489c();
        if (sSLEngine == null) {
            throw new NullPointerException("engine");
        } else if (cVar == null) {
            throw new NullPointerException("bufferPool");
        } else if (executor == null) {
            throw new NullPointerException("delegatedTaskExecutor");
        } else {
            this.f6558m = sSLEngine;
            this.f6559n = cVar;
            this.f6560o = executor;
            this.f6561p = z;
        }
    }

    /* renamed from: a */
    private C2284d m9889a(C2396p pVar, C2384f fVar, C2284d dVar, int i, int i2) {
        boolean z;
        SSLEngineResult unwrap;
        C2284d dVar2;
        C2481c cVar;
        boolean z2 = false;
        ByteBuffer h = dVar.mo6880h(i, i2);
        ByteBuffer a = this.f6559n.mo7273a();
        while (true) {
            try {
                synchronized (this.f6554c) {
                    z = !this.f6564s && !this.f6563r && !this.f6558m.getUseClientMode() && !this.f6558m.isInboundDone() && !this.f6558m.isOutboundDone();
                }
                if (z) {
                    mo7278e();
                }
                synchronized (this.f6554c) {
                    unwrap = this.f6558m.unwrap(h, a);
                }
                if (unwrap.getStatus() == SSLEngineResult.Status.CLOSED) {
                    this.f6552A.mo6911b();
                }
                SSLEngineResult.HandshakeStatus handshakeStatus = unwrap.getHandshakeStatus();
                m9893a(handshakeStatus);
                switch (C24864.f6579b[handshakeStatus.ordinal()]) {
                    case 1:
                        m9898b(pVar, fVar);
                        break;
                    case 2:
                        if (h.hasRemaining() && !this.f6558m.isInboundDone()) {
                            break;
                        }
                    case 3:
                        m9901g();
                        break;
                    case 4:
                        m9895a(fVar);
                        z2 = true;
                        break;
                    case 5:
                        z2 = true;
                        break;
                    default:
                        throw new IllegalStateException("Unknown handshake status: " + handshakeStatus);
                }
            } catch (SSLException e) {
                m9896a(fVar, e);
             //   throw e;
            } catch (Throwable th) {
                this.f6559n.mo7274a(a);
               // throw th;
            }
            break;
        }
        if (z2 && !Thread.holdsLock(this.f6554c) && !this.f6570y.mo7392a()) {
            m9890a(pVar, fVar);
        }
        a.flip();
        if (a.hasRemaining()) {
            dVar2 = pVar.mo6977a().mo7051m().mo6942a().mo6860a(a.remaining());
            dVar2.mo6823a(a);
            cVar = this.f6559n;
        } else {
            dVar2 = null;
            cVar = this.f6559n;
        }
        cVar.mo7274a(a);
        return dVar2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0109, code lost:
        r2 = false;
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x013f, code lost:
        r0 = true;
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0144, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0018, code lost:
        r0 = true;
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x015d, code lost:
        r0 = r2;
        r2 = false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0082  */
    /* renamed from: a */
    private C2390l m9890a(C2396p pVar, C2384f fVar) {
        boolean z;
        Throwable th;
        C2488b poll;
        boolean z2 = false;
        SSLEngineResult wrap;
        C2488b poll2;
        boolean z3 = true;
        C2390l lVar = null;
        ByteBuffer a = this.f6559n.mo7273a();
        boolean z4 = false;
        while (true) {
            try {
                synchronized (this.f6568w) {
                    try {
                        C2488b peek = this.f6568w.peek();
                        if (peek != null) {
                            ByteBuffer byteBuffer = peek.f6583b;
                            if (byteBuffer == null) {
                                this.f6568w.remove();
                                m9894a(new C2319ak(fVar, peek.f6582a, C2286f.f6097c, fVar.mo7053p()));
                                z4 = true;
                            } else {
                                try {
                                    synchronized (this.f6554c) {
                                        wrap = this.f6558m.wrap(byteBuffer, a);
                                    }
                                    if (wrap.bytesProduced() > 0) {
                                        a.flip();
                                        C2284d a2 = this.f6557l.mo6977a().mo7051m().mo6942a().mo6860a(a.remaining());
                                        a2.mo6823a(a);
                                        a.clear();
                                        lVar = peek.f6583b.hasRemaining() ? C2405y.m9549b(fVar) : peek.f6582a;
                                        m9894a(new C2319ak(fVar, lVar, a2, fVar.mo7053p()));
                                        z4 = true;
                                    } else if (wrap.getStatus() == SSLEngineResult.Status.CLOSED) {
                                        try {
                                        } catch (Throwable th2) {
                                            th = th2;
                                            throw th;
                                        }
                                    } else {
                                        SSLEngineResult.HandshakeStatus handshakeStatus = wrap.getHandshakeStatus();
                                        m9893a(handshakeStatus);
                                        switch (C24864.f6579b[handshakeStatus.ordinal()]) {
                                            case 1:
                                                if (!byteBuffer.hasRemaining()) {
                                                    break;
                                                } else {
                                                    continue;
                                                }
                                            case 2:
                                                break;
                                            case 3:
                                                m9901g();
                                                continue;
                                            case 4:
                                            case 5:
                                                if (handshakeStatus == SSLEngineResult.HandshakeStatus.FINISHED) {
                                                    m9895a(fVar);
                                                }
                                                if (wrap.getStatus() == SSLEngineResult.Status.CLOSED) {
                                                    z3 = false;
                                                    break;
                                                }
                                                break;
                                            default:
                                                throw new IllegalStateException("Unknown handshake status: " + handshakeStatus);
                                        }
                                    }
                                } finally {
                                    if (!byteBuffer.hasRemaining()) {
                                        this.f6568w.remove();
                                    }
                                }
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        throw th;
                    }
                }
            } catch (SSLException e) {
                m9896a(fVar, e);
               // throw e;
            } catch (Throwable th4) {
                z3 = false;
                th = th4;
                z = z4;
                this.f6559n.mo7274a(a);
                if (z) {
                }
                if (!z3) {
                }
              //  throw th;
            }
            break;
        }
        this.f6559n.mo7274a(a);
        if (z4) {
            m9900e(pVar);
        }
        if (!z2) {
            IllegalStateException illegalStateException = new IllegalStateException("SSLEngine already closed");
            while (true) {
                synchronized (this.f6568w) {
                    poll2 = this.f6568w.poll();
                    if (poll2 == null) {
                    }
                }
                poll2.f6582a.mo6910a(illegalStateException);
            }
        }
        if (z3) {
            m9889a(pVar, fVar, C2286f.f6097c, 0, 0);
        }
        return lVar == null ? C2405y.m9549b(fVar) : lVar;
    }

    /* renamed from: a */
    private static short m9892a(C2284d dVar, int i) {
        return (short) ((dVar.mo6881n(i) << 8) | (dVar.mo6881n(i + 1) & 255));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0033, code lost:
        if (r0 == false) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0035, code lost:
        mo7278e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x003e, code lost:
        org.p035a.p036a.p039c.C2405y.m9556b(r3.f6557l, new javax.net.ssl.SSLException("renegotiation attempted by peer; closing the connection"));
        org.p035a.p036a.p039c.C2405y.m9546a(r3.f6557l, org.p035a.p036a.p039c.C2405y.m9549b(r3.f6557l.mo6977a()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        return;
     */
    /* renamed from: a */
    private void m9893a(SSLEngineResult.HandshakeStatus handshakeStatus) {
        boolean z = true;
        if (handshakeStatus != SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING && handshakeStatus != SSLEngineResult.HandshakeStatus.FINISHED && this.f6564s) {
            synchronized (this.f6554c) {
                if (!this.f6563r) {
                    if (!this.f6558m.isInboundDone() && !this.f6558m.isOutboundDone()) {
                        if (!mo7279f()) {
                            z = false;
                            this.f6563r = true;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private void m9894a(C2324ap apVar) {
        boolean tryLock = this.f6570y.tryLock();
        try {
            this.f6569x.offer(apVar);
        } finally {
            if (tryLock) {
                this.f6570y.unlock();
            }
        }
    }

    /* renamed from: a */
    private void m9895a(C2384f fVar) {
        synchronized (this.f6554c) {
            this.f6563r = false;
            this.f6564s = true;
            if (this.f6565t == null) {
                this.f6565t = C2405y.m9534a(fVar);
            }
        }
        this.f6565t.mo6909a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0024, code lost:
        r4.f6565t.mo6910a(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002b, code lost:
        if (r4.f6553B == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002d, code lost:
        org.p035a.p036a.p039c.C2405y.m9546a(r4.f6557l, org.p035a.p036a.p039c.C2405y.m9534a(r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        return;
     */
    /* renamed from: a */
    private void m9896a(C2384f fVar, SSLException sSLException) {
        synchronized (this.f6554c) {
            if (this.f6563r) {
                this.f6563r = false;
                this.f6564s = false;
                if (this.f6565t == null) {
                    this.f6565t = C2405y.m9534a(fVar);
                }
                this.f6558m.closeOutbound();
                try {
                    this.f6558m.closeInbound();
                } catch (SSLException e) {
                    if (f6547g.mo7283a()) {
                        f6547g.mo7282a("SSLEngine.closeInbound() raised an exception after a handshake failure.", e);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private boolean m9897a(Throwable th) {
        if (!(th instanceof SSLException) && (th instanceof IOException) && this.f6558m.isOutboundDone()) {
            if (f6550j.matcher(String.valueOf(th.getMessage()).toLowerCase()).matches()) {
                return true;
            }
            StackTraceElement[] stackTrace = th.getStackTrace();
            for (StackTraceElement stackTraceElement : stackTrace) {
                String className = stackTraceElement.getClassName();
                String methodName = stackTraceElement.getMethodName();
                if (!className.startsWith("org.jboss.netty.") && methodName.equals("read")) {
                    if (f6549i.matcher(className).matches()) {
                        return true;
                    }
                    try {
                        Class<?> loadClass = getClass().getClassLoader().loadClass(className);
                        if (SocketChannel.class.isAssignableFrom(loadClass) || DatagramChannel.class.isAssignableFrom(loadClass)) {
                            return true;
                        }
                        if (C2531e.m10054a() >= 7 && "com.sun.nio.sctp.SctpChannel".equals(loadClass.getSuperclass().getName())) {
                            return true;
                        }
                    } catch (ClassNotFoundException e) {
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    private C2390l m9898b(C2396p pVar, C2384f fVar) {
        SSLEngineResult wrap = null;
        C2390l lVar = null;
        ByteBuffer a = this.f6559n.mo7273a();
        do {
            try {
                synchronized (this.f6554c) {
                    wrap = this.f6558m.wrap(f6548h, a);
                }
                if (wrap.bytesProduced() > 0) {
                    a.flip();
                    C2284d a2 = pVar.mo6977a().mo7051m().mo6942a().mo6860a(a.remaining());
                    a2.mo6823a(a);
                    a.clear();
                    lVar = C2405y.m9534a(fVar);
                    lVar.mo6936a(new C2391m() {
                        /* class org.p035a.p036a.p043d.p052b.C2482d.C24831 */

                        @Override // org.p035a.p036a.p039c.C2391m
                        /* renamed from: a */
                        public void mo6933a(C2390l lVar) {
                            if (lVar.mo6950e() instanceof ClosedChannelException) {
                                synchronized (C2482d.this.f6556e) {
                                    C2482d.this.f6555d++;
                                }
                            }
                        }
                    });
                    C2405y.m9547a(pVar, lVar, a2);
                }
                SSLEngineResult.HandshakeStatus handshakeStatus = wrap.getHandshakeStatus();
                m9893a(handshakeStatus);
                switch (C24864.f6579b[handshakeStatus.ordinal()]) {
                    case 1:
                    case 5:
                        break;
                    case 2:
                        if (!Thread.holdsLock(this.f6554c)) {
                            m9889a(pVar, fVar, C2286f.f6097c, 0, 0);
                            break;
                        }
                        break;
                    case 3:
                        m9901g();
                        break;
                    case 4:
                        m9895a(fVar);
                        m9901g();
                        break;
                    default:
                        throw new IllegalStateException("Unexpected handshake status: " + handshakeStatus);
                }
            } catch (SSLException e) {
                m9896a(fVar, e);
                //throw e;
            } catch (Throwable th) {
                this.f6559n.mo7274a(a);
                throw th;
            }
        } while (wrap.bytesProduced() != 0);
        this.f6559n.mo7274a(a);
        return lVar == null ? C2405y.m9549b(fVar) : lVar;
    }

    /* renamed from: d */
    public static synchronized C2481c m9899d() {
        C2481c cVar;
        synchronized (C2482d.class) {
            if (f6551k == null) {
                f6551k = new C2481c();
            }
            cVar = f6551k;
        }
        return cVar;
    }

    /* renamed from: e */
    private void m9900e(C2396p pVar) {
        if (this.f6570y.tryLock()) {
            while (true) {
                try {
                    C2324ap poll = this.f6569x.poll();
                    if (poll != null) {
                        pVar.mo6981b(poll);
                    } else {
                        return;
                    }
                } finally {
                    this.f6570y.unlock();
                }
            }
        }
    }

    /* renamed from: g */
    private void m9901g() {
        Runnable delegatedTask;
        while (true) {
            synchronized (this.f6554c) {

                delegatedTask = this.f6558m.getDelegatedTask();
            }
            if (delegatedTask != null) {
                final Runnable finalDelegatedTask = delegatedTask;
                this.f6560o.execute(new Runnable() {
                    /* class org.p035a.p036a.p043d.p052b.C2482d.C24842 */

                    public void run() {
                        synchronized (C2482d.this.f6554c) {
                            finalDelegatedTask.run();
                        }
                    }
                });
            } else {
                return;
            }
        }
    }

    /* renamed from: i */
    private void m9902i(C2396p pVar, C2403w wVar) {
        boolean z;
        if (!wVar.mo6990a().mo7120l()) {
            pVar.mo6981b(wVar);
            return;
        }
        m9889a(pVar, wVar.mo6990a(), C2286f.f6097c, 0, 0);
        try {
            if (this.f6558m.isInboundDone()) {
                z = true;
            } else if (this.f6567v.compareAndSet(false, true)) {
                this.f6558m.closeOutbound();
                m9898b(pVar, wVar.mo6990a()).mo6936a(new C2487a(pVar, wVar));
                z = true;
            } else {
                z = false;
            }
            if (z) {
            }
        } finally {
            pVar.mo6981b(wVar);
        }
    }

    /* access modifiers changed from: protected */
    @Override // org.p035a.p036a.p043d.p044a.p047c.C2436b
    /* renamed from: a */
    public Object mo7163a(C2396p pVar, C2384f fVar, C2284d dVar) {
        boolean z;
        int i;
        int i2 = 0;
        boolean z2;
        if (dVar.mo6838d() < 5) {
            return null;
        }
        switch (dVar.mo6839d(dVar.mo6816a())) {
            case 20:
            case 21:
            case 22:
            case 23:
                z = true;
                break;
            default:
                z = false;
                break;
        }
        if (!z) {
            i = 0;
        } else if (dVar.mo6839d(dVar.mo6816a() + 1) == 3) {
            i = (m9892a(dVar, dVar.mo6816a() + 3) & 65535) + 5;
            if (i <= 5) {
                z = false;
            }
        } else {
            z = false;
            i = 0;
        }
        if (!z) {
            int i3 = (dVar.mo6839d(dVar.mo6816a()) & 128) != 0 ? 2 : 3;
            short d = dVar.mo6839d(dVar.mo6816a() + i3 + 1);
            if (d == 2 || d == 3) {
                i2 = i3 == 2 ? (m9892a(dVar, dVar.mo6816a()) & Short.MAX_VALUE) + 2 : (m9892a(dVar, dVar.mo6816a()) & 16383) + 3;
                z2 = i2 > i3;
            } else {
                z2 = false;
            }
            if (!z2) {
                C2480b bVar = new C2480b("not an SSL/TLS record: " + C2286f.m8943b(dVar));
                dVar.mo6846g(dVar.mo6838d());
                if (this.f6553B) {
                    C2405y.m9556b(pVar, bVar);
                    C2405y.m9546a(pVar, C2405y.m9534a(fVar));
                    return null;
                }
                //throw bVar;
            }
        }
        if (!f6546f && i2 <= 0) {
            throw new AssertionError();
        } else if (dVar.mo6838d() < i2) {
            return null;
        } else {
            int a = dVar.mo6816a();
            dVar.mo6846g(i2);
            return m9889a(pVar, fVar, dVar, a, i2);
        }
    }

    @Override // org.p035a.p036a.p039c.C2323ao, org.p035a.p036a.p043d.p044a.p047c.C2436b
    /* renamed from: a */
    public void mo7009a(C2396p pVar) {
        super.mo7009a(pVar);
        this.f6557l = pVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        return;
     */
    @Override // org.p035a.p036a.p039c.C2331av, org.p035a.p036a.p043d.p044a.p047c.C2436b
    /* renamed from: a */
    public void mo6813a(C2396p pVar, C2320al alVar) {
        Throwable c = alVar.mo6994c();
        if (c instanceof IOException) {
            if (c instanceof ClosedChannelException) {
                synchronized (this.f6556e) {
                    if (this.f6555d > 0) {
                        this.f6555d--;
                        if (f6547g.mo7283a()) {
                            f6547g.mo7282a("Swallowing an exception raised while writing non-app data", c);
                        }
                    }
                }
            } else if (m9897a(c)) {
                return;
            }
        }
        pVar.mo6979a((C2387i) alVar);
    }

    @Override // org.p035a.p036a.p039c.C2386h
    /* renamed from: a */
    public void mo7019a(C2396p pVar, C2387i iVar) {
        if (iVar instanceof C2403w) {
            C2403w wVar = (C2403w) iVar;
            switch (wVar.mo7003c()) {
                case OPEN:
                case CONNECTED:
                case BOUND:
                    if (Boolean.FALSE.equals(wVar.mo7004d()) || wVar.mo7004d() == null) {
                        m9902i(pVar, wVar);
                        return;
                    }
            }
        }
        if (!(iVar instanceof C2324ap)) {
            pVar.mo6981b(iVar);
            return;
        }
        C2324ap apVar = (C2324ap) iVar;
        if (!(apVar.mo7006c() instanceof C2284d)) {
            pVar.mo6981b(iVar);
        } else if (!this.f6561p || !this.f6566u.compareAndSet(false, true)) {
            C2284d dVar = (C2284d) apVar.mo7006c();
            C2488b bVar = dVar.mo6836c() ? new C2488b(iVar.mo6991b(), dVar.mo6880h(dVar.mo6816a(), dVar.mo6838d())) : new C2488b(iVar.mo6991b(), null);
            synchronized (this.f6568w) {
                boolean offer = this.f6568w.offer(bVar);
                if (!f6546f && !offer) {
                    throw new AssertionError();
                }
            }
            m9890a(pVar, iVar.mo6990a());
        } else {
            pVar.mo6981b(iVar);
        }
    }

    /* renamed from: a */
    public void mo7277a(boolean z) {
        if (this.f6557l != null) {
            throw new IllegalStateException("Can only get changed before attached to ChannelPipeline");
        }
        this.f6553B = z;
    }

    @Override // org.p035a.p036a.p039c.C2331av
    /* renamed from: c */
    public void mo7041c(final C2396p pVar, final C2403w wVar) {
        if (this.f6571z) {
            mo7278e().mo6936a(new C2391m() {
                /* class org.p035a.p036a.p043d.p052b.C2482d.C24853 */

                @Override // org.p035a.p036a.p039c.C2391m
                /* renamed from: a */
                public void mo6933a(C2390l lVar) {
                    if (!lVar.mo6949d()) {
                        C2405y.m9559c(lVar.mo6939c(), lVar.mo6950e());
                    } else {
                        pVar.mo6979a((C2387i) wVar);
                    }
                }
            });
        } else {
            super.mo7041c(pVar, wVar);
        }
    }

    @Override // org.p035a.p036a.p039c.C2323ao, org.p035a.p036a.p043d.p044a.p047c.C2436b
    /* renamed from: d */
    public void mo7012d(C2396p pVar) {
        IOException iOException = null;
        while (true) {
            C2488b poll = this.f6568w.poll();
            if (poll == null) {
                break;
            }
            if (iOException == null) {
                iOException = new IOException("Unable to write data");
            }
            poll.f6582a.mo6910a(iOException);
        }
        while (true) {
            C2324ap poll2 = this.f6569x.poll();
            if (poll2 == null) {
                break;
            }
            if (iOException == null) {
                iOException = new IOException("Unable to write data");
            }
            poll2.mo6991b().mo6910a(iOException);
        }
        if (iOException != null) {
            C2405y.m9538a(pVar, iOException);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: org.a.a.c.y.a(org.a.a.c.f, java.lang.Throwable):org.a.a.c.l
     arg types: [org.a.a.c.f, java.lang.Exception]
     candidates:
      org.a.a.c.y.a(org.a.a.c.f, long):org.a.a.c.l
      org.a.a.c.y.a(org.a.a.c.f, boolean):org.a.a.c.l
      org.a.a.c.y.a(org.a.a.c.p, java.lang.Throwable):org.a.a.c.l
      org.a.a.c.y.a(org.a.a.c.f, java.lang.Object):void
      org.a.a.c.y.a(org.a.a.c.f, java.net.SocketAddress):void
      org.a.a.c.y.a(org.a.a.c.f, org.a.a.c.f):void
      org.a.a.c.y.a(org.a.a.c.p, org.a.a.c.l):void
      org.a.a.c.y.a(org.a.a.c.f, java.lang.Throwable):org.a.a.c.l */
    /* renamed from: e */
    public C2390l mo7278e() {
        C2390l lVar;
        Exception exc;
        if (!this.f6564s || mo7279f()) {
            C2396p pVar = this.f6557l;
            C2384f a = pVar.mo6977a();
            synchronized (this.f6554c) {
                if (this.f6563r) {
                    lVar = this.f6565t;
                } else {
                    this.f6563r = true;
                    try {
                        this.f6558m.beginHandshake();
                        m9901g();
                        C2390l a2 = C2405y.m9534a(a);
                        this.f6565t = a2;
                        lVar = a2;
                        exc = null;
                    } catch (Exception e) {
                        C2390l a3 = C2405y.m9536a(a, (Throwable) e);
                        this.f6565t = a3;
                        lVar = a3;
                        exc = e;
                    }
                    if (exc == null) {
                        m9898b(pVar, a);
                    } else {
                        C2405y.m9556b(pVar, exc);
                        if (this.f6553B) {
                            C2405y.m9546a(pVar, C2405y.m9534a(a));
                        }
                    }
                }
            }
            return lVar;
        }
        throw new IllegalStateException("renegotiation disabled");
    }

    @Override // org.p035a.p036a.p039c.C2331av, org.p035a.p036a.p043d.p044a.p047c.C2436b
    /* renamed from: e */
    public void mo7043e(C2396p pVar, C2403w wVar) {
        boolean z = false;
        boolean z2 = false;
        synchronized (this.f6554c) {
            if (this.f6563r) {
                this.f6565t.mo6910a(new ClosedChannelException());
            }
        }
        try {
            super.mo7043e(pVar, wVar);
            if (!z && z2) {
            }
        } finally {
            m9889a(pVar, wVar.mo6990a(), C2286f.f6097c, 0, 0);
            this.f6558m.closeOutbound();
            if (!this.f6567v.get() && this.f6564s) {
                try {
                    this.f6558m.closeInbound();
                } catch (SSLException e2) {
                    if (f6547g.mo7283a()) {
                        f6547g.mo7282a("Failed to clean up SSLEngine.", e2);
                    }
                }
            }
        }
    }

    /* renamed from: f */
    public boolean mo7279f() {
        return this.f6562q;
    }

    @Override // org.p035a.p036a.p039c.C2331av, org.p035a.p036a.p043d.p044a.p047c.C2436b
    /* renamed from: g */
    public void mo7045g(C2396p pVar, C2403w wVar) {
        ClosedChannelException closedChannelException = null;
        synchronized (this.f6568w) {
            while (true) {
                C2488b poll = this.f6568w.poll();
                if (poll == null) {
                    while (true) {
                        C2324ap poll2 = this.f6569x.poll();
                        if (poll2 == null) {
                            break;
                        }
                        if (closedChannelException == null) {
                            closedChannelException = new ClosedChannelException();
                        }
                        poll2.mo6991b().mo6910a(closedChannelException);
                    }
                } else {
                    if (closedChannelException == null) {
                        closedChannelException = new ClosedChannelException();
                    }
                    poll.f6582a.mo6910a(closedChannelException);
                }
                break;
            }
        }
        if (closedChannelException != null) {
            C2405y.m9556b(pVar, closedChannelException);
        }
        super.mo7045g(pVar, wVar);
    }
}
