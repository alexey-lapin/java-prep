package com.github.alexeylapin.oca.g04_arrays.t01;

public class InvalidArrayInitialization04 implements Runnable {

    // array should be assignable to another array

    @Override
    public void run() {
        int[][][][] arr1 = new int[1][1][1][1];

        arr1[0][0][0][0] = 1;
        arr1[0][0][0] = new int[]{1};
        arr1[0][0] = new int[][]{{1}};
        arr1[0] = new int[][][]{{{1}}};
        arr1 = new int[][][][]{{{{1}}}};

        int[][][][] arr2 = new int[1][1][1][1];

        arr2[0][0][0][0] = new int[]{1};
        arr2[0][0][0] = new int[][]{{1}};
    }

}
