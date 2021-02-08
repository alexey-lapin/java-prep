package com.github.alexeylapin.oca.g05_loops.t01;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class T01 {

    @Test
    void name0() {
        int s = 0;
        for (int i = 0; i < 5; i++) {
            s++;
        }

        assertThat(s).isEqualTo(5);
    }

    @Test
    void name() {
        int i = 0;
        int j = 0;
        for (; i < 3; i++) {
            j = i;
        }
        assertThat(i).isEqualTo(3);
        assertThat(j).isEqualTo(2);
    }

    @Test
    void name2() {
        l1:
        if (true) {
            break l1;
//            System.out.println();
        }

        int i;
        l2:
        i = 1;
        System.out.println("qq");
//        break l2;
    }

    /**
     * @see com.github.alexeylapin.oca.g05_loops.InvalidForLoop01
     */
    @Test
    void name4() {
        for (; ; ) {
            break; // it is not infinite loop
        }
        System.out.println("hello after loop");
    }

    /**
     * @see com.github.alexeylapin.oca.g05_loops.InvalidForLoop01
     */
    @Disabled("infinite loop")
    @Test
    void name5() {
        boolean b = true;
        for (; b; ) {
            System.out.println("hello from loop");
        }
        System.out.println("hello after loop"); // reachable
    }

    /**
     * @see com.github.alexeylapin.oca.g05_loops.InvalidForLoop01
     */
    @Disabled("infinite loop")
    @Test
    void name6() {
        final Boolean b = true;
        for (; b; ) {
            System.out.println("hello from loop");
        }
        System.out.println("hello after loop"); // reachable
    }

    @Test
    void name7() {
        final Boolean b = false;
        for (; b; ) {
            System.out.println("hello from loop");
        }
        System.out.println("hello after loop");
    }
}
