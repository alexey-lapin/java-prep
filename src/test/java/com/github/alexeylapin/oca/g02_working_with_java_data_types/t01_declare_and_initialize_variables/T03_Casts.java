package com.github.alexeylapin.oca.g02_working_with_java_data_types.t01_declare_and_initialize_variables;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class T03_Casts {

    @Test
    void name1() {
        int i = 10;
        double d = i; // implicit cast
    }

    @Test
    void name2() {
        double d = 10;
        int i = (int) d; // explicit cast

        assertThat(i).isEqualTo(10);
    }

    @Test
    void name3() {
        double d = 10.4567;
        int i = (int) d; // explicit cast

        assertThat(i).isEqualTo(10);
    }

    @Test
    void name4() {
        double d = 10.789;
        int i = (int) d; // explicit cast

        assertThat(i).isEqualTo(10);
    }

    @Test
    void name5() {
        long l = 5_000_000_000L;
        int i = (int) l; // explicit cast

        assertThat(i).isNotEqualTo(5_000_000_000L);
    }

}
