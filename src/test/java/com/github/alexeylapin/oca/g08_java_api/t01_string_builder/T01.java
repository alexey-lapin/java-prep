package com.github.alexeylapin.oca.g08_java_api.t01_string_builder;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class T01 {

    @Test
    void name() {
        StringBuilder sb = new StringBuilder();

        assertThat(sb.capacity()).isEqualTo(16);
        assertThat(sb.toString()).isEqualTo("");
    }

    @Test
    void name2() {
        StringBuilder sb = new StringBuilder(5);

        assertThat(sb.capacity()).isEqualTo(5);
        assertThat(sb.toString()).isEqualTo("");
    }

    @Test
    void name3() {
        StringBuilder sb = new StringBuilder("hello");

        assertThat(sb.capacity()).isEqualTo("hello".length() + 16);
        assertThat(sb.toString()).isEqualTo("hello");
    }

    @Test
    void name4() {
        StringBuilder sb = new StringBuilder(new StringBuilder("hello"));

        assertThat(sb.capacity()).isEqualTo("hello".length() + 16);
        assertThat(sb.toString()).isEqualTo("hello");
    }

}
