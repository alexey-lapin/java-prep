package com.github.alexeylapin.oca.g04_arrays.t01;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.concurrent.atomic.AtomicInteger;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

public class T02 {

    @Test
    void name() {
        Object[] arr = {new Object(), new Object(), new Object()};

        assertThat(arr.length).isEqualTo(3);
        assertThat(arr.getClass().getName()).isEqualTo("[Ljava.lang.Object;");
    }

    @Test
    void name1() {
        Number[] arr = {1, new Integer(2), 3.7, new Double(4.2)};

        boolean b = arr[0] instanceof Integer;
        System.out.println(b);

        assertThat(arr.length).isEqualTo(4);
        assertThat(arr.getClass().getName()).isEqualTo("[Ljava.lang.Number;");
    }

    @Test
    void name2() {
        CharSequence[][] arr = {{"s1", "s2"}, {"s3"}};

        boolean b = arr[0][0] instanceof String;
        System.out.println(b);

        assertThat(arr.length).isEqualTo(2);
        assertThat(arr.getClass().getName()).isEqualTo("[[Ljava.lang.CharSequence;");
    }

    @Nested
    class NN {

        int[] getArray1() {
            return new int[1];
        }

        int[] getArray2() {
            throw new NullPointerException();
        }

        @Test
        void name3() {
            AtomicInteger i = new AtomicInteger(0);

            int i1 = getArray1()[i.getAndIncrement()]; // i++

            Throwable throwable = catchThrowable(() -> {
                int i2 = getArray2()[i.getAndIncrement()]; // increment won't execute
            });

            assertThat(i.get()).isEqualTo(1);
            assertThat(throwable).isInstanceOf(NullPointerException.class);
        }
    }

    @Nested
    class NN2 {

        int[] getArray1() {
            return new int[1];
        }

        int[] getArray2() {
            return null;
        }

        @Test
        void name3() {
            AtomicInteger i = new AtomicInteger(0);

            int i1 = getArray1()[i.getAndIncrement()]; // i++

            Throwable throwable = catchThrowable(() -> {
                int i2 = getArray2()[i.getAndIncrement()]; // increment will execute
            });

            assertThat(i.get()).isEqualTo(2);
            assertThat(throwable).isInstanceOf(NullPointerException.class);
        }
    }

    @Test
    void name4() {
        int[] arr = {(0), (1 + 1), (2) * 2};
    }

    @Test
    void name5() {
        int[] i = {1, 2, 3};

        int[][][] arr = new int[3][3][3];
        arr[0][0] = arr[0][1] = i;
    }

    @Nested
    class NNN {
        int index() {
            throw new IllegalArgumentException();
        }

        @Test
        void name() {
            int[] arr = null;

            Throwable throwable = catchThrowable(() -> {
                arr[index()]++;
            });

            assertThat(throwable).isInstanceOf(IllegalArgumentException.class);
        }
    }
}
