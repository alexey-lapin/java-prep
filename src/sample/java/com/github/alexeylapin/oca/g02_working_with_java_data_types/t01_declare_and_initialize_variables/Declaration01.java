package com.github.alexeylapin.oca.g02_working_with_java_data_types.t01_declare_and_initialize_variables;

import java.util.concurrent.Callable;

public class Declaration01 implements Callable<String> {

    final String s = "final";

    @Override
    public String call() throws Exception {
        return s;
    }

}
