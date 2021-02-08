package com.github.alexeylapin.oca.g05_loops;

public class InvalidForLoop04 implements Runnable {

    // false compile time const fails compilation

    @Override
    public void run() {
        final boolean b = false;
        for (; b; ) {
            System.out.println("qwer");
        }
    }

}
