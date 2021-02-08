package com.github.alexeylapin.oca.g07_inheritance.t04_this_super;

import org.junit.jupiter.api.Test;

class A01 {
    int a = this.a;
    int b = hashCode();
    int c = this.hashCode();
    int d = super.hashCode();
}

class Y01 {
    int i;

    int m() {
        return 1;
    }
}

class Y02 extends Y01 {
    int z = super.i;
    int m() {
        return super.m();
    }
}

public class T01 {

    @Test
    void name() {
        super.hashCode();
        A01 a = new A01();
        System.out.println(a.c);
        System.out.println(a.d);
    }

}
