package com.github.alexeylapin.oca.g02_working_with_java_data_types.t01_declare_and_initialize_variables;

public class InvalidDeclaration03 implements Runnable {

    // final fields require initialization

    final String s;

    @Override
    public void run() {
        System.out.println(s);
    }

}
