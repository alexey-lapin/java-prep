package com.github.alexeylapin.oca.g01_basics.t03_main_method;

// interfaces can have main method

import com.github.alexeylapin.launcher.Result;
import org.junit.jupiter.api.Test;

import static com.github.alexeylapin.launcher.Launcher.launch;
import static org.assertj.core.api.Assertions.assertThat;

public interface T06 {

    static void main(String[] args) {
        System.out.println("hello from interface main method");
    }

}

class T06Test {
    @Test
    void name() {
        Result result = launch(T06.class);

        System.out.println(result.getOutput());
        assertThat(result.isSuccessful()).isTrue();
    }
}
