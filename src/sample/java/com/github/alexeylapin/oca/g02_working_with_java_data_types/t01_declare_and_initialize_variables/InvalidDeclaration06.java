package com.github.alexeylapin.oca.g02_working_with_java_data_types.t01_declare_and_initialize_variables;

public class InvalidDeclaration06 implements Runnable {

    // multi variable declaration requires same type only at the beginning

    @Override
    public void run() {
        int i, int j;
        int m, long n;

        //formatter:off
        int k; int l;
        //formatter:on
    }

}
