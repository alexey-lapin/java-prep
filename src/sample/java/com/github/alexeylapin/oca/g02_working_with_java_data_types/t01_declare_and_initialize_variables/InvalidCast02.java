package com.github.alexeylapin.oca.g02_working_with_java_data_types.t01_declare_and_initialize_variables;

public class InvalidCast02 implements Runnable {

    @Override
    public void run() {
        char c = 97;
        short s = c;
    }

}
