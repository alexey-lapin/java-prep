package com.github.alexeylapin.oca.g06_methods.t03_constructors;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

class ZZ {
    static {
        int a = 1/0;
    }
}


public class Sample06 {

    @Test
    void name() throws Throwable {
        Throwable throwable = catchThrowable(() -> new ZZ());

        assertThat(throwable).isInstanceOf(ExceptionInInitializerError.class);
    }
}
