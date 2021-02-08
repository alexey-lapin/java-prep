package com.github.alexeylapin.oca.g06_methods.t01;

import org.junit.jupiter.api.Test;

public class T01 {

    @Test
    void name() {
        new Sample07().m1();
        new Sample07().m1(1);
        new Sample07().m1(1, 2);
        new Sample07().m1(1, 2, 42);
    }

}
