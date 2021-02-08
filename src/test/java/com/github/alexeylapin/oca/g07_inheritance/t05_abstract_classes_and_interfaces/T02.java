package com.github.alexeylapin.oca.g07_inheritance.t05_abstract_classes_and_interfaces;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

// sub class can be abstract
// sub class can override concrete method with abstract method

abstract class ACA02 {
    abstract int m();
}

class CB02 extends ACA02 {
    @Override
    int m() {
        return 2;
    }
}

abstract class ACC02 extends CB02 {
    @Override
    abstract int m();
}

class CD04 extends ACC02 {
    @Override
    int m() {
        return 3;
    }
}

public class T02 {
    @Test
    void name() {
        CD04 d = new CD04();

        assertThat(d.m()).isEqualTo(3);
    }
}
