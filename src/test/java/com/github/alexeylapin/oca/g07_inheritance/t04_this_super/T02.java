package com.github.alexeylapin.oca.g07_inheritance.t04_this_super;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class A02 {

    int m() {
        return 1;
    }
}

class B02 extends A02 {
    int i = super.m();

    @Override
    int m() {
        return 2;
    }
}

public class T02 {

    @Test
    void name() {
        B02 b = new B02();

        assertThat(b.i).isEqualTo(1);
    }
}
