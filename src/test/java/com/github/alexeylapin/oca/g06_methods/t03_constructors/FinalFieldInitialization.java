package com.github.alexeylapin.oca.g06_methods.t03_constructors;

class Option1 {

    final int i = 10;

}

class Option2 {

    final int i;

    {
        i = 20;
    }

}

class Option3 {

    final int i;

    Option3() {
        i = 30;
    }

}
