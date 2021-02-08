package com.github.alexeylapin.oca.g03_using_operators_and_desicion_constructs.t02_equality;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class T01 {

    @Test
    void puzzler() {
        String str1 = "one";
        String str2 = "two";

        boolean equals = str1.equals(str1 = str2);

        assertThat(equals).isEqualTo(false);
    }

}
