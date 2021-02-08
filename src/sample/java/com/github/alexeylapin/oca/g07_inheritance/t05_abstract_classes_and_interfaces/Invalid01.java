package com.github.alexeylapin.oca.g07_inheritance.t05_abstract_classes_and_interfaces;

// clash

interface IA01 {
    default int m() {
        return 1;
    }
}

interface IB01 {
    default int m() {
        return 2;
    }
}

class CC01 implements IA01, IB01 {
}

class CD01 implements IA01, IB01 {
    @Override
    public int m() {
        return 3;
    }
}

public class Invalid01 {
}
