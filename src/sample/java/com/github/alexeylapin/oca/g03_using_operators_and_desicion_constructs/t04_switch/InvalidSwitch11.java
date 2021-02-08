package com.github.alexeylapin.oca.g03_using_operators_and_desicion_constructs.t04_switch;

import java.util.concurrent.Callable;

// switch does not accept declarations

class InvalidSwitch11 implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        int result = 0;

        switch ( int a = 1){ // declaration is not allowed
            case 1:
                result++;
        }

        return result;
    }

}