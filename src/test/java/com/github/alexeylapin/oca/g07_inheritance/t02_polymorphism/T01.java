package com.github.alexeylapin.oca.g07_inheritance.t02_polymorphism;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

// private methods are not inherited
// private methods are not polymorphic

abstract class T01A {

    private int m() {
        return 1;
    }

    @Test
    void name1() {
        T01A a = new T01B();

        assertThat(a.m()).isEqualTo(1);
    }

    @Test
    void name2() {
        T01B b = new T01B();

        assertThat(b.m()).isEqualTo(2);
    }

}

class T01B extends T01A {

    protected int m() {
        return 2;
    }

}
