package org.p035a.p036a.p039c.p041b.p042a;

import java.io.IOException;
import java.lang.ref.SoftReference;
import java.nio.ByteBuffer;
import java.nio.channels.GatheringByteChannel;
import java.nio.channels.WritableByteChannel;
import org.p035a.p036a.p038b.C2284d;
import org.p035a.p036a.p038b.C2287g;
import org.p035a.p036a.p039c.C2314ag;
import org.p035a.p036a.p039c.C2322an;

/* renamed from: org.a.a.c.b.a.s */
final class C2363s {

    /* renamed from: c */
    private static final C2370g f6302c = new C2364a();

    /* renamed from: a */
    C2369f f6303a;

    /* renamed from: b */
    C2368e f6304b = new C2368e(65536);

    /* renamed from: org.a.a.c.b.a.s$a */
    static final class C2364a implements C2370g {
        C2364a() {
        }

        @Override // org.p035a.p036a.p039c.p041b.p042a.C2363s.C2370g
        /* renamed from: a */
        public long mo7127a(WritableByteChannel writableByteChannel) {
            return 0;
        }

        @Override // org.p035a.p036a.p039c.p041b.p042a.C2363s.C2370g
        /* renamed from: a */
        public boolean mo7128a() {
            return true;
        }

        @Override // org.p035a.p036a.p039c.p041b.p042a.C2363s.C2370g
        /* renamed from: b */
        public long mo7129b() {
            return 0;
        }

        @Override // org.p035a.p036a.p039c.p041b.p042a.C2363s.C2370g
        /* renamed from: c */
        public long mo7130c() {
            return 0;
        }

        @Override // org.p035a.p036a.p039c.p041b.p042a.C2363s.C2370g
        /* renamed from: d */
        public void mo7131d() {
        }
    }

    /* renamed from: org.a.a.c.b.a.s$b */
    final class C2365b implements C2370g {

        /* renamed from: b */
        private final C2322an f6306b;

        /* renamed from: c */
        private long f6307c;

        C2365b(C2322an anVar) {
            this.f6306b = anVar;
        }

        @Override // org.p035a.p036a.p039c.p041b.p042a.C2363s.C2370g
        /* renamed from: a */
        public long mo7127a(WritableByteChannel writableByteChannel) {
            long a = this.f6306b.mo6997a(writableByteChannel, this.f6307c);
            this.f6307c += a;
            return a;
        }

        @Override // org.p035a.p036a.p039c.p041b.p042a.C2363s.C2370g
        /* renamed from: a */
        public boolean mo7128a() {
            return this.f6307c >= this.f6306b.mo6996a();
        }

        @Override // org.p035a.p036a.p039c.p041b.p042a.C2363s.C2370g
        /* renamed from: b */
        public long mo7129b() {
            return this.f6307c;
        }

        @Override // org.p035a.p036a.p039c.p041b.p042a.C2363s.C2370g
        /* renamed from: c */
        public long mo7130c() {
            return this.f6306b.mo6996a();
        }

        @Override // org.p035a.p036a.p039c.p041b.p042a.C2363s.C2370g
        /* renamed from: d */
        public void mo7131d() {
            if ((this.f6306b instanceof C2314ag) && ((C2314ag) this.f6306b).mo6998b()) {
                this.f6306b.mo6810d();
            }
        }
    }

    /* renamed from: org.a.a.c.b.a.s$c */
    class C2366c implements C2370g {

        /* renamed from: a */
        final /* synthetic */ C2363s f6308a;

        /* renamed from: b */
        private final ByteBuffer[] f6309b;

        /* renamed from: c */
        private final int f6310c;

        /* renamed from: d */
        private long f6311d;

        /* renamed from: e */
        private final int f6312e;

        C2366c(C2363s sVar, ByteBuffer[] byteBufferArr) {
            this.f6308a = sVar;
            this.f6309b = byteBufferArr;
            this.f6310c = byteBufferArr.length - 1;
            int i = 0;
            for (ByteBuffer byteBuffer : byteBufferArr) {
                i += byteBuffer.remaining();
            }
            this.f6312e = i;
        }

        @Override // org.p035a.p036a.p039c.p041b.p042a.C2363s.C2370g
        /* renamed from: a */
        public long mo7127a(WritableByteChannel writableByteChannel) {
            int i = 0;
            if (writableByteChannel instanceof GatheringByteChannel) {
                long write = 0;
                try {
                    write = ((GatheringByteChannel) writableByteChannel).write(this.f6309b);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                this.f6311d += write;
                return write;
            }
            ByteBuffer[] byteBufferArr = this.f6309b;
            for (ByteBuffer byteBuffer : byteBufferArr) {
                if (byteBuffer.hasRemaining()) {
                    int write2 = 0;
                    try {
                        write2 = writableByteChannel.write(byteBuffer);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    if (write2 == 0) {
                        break;
                    }
                    i += write2;
                }
            }
            this.f6311d += (long) i;
            return (long) i;
        }

        @Override // org.p035a.p036a.p039c.p041b.p042a.C2363s.C2370g
        /* renamed from: a */
        public boolean mo7128a() {
            return !this.f6309b[this.f6310c].hasRemaining();
        }

        @Override // org.p035a.p036a.p039c.p041b.p042a.C2363s.C2370g
        /* renamed from: b */
        public long mo7129b() {
            return this.f6311d;
        }

        @Override // org.p035a.p036a.p039c.p041b.p042a.C2363s.C2370g
        /* renamed from: c */
        public long mo7130c() {
            return (long) this.f6312e;
        }

        @Override // org.p035a.p036a.p039c.p041b.p042a.C2363s.C2370g
        /* renamed from: d */
        public void mo7131d() {
        }
    }

    /* renamed from: org.a.a.c.b.a.s$d */
    final class C2367d extends C2371h {

        /* renamed from: e */
        private final C2368e f6314e;

        C2367d(C2368e eVar, ByteBuffer byteBuffer) {
            super(byteBuffer);
            this.f6314e = eVar;
        }

        @Override // org.p035a.p036a.p039c.p041b.p042a.C2363s.C2371h, org.p035a.p036a.p039c.p041b.p042a.C2363s.C2370g
        /* renamed from: d */
        public void mo7131d() {
            C2368e eVar = this.f6314e;
            int i = eVar.f6316b - 1;
            eVar.f6316b = i;
            if (i == 0) {
                eVar.f6315a.clear();
                if (eVar != C2363s.this.f6304b) {
                    C2363s.this.f6303a = new C2369f(eVar, C2363s.this.f6303a);
                }
            }
        }
    }

    /* renamed from: org.a.a.c.b.a.s$e */
    private final class C2368e {

        /* renamed from: a */
        final ByteBuffer f6315a;

        /* renamed from: b */
        int f6316b;

        C2368e(int i) {
            this.f6315a = ByteBuffer.allocateDirect(i);
        }
    }

    /* renamed from: org.a.a.c.b.a.s$f */
    private final class C2369f extends SoftReference<C2368e> {

        /* renamed from: a */
        final C2369f f6318a;

        C2369f(C2368e eVar, C2369f fVar) {
            super(eVar);
            this.f6318a = fVar;
        }
    }

    /* renamed from: org.a.a.c.b.a.s$g */
    interface C2370g {
        /* renamed from: a */
        long mo7127a(WritableByteChannel writableByteChannel);

        /* renamed from: a */
        boolean mo7128a();

        /* renamed from: b */
        long mo7129b();

        /* renamed from: c */
        long mo7130c();

        /* renamed from: d */
        void mo7131d();
    }

    /* renamed from: org.a.a.c.b.a.s$h */
    class C2371h implements C2370g {

        /* renamed from: b */
        final ByteBuffer f6320b;

        /* renamed from: c */
        final int f6321c;

        C2371h(ByteBuffer byteBuffer) {
            this.f6320b = byteBuffer;
            this.f6321c = byteBuffer.position();
        }

        @Override // org.p035a.p036a.p039c.p041b.p042a.C2363s.C2370g
        /* renamed from: a */
        public final long mo7127a(WritableByteChannel writableByteChannel) {
            try {
                return (long) writableByteChannel.write(this.f6320b);
            } catch (IOException e) {
                e.printStackTrace();
            }
            return 0;
        }

        @Override // org.p035a.p036a.p039c.p041b.p042a.C2363s.C2370g
        /* renamed from: a */
        public final boolean mo7128a() {
            return !this.f6320b.hasRemaining();
        }

        @Override // org.p035a.p036a.p039c.p041b.p042a.C2363s.C2370g
        /* renamed from: b */
        public final long mo7129b() {
            return (long) (this.f6320b.position() - this.f6321c);
        }

        @Override // org.p035a.p036a.p039c.p041b.p042a.C2363s.C2370g
        /* renamed from: c */
        public final long mo7130c() {
            return (long) (this.f6320b.limit() - this.f6321c);
        }

        @Override // org.p035a.p036a.p039c.p041b.p042a.C2363s.C2370g
        /* renamed from: d */
        public void mo7131d() {
        }
    }

    C2363s() {
    }

    /* renamed from: a */
    private static int m9416a(int i) {
        int i2 = i >>> 4;
        if ((i & 15) != 0) {
            i2++;
        }
        return i2 << 4;
    }

    /* renamed from: a */
    private C2368e m9417a() {
        C2368e eVar = this.f6304b;
        if (eVar.f6316b != 0) {
            return m9420b();
        }
        eVar.f6315a.clear();
        return eVar;
    }

    /* renamed from: a */
    private C2370g m9418a(C2284d dVar) {
        C2367d dVar2;
        int d = dVar.mo6838d();
        if (d == 0) {
            return f6302c;
        }
        if ((dVar instanceof C2287g) && ((C2287g) dVar).mo6888u()) {
            return new C2366c(this, dVar.mo6857n());
        }
        if (dVar.mo6883s()) {
            return new C2371h(dVar.mo6856m());
        }
        if (dVar.mo6838d() > 65536) {
            return new C2371h(dVar.mo6856m());
        }
        C2368e eVar = this.f6304b;
        ByteBuffer byteBuffer = eVar.f6315a;
        int remaining = byteBuffer.remaining();
        if (d < remaining) {
            int position = d + byteBuffer.position();
            ByteBuffer duplicate = byteBuffer.duplicate();
            byteBuffer.position(m9416a(position));
            duplicate.limit(position);
            eVar.f6316b++;
            dVar2 = new C2367d(eVar, duplicate);
        } else if (d > remaining) {
            C2368e a = m9417a();
            this.f6304b = a;
            ByteBuffer byteBuffer2 = a.f6315a;
            ByteBuffer duplicate2 = byteBuffer2.duplicate();
            byteBuffer2.position(m9416a(d));
            duplicate2.limit(d);
            a.f6316b++;
            dVar2 = new C2367d(a, duplicate2);
        } else {
            eVar.f6316b++;
            this.f6304b = m9420b();
            dVar2 = new C2367d(eVar, eVar.f6315a);
        }
        ByteBuffer byteBuffer3 = dVar2.f6320b;
        byteBuffer3.mark();
        dVar.mo6872a(dVar.mo6816a(), byteBuffer3);
        byteBuffer3.reset();
        return dVar2;
    }

    /* renamed from: a */
    private C2370g m9419a(C2322an anVar) {
        return anVar.mo6996a() == 0 ? f6302c : new C2365b(anVar);
    }

    /* renamed from: b */
    private C2368e m9420b() {
        C2369f fVar = this.f6303a;
        if (fVar != null) {
            C2369f fVar2 = fVar;
            do {
                C2368e eVar = (C2368e) fVar2.get();
                fVar2 = fVar2.f6318a;
                if (eVar != null) {
                    this.f6303a = fVar2;
                    return eVar;
                }
            } while (fVar2 != null);
            this.f6303a = fVar2;
        }
        return new C2368e(65536);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C2370g mo7126a(Object obj) {
        if (obj instanceof C2284d) {
            return m9418a((C2284d) obj);
        }
        if (obj instanceof C2322an) {
            return m9419a((C2322an) obj);
        }
        throw new IllegalArgumentException("unsupported message type: " + obj.getClass());
    }
}
