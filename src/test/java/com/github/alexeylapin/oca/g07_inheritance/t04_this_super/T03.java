package com.github.alexeylapin.oca.g07_inheritance.t04_this_super;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

interface A03 {
    default int m() {
        return 1;
    }
}

class B03 implements A03 {
    @Override
    public int m() {
        return 2;
    }
}

class C03 implements A03 {
    @Override
    public int m() {
        return A03.super.m();
    }
}

public class T03 {

    @Test
    void name() {
        C03 c = new C03();

        assertThat(c.m()).isEqualTo(1);
    }
}
