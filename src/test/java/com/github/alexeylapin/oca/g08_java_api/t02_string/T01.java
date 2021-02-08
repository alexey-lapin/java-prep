package com.github.alexeylapin.oca.g08_java_api.t02_string;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class T01 {

    @Test
    void name() {
        String string = "hello";

        assertThat(string == string.trim()).isTrue();
    }

    @Test
    void name2() {
        String string = "hello";

        assertThat(string == string.substring(0)).isTrue();
    }

    @Test
    void name3() {
        String string = "hello";

        assertThat(string == string.replace("z", "Z")).isTrue();
    }

    @Test
    void name4() {
        int[] arr = {1, 2, 3, 4, 5};
        String string = null;

        for (int i : arr) {
            string += i;
        }

        assertThat(string).isEqualTo("null12345");
    }

    @Test
    void name5() {
        assertThat("javeline".replace("e", "a")).isEqualTo("javalina");
    }

    @Test
    void name6() {
        assertThat("javeline".replace('e', 'a')).isEqualTo("javalina");
    }


}
