package com.github.alexeylapin.oca.g06_methods.t03_constructors;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

// bad code
// constructor uses method that can be overridden

class A {

    int i = 0;

    public A() {
        i = method();
    }

    int method() {
        return 1;
    }

}

class B extends A {

    @Override
    int method() {
        return 2;
    }

}

class Sample02 {

    @Test
    void name1() {
        A a = new A();

        assertThat(a.i).isEqualTo(1);
    }

    @Test
    void name() {
        B b = new B();

        assertThat(b.i).isEqualTo(2);
    }
}
