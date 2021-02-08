package com.github.alexeylapin.oca; // package is applied to all classes in the same file

import java.time.LocalDate;

public class N09_MultiClass2 {
}

//class Class1 { fail! - conflict
//}

class Class3 {

    LocalDate method() {
        return null;
    }

}

//interface Interface1 { fail! - conflict
//}

interface Interface3 {

    LocalDate method();

}