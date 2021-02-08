package com.github.alexeylapin.oca.g06_methods.t03_constructors;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

// bad code
// constructor uses method that can be overridden

class S022A {

    int i = 0;

    public S022A() {
        i = method();
    }

    int method() {
        return 1;
    }

}

class S022B extends S022A {

    int s = 10;

    @Override
    int method() {
        return s;
    }

}

public class Sample02_ {

    @Test
    void name() {
        S022A a = new S022A();

        assertThat(a.i).isEqualTo(1);
    }

    @Test
    void name2() {
        S022B a = new S022B();

        assertThat(a.i).isEqualTo(0);
    }
}
