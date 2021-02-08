package com.github.alexeylapin.oca.g02_working_with_java_data_types.t05_wrapper_classes;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

/**
 * new Short((short) 1);
 * new Short("1");
 *
 * primitive parseShort("1");
 * primitive parseShort("1", 10);
 *
 * wrapper valueOf((short) 1);
 * wrapper valueOf("1");
 * wrapper valueOf("1", 10);
 */
public class T_Short {

    @Test
    void name() {
        Short s = new Short((short) 1);
        s.byteValue();
        s.shortValue();
        s.intValue();
        s.longValue();
        s.floatValue();
        s.doubleValue();
    }

    @Test
    void name2() {
        Short s = new Short("1");
    }

    @Test
    void name22() {
        short s1 = Short.parseShort("1");
        short s2 = Short.parseShort("1", 10);
    }

    @Test
    void name23() {
        Short s1 = Short.valueOf((short) 1);
        Short s2 = Short.valueOf("1");
        Short s3 = Short.valueOf("1", 10);
    }

    @Test
    void name3() {
        Throwable throwable = catchThrowable(() -> new Short("70000"));

        assertThat(throwable).isInstanceOf(NumberFormatException.class);
    }

    @Test
    void name4() {
        Throwable throwable = catchThrowable(() -> new Short("1.0"));

        assertThat(throwable).isInstanceOf(NumberFormatException.class);
    }

    @Test
    void name5() {
        Throwable throwable = catchThrowable(() -> new Short("1L"));

        assertThat(throwable).isInstanceOf(NumberFormatException.class);
    }

    @Test
    void name6() {
        Throwable throwable = catchThrowable(() -> new Short("1f"));

        assertThat(throwable).isInstanceOf(NumberFormatException.class);
    }
}
