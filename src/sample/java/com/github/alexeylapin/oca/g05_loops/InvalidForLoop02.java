package com.github.alexeylapin.oca.g05_loops;

public class InvalidForLoop02 implements Runnable {

    // false compile time const fails compilation

    @Override
    public void run() {
        for (; false; ) {
            System.out.println("qwer");
        }
    }

}
