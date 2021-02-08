package com.github.alexeylapin.oca.g01_basics.t03_main_method;

// abstract classes can have main method

import com.github.alexeylapin.launcher.Result;
import org.junit.jupiter.api.Test;

import static com.github.alexeylapin.launcher.Launcher.launch;
import static org.assertj.core.api.Assertions.assertThat;

public abstract class T05 {

    public static void main(String[] args) {
        System.out.println("hello from abstract class main method");
    }

}

class T05Test {
    @Test
    void name() {
        Result result = launch(T05.class);

        System.out.println(result.getOutput());
        assertThat(result.isSuccessful()).isTrue();
    }
}
