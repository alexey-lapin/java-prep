package com.github.alexeylapin.oca.g08_exceptions;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.IOException;

class CA01 {
    void m() throws IOException {
    }
}

class CB01 extends CA01 {
    @Override
    void m() {
    }
}

class CC01 extends CA01 {
    @Override
    void m() throws IOException {
    }
}

class CD01 extends CA01 {
    @Override
    void m() throws FileNotFoundException {
    }
}


public class T01 {

    @Test
    void name() {

    }

}
