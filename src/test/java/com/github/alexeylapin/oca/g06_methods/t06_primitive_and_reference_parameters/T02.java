package com.github.alexeylapin.oca.g06_methods.t06_primitive_and_reference_parameters;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class T02A {

    void m1(StringBuilder sb) {
        sb.append("1");
    }

}

public class T02 {

    @Test
    void name() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("0");

        new T02A().m1(stringBuilder);

        assertThat(stringBuilder.toString()).isEqualTo("01");
    }

}
