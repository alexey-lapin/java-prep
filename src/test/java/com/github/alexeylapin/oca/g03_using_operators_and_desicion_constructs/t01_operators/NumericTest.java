package com.github.alexeylapin.oca.g03_using_operators_and_desicion_constructs.t01_operators;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class NumericTest {


    @Test
    void name() {
        byte b = Byte.MAX_VALUE; // 127

        assertThat(b + 1).isEqualTo(128);
    }

    @Test
    void name2() {
        int i = Integer.MAX_VALUE; // 2147483647

        assertThat(i + 1).isEqualTo(Integer.MIN_VALUE);
    }

    @Test
    void name3() {
        int i = Integer.MAX_VALUE; // 2147483647

        assertThat(i + 1L).isEqualTo(2147483648L);
    }
}
