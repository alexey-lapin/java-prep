package com.github.alexeylapin.oca.g08_exceptions.t01;

import java.io.IOException;

// checked exceptions must be handled

public class Invalid03 implements Runnable {

    void m() {
        throw new IOException();
    }

    @Override
    public void run() {
        m();
    }

}
