package com.github.alexeylapin.oca.g06_methods.t02_static;

import org.junit.jupiter.api.Test;
import com.github.alexeylapin.oca.g06_methods.t02_static.sub.Sample01;
import static com.github.alexeylapin.oca.g06_methods.t02_static.sub.Sample01.*;

public class T01 {

    static String s = "test";

    @Test
    void name() {
        String s1 = new T01().s;
        String s2 = ((T01)null).s;
    }
}
