package com.github.alexeylapin.oca.g01_basics.t01_scope_of_variables;

import org.junit.jupiter.api.Test;

public class T01 {

    @Test
    void name() {
        int i = 1;
    }

    @Test
    void name2() {
        if (true) {
            int i = 1;
        }
    }

    @Test
    void name3() {
        for (int i = 0; i < 5; i++) {
            int j;
        }
    }

    @Test
    void name4() {
        try {
            int i;
        } catch (Exception ex) {
            int i;
        } finally {
            int i;
        }
    }

    @Test
    void name5() {
        {
            int i;
        }
    }

}
