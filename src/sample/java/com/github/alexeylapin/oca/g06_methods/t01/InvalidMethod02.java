package com.github.alexeylapin.oca.g06_methods.t01;

import java.io.FileNotFoundException;
import java.io.IOException;

class A2 {

    void method() throws IOException {
    }

}

class B2 extends A2 {

    @Override
    void method() throws Exception {
    }

}

class C2 extends A2 {

    @Override
    void method() throws FileNotFoundException {
    }

}
