package com.github.alexeylapin.oca.g07_inheritance.t03_casting;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

interface A02 {
    int i = 10;
}

interface B02 {
    int i = 20;
}

class C02 implements A02, B02 {
}

public class T02 {

    @Test
    void name1() {
        C02 c = new C02();

        A02 a = (A02) c;
        assertThat(a.i).isEqualTo(10);
    }

    @Test
    void name2() {
        C02 c = new C02();

        B02 b = (B02) c;
        assertThat(b.i).isEqualTo(20);
    }

}
