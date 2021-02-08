package com.github.alexeylapin.oca.g02_working_with_java_data_types.t01_declare_and_initialize_variables;

public class InvalidDeclaration04 implements Runnable {

    @Override
    public void run() {
        int i;
        System.out.println(i); // local variables must be explicitly initialized before use
    }

}
