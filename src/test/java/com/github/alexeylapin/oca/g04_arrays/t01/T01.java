package com.github.alexeylapin.oca.g04_arrays.t01;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

public class T01 {

    @Test
    void arrayDeclaration() {
        int[] arr1 = new int[0]; // common
        assertThat(arr1.getClass().getName()).isEqualTo("[I");

        //@formatter:off
        int []arr2 = new int[0];
        assertThat(arr2.getClass().getName()).isEqualTo("[I");
        int arr3[] = new int[0];
        assertThat(arr3.getClass().getName()).isEqualTo("[I");
        //@formatter:on
    }

    @Test
    void arrayObjectClassName() {
        assertThat(new byte[0].getClass().getName()).isEqualTo("[B");
        assertThat(new short[0].getClass().getName()).isEqualTo("[S");
        assertThat(new char[0].getClass().getName()).isEqualTo("[C");
        assertThat(new int[0].getClass().getName()).isEqualTo("[I");
        assertThat(new long[0].getClass().getName()).isEqualTo("[J");
        assertThat(new float[0].getClass().getName()).isEqualTo("[F");
        assertThat(new double[0].getClass().getName()).isEqualTo("[D");
        assertThat(new boolean[0].getClass().getName()).isEqualTo("[Z");
    }

    @Test
    void arrayClassName() {
        assertThat(byte[].class.getName()).isEqualTo("[B");
        assertThat(short[].class.getName()).isEqualTo("[S");
        assertThat(char[].class.getName()).isEqualTo("[C");
        assertThat(int[].class.getName()).isEqualTo("[I");
        assertThat(long[].class.getName()).isEqualTo("[J");
        assertThat(float[].class.getName()).isEqualTo("[F");
        assertThat(double[].class.getName()).isEqualTo("[D");
        assertThat(boolean[].class.getName()).isEqualTo("[Z");
    }

    @Test
    void arrayAssignment() {
        int[] arr1 = new int[3];
        int[] arr2 = new int[]{1, 2, 3};
        int[] arr3 = {1, new Integer(2), 3};
    }

    @Test
    void name111() {
        int[] arr = new int[1];

        boolean b = (Object) arr[0] instanceof Integer;
        System.out.println(b);
    }

    @Test
    void name1111() {
        Object bb = (byte) 10;
        System.out.println("is a Byte ?   " + (bb instanceof Byte));
        System.out.println("Check class = " + (bb.getClass()));
        System.out.println(bb);
    }

    @Test
    void name11111() {
        int[][] arr = new int[5][];

        Throwable throwable = catchThrowable(() -> {
            int i = arr[0][0]; // inner array should be initialized
        });

        assertThat(throwable).isInstanceOf(NullPointerException.class);
    }


    @Test
    void name2() {
        int[][] arr1 = new int[0][0];
        //@formatter:off
        int[] arr2[] = new int[0][];
        int []arr3[] = new int[0][];
        int arr4[][] = new int[0][];
        //@formatter:on

        int[][][] arr = new int[0][0][0];
        int[][] arr7[] = new int[0][][];

    }
}
