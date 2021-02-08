package com.github.alexeylapin.oca.g01_basics.t03_main_method;

// common declaration of main method

import com.github.alexeylapin.launcher.Result;
import org.junit.jupiter.api.Test;

import static com.github.alexeylapin.launcher.Launcher.launch;
import static org.assertj.core.api.Assertions.assertThat;


public class T01 {

    public static void main(String[] args) {
        System.out.println("hello from main method with String[] args");
    }

}

class T01Test {
    @Test
    void name() {
        Result result = launch(T01.class);

        System.out.println(result.getOutput());
        assertThat(result.isSuccessful()).isTrue();
    }
}

