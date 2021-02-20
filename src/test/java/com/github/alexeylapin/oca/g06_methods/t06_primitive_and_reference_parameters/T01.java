package com.github.alexeylapin.oca.g06_methods.t06_primitive_and_reference_parameters;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class T01A {

    void m1(int i) {
        i++;
    }

    void m2(Integer i) {
        i++;
    }

}

public class T01 {

    @Test
    void name1() {
        int a = 1;
        new T01A().m1(a);

        assertThat(a == 1).isTrue();
    }

    @Test
    void name2() {
        Integer a = 1;
        new T01A().m2(a);

        assertThat(a == 1).isTrue();
    }

}
