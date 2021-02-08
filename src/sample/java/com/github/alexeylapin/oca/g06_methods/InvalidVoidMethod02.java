package com.github.alexeylapin.oca.g06_methods;

public class InvalidVoidMethod02 {

    void m() {
        return;
        // unreachable
        System.out.println("hello after return");
    }
    
}
