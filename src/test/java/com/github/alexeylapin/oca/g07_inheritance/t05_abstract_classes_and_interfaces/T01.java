package com.github.alexeylapin.oca.g07_inheritance.t05_abstract_classes_and_interfaces;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

interface I01 {
    default int m() {
        return 1;
    }
}

abstract class ACA01 {
    public int m() {
        return 2;
    }
}

class CA01 extends ACA01 implements I01 {
}

public class T01 {

    @Test
    void name1() {
        CA01 a = new CA01();

        assertThat(a.m()).isEqualTo(2);
    }

}
