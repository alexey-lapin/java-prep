package com.github.alexeylapin.oca.g06_methods.t01;

import java.io.FileNotFoundException;
import java.io.IOException;

// thrown exceptions can be specified in any order

public class Sample06 {

    void m1() throws Exception {
    }

    void m2() throws Exception, IOException, FileNotFoundException, NullPointerException {
    }

    void m3() throws FileNotFoundException, IOException, Exception, NullPointerException {
    }

}
