package com.github.alexeylapin.oca.g02_working_with_java_data_types.t03_object_fields;

public class SampleClass {

    static int staticVar1;
    static int staticVar2;

    static {
        staticVar1 = 1;
    }

    int var1;
    int var2;

    {
        var1 = 2;
    }

}
