package com.github.alexeylapin.oca.g03_using_operators_and_desicion_constructs.t04_switch;

// switch requires body with curly braces {}

class InvalidSwitch01 implements Runnable {

    @Override
    public void run() {
        byte a = 2;
        switch (a) ;
    }

}