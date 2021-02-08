package com.github.alexeylapin.oca.g03_using_operators_and_desicion_constructs.t01_operators;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringTest {

    @Test
    void name() {
        String str = "" + null;

        assertThat(str).isEqualTo("null");
    }

    @Test
    void name2() {
        String str = null + "";

        assertThat(str).isEqualTo("null");
    }

    @Test
    void name23() {
        String str = "" + 'a';

        assertThat(str).isEqualTo("a");
    }

    @Test
    void name3() {
//        String str = null + 'a';

//        assertThat(str).isEqualTo("null");
    }

    @Test
    void name4() {
        String str = "";

        str += 'a';

        assertThat(str).isEqualTo("null");
    }

    @Test
    void name5() {
        String str = "";

//        str += null + 'a';

//        assertThat(str).isEqualTo("null");
    }

}
