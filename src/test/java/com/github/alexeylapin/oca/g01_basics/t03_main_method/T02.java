package com.github.alexeylapin.oca.g01_basics.t03_main_method;

// declaration of main method with vararg

import com.github.alexeylapin.launcher.Result;
import org.junit.jupiter.api.Test;

import static com.github.alexeylapin.launcher.Launcher.launch;
import static org.assertj.core.api.Assertions.assertThat;

public class T02 {

    public static void main(String... args) {
        System.out.println("hello from main method with String... args");
    }

}

class T02Test {
    @Test
    void name() {
        Result result = launch(T02.class);

        System.out.println(result.getOutput());
        assertThat(result.isSuccessful()).isTrue();
    }
}
