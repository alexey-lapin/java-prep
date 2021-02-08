package com.github.alexeylapin.oca;

public interface N07_InterfaceDefinition {

    String var1 = "value1";                   // interface variables are implicitly public static

    public static String var2 = "value2";     // redundant public static modifiers



    void behave1();                     // interface methods are implicitly public abstract

    public abstract void behave2();     // redundant public abstract modifiers



    default void behave3() {            // default interface methods are implicitly public
    }

    public default void behave4() {     // redundant public modifier
    }

    //private default void behave5() {  // fail! - in java 8 can't have private methods
    //}

    //protected default void behave6() {// fail! - in java 8 can't have protected methods
    //}

}
