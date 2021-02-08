package com.github.alexeylapin.oca.g06_methods.t02_static;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class T02 {

    @Test
    void name() {
        assertThat(A.method()).isEqualTo(1);
    }

    @Test
    void name2() {
        assertThat(B.method()).isEqualTo(2);
    }

    @Test
    void name3() {
        A a = new A();
        assertThat(a.method()).isEqualTo(1);
    }

    @Test
    void name4() {
        A a = new B();
        assertThat(a.method()).isEqualTo(1);
    }

    @Test
    void name5() {
        assertThat(C.method()).isEqualTo(1);
    }

    @Test
    void name6() {
        C c = new C();
        assertThat(c.method()).isEqualTo(1);
    }

}

class A {
    static int method() {
        return 1;
    }
}

class B extends A {
    static int method() {
        return 2;
    }
}

class C extends A {
}
