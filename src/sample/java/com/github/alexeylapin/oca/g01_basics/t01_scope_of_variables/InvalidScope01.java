package com.github.alexeylapin.oca.g01_basics.t01_scope_of_variables;

public class InvalidScope01 implements Runnable {

    @Override
    public void run() {
        if (true) {
            int i = 1;
        }
        i = 2;

    }

}
