package org.p035a.p036a.p054f.p055a;

import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.locks.ReentrantLock;

@SuppressWarnings("ALL")
/* renamed from: org.a.a.f.a.b */
public final class C2516b<K, V> extends AbstractMap<K, V> implements ConcurrentMap<K, V> {

    /* renamed from: a */
    final int f6775a;

    /* renamed from: b */
    final int f6776b;

    /* renamed from: c */
    final C2523g<K, V>[] f6777c;

    /* renamed from: d */
    Set<K> f6778d;

    /* renamed from: e */
    Set<Entry<K, V>> f6779e;

    /* renamed from: f */
    Collection<V> f6780f;

    /* renamed from: org.a.a.f.a.b$a */
    final class C2517a extends C2516b.C2520d/*<K, V>*/ implements C2535h/*<Entry<K, V>> */{
        C2517a() {
            super();
        }

        @Override
        public boolean hasNext() {
            return false;
        }

        /* renamed from: a */
        public Entry<K, V> next() {
            C2519c<K, V> c = super.mo7351c();
            return new C2527k(c.mo7347a(), c.mo7349b());
        }
    }

    /* renamed from: org.a.a.f.a.b$b */
    final class C2518b extends AbstractSet<Entry<K, V>> {
        C2518b() {
        }

        public void clear() {
            C2516b.this.clear();
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            V v = C2516b.this.get(entry.getKey());
            return v != null && v.equals(entry.getValue());
        }

        public boolean isEmpty() {
            return C2516b.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set, java.lang.Iterable
        public Iterator<Entry<K, V>> iterator() {
            return new C2517a();
        }

        public boolean remove(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            return C2516b.this.remove(entry.getKey(), entry.getValue());
        }

        public int size() {
            return C2516b.this.size();
        }
    }

    /* renamed from: org.a.a.f.a.b$c */
    static final class C2519c<K, V> {

        /* renamed from: a */
        final Object f6783a;

        /* renamed from: b */
        final int f6784b;

        /* renamed from: c */
        volatile Object f6785c;

        /* renamed from: d */
        final C2519c<K, V> f6786d;

        C2519c(K k, int i, C2519c<K, V> cVar, V v) {
            this.f6784b = i;
            this.f6786d = cVar;
            this.f6783a = k;
            this.f6785c = v;
        }

        /* renamed from: a */
        static <K, V> C2519c<K, V>[] m10029a(int i) {
            return new C2519c[i];
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public K mo7347a() {
            return (K) this.f6783a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo7348a(V v) {
            this.f6785c = v;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public V mo7349b() {
            return (V) this.f6785c;
        }
    }

    /* renamed from: org.a.a.f.a.b$d */
    abstract class C2520d {

        /* renamed from: b */
        int f6787b;

        /* renamed from: c */
        int f6788c = -1;

        /* renamed from: d */
        C2519c<K, V>[] f6789d;

        /* renamed from: e */
        C2519c<K, V> f6790e;

        /* renamed from: f */
        C2519c<K, V> f6791f;

        /* renamed from: g */
        K f6792g;

        C2520d() {
            this.f6787b = C2516b.this.f6777c.length - 1;
            mo7350b();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final void mo7350b() {
            if (this.f6790e != null) {
                C2519c<K, V> cVar = this.f6790e.f6786d;
                this.f6790e = cVar;
                if (cVar != null) {
                    return;
                }
            }
            while (this.f6788c >= 0) {
                C2519c<K, V>[] cVarArr = this.f6789d;
                int i = this.f6788c;
                this.f6788c = i - 1;
                C2519c<K, V> cVar2 = cVarArr[i];
                this.f6790e = cVar2;
                if (cVar2 != null) {
                    return;
                }
            }
            while (this.f6787b >= 0) {
                C2523g<K, V>[] gVarArr = C2516b.this.f6777c;
                int i2 = this.f6787b;
                this.f6787b = i2 - 1;
                C2523g<K, V> gVar = gVarArr[i2];
                if (gVar.f6796a != 0) {
                    this.f6789d = gVar.f6799d;
                    for (int length = this.f6789d.length - 1; length >= 0; length--) {
                        C2519c<K, V> cVar3 = this.f6789d[length];
                        this.f6790e = cVar3;
                        if (cVar3 != null) {
                            this.f6788c = length - 1;
                            return;
                        }
                    }
                    continue;
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C2519c<K, V> mo7351c() {
            while (this.f6790e != null) {
                this.f6791f = this.f6790e;
                this.f6792g = this.f6791f.mo7347a();
                mo7350b();
                if (this.f6792g != null) {
                    return this.f6791f;
                }
            }
            throw new NoSuchElementException();
        }

        public boolean hasMoreElements() {
            return hasNext();
        }

        public boolean hasNext() {
            while (this.f6790e != null) {
                if (this.f6790e.mo7347a() != null) {
                    return true;
                }
                mo7350b();
            }
            return false;
        }

        public void remove() {
            if (this.f6791f == null) {
                throw new IllegalStateException();
            }
            C2516b.this.remove(this.f6792g);
            this.f6791f = null;
        }
    }

    /* renamed from: org.a.a.f.a.b$e */
    final class C2521e extends C2516b<K, V>.C2520d implements Enumeration<K>, C2535h/*<K>*/ {
        C2521e() {
            super();
        }

        @Override // java.util.Iterator
        public K next() {
            return super.mo7351c().mo7347a();
        }

        @Override // java.util.Enumeration
        public K nextElement() {
            return super.mo7351c().mo7347a();
        }
    }

    /* renamed from: org.a.a.f.a.b$f */
    final class C2522f extends AbstractSet<K> {
        C2522f() {
        }

        public void clear() {
            C2516b.this.clear();
        }

        public boolean contains(Object obj) {
            return C2516b.this.containsKey(obj);
        }

        public boolean isEmpty() {
            return C2516b.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set, java.lang.Iterable
        public Iterator<K> iterator() {
            return new C2521e();
        }

        public boolean remove(Object obj) {
            return C2516b.this.remove(obj) != null;
        }

        public int size() {
            return C2516b.this.size();
        }
    }

    /* renamed from: org.a.a.f.a.b$g */
    static final class C2523g<K, V> extends ReentrantLock {

        /* renamed from: a */
        volatile transient int f6796a;

        /* renamed from: b */
        int f6797b;

        /* renamed from: c */
        int f6798c;

        /* renamed from: d */
        volatile transient C2519c<K, V>[] f6799d;

        /* renamed from: e */
        final float f6800e;

        C2523g(int i, float f) {
            this.f6800e = f;
            mo7369a((C2519c[]) C2519c.m10029a(i));
        }

        /* renamed from: a */
        private static boolean m10035a(Object obj, Object obj2) {
            return obj.equals(obj2);
        }

        /* renamed from: a */
        static <K, V> C2523g<K, V>[] m10036a(int i) {
            return new C2523g[i];
        }

        /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
         method: MutableMD:(java.lang.Object, int, org.a.a.f.a.b$c, java.lang.Object):org.a.a.f.a.b$c
         arg types: [K, int, org.a.a.f.a.b$c<K, V>, V]
         candidates:
          MutableMD:(java.lang.Object, int, java.lang.Object, boolean):java.lang.Object
          MutableMD:(java.lang.Object, int, java.lang.Object, java.lang.Object):boolean
          MutableMD:(java.lang.Object, int, org.a.a.f.a.b$c, java.lang.Object):org.a.a.f.a.b$c */
        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo7363a() {
            int i;
            C2519c<K, V> cVar;
            int i2 = 0;
            C2519c<K, V>[] cVarArr = this.f6799d;
            int length = cVarArr.length;
            if (length < 1073741824) {
                C2519c<K, V>[] a = C2519c.m10029a(length << 1);
                this.f6798c = (int) (((float) a.length) * this.f6800e);
                int length2 = a.length - 1;
                int i3 = 0;
                while (i3 < length) {
                    C2519c<K, V> cVar2 = cVarArr[i3];
                    if (cVar2 != null) {
                        C2519c<K, V> cVar3 = cVar2.f6786d;
                        int i4 = cVar2.f6784b & length2;
                        if (cVar3 == null) {
                            a[i4] = cVar2;
                            i = i2;
                        } else {
                            C2519c<K, V> cVar4 = cVar2;
                            while (cVar3 != null) {
                                int i5 = cVar3.f6784b & length2;
                                if (i5 != i4) {
                                    cVar = cVar3;
                                } else {
                                    i5 = i4;
                                    cVar = cVar4;
                                }
                                cVar3 = cVar3.f6786d;
                                cVar4 = cVar;
                                i4 = i5;
                            }
                            a[i4] = cVar4;
                            i = i2;
                            for (C2519c<K, V> cVar5 = cVar2; cVar5 != cVar4; cVar5 = cVar5.f6786d) {
                                K a2 = cVar5.mo7347a();
                                if (a2 == null) {
                                    i++;
                                } else {
                                    int i6 = cVar5.f6784b & length2;
                                    a[i6] = mo7368a(/*(Object)*/ a2, cVar5.f6784b, (C2519c) a[i6], /*(Object) */cVar5.mo7349b());
                                }
                            }
                        }
                    } else {
                        i = i2;
                    }
                    i3++;
                    i2 = i;
                }
                this.f6799d = a;
            }
            return i2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public V mo7364a(Object obj, int i) {
            if (this.f6796a != 0) {
                C2519c<K, V> b = mo7373b(i);
                while (b != null) {
                    if (b.f6784b != i || !m10035a(obj, b.mo7347a())) {
                        b = b.f6786d;
                    } else {
                        V b2 = b.mo7349b();
                        return b2 != null ? b2 : (V) mo7367a((C2519c) b);
                    }
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public V mo7365a(K k, int i, V v) {
            lock();
            try {
                C2519c<K, V> b = mo7373b(i);
                while (b != null && (b.f6784b != i || !m10035a(k, b.mo7347a()))) {
                    b = b.f6786d;
                }
                V v2 = null;
                if (b != null) {
                    v2 = b.mo7349b();
                    b.mo7348a(v);
                }
                return v2;
            } finally {
                unlock();
            }
        }

        /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
         method: MutableMD:(java.lang.Object, int, org.a.a.f.a.b$c, java.lang.Object):org.a.a.f.a.b$c
         arg types: [K, int, org.a.a.f.a.b$c<K, V>, V]
         candidates:
          MutableMD:(java.lang.Object, int, java.lang.Object, boolean):java.lang.Object
          MutableMD:(java.lang.Object, int, java.lang.Object, java.lang.Object):boolean
          MutableMD:(java.lang.Object, int, org.a.a.f.a.b$c, java.lang.Object):org.a.a.f.a.b$c */
        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public V mo7366a(K k, int i, V v, boolean z) {
            V v2;
            int a;
            lock();
            try {
                int i2 = this.f6796a;
                int i3 = i2 + 1;
                if (i2 > this.f6798c && (a = mo7363a()) > 0) {
                    i3 -= a;
                    this.f6796a = i3 - 1;
                }
                C2519c<K, V>[] cVarArr = this.f6799d;
                int length = i & (cVarArr.length - 1);
                C2519c<K, V> cVar = cVarArr[length];
                C2519c<K, V> cVar2 = cVar;
                while (cVar2 != null && (cVar2.f6784b != i || !m10035a(k, cVar2.mo7347a()))) {
                    cVar2 = cVar2.f6786d;
                }
                if (cVar2 != null) {
                    v2 = cVar2.mo7349b();
                    if (!z) {
                        cVar2.mo7348a(v);
                    }
                } else {
                    v2 = null;
                    this.f6797b++;
                    cVarArr[length] = mo7368a(/*(Object)*/ k, i, (C2519c) cVar, /*(Object)*/ v);
                    this.f6796a = i3;
                }
                return v2;
            } finally {
                unlock();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public V mo7367a(C2519c<K, V> cVar) {
            lock();
            try {
                return cVar.mo7349b();
            } finally {
                unlock();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C2519c<K, V> mo7368a(K k, int i, C2519c<K, V> cVar, V v) {
            return new C2519c<>(k, i, cVar, v);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo7369a(C2519c<K, V>[] cVarArr) {
            this.f6798c = (int) (((float) cVarArr.length) * this.f6800e);
            this.f6799d = cVarArr;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo7370a(Object obj) {
            if (this.f6796a != 0) {
                C2519c<K, V>[] cVarArr = this.f6799d;
                for (C2519c<K, V> cVar : cVarArr) {
                    for (; cVar != null; cVar = cVar.f6786d) {
                        V b = cVar.mo7349b();
                        if (b == null) {
                            b = (V) mo7367a((C2519c) cVar);
                        }
                        if (obj.equals(b)) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo7371a(K k, int i, V v, V v2) {
            lock();
            try {
                C2519c<K, V> b = mo7373b(i);
                while (b != null && (b.f6784b != i || !m10035a(k, b.mo7347a()))) {
                    b = b.f6786d;
                }
                boolean z = false;
                if (b != null && v.equals(b.mo7349b())) {
                    z = true;
                    b.mo7348a(v2);
                }
                return z;
            } finally {
                unlock();
            }
        }

        /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
         method: MutableMD:(java.lang.Object, int, org.a.a.f.a.b$c, java.lang.Object):org.a.a.f.a.b$c
         arg types: [K, int, org.a.a.f.a.b$c<K, V>, V]
         candidates:
          MutableMD:(java.lang.Object, int, java.lang.Object, boolean):java.lang.Object
          MutableMD:(java.lang.Object, int, java.lang.Object, java.lang.Object):boolean
          MutableMD:(java.lang.Object, int, org.a.a.f.a.b$c, java.lang.Object):org.a.a.f.a.b$c */
        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public V mo7372b(Object obj, int i, Object obj2, boolean z) {
            lock();
            try {
                int i2 = this.f6796a - 1;
                C2519c<K, V>[] cVarArr = this.f6799d;
                int length = i & (cVarArr.length - 1);
                C2519c<K, V> cVar = cVarArr[length];
                C2519c<K, V> cVar2 = cVar;
                while (cVar2 != null && obj != cVar2.f6783a && (z || i != cVar2.f6784b || !m10035a(obj, cVar2.mo7347a()))) {
                    cVar2 = cVar2.f6786d;
                }
                V v = null;
                if (cVar2 != null) {
                    V b = cVar2.mo7349b();
                    if (obj2 == null || obj2.equals(b)) {
                        this.f6797b++;
                        C2519c<K, V> cVar3 = cVar2.f6786d;
                        int i3 = i2;
                        for (C2519c<K, V> cVar4 = cVar; cVar4 != cVar2; cVar4 = cVar4.f6786d) {
                            K a = cVar4.mo7347a();
                            if (a == null) {
                                i3--;
                            } else {
                                cVar3 = mo7368a(/*(Object)*/ a, cVar4.f6784b, (C2519c) cVar3, /*(Object)*/ cVar4.mo7349b());
                            }
                        }
                        cVarArr[length] = cVar3;
                        this.f6796a = i3;
                        v = b;
                    }
                }
                return v;
            } finally {
                unlock();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C2519c<K, V> mo7373b(int i) {
            C2519c<K, V>[] cVarArr = this.f6799d;
            return cVarArr[(cVarArr.length - 1) & i];
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo7374b() {
            if (this.f6796a != 0) {
                lock();
                try {
                    C2519c<K, V>[] cVarArr = this.f6799d;
                    for (int i = 0; i < cVarArr.length; i++) {
                        cVarArr[i] = null;
                    }
                    this.f6797b++;
                    this.f6796a = 0;
                } finally {
                    unlock();
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo7375b(Object obj, int i) {
            if (this.f6796a != 0) {
                for (C2519c<K, V> b = mo7373b(i); b != null; b = b.f6786d) {
                    if (b.f6784b == i && m10035a(obj, b.mo7347a())) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    /* renamed from: org.a.a.f.a.b$h */
    static class C2524h<K, V> implements Entry<K, V> {

        /* renamed from: a */
        private final K f6801a;

        /* renamed from: b */
        private V f6802b;

        public C2524h(K k, V v) {
            this.f6801a = k;
            this.f6802b = v;
        }

        /* renamed from: a */
        private static boolean m10050a(Object obj, Object obj2) {
            return obj == null ? obj2 == null : obj.equals(obj2);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            return m10050a(this.f6801a, entry.getKey()) && m10050a(this.f6802b, entry.getValue());
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f6801a;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f6802b;
        }

        public int hashCode() {
            int i = 0;
            int hashCode = this.f6801a == null ? 0 : this.f6801a.hashCode();
            if (this.f6802b != null) {
                i = this.f6802b.hashCode();
            }
            return hashCode ^ i;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            V v2 = this.f6802b;
            this.f6802b = v;
            return v2;
        }

        public String toString() {
            return ((Object) this.f6801a) + "=" + ((Object) this.f6802b);
        }
    }

    /* renamed from: org.a.a.f.a.b$i */
    final class C2525i extends C2516b<K, V>.C2520d implements Enumeration<V>, C2535h/*<V>*/ {
        C2525i() {
            super();
        }

        @Override // java.util.Iterator
        public V next() {
            return super.mo7351c().mo7349b();
        }

        @Override // java.util.Enumeration
        public V nextElement() {
            return super.mo7351c().mo7349b();
        }
    }

    /* renamed from: org.a.a.f.a.b$j */
    final class C2526j extends AbstractCollection<V> {
        C2526j() {
        }

        public void clear() {
            C2516b.this.clear();
        }

        public boolean contains(Object obj) {
            return C2516b.this.containsValue(obj);
        }

        public boolean isEmpty() {
            return C2516b.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return new C2525i();
        }

        public int size() {
            return C2516b.this.size();
        }
    }

    /* renamed from: org.a.a.f.a.b$k */
    final class C2527k extends C2524h<K, V> {
        C2527k(K k, V v) {
            super(k, v);
        }

        @Override // java.util.Map.Entry, org.p035a.p036a.p054f.p055a.C2516b.C2524h
        public V setValue(V v) {
            if (v == null) {
                throw new NullPointerException();
            }
            V value = super.setValue(v);
            C2516b.this.put(getKey(), v);
            return value;
        }
    }

    public C2516b() {
        this(16, 0.75f, 16);
    }

    public C2516b(int i, float f, int i2) {
        if (f <= 0.0f || i < 0 || i2 <= 0) {
            throw new IllegalArgumentException();
        }
        int i3 = 1;
        int i4 = 0;
        while (i3 < (i2 > 65536 ? 65536 : i2)) {
            i3 <<= 1;
            i4++;
        }
        this.f6776b = 32 - i4;
        this.f6775a = i3 - 1;
        this.f6777c = C2523g.m10036a(i3);
        i = i > 1073741824 ? 1073741824 : i;
        int i5 = i / i3;
        int i6 = 1;
        while (i6 < (i5 * i3 < i ? i5 + 1 : i5)) {
            i6 <<= 1;
        }
        for (int i7 = 0; i7 < this.f6777c.length; i7++) {
            this.f6777c[i7] = new C2523g<>(i6, f);
        }
    }

    /* renamed from: a */
    private static int m10025a(Object obj) {
        return m10026b(obj.hashCode());
    }

    /* renamed from: b */
    private static int m10026b(int i) {
        int i2 = ((i << 15) ^ -12931) + i;
        int i3 = i2 ^ (i2 >>> 10);
        int i4 = i3 + (i3 << 3);
        int i5 = i4 ^ (i4 >>> 6);
        int i6 = i5 + (i5 << 2) + (i5 << 14);
        return i6 ^ (i6 >>> 16);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C2523g<K, V> mo7322a(int i) {
        return this.f6777c[(i >>> this.f6776b) & this.f6775a];
    }

    public void clear() {
        for (int i = 0; i < this.f6777c.length; i++) {
            this.f6777c[i].mo7374b();
        }
    }

    public boolean containsKey(Object obj) {
        int a = m10025a(obj);
        return mo7322a(a).mo7375b(obj, a);
    }

    /*  JADX ERROR: StackOverflowError in pass: MarkFinallyVisitor
        java.lang.StackOverflowError
        	at jadx.core.dex.nodes.InsnNode.isSame(InsnNode.java:303)
        	at jadx.core.dex.instructions.InvokeNode.isSame(InvokeNode.java:77)
        	at jadx.core.dex.visitors.MarkFinallyVisitor.sameInsns(MarkFinallyVisitor.java:451)
        	at jadx.core.dex.visitors.MarkFinallyVisitor.compareBlocks(MarkFinallyVisitor.java:436)
        	at jadx.core.dex.visitors.MarkFinallyVisitor.checkBlocksTree(MarkFinallyVisitor.java:408)
        	at jadx.core.dex.visitors.MarkFinallyVisitor.checkBlocksTree(MarkFinallyVisitor.java:411)
        */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x003d A[LOOP:0: B:5:0x0010->B:22:0x003d, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0028 A[SYNTHETIC] */
    public boolean containsValue(Object r9) {
        /*
            r8 = this;
            r3 = 1
            r1 = 0
            if (r9 != 0) goto L_0x000a
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>()
            throw r0
        L_0x000a:
            org.a.a.f.a.b$g<K, V>[] r5 = r8.f6777c
            int r0 = r5.length
            int[] r6 = new int[r0]
            r4 = r1
        L_0x0010:
            r0 = 2
            if (r4 >= r0) goto L_0x0044
            r0 = r1
            r2 = r1
        L_0x0015:
            int r7 = r5.length
            if (r0 >= r7) goto L_0x002c
            r7 = r5[r0]
            int r7 = r7.f6797b
            r6[r0] = r7
            int r2 = r2 + r7
            r7 = r5[r0]
            boolean r7 = r7.mo7370a(r9)
            if (r7 == 0) goto L_0x0029
            r1 = r3
        L_0x0028:
            return r1
        L_0x0029:
            int r0 = r0 + 1
            goto L_0x0015
        L_0x002c:
            if (r2 == 0) goto L_0x007d
            r0 = r1
        L_0x002f:
            int r2 = r5.length
            if (r0 >= r2) goto L_0x007d
            r2 = r6[r0]
            r7 = r5[r0]
            int r7 = r7.f6797b
            if (r2 == r7) goto L_0x0041
            r0 = r1
        L_0x003b:
            if (r0 != 0) goto L_0x0028
            int r0 = r4 + 1
            r4 = r0
            goto L_0x0010
        L_0x0041:
            int r0 = r0 + 1
            goto L_0x002f
        L_0x0044:
            r0 = r1
        L_0x0045:
            int r2 = r5.length
            if (r0 >= r2) goto L_0x0050
            r2 = r5[r0]
            r2.lock()
            int r0 = r0 + 1
            goto L_0x0045
        L_0x0050:
            r0 = r1
        L_0x0051:
            int r2 = r5.length     // Catch:{ all -> 0x0079 }
            if (r0 >= r2) goto L_0x007b
            r2 = r5[r0]     // Catch:{ all -> 0x0079 }
            boolean r2 = r2.mo7370a(r9)     // Catch:{ all -> 0x0079 }
            if (r2 == 0) goto L_0x0068
            r0 = r3
        L_0x005d:
            int r2 = r5.length
            if (r1 >= r2) goto L_0x006c
            r2 = r5[r1]
            r2.unlock()
            int r1 = r1 + 1
            goto L_0x005d
        L_0x0068:
            int r0 = r0 + 1
            goto L_0x0051
        L_0x006b:
            throw r0
        L_0x006c:
            r1 = r0
            goto L_0x0028
        L_0x006e:
            int r2 = r5.length
            if (r1 >= r2) goto L_0x006b
            r2 = r5[r1]
            r2.unlock()
            int r1 = r1 + 1
            goto L_0x006e
        L_0x0079:
            r0 = move-exception
            goto L_0x006e
        L_0x007b:
            r0 = r1
            goto L_0x005d
        L_0x007d:
            r0 = r3
            goto L_0x003b
        */
        throw new UnsupportedOperationException("Method not decompiled: org.p035a.p036a.p054f.p055a.C2516b.containsValue(java.lang.Object):boolean");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Entry<K, V>> entrySet() {
        Set<Entry<K, V>> set = this.f6779e;
        if (set != null) {
            return set;
        }
        C2518b bVar = new C2518b();
        this.f6779e = bVar;
        return bVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        int a = m10025a(obj);
        return mo7322a(a).mo7364a(obj, a);
    }

    public boolean isEmpty() {
        C2523g<K, V>[] gVarArr = this.f6777c;
        int[] iArr = new int[gVarArr.length];
        int i = 0;
        for (int i2 = 0; i2 < gVarArr.length; i2++) {
            if (gVarArr[i2].f6796a != 0) {
                return false;
            }
            int i3 = gVarArr[i2].f6797b;
            iArr[i2] = i3;
            i += i3;
        }
        if (i != 0) {
            for (int i4 = 0; i4 < gVarArr.length; i4++) {
                if (gVarArr[i4].f6796a != 0 || iArr[i4] != gVarArr[i4].f6797b) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.f6778d;
        if (set != null) {
            return set;
        }
        C2522f fVar = new C2522f();
        this.f6778d = fVar;
        return fVar;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: MutableMD:(java.lang.Object, int, java.lang.Object, boolean):java.lang.Object
     arg types: [K, int, V, int]
     candidates:
      MutableMD:(java.lang.Object, int, org.a.a.f.a.b$c, java.lang.Object):org.a.a.f.a.b$c
      MutableMD:(java.lang.Object, int, java.lang.Object, java.lang.Object):boolean
      MutableMD:(java.lang.Object, int, java.lang.Object, boolean):java.lang.Object */
    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k, V v) {
        if (v == null) {
            throw new NullPointerException();
        }
        int a = m10025a(k);
        return mo7322a(a).mo7366a(/*(Object)*/ k, a, /*(Object)*/ v, false);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        for (Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: MutableMD:(java.lang.Object, int, java.lang.Object, boolean):java.lang.Object
     arg types: [K, int, V, int]
     candidates:
      MutableMD:(java.lang.Object, int, org.a.a.f.a.b$c, java.lang.Object):org.a.a.f.a.b$c
      MutableMD:(java.lang.Object, int, java.lang.Object, java.lang.Object):boolean
      MutableMD:(java.lang.Object, int, java.lang.Object, boolean):java.lang.Object */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public V putIfAbsent(K k, V v) {
        if (v == null) {
            throw new NullPointerException();
        }
        int a = m10025a(k);
        return mo7322a(a).mo7366a(/*(Object)*/ k, a,/* (Object)*/ v, true);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        int a = m10025a(obj);
        return mo7322a(a).mo7372b(obj, a, null, false);
    }

    public boolean remove(Object obj, Object obj2) {
        int a = m10025a(obj);
        return (obj2 == null || mo7322a(a).mo7372b(obj, a, obj2, false) == null) ? false : true;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public V replace(K k, V v) {
        if (v == null) {
            throw new NullPointerException();
        }
        int a = m10025a(k);
        return mo7322a(a).mo7365a(k, a, v);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: MutableMD:(java.lang.Object, int, java.lang.Object, java.lang.Object):boolean
     arg types: [K, int, V, V]
     candidates:
      MutableMD:(java.lang.Object, int, java.lang.Object, boolean):java.lang.Object
      MutableMD:(java.lang.Object, int, org.a.a.f.a.b$c, java.lang.Object):org.a.a.f.a.b$c
      MutableMD:(java.lang.Object, int, java.lang.Object, java.lang.Object):boolean */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public boolean replace(K k, V v, V v2) {
        if (v == null || v2 == null) {
            throw new NullPointerException();
        }
        int a = m10025a(k);
        return mo7322a(a).mo7371a(/*(Object)*/ k, a, /*(Object)*/ v, /*(Object)*/ v2);
    }

    public int size() {
        C2523g<K, V>[] gVarArr = this.f6777c;
        int[] iArr = new int[gVarArr.length];
        long j = 0;
        long j2 = 0;
        for (int i = 0; i < 2; i++) {
            long j3 = 0;
            j2 = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < gVarArr.length; i3++) {
                j2 += (long) gVarArr[i3].f6796a;
                int i4 = gVarArr[i3].f6797b;
                iArr[i3] = i4;
                i2 += i4;
            }
            if (i2 != 0) {
                int i5 = 0;
                while (true) {
                    if (i5 >= gVarArr.length) {
                        break;
                    }
                    j3 += (long) gVarArr[i5].f6796a;
                    if (iArr[i5] != gVarArr[i5].f6797b) {
                        j = -1;
                        break;
                    }
                    i5++;
                }
            }
            j = j3;
            if (j == j2) {
                break;
            }
        }
        if (j != j2) {
            long j4 = 0;
            for (C2523g<K, V> gVar : gVarArr) {
                gVar.lock();
            }
            for (C2523g<K, V> gVar2 : gVarArr) {
                j4 = j2 + ((long) gVar2.f6796a);
            }
            for (C2523g<K, V> gVar3 : gVarArr) {
                gVar3.unlock();
            }
        }
        if (j2 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) j2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
        Collection<V> collection = this.f6780f;
        if (collection != null) {
            return collection;
        }
        C2526j jVar = new C2526j();
        this.f6780f = jVar;
        return jVar;
    }
}
