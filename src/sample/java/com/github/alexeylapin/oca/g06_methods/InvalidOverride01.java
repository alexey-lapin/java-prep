package com.github.alexeylapin.oca.g06_methods;

class A {

    short method() {
        return 1;
    }

}

class B extends A {

    @Override
    byte method() {
        return 2;
    }

}

class C extends A {

    @Override
    short method() {
        return 3;
    }
}

public class InvalidOverride01 {
}
