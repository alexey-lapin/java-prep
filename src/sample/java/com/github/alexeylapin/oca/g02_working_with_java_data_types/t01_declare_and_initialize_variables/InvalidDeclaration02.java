package com.github.alexeylapin.oca.g02_working_with_java_data_types.t01_declare_and_initialize_variables;

public class InvalidDeclaration02 implements Runnable {

    // identifier can not use reserved keywords

    @Override
    public void run() {
        String switch;
        String goto;
        String if;
        String public;
    }

}
