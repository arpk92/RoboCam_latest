package org.p057b.p060b;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

/* renamed from: org.b.b.d */
public class C2558d {

    /* renamed from: a */
    private static final List<String> f6837a = Collections.emptyList();

    /* renamed from: b */
    private final Map<String, List<String>> f6838b = new HashMap();

    public C2558d(String str) {
        if (str != null) {
            m10092c(str);
        }
    }

    /* renamed from: c */
    private void m10092c(String str) {
        try {
            StringTokenizer stringTokenizer = new StringTokenizer(str, "&");
            while (stringTokenizer.hasMoreTokens()) {
                String[] split = stringTokenizer.nextToken().split("=");
                String decode = URLDecoder.decode(split[0], "UTF-8");
                String decode2 = split.length == 1 ? null : URLDecoder.decode(split[1], "UTF-8");
                List<String> list = this.f6838b.get(decode);
                if (list == null) {
                    list = new ArrayList<>();
                    this.f6838b.put(decode, list);
                }
                list.add(decode2);
            }
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("Couldn't parse query string: " + str, e);
        }
    }

    /* renamed from: a */
    public String mo7421a(String str) {
        List<String> b = mo7422b(str);
        if (b.isEmpty()) {
            return null;
        }
        return b.get(0);
    }

    /* renamed from: b */
    public List<String> mo7422b(String str) {
        return this.f6838b.containsKey(str) ? this.f6838b.get(str) : f6837a;
    }
}
