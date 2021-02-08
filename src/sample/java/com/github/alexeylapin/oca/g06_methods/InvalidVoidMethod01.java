package com.github.alexeylapin.oca.g06_methods;

public class InvalidVoidMethod01 {

    void m() {
        ;
        ;;;
        ;;
        return;
        // unreachable
        ;
    }

}
