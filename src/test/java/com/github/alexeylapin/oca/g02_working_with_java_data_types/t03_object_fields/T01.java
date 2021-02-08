package com.github.alexeylapin.oca.g02_working_with_java_data_types.t03_object_fields;

import org.junit.jupiter.api.Test;

public class T01 {

    @Test
    void name() {
        SampleClass s = null;
        s.staticVar1 = 1;
        s.var1 = 1;
    }

    @Test
    void name2() {
        ((SampleClass) null).staticVar1 = 1;
    }

}
