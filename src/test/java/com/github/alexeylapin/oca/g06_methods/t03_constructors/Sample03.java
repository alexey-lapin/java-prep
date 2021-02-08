package com.github.alexeylapin.oca.g06_methods.t03_constructors;

import org.junit.jupiter.api.Test;

class A3 {

    A3() {
        report("constructor");
    }

    {
        report("block 1");
    }

    String f1 = report("f1");

    {
        report("block 2");
    }

    String f2 = report("f2");

    static String s1 = report("s1");

    static {
        report("static block 1");
    }

    static String s2 = report("s2");

    static String report(String name) {
        System.out.println("init(" + name + ")");
        return name;
    }

}

class T03 {

    @Test
    void name() throws Exception {
//        Object o = A3.class.getDeclaredField("s1").get(null);
//        System.out.println(A3.class);

        new A3();
    }

}
