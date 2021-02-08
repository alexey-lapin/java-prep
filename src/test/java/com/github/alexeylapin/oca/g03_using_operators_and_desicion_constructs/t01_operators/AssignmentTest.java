package com.github.alexeylapin.oca.g03_using_operators_and_desicion_constructs.t01_operators;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AssignmentTest {

    @Test
    void name() {
        int a, b, c;
        a = b = c = 3;
        a = (b = (c = 3));
    }

    @Test
    void name2() {
        int a, b = 0;
        boolean bool;
        a = (bool = true) ? b = 10 : 11;

        assertThat(a).isEqualTo(10);
        assertThat(b).isEqualTo(10);
    }

    @Test
    void name3() {
        int a, b = 0;
        boolean bool;
        a = (bool = false) ? b = 10 : 11;

        assertThat(a).isEqualTo(11);
        assertThat(b).isEqualTo(0);
    }
}
