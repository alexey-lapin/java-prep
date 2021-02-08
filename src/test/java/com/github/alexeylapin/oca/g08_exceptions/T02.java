package com.github.alexeylapin.oca.g08_exceptions;

import org.junit.jupiter.api.Test;

import java.io.IOException;

class CA02 {
    void m() throws IOException {
    }
}

class CB02 extends CA02{
    @Override
    void m() {
    }
}

public class T02 {

    @Test
    void name1() {
        CA02 a = new CA02();
        try {
            a.m();
        } catch (IOException ex) {
        }
    }

    @Test
    void name2() {
        CB02 b = new CB02();
        b.m();
    }

    @Test
    void name3() {
        CA02 a = new CB02();
        try {
            a.m();
        } catch (IOException ex) {
        }
    }

}
