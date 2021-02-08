package com.github.alexeylapin.oca.g06_methods.t03_constructors;


import org.junit.jupiter.api.Test;

class Ex05A {

    static int i;

    static {
        i = 1;
    }

}

class Ex05B extends Ex05A {

    static {
        i = 2;
    }

}

class Ex05C extends Ex05B {

    static {
        i = 3;
    }

}

public class Sample05 {

    @Test
    void name() {
        System.out.println(Ex05C.i);
    }

}


