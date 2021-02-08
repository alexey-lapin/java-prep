package com.github.alexeylapin.oca.g01_basics.t03_main_method;

// confusing overload

import com.github.alexeylapin.launcher.Result;
import org.junit.jupiter.api.Test;

import static com.github.alexeylapin.launcher.Launcher.launch;
import static org.assertj.core.api.Assertions.assertThat;

public class T03 {

    public static void main(String[][] args) {
        System.out.println("hello from main method with String[][] args");
    }

    public static void main(String args) {
        System.out.println("hello from main method with String args");
    }

    public static int main(int args) {
        return 0;
    }

}

class T03Test {
    @Test
    void name() {
        Result result = launch(T03.class);

        System.out.println(result.getOutput());
        assertThat(result.isSuccessful()).isFalse();
    }
}

