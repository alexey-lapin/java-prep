package com.github.alexeylapin.oca.g08_exceptions.t01;


import java.io.IOException;

class Invalid01 implements Runnable {

    void m() throws IOException {
    }

    @Override
    public void run() {
        m();
    }

}
