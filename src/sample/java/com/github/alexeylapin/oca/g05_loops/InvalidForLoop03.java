package com.github.alexeylapin.oca.g05_loops;

public class InvalidForLoop03 implements Runnable {

    // false compile time const fails compilation

    @Override
    public void run() {
        for (; !true; ) {
            System.out.println("qwer");
        }
    }

}
