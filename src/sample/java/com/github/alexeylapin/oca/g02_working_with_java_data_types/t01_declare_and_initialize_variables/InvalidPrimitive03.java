package com.github.alexeylapin.oca.g02_working_with_java_data_types.t01_declare_and_initialize_variables;

public class InvalidPrimitive03 implements Runnable{

    // default floating point literal is double

    @Override
    public void run() {
        double d1 = 10000_.00; // float can not contain double
        double d2 = 10000._00; // float can not contain double
        double d3 = _10000.00; // float can not contain double
        double d4 = 10000.00_; // float can not contain double
    }

}
