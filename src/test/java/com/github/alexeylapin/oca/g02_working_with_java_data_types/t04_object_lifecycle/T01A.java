package com.github.alexeylapin.oca.g02_working_with_java_data_types.t04_object_lifecycle;

public class T01A {

    private final int i;

    public T01A(int i) {
        this.i = i;
    }

    @Override
    public String toString() {
        return "Container{" + "i=" + i + '}';
    }
}
