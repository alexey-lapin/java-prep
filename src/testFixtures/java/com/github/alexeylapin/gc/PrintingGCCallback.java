package com.github.alexeylapin.gc;

import java.util.function.Consumer;

public class PrintingGCCallback implements Consumer<String> {

    private static final PrintingGCCallback instance = new PrintingGCCallback();

    public static PrintingGCCallback instance() {
        return instance;
    }

    private PrintingGCCallback() {
    }

    @Override
    public void accept(String s) {
        System.out.println("object " + s + " was garbage collected");
    }

}
