package org.p035a.p036a.p054f;

import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.IdentityHashMap;
import java.util.Map;

/* renamed from: org.a.a.f.a */
public final class C2496a {

    /* renamed from: a */
    public static final Charset f6589a = Charset.forName("UTF-16");

    /* renamed from: b */
    public static final Charset f6590b = Charset.forName("UTF-16BE");

    /* renamed from: c */
    public static final Charset f6591c = Charset.forName("UTF-16LE");

    /* renamed from: d */
    public static final Charset f6592d = Charset.forName("UTF-8");

    /* renamed from: e */
    public static final Charset f6593e = Charset.forName("ISO-8859-1");

    /* renamed from: f */
    public static final Charset f6594f = Charset.forName("US-ASCII");

    /* renamed from: g */
    private static final ThreadLocal<Map<Charset, CharsetEncoder>> f6595g = new ThreadLocal<Map<Charset, CharsetEncoder>>() {
        /* class org.p035a.p036a.p054f.C2496a.C24971 */

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Map<Charset, CharsetEncoder> initialValue() {
            return new IdentityHashMap();
        }
    };

    /* renamed from: h */
    private static final ThreadLocal<Map<Charset, CharsetDecoder>> f6596h = new ThreadLocal<Map<Charset, CharsetDecoder>>() {
        /* class org.p035a.p036a.p054f.C2496a.C24982 */

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Map<Charset, CharsetDecoder> initialValue() {
            return new IdentityHashMap();
        }
    };

    /* renamed from: a */
    public static CharsetEncoder m9950a(Charset charset) {
        if (charset == null) {
            throw new NullPointerException("charset");
        }
        Map<Charset, CharsetEncoder> map = f6595g.get();
        CharsetEncoder charsetEncoder = map.get(charset);
        if (charsetEncoder != null) {
            charsetEncoder.reset();
            charsetEncoder.onMalformedInput(CodingErrorAction.REPLACE);
            charsetEncoder.onUnmappableCharacter(CodingErrorAction.REPLACE);
            return charsetEncoder;
        }
        CharsetEncoder newEncoder = charset.newEncoder();
        newEncoder.onMalformedInput(CodingErrorAction.REPLACE);
        newEncoder.onUnmappableCharacter(CodingErrorAction.REPLACE);
        map.put(charset, newEncoder);
        return newEncoder;
    }

    /* renamed from: b */
    public static CharsetDecoder m9951b(Charset charset) {
        if (charset == null) {
            throw new NullPointerException("charset");
        }
        Map<Charset, CharsetDecoder> map = f6596h.get();
        CharsetDecoder charsetDecoder = map.get(charset);
        if (charsetDecoder != null) {
            charsetDecoder.reset();
            charsetDecoder.onMalformedInput(CodingErrorAction.REPLACE);
            charsetDecoder.onUnmappableCharacter(CodingErrorAction.REPLACE);
            return charsetDecoder;
        }
        CharsetDecoder newDecoder = charset.newDecoder();
        newDecoder.onMalformedInput(CodingErrorAction.REPLACE);
        newDecoder.onUnmappableCharacter(CodingErrorAction.REPLACE);
        map.put(charset, newDecoder);
        return newDecoder;
    }
}
