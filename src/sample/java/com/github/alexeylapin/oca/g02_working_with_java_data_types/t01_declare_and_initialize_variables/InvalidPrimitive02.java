package com.github.alexeylapin.oca.g02_working_with_java_data_types.t01_declare_and_initialize_variables;

public class InvalidPrimitive02 implements Runnable{

    // default floating point literal is double

    @Override
    public void run() {
        float l = 10.0; // float can not contain double
    }

}
