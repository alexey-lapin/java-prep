package com.github.alexeylapin.oca.g03_using_operators_and_desicion_constructs.t04_switch;

import java.util.concurrent.Callable;

// every case constant must be assignable to the type of switch expression

class InvalidSwitch03 implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        int result = 0;

        byte a = 2;
        switch (a) {
            case (long) 0:
                result = 0;
            case (long) 127:
                result = 127;
        }

        return result;
    }

}