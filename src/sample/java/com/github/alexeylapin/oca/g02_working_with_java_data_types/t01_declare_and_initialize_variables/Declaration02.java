package com.github.alexeylapin.oca.g02_working_with_java_data_types.t01_declare_and_initialize_variables;

import java.util.concurrent.Callable;

public class Declaration02 implements Callable<String> {

    final String s;

    public Declaration02(String s) {
        this.s = s;
    }

    @Override
    public String call() throws Exception {
        return s;
    }

}
