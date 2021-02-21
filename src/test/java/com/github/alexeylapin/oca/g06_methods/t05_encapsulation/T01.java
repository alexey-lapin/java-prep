package com.github.alexeylapin.oca.g06_methods.t05_encapsulation;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

// good encapsulation: fields are private, state exposed through methods

class T01A {
    private int i;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
}

public class T01 {
    @Test
    void name() {
        T01A a = new T01A();

        // int j = a.i; // not visible
        a.setI(5);

        assertThat(a.getI()).isEqualTo(5);
    }
}
