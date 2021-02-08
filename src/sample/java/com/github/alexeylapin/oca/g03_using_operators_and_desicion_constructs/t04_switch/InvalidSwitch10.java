package com.github.alexeylapin.oca.g03_using_operators_and_desicion_constructs.t04_switch;

import java.util.concurrent.Callable;

// ever case must be compile time constant

class InvalidSwitch10 implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        int result = 0;

        String s1 = "s1";
        switch ("s1") {
            case s1: // must be compile time constant
                result++;
        }

        return result;
    }

}