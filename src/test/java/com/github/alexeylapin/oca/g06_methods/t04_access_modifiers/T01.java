package com.github.alexeylapin.oca.g06_methods.t04_access_modifiers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class T01A {

    private int m1() {
        return 1;
    }

    int m2() {
        return 2;
    }

    protected int m3() {
        return 3;
    }

    public int m4() {
        return 4;
    }

    void m5(Object other) {
        // class can see private members of objects of the same class
        int a = ((T01A) other).m1();
    }

}


public class T01 {
    @Test
    void name() {
        T01A a = new T01A();

        // assertThat(a.m1()).isEqualTo(1); // not visible
        assertThat(a.m2()).isEqualTo(2); // visible in the same package
        assertThat(a.m3()).isEqualTo(3);
        assertThat(a.m4()).isEqualTo(4);
    }
}
