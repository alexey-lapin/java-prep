package com.github.alexeylapin.oca.g08_exceptions.t01;

import java.io.FileNotFoundException;
import java.io.IOException;

class CA04 {
    void m() throws IOException {
    }
}

class CB04 extends CA04 {
    @Override
    void m() {
    }
}

class CC04 extends CA04 {
    @Override
    void m() throws IOException {
    }
}

class CD04 extends CA04 {
    @Override
    void m() throws Exception {
    }
}
