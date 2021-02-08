package com.github.alexeylapin.oca.g04_arrays.t01;

public class InvalidArrayInitialization02 implements Runnable {

    // short initialization is not allowed on non-declaration line

    @Override
    public void run() {
        int[] arr1;
        arr1 = new int[]{1};

        int[] arr2;
        arr2 = {1, 2};

        int[] arr3 = {1, 2};
    }

}
