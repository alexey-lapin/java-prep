package com.github.alexeylapin.oca.g02_working_with_java_data_types.t01_declare_and_initialize_variables;

public class InvalidCast03 implements Runnable {

    @Override
    public void run() {
        short s = 97;
        char c = s;
    }

}
