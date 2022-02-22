package org.p035a.p036a.p039c.p041b.p042a;

import java.nio.channels.spi.SelectorProvider;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.p035a.p036a.p053e.C2491b;
import org.p035a.p036a.p053e.C2492c;
import org.p035a.p036a.p054f.p055a.C2538k;

/* renamed from: org.a.a.c.b.a.i */
final class C2350i {

    /* renamed from: a */
    static final C2491b f6268a = C2492c.m9929a(C2350i.class);

    /* renamed from: b */
    static final int f6269b;

    static {
        int a = C2538k.m10065a("org.jboss.netty.channel.socket.nio.constraintLevel", -1);
        if (a < 0 || a > 2) {
            a = C2538k.m10065a("java.nio.channels.spi.constraintLevel", -1);
            if (a < 0 || a > 2) {
                a = -1;
            } else {
                f6268a.mo7287c("System property 'java.nio.channels.spi.constraintLevel' has been deprecated.  Use 'org.jboss.netty.channel.socket.nio.constraintLevel' instead.");
            }
        }
        if (a >= 0) {
            f6268a.mo7281a("Setting the NIO constraint level to: " + a);
        }
        if (a < 0) {
            a = m9371a();
            if (a < 0) {
                if (f6268a.mo7283a()) {
                    f6268a.mo7281a("Couldn't determine the NIO constraint level from the system properties; using the safest level (2)");
                    a = 2;
                } else {
                    a = 2;
                }
            } else if (a != 0) {
                if (f6268a.mo7286b()) {
                    f6268a.mo7284b("Using the autodetected NIO constraint level: " + a + " (Use better NIO provider for better performance)");
                }
            } else if (f6268a.mo7283a()) {
                f6268a.mo7281a("Using the autodetected NIO constraint level: " + a);
            }
        }
        f6269b = a;
        if (f6269b < 0 || f6269b > 2) {
            throw new Error("Unexpected NIO constraint level: " + f6269b + ", please report this error.");
        }
    }

    private C2350i() {
    }

    /* renamed from: a */
    private static int m9371a() {
        String str;
        String a = C2538k.m10066a("java.specification.version");
        String a2 = C2538k.m10067a("java.vm.info", "");
        String a3 = C2538k.m10066a("os.name");
        String a4 = C2538k.m10066a("java.vm.vendor");
        try {
            str = SelectorProvider.provider().getClass().getName();
        } catch (Exception e) {
            str = null;
        }
        if (a == null || a3 == null || a4 == null || str == null) {
            return -1;
        }
        String lowerCase = a3.toLowerCase();
        String lowerCase2 = a4.toLowerCase();
        if (lowerCase2.indexOf("sun") >= 0) {
            if (lowerCase.indexOf("linux") >= 0) {
                if (str.equals("sun.nio.ch.EPollSelectorProvider") || str.equals("sun.nio.ch.PollSelectorProvider")) {
                    return 0;
                }
            } else if (lowerCase.indexOf("windows") >= 0) {
                if (str.equals("sun.nio.ch.WindowsSelectorProvider")) {
                    return 0;
                }
            } else if ((lowerCase.indexOf("sun") >= 0 || lowerCase.indexOf("solaris") >= 0) && str.equals("sun.nio.ch.DevPollSelectorProvider")) {
                return 0;
            }
        } else if (lowerCase2.indexOf("apple") >= 0) {
            if (lowerCase.indexOf("mac") >= 0 && lowerCase.indexOf("os") >= 0 && str.equals("sun.nio.ch.KQueueSelectorProvider")) {
                return 0;
            }
        } else if (lowerCase2.indexOf("ibm") >= 0) {
            if (lowerCase.indexOf("linux") >= 0 || lowerCase.indexOf("aix") >= 0) {
                if (a.equals("1.5") || a.matches("^1\\.5\\D.*$")) {
                    if (str.equals("sun.nio.ch.PollSelectorProvider")) {
                        return 1;
                    }
                } else if (a.equals("1.6") || a.matches("^1\\.6\\D.*$")) {
                    Matcher matcher = Pattern.compile("(?:^|[^0-9])([2-9][0-9]{3}(?:0[1-9]|1[0-2])(?:0[1-9]|[12][0-9]|3[01]))(?:$|[^0-9])").matcher(a2);
                    if (matcher.find()) {
                        if (Long.parseLong(matcher.group(1)) < 20081105) {
                            return 2;
                        }
                        if (str.equals("sun.nio.ch.EPollSelectorProvider")) {
                            return 0;
                        }
                        if (str.equals("sun.nio.ch.PollSelectorProvider")) {
                            return 1;
                        }
                    }
                }
            }
        } else if (lowerCase2.indexOf("bea") >= 0 || lowerCase2.indexOf("oracle") >= 0) {
            if (lowerCase.indexOf("linux") >= 0) {
                if (str.equals("sun.nio.ch.EPollSelectorProvider") || str.equals("sun.nio.ch.PollSelectorProvider")) {
                    return 0;
                }
            } else if (lowerCase.indexOf("windows") >= 0 && str.equals("sun.nio.ch.WindowsSelectorProvider")) {
                return 0;
            }
        } else if (lowerCase2.indexOf("apache") >= 0 && str.equals("org.apache.harmony.nio.internal.SelectorProviderImpl")) {
            return 1;
        }
        return -1;
    }
}
