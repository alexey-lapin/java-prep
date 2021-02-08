package com.github.alexeylapin.oca.g08_java_api.t01_string_builder;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

public class T02 {

    @Test
    void name() {
        StringBuilder sb = new StringBuilder();

        sb.length();
        assertThat(sb.length()).isEqualTo(0);

    }

    @Test
    void name2() {
        StringBuilder sb = new StringBuilder();

        String s = null;
        sb.append(s);

        assertThat(sb.length()).isEqualTo(4);
        assertThat(sb.toString()).isEqualTo("null");
    }

    @Test
    void name3() {
        StringBuilder sb = new StringBuilder();

        sb.append("1");
        sb.append("2");
        sb.append("3");
        sb.append("4");

        sb.replace(4, 4, "hello");

        assertThat(sb.toString()).isEqualTo("1234hello");
    }

    @Test
    void name4() {
        StringBuilder sb = new StringBuilder();

        sb.append("1");
        sb.append("2");
        sb.append("3");
        sb.append("4");

        Throwable throwable = catchThrowable(() -> sb.replace(5, 5, "hello"));

        assertThat(throwable).isInstanceOf(StringIndexOutOfBoundsException.class);
    }


}
