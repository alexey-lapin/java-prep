package com.github.alexeylapin.oca.g06_methods.t02_static;

// static methods cannot be invoked on interface instances
// https://stackoverflow.com/questions/34709082/illegal-static-interface-method-call/34709162#comment57183849_34709162

interface A2 {

    static void method() {
    }

}

class Sample1 {

    void test() {
        A2 a = null;
        a.method();
    }

}
