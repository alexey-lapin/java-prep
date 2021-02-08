package com.github.alexeylapin.oca.g07_inheritance.t03_casting;

class A01 {
}

class B01 {
}

public class Sample01 implements Runnable {

    @Override
    public void run() {
        A01 a = (A01) new B01();
    }

}
