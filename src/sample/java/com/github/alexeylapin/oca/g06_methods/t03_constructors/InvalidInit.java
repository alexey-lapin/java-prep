package com.github.alexeylapin.oca.g06_methods.t03_constructors;

public class InvalidInit {

    static final int i;

    {
        i = 0;
    }

    static {
        i = 0;
    }

}
