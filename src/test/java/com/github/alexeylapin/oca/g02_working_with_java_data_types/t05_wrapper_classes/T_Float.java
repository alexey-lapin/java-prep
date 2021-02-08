package com.github.alexeylapin.oca.g02_working_with_java_data_types.t05_wrapper_classes;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

/**
 * new Float(float);
 * new Float(double);
 * new Float(String);
 * <p>
 * primitive parseFloat(String);
 * <p>
 * wrapper valueOf(float);
 * wrapper valueOf(String);
 */
public class T_Float {

    @Test
    void name() {
        Float s = new Float(1f);
        s.byteValue();
        s.floatValue();
        s.intValue();
        s.longValue();
        s.floatValue();
        s.doubleValue();
    }

    @Test
    void name11() {
        new Float((byte) 1);
        new Float((short) 1);
        new Float((char) 1);
        new Float((int) 1);
        new Float((long) 1);
        new Float((float) 1);
        new Float((double) 1);

        new Float(1);
        new Float(1L);
        new Float(1F);
        new Float(1.0);
        new Float(1D);
    }

    @Test
    void name2() {
        Float s = new Float("1");
    }

    @Test
    void name22() {
        Float s1 = Float.parseFloat("1");
    }

    @Test
    void name23() {
        Float s1 = Float.valueOf(1);
        Float s2 = Float.valueOf("1");
        Float s3 = Float.valueOf("1f");
    }

    @Test
    void name5() {
        Throwable throwable = catchThrowable(() -> new Float("1L"));

        assertThat(throwable).isInstanceOf(NumberFormatException.class);
    }

}
