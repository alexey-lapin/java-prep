package com.github.alexeylapin.oca.g02_working_with_java_data_types.t05_wrapper_classes;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * new Boolean(boolean)
 * new Boolean(String)
 *
 * parseBoolean()
 *
 */
public class T_Boolean {

    @Test
    void name() {
        Boolean v = new Boolean(true);
    }

    @Test
    void name2() {
        Boolean v = new Boolean("true");

        assertThat(v).isTrue();
    }

    @Test
    void name3() {
        assertThat(new Boolean(null)).isFalse();
        assertThat(new Boolean("")).isFalse();
        assertThat(new Boolean(" ")).isFalse();
        assertThat(new Boolean("true ")).isFalse();
    }

    @Test
    void name4() {
        assertThat(Boolean.parseBoolean("true")).isTrue();
    }

    @Test
    void name5() {
        assertThat(Boolean.parseBoolean(null)).isFalse();
        assertThat(Boolean.parseBoolean("")).isFalse();
        assertThat(Boolean.parseBoolean(" ")).isFalse();
        assertThat(Boolean.parseBoolean("true ")).isFalse();
    }
}
