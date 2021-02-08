package com.github.alexeylapin.oca.g06_methods.t03_constructors;

import org.junit.jupiter.api.Test;

class ZZ2 {
    public ZZ2() {
        int i = 1/0;
    }
}


// to delete

public class Sample07 {

    @Test
    void name() {
        new ZZ2();
    }
}
