package com.github.alexeylapin.oca.g07_inheritance.t01_inheritance;

import org.junit.jupiter.api.Test;

class T01A {
    static String s1 = T01.report("A: static s1");

    {
        T01.report("A: block1");
    }

    String a1 = T01.report("A: a1");

    static {
        T01.report("A: static block1");
    }

    public T01A() {
        T01.report("A: T01A()");
    }
}

class T01B extends T01A {
    static String s2 = T01.report("B: static s2");

    {
        T01.report("B: block2");
    }

    String a2 = T01.report("B: a2");

    static {
        T01.report("B: static block2");
    }

    public T01B() {
        T01.report("B: T01B()");
    }
}

class T01C extends T01B {
    static String s3 = T01.report("C: static s3");

    {
        T01.report("C: block3");
    }

    String a3 = T01.report("C: a3");

    static {
        T01.report("C: static block3");
    }

    public T01C() {
        T01.report("C: T01C()");
    }
}

public class T01 {

    static String report(String name) {
        System.out.println("init(" + name + ")");
        return name;
    }

    @Test
    void name() {
        new T01A();
    }

    @Test
    void name2() {
        new T01B();
    }

    @Test
    void name3() {
        new T01C();
    }
}
