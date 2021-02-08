package com.github.alexeylapin.oca.g06_methods.t04_access_modifiers;

import com.github.alexeylapin.oca.g06_methods.t04_access_modifiers.sub01.Sample01;

class InvalidAccess01 {

    void method() {
        Sample01 s = new Sample01();
        int i = s.i2;
    }

}

class InvalidAccess02 extends Sample01 {

    void method1() {
        Sample01 s = new InvalidAccess02();
        int i = s.i2;
    }

    void method2() {
        InvalidAccess02 s = new InvalidAccess02();
        int i = s.i2;
    }

}
