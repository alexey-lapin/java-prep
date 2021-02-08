package com.github.alexeylapin.oca.g06_methods.t03_constructors;

import org.junit.jupiter.api.Test;

class Ex4A {

    Ex4A() {
        System.out.println("Ex4A");
    }

}

class Ex4B extends Ex4A {

    Ex4B() {
    }

}

class Ex4C extends Ex4A {

    Ex4C() {
        super();
    }

}

public class Sample04 {

    @Test
    void name1() {
        new Ex4B();
    }

    @Test
    void name2() {
        new Ex4C();
    }

}
