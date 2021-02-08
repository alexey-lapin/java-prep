package com.github.alexeylapin.oca.g02_working_with_java_data_types.t05_wrapper_classes;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

/**
 * new Byte((byte) 1);
 * new Byte("1");
 * <p>
 * primitive parseByte("1");
 * primitive parseByte("1", 10);
 * <p>
 * wrapper valueOf((byte) 1);
 * wrapper valueOf("1");
 * wrapper valueOf("1", 10);
 */
public class T_Byte {

    @Test
    void name() {
        Byte b = new Byte((byte) 1);
        b.byteValue();
        b.shortValue();
        b.intValue();
        b.longValue();
        b.floatValue();
        b.doubleValue();
    }

    @Test
    void name2() {
        Byte b = new Byte("1");
    }

    @Test
    void name22() {
        byte b1 = Byte.parseByte("1");
        byte b2 = Byte.parseByte("1", 10);
    }

    @Test
    void name222() {
        Throwable throwable = catchThrowable(() -> Byte.parseByte(null));

        assertThat(throwable).isInstanceOf(NumberFormatException.class);
    }

    @Test
    void name223() {
        Throwable throwable = catchThrowable(() -> Byte.parseByte(""));

        assertThat(throwable).isInstanceOf(NumberFormatException.class);
    }

    @Test
    void name23() {
        Byte b1 = Byte.valueOf((byte) 1);
        Byte b2 = Byte.valueOf("1");
        Byte b3 = Byte.valueOf("1", 10);
    }

    @Test
    void name3() {
        Throwable throwable = catchThrowable(() -> new Byte("128"));

        assertThat(throwable).isInstanceOf(NumberFormatException.class);
    }

    @Test
    void name4() {
        Throwable throwable = catchThrowable(() -> new Byte("1.0"));

        assertThat(throwable).isInstanceOf(NumberFormatException.class);
    }

    @Test
    void name5() {
        Throwable throwable = catchThrowable(() -> new Byte("1L"));

        assertThat(throwable).isInstanceOf(NumberFormatException.class);
    }

    @Test
    void name6() {
        Throwable throwable = catchThrowable(() -> new Byte("1f"));

        assertThat(throwable).isInstanceOf(NumberFormatException.class);
    }
}
