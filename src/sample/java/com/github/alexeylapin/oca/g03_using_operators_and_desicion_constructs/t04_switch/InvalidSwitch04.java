package com.github.alexeylapin.oca.g03_using_operators_and_desicion_constructs.t04_switch;

import java.util.concurrent.Callable;

// every case must be compile time constant

class InvalidSwitch04 implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        int result = 0;

        int a = 2;
        int b = 3;
        switch (a) {
            case 2:
                result++;
            case b: // must be compile time constant
                result++;
        }

        return result;
    }

}