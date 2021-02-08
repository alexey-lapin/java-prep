package com.github.alexeylapin.oca.g04_arrays.t01;

public class InvalidArrayInitialization03 implements Runnable {

    // the upper-level dimension must be defined when no initializer block used

    @Override
    public void run() {
        int[][] arr1 = new int[1][];
        int[][] arr2 = new int[][1];

        int[][][][][] arr3 = new int[5][][][][];
        int[][][][][] arr4 = new int[5][4][][][];
        int[][][][][] arr5 = new int[5][4][3][][];
        int[][][][][] arr6 = new int[5][4][3][2][];
        int[][][][][] arr7 = new int[5][4][3][2][1];

        int[][][][][] arr8 = new int[][4][3][2][1];
        int[][][][][] arr9 = new int[5][][3][2][1];
        int[][][][][] arr10 = new int[5][4][][][1];
    }

}
