package com.github.alexeylapin.oca.g02_working_with_java_data_types.t01_declare_and_initialize_variables;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

public class T02_Primitives {

    byte b = 1;
    short s = 1;
    char c = 1;
    int i = 1;
    float f = 1;
    long l = 1;
    double d = 1;

    final byte fb = 1;
    final short fs = 1;
    final char fc = 1;
    final int fi = 1;
    final float ff = 1;
    final long fl = 1;
    final double fd = 1;

    @Nested
    class ByteTest {

        @Test
        void name1() {
            byte primitive;

            primitive = b;
            primitive = (byte) s;
            primitive = (byte) c;
            primitive = (byte) i;
            primitive = (byte) f;
            primitive = (byte) l;
            primitive = (byte) d;
        }

        @Test
        void name2() {
            byte primitive;

            primitive = fb;
            primitive = fs;
            primitive = fc;
            primitive = fi;
            primitive = (byte) ff;
            primitive = (byte) fl;
            primitive = (byte) fd;
        }

        @Test
        void name3() {
            assertThat((byte) 128).isEqualTo((byte) -128);
            assertThat((byte) 129).isEqualTo((byte) -127);
        }

        @Test
        void name4() {
            short s = 1;
            float f = 2.7f;
            double d = 3.8d;
            assertThat((byte) s == 1).isTrue();
            assertThat((byte) f == 2).isTrue();
            assertThat((byte) d == 3).isTrue();
        }
    }

    @Nested
    class ShortTest {

        @Test
        void name1() {
            short primitive;

            primitive = b;
            primitive = s;
            primitive = (short) c;
            primitive = (short) i;
            primitive = (short) f;
            primitive = (short) l;
            primitive = (short) d;
        }

        @Test
        void name2() {
            short primitive;

            primitive = fb;
            primitive = fs;
            primitive = fc;
            primitive = fi;
            primitive = (short) ff;
            primitive = (short) fl;
            primitive = (short) fd;
        }
    }

    @Nested
    class CharTest {

        @Test
        void name1() {
            char primitive;

            primitive = (char) b;
            primitive = (char) s;
            primitive = c;
            primitive = (char) i;
            primitive = (char) f;
            primitive = (char) l;
            primitive = (char) d;
        }

        @Test
        void name2() {
            char primitive;

            primitive = fb;
            primitive = fs;
            primitive = fc;
            primitive = fi;
            primitive = (char) ff;
            primitive = (char) fl;
            primitive = (char) fd;
        }
    }

    @Nested
    class IntTest {

        @Test
        void name1() {
            int primitive;

            primitive = b;
            primitive = s;
            primitive = c;
            primitive = i;
            primitive = (int) f;
            primitive = (int) l;
            primitive = (int) d;
        }

        @Test
        void name22() {
            int primitive;

            primitive = fb;
            primitive = fs;
            primitive = fc;
            primitive = fi;
            primitive = (int) ff;
            primitive = (int) fl;
            primitive = (int) fd;
        }

        @Test
        void name2() {
            int i = Integer.MAX_VALUE;
            float f = i;

            assertThat(i == f).isTrue();
        }

        @Test
        void name3() {
            int i = Integer.MAX_VALUE - 1;
            float f = Integer.MAX_VALUE;

            assertThat(i == f).isTrue();
            System.out.println(i);
            System.out.println(f);
        }

        @Test
        void name4() {
            int i = 123456789;
            float f = 123456789;

            assertThat(i == f).isTrue();
            System.out.println(i);
            System.out.println(f);
        }
    }

    @Nested
    class FloatTest {

        @Test
        void name1() {
            float primitive;

            primitive = b;
            primitive = s;
            primitive = c;
            primitive = i; // possible loss
            primitive = f;
            primitive = l; // possible loss
            primitive = (int) fd;
        }

        @Test
        void name2() {
            float primitive;

            primitive = fb;
            primitive = fs;
            primitive = fc;
            primitive = fi; // possible loss
            primitive = ff;
            primitive = fl; // possible loss
            primitive = (int) fd;
        }
    }

    @Nested
    class LongTest {

        @Test
        void name1() {
            long primitive;

            primitive = b;
            primitive = s;
            primitive = c;
            primitive = i;
            primitive = (long) f;
            primitive = l;
            primitive = (long) d;
        }

        @Test
        void name2() {
            long primitive;

            primitive = fb;
            primitive = fs;
            primitive = fc;
            primitive = fi;
            primitive = (long) ff;
            primitive = fl;
            primitive = (long) fd;
        }
    }

    @Nested
    class DoubleTest {

        @Test
        void name1() {
            double primitive;

            primitive = b;
            primitive = s;
            primitive = c;
            primitive = i;
            primitive = f;
            primitive = l;
            primitive = d;
        }

        @Test
        void name22() {
            double primitive;

            primitive = fb;
            primitive = fs;
            primitive = fc;
            primitive = fi;
            primitive = ff;
            primitive = fl;
            primitive = fd;
        }

        @Test
        void name2() {
            long l = Long.MAX_VALUE;
            double d = l;

            assertThat(l == d).isTrue();
        }
    }

    @Test
    void name1() {
        byte b = 1;
    }

    // byte allocates 1 byte
    @Test
    void name2() {
        assertThat((byte) -128).isEqualTo(Byte.MIN_VALUE);
        assertThat((byte) 127).isEqualTo(Byte.MAX_VALUE);
    }

    // short allocates 2 byte
    @Test
    void name3() {
        assertThat((short) -32_768).isEqualTo(Short.MIN_VALUE);
        assertThat((short) 32_767).isEqualTo(Short.MAX_VALUE);
    }

    // int allocates 4 byte
    @Test
    void name4() {
        assertThat((int) -2_147_483_648).isEqualTo(Integer.MIN_VALUE);
        assertThat((int) 2_147_483_647).isEqualTo(Integer.MAX_VALUE);
    }

    // int allocates 4 byte
    @Test
    void name41() {
        assertThat(-2_147_483_648).isEqualTo(Integer.MIN_VALUE);
        assertThat(2_147_483_647).isEqualTo(Integer.MAX_VALUE);
    }

    // long allocates 8 byte
    @Test
    void name5() {
        assertThat((long) -9_223_372_036_854_775_808L).isEqualTo(Long.MIN_VALUE);
        assertThat((long) 9_223_372_036_854_775_807L).isEqualTo(Long.MAX_VALUE);
    }

    // long allocates 8 byte
    @Test
    void name51() {
        assertThat(-9_223_372_036_854_775_808L).isEqualTo(Long.MIN_VALUE);
        assertThat(9_223_372_036_854_775_807L).isEqualTo(Long.MAX_VALUE);
    }

    @Test
    void name6() {
        int i = 10; // default integral literal is int
    }

    @Test
    void name7() {
        float f = 10.0f; // default floating point literal is double
    }

    @Test
    void name71() {
        float f = 10; // float can contain int
    }

    // char allocates 2 byte
    @Test
    void name8() {
        assertThat((char) 0).isEqualTo(Character.MIN_VALUE);
        assertThat((char) 65535).isEqualTo(Character.MAX_VALUE);
    }

    @Test
    void name9() {
        System.out.println(Character.MAX_VALUE);
    }

    @Test
    void name10() {
        char c = 'a';
        assertThat(c).isEqualTo((char) 97);
    }

    @Test
    void name101() {
        char c = 97;
        assertThat(c).isEqualTo('a');
    }

    @Test
    void name11() {
        char c = 97;
        assertThat(c + 1).isEqualTo('b');
    }

    @Test
    void name12() {
        final char c = 97;
        short s = c;
    }

    @Test
    void name13() {
        final short s = 97;
        char c = s;
    }

    @Test
    void name14() {
        final int s = 97; // works for byte, short, char, int
        byte c = s;
    }

    @Test
    void name() {
//        assertThat(4).isEqualTo(Float.MAX_VALUE);
//        assertThat(4).isEqualTo(Float.MIN_VALUE);
        System.out.println(Float.valueOf(Float.MAX_VALUE));
    }

    @Test
    void name22() {
//        float f = 1e1;
    }


}

