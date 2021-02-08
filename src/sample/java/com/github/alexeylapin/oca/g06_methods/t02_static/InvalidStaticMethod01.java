package com.github.alexeylapin.oca.g06_methods.t02_static;

// static methods do not take part in polymorphism

class A1 {

    static void method() {
    }

}

class B1 extends A1 {

    @Override
    static void method() {
    }

}