package com.github.alexeylapin.oca.g07_inheritance.t03_casting;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class A03 {
    public int i = 1;
}

class B03 extends A03 {
    private int i = 2;
}

class C03 extends B03 {
}

public class T03 {

    @Test
    void name1() {
        A03 a = new A03();

        assertThat(a.i).isEqualTo(1);
    }

    @Test
    void name2() {
        B03 b = new B03();

        int i = ((A03)b).i;

        assertThat(i).isEqualTo(1);
    }

    @Test
    void name3() {
        C03 c = new C03();

        int i = ((A03)c).i;

        assertThat(i).isEqualTo(1);
    }
}
