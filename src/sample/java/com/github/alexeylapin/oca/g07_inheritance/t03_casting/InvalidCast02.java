package com.github.alexeylapin.oca.g07_inheritance.t03_casting;

interface A02 {
}

class B02 {
}

final class C02 {
}

public class InvalidCast02 implements Runnable {

    @Override
    public void run() {
        A02 a = null;

        B02 b = (B02) a;

        C02 c = (C02) a;
    }

}
