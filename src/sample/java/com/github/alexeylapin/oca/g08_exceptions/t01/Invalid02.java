package com.github.alexeylapin.oca.g08_exceptions.t01;

import java.io.IOException;

public class Invalid02 implements Runnable {

    void m() throws IOException {
    }

    @Override
    public void run() {
        try {
            m();
        } catch (Exception ex) {

        } catch (IOException ex) {
            // unreachable
            System.out.println("IOException");
        }
    }

}
