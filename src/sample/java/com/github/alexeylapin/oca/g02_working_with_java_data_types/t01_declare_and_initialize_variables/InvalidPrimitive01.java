package com.github.alexeylapin.oca.g02_working_with_java_data_types.t01_declare_and_initialize_variables;

public class InvalidPrimitive01 implements Runnable{

    // default integral literal is int

    @Override
    public void run() {
        long l = 555_555_555_555; // exceeds Integer.MAX_VALUE
    }

}
