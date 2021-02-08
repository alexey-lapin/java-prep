package com.github.alexeylapin.oca.g04_arrays.t01;

public class InvalidArrayInitialization01 implements Runnable {

    // size is not allowed when array initializer is used

    @Override
    public void run() {
        //@formatter:off
        int[] arr1 = new int[]{1};
        int[] arr2 = new int[1]{1};
        //@formatter:on
    }

}
