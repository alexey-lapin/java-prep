package com.github.alexeylapin.oca.g02_working_with_java_data_types.t01_declare_and_initialize_variables;

public class InvalidDeclaration07 implements Runnable {

    // multi variable assignment requires declaration

    @Override
    public void run() {
        int k = l = 0;

        int i, j, m = i = j = 0;
    }

}
