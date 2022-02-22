package org.p035a.p036a.p039c.p040a;

import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;
import org.p035a.p036a.p039c.C2327as;
import org.p035a.p036a.p039c.C2384f;
import org.p035a.p036a.p039c.C2390l;
import org.p035a.p036a.p039c.C2391m;
import org.p035a.p036a.p054f.p055a.C2516b;

/* renamed from: org.a.a.c.a.e */
public class C2302e extends AbstractSet<C2384f> implements C2298a {

    /* renamed from: a */
    private static final AtomicInteger f6132a = new AtomicInteger();

    /* renamed from: b */
    private final String f6133b;

    /* renamed from: c */
    private final ConcurrentMap<Integer, C2384f> f6134c;

    /* renamed from: d */
    private final ConcurrentMap<Integer, C2384f> f6135d;

    /* renamed from: e */
    private final C2391m f6136e;

    public C2302e() {
        this("group-0x" + Integer.toHexString(f6132a.incrementAndGet()));
    }

    public C2302e(String str) {
        this.f6134c = new C2516b();
        this.f6135d = new C2516b();
        this.f6136e = new C2391m() {
            /* class org.p035a.p036a.p039c.p040a.C2302e.C23031 */

            @Override // org.p035a.p036a.p039c.C2391m
            /* renamed from: a */
            public void mo6933a(C2390l lVar) {
                C2302e.this.remove(lVar.mo6939c());
            }
        };
        if (str == null) {
            throw new NullPointerException("name");
        }
        this.f6133b = str;
    }

    /* renamed from: a */
    public int compareTo(C2298a aVar) {
        int compareTo = mo6912a().compareTo(aVar.mo6912a());
        return compareTo != 0 ? compareTo : System.identityHashCode(this) - System.identityHashCode(aVar);
    }

    @Override // org.p035a.p036a.p039c.p040a.C2298a
    /* renamed from: a */
    public String mo6912a() {
        return this.f6133b;
    }

    /* renamed from: a */
    public boolean add(C2384f fVar) {
        boolean z = (fVar instanceof C2327as ? this.f6134c : this.f6135d).putIfAbsent(fVar.mo6891a(), fVar) == null;
        if (z) {
            fVar.mo6906j().mo6936a(this.f6136e);
        }
        return z;
    }

    @Override // org.p035a.p036a.p039c.p040a.C2298a
    /* renamed from: b */
    public C2299b mo6913b() {
        LinkedHashMap linkedHashMap = new LinkedHashMap(size());
        for (C2384f fVar : this.f6134c.values()) {
            linkedHashMap.put(fVar.mo6891a(), fVar.mo6905i().mo6941g());
        }
        for (C2384f fVar2 : this.f6135d.values()) {
            linkedHashMap.put(fVar2.mo6891a(), fVar2.mo6905i());
        }
        return new C2304f(this, linkedHashMap);
    }

    public void clear() {
        this.f6135d.clear();
        this.f6134c.clear();
    }

    public boolean contains(Object obj) {
        if (obj instanceof Integer) {
            return this.f6135d.containsKey(obj) || this.f6134c.containsKey(obj);
        }
        if (!(obj instanceof C2384f)) {
            return false;
        }
        C2384f fVar = (C2384f) obj;
        return obj instanceof C2327as ? this.f6134c.containsKey(fVar.mo6891a()) : this.f6135d.containsKey(fVar.mo6891a());
    }

    public boolean equals(Object obj) {
        return this == obj;
    }

    public int hashCode() {
        return System.identityHashCode(this);
    }

    public boolean isEmpty() {
        return this.f6135d.isEmpty() && this.f6134c.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set, java.lang.Iterable
    public Iterator<C2384f> iterator() {
        return new C2301d(this.f6134c.values().iterator(), this.f6135d.values().iterator());
    }

    public boolean remove(Object obj) {
        C2384f fVar = null;
        if (obj instanceof Integer) {
            fVar = this.f6135d.remove(obj);
            if (fVar == null) {
                fVar = this.f6134c.remove(obj);
            }
        } else if (obj instanceof C2384f) {
            C2384f fVar2 = (C2384f) obj;
            fVar = fVar2 instanceof C2327as ? this.f6134c.remove(fVar2.mo6891a()) : this.f6135d.remove(fVar2.mo6891a());
        }
        if (fVar == null) {
            return false;
        }
        fVar.mo6906j().mo6938b(this.f6136e);
        return true;
    }

    public int size() {
        return this.f6135d.size() + this.f6134c.size();
    }

    public Object[] toArray() {
        ArrayList arrayList = new ArrayList(size());
        arrayList.addAll(this.f6134c.values());
        arrayList.addAll(this.f6135d.values());
        return arrayList.toArray();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        ArrayList arrayList = new ArrayList(size());
        arrayList.addAll(this.f6134c.values());
        arrayList.addAll(this.f6135d.values());
        return (T[]) arrayList.toArray(tArr);
    }

    public String toString() {
        return getClass().getSimpleName() + "(name: " + mo6912a() + ", size: " + size() + ')';
    }
}
