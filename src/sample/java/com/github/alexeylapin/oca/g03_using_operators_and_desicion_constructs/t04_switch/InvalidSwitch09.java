package com.github.alexeylapin.oca.g03_using_operators_and_desicion_constructs.t04_switch;

import java.util.concurrent.Callable;

// case must not be literal null

class InvalidSwitch09 implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        int result = 0;

        switch ("s1") {
            case null:
                result++;
        }

        return result;
    }

}