package com.github.alexeylapin.oca.g02_working_with_java_data_types.t01_declare_and_initialize_variables;

public class InvalidPrimitive04 implements Runnable{

    @Override
    public void run() {
        byte b1 = 127;
        byte b2 = 128;

        short s1 = 32_767;
        short s2 = 32_768;

        char c1 = 65_535;
        char c2 = 65_536;

        int i1 = 2_147_483_647;
        int i2 = 2_147_483_648;

        float f1 = 3.4028235e+38f;
        float f2 = 3.4028235123e+38f;
        float f3 = 3.40282350000000000000000e+38f;
        float f4 = 3.4028236e+38f;

        long l1 = 9_223_372_036_854_775_807L;
        long l2 = 9_223_372_036_854_775_808L;
    }

}
