package com.github.alexeylapin.oca.g02_working_with_java_data_types.t05_wrapper_classes;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

/**
 * new Double(double);
 * new Double(String);
 *
 * primitive parseDouble(String);
 *
 * wrapper valueOf(double);
 * wrapper valueOf(String);
 */
public class T_Double {

    @Test
    void name() {
        Double s = new Double(1f);
        s.byteValue();
        s.floatValue();
        s.intValue();
        s.longValue();
        s.floatValue();
        s.doubleValue();
    }

    @Test
    void name11() {
        new Double((byte) 1);
        new Double((short) 1);
        new Double((char) 1);
        new Double((int) 1);
        new Double((long) 1);
        new Double((float) 1);
        new Double((double) 1);

        new Double(1);
        new Double(1L);
        new Double(1F);
        new Double(1.0);
        new Double(1D);
    }

    @Test
    void name2() {
        Double s = new Double("1");
    }

    @Test
    void name22() {
        Double s1 = Double.parseDouble("1");
    }

    @Test
    void name23() {
        Double s1 = Double.valueOf(1);
        Double s2 = Double.valueOf("1");
        Double s3 = Double.valueOf("1f");
    }

    @Test
    void name5() {
        Throwable throwable = catchThrowable(() -> new Double("1L"));

        assertThat(throwable).isInstanceOf(NumberFormatException.class);
    }

}
