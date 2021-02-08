package com.github.alexeylapin.oca.g05_loops;

public class InvalidForLoop01 implements Runnable {

    // infinite loop fails compilation

    @Override
    public void run() {
        for (; ; ) {
        }
        System.out.println("hello");
    }

}
