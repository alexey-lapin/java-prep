package com.github.alexeylapin.oca.g07_inheritance.t03_casting;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

class T01A {
}

public class T01 {

    @Test
    void name() {
        Throwable throwable = catchThrowable(() -> {
            List<String> list = new ArrayList<>();
            T01A a = (T01A) list;
        });

        assertThat(throwable).isInstanceOf(ClassCastException.class);
    }

}
