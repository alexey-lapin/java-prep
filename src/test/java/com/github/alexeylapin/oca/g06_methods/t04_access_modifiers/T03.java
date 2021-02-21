package com.github.alexeylapin.oca.g06_methods.t04_access_modifiers;

import com.github.alexeylapin.oca.g06_methods.t04_access_modifiers.sub.T03A;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class T03C extends T03 {
}

public class T03 extends T03A {
    @Test
    void name() {
        T03A a = new T03A();

        // assertThat(a.m1()).isEqualTo(1); // not visible
        // assertThat(a.m2()).isEqualTo(2); // not visible
        // assertThat(a.m3()).isEqualTo(3); // not visible
        assertThat(a.m4()).isEqualTo(4);
    }

    @Test
    void name2() {
        T03 a = new T03();

        // assertThat(a.m1()).isEqualTo(1); // not visible
        // assertThat(a.m2()).isEqualTo(2); // not visible
        assertThat(a.m3()).isEqualTo(3);
        assertThat(a.m4()).isEqualTo(4);
    }

    @Test
    void name3() {
        T03C a = new T03C();

        // assertThat(a.m1()).isEqualTo(1); // not visible
        // assertThat(a.m2()).isEqualTo(2); // not visible
        assertThat(a.m3()).isEqualTo(3);
        assertThat(a.m4()).isEqualTo(4);
    }
}
