package com.github.alexeylapin.oca.g03_using_operators_and_desicion_constructs.t04_switch;

import java.util.concurrent.Callable;

// cases must not be duplicated

class InvalidSwitch07 implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        int result = 0;

        switch (2) {
            case 2:
                result++;
            case 2: // must not duplicate
                result++;
        }

        return result;
    }

}