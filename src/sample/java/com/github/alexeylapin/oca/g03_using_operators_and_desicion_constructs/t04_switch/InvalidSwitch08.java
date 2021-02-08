package com.github.alexeylapin.oca.g03_using_operators_and_desicion_constructs.t04_switch;

import java.util.concurrent.Callable;

// cases must not be duplicated

class InvalidSwitch08 implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        int result = 0;

        switch (200) {
            case 200:
                result++;
            case 20_0: // must not duplicate
                result++;
            case 2_00: // must not duplicate
                result++;
        }

        return result;
    }

}