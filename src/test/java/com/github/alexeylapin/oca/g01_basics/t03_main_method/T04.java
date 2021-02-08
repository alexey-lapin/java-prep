package com.github.alexeylapin.oca.g01_basics.t03_main_method;

// main method can be final

import com.github.alexeylapin.launcher.Result;
import org.junit.jupiter.api.Test;

import static com.github.alexeylapin.launcher.Launcher.launch;
import static org.assertj.core.api.Assertions.assertThat;

public class T04 {

    public static final void main(String[] args) {
        System.out.println("hello from final main method");
    }

}

class T04Test {
    @Test
    void name() {
        Result result = launch(T04.class);

        System.out.println(result.getOutput());
        assertThat(result.isSuccessful()).isTrue();
    }
}
