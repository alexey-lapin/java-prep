package com.github.alexeylapin.oca.g01_basics.t01_scope_of_variables;

public class InvalidLocalVariable01 implements Runnable {

    @Override
    public void run() {
        int i;
        {
            int i;
        }
    }

}
