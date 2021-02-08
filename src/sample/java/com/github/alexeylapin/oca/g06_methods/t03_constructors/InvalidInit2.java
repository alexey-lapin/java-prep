package com.github.alexeylapin.oca.g06_methods.t03_constructors;

public class InvalidInit2 {

    static {
        throw new NullPointerException();
    }

    {
        throw new NullPointerException();
    }

}
