package com.github.alexeylapin.oca.g06_methods.t03_constructors;

import java.io.FileNotFoundException;
import java.io.IOException;

class A {

    A() throws IOException {
    }

}

class B extends A {

    B() throws FileNotFoundException {
        super();
    }

}

class C extends A {

    C() throws FileNotFoundException {
    }

}

class D extends A {

    D() throws Exception {
        super();
    }

}
