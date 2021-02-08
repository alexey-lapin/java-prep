package com.github.alexeylapin.oca.g06_methods.t02_static;

// static interface methods are not inherited

interface A3 {

    static void method() {
    }

}

interface B3 extends A3 {

}

class Sample1 {

    void test() {
        A3.method();
        B3.method();
    }

}
