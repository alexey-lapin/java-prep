package com.github.alexeylapin.oca.g02_working_with_java_data_types.t05_wrapper_classes;

import java.util.ArrayList;
import java.util.List;

public class Invalid01 implements Runnable {

    // compiler performs only a single-step conversion

    @Override
    public void run() {
        byte b = 2;
        short s = 3;
        int i = 4;
        long l = 5;
        float f = 6;
        double d = 7.8;
        List<Integer> list = new ArrayList<>();

        list.add(1); // int literal

        list.add(b);
        list.add((int) b);

        list.add(s);
        list.add((int) s);

        list.add(i);

        list.add(l);
        list.add((int) l);

        list.add(f);
        list.add((int) f);

        list.add(d);
        list.add((int) d);
    }

}
