package com.github.alexeylapin.oca.g06_methods.t03_constructors;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

// bad code
// constructor uses method that can be overridden

class S023A {

    int i = 0;

    public S023A() {
        i = method();
    }

    int method() {
        return 1;
    }

}

class S023B extends S023A {

    final int s = 10;

    @Override
    int method() {
        return s;
    }

}

public class Sample02__ {

    @Test
    void name() {
        S023A a = new S023A();

        assertThat(a.i).isEqualTo(1);
    }

    @Test
    void name2() {
        S023B a = new S023B();

        assertThat(a.i).isEqualTo(10);
    }
}
