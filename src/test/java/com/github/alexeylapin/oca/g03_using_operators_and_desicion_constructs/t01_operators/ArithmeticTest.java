package com.github.alexeylapin.oca.g03_using_operators_and_desicion_constructs.t01_operators;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ArithmeticTest {

    @Test
    void name() {
//        int i = true + true;
    }

    @Test
    void name2() {
        int i = 1;

        assertThat(i++).isEqualTo(1);
        assertThat(i).isEqualTo(2);
    }

    @Test
    void name3() {
        int i = 1;

        assertThat(++i).isEqualTo(2);
        assertThat(i).isEqualTo(2);
    }

    @Test
    void name4() {
        // 5++; invalid
        // ++5; invalid
        int a = 1, b = 2;
        // (a + b)++ invalid
        // ++(a + b) invalid
    }

    @Test
    void name5() {
        int a = 0;
        System.out.println(a + a++ - a--);
    }

}
