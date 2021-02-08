package com.github.alexeylapin.oca.g05_loops.t01;

import org.junit.jupiter.api.Test;

public class T02 {

    @Test
    void name1() {
        int i = 0;
        do while (i < 5) i++; while (i < 5);
    }

    @Test
    void name2() {
        int i = 0;
        do while (i < 5) i++;
        while (i < 6);
    }

    @Test
    void name3() {
        int i = 0;
        do try {
            i++;
        } catch (Exception e) {
        }
        while (i < 6);
    }

}
