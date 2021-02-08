package com.github.alexeylapin.oca.g02_working_with_java_data_types.t05_wrapper_classes;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

public class T01 {

    @Test
    void name() {
        int i = new Integer(10); // unboxing
    }

    @Test
    void name2() {
        Integer i = 10; // boxing
    }

    @Test
    void name3() {
        Integer.valueOf(10);
        Integer.valueOf("10");

        Integer.parseInt("10");
        Integer.parseInt("10", 2);

        Integer anInteger = new Integer(10);
        anInteger.byteValue();
        anInteger.shortValue();
        anInteger.intValue();
        anInteger.longValue();
        anInteger.floatValue();
        anInteger.doubleValue();
    }

    @Test
    void name4() {
        Byte.valueOf((byte) 10);
        Byte.valueOf("10");

        Byte.parseByte("10");

        byte b = 10;
        Byte aByte = new Byte(b);
        aByte.byteValue();
        aByte.shortValue();
        aByte.intValue();
        aByte.longValue();
        aByte.floatValue();
        aByte.doubleValue();
    }

    @Test
    void name5() {
        assertThat(1 == new Integer(1)).isTrue();
        assertThat(new Integer(1) == 1).isTrue();
    }

    @Test
    void name6() {
        assertThat(1000 == new Integer(1000)).isTrue();
        assertThat(new Integer(1000) == 1000).isTrue();
    }

    @Test
    void name7() {
        int i1 = 1;
        int i2 = 1;
        assertThat(i1 == i2).isTrue();
    }

    @Test
    void name8() {
        int i1 = 10000;
        int i2 = 10000;
        assertThat(i1 == i2).isTrue();
    }

    @Test
    void name9() {
        Integer integer1 = 1;
        Integer integer2 = 1;
        assertThat(integer1 == integer2).isTrue();
    }

    @Test
    void name10() {
        Integer integer1 = 10000;
        Integer integer2 = 10000;
        assertThat(integer1 == integer2).isFalse();
    }

    @Test
    void name11() {
        assertThat(10 == new Double(10)).isTrue();
        assertThat(10 == new Float(10)).isTrue();
        assertThat(10 == new Long(10)).isTrue();
    }

    @Test
    void name12() {
        Throwable throwable = catchThrowable(() -> {
            int i = (Integer) null;
        });

        assertThat(throwable).isInstanceOf(NullPointerException.class);
    }

    @Test
    void name13() {
        Throwable throwable = catchThrowable(() -> {
            int i = (Byte) null;
        });

        assertThat(throwable).isInstanceOf(NullPointerException.class);
    }

}
