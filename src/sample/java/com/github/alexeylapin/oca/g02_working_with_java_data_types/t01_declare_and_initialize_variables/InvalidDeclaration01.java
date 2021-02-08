package com.github.alexeylapin.oca.g02_working_with_java_data_types.t01_declare_and_initialize_variables;

public class InvalidDeclaration01 implements Runnable {

    @Override
    public void run() {
        String 1abc; // identifier cannot start with digit
    }

}
