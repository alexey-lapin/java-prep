package com.github.alexeylapin.oca.g03_using_operators_and_desicion_constructs.t04_switch;

import java.util.concurrent.Callable;

// ever case must be compile time constant

class InvalidSwitch06 implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        int result = 0;

        final Integer b = new Integer(3);
        switch (new Integer(3)) {
            case 2:
                result++;
            case b: // must be compile time constant
                result++;
        }

        return result;
    }

}