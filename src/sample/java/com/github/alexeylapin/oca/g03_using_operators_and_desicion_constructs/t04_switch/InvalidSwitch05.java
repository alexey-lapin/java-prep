package com.github.alexeylapin.oca.g03_using_operators_and_desicion_constructs.t04_switch;

import java.util.concurrent.Callable;

// ever case must be compile time constant

class InvalidSwitch05 implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        int result = 0;

        switch (new Integer(3)) {
            case 2:
                result++;
            case new Integer(3): // must be compile time constant
                result++;
        }

        return result;
    }

}