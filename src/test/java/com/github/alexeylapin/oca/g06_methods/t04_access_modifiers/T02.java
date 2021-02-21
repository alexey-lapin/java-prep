package com.github.alexeylapin.oca.g06_methods.t04_access_modifiers;

import com.github.alexeylapin.oca.g06_methods.t04_access_modifiers.sub.T02A;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class T02 {
    @Test
    void name() {
        T02A a = new T02A();

        // assertThat(a.m1()).isEqualTo(1); // not visible
        // assertThat(a.m2()).isEqualTo(2); // not visible
        // assertThat(a.m3()).isEqualTo(3); // not visible
        assertThat(a.m4()).isEqualTo(4);
    }
}
