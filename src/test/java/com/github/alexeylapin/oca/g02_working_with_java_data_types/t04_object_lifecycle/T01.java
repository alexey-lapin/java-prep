package com.github.alexeylapin.oca.g02_working_with_java_data_types.t04_object_lifecycle;

import com.github.alexeylapin.gc.GCObserver;
import com.github.alexeylapin.gc.PrintingGCCallback;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class T01 {

    @Test
    void name2() {
        GCObserver gc = new GCObserver();

        Object o1 = gc.wrap(new Object(), PrintingGCCallback.instance());
        Object o2 = gc.wrap(new Object(), PrintingGCCallback.instance());

        o1 = null;
        o2 = null;

        gc.waitForGCAndFinalize(5, TimeUnit.SECONDS);
    }

    @Test
    void name3() {
        GCObserver gc = new GCObserver();

        Object o1 = gc.wrap(new T01A(1), PrintingGCCallback.instance());
        Object o2 = gc.wrap(new T01A(2), PrintingGCCallback.instance());
        Object o3 = gc.wrap(new T01A(3), PrintingGCCallback.instance());

        o1 = null;
        o2 = null;

        gc.waitForGCAndFinalize(5, TimeUnit.SECONDS);
    }

    @Test
    void name4() {
        GCObserver gc = new GCObserver();

        Arrays.asList(
                gc.wrap(new T01A(1), PrintingGCCallback.instance()),
                gc.wrap(new T01A(2), PrintingGCCallback.instance()),
                gc.wrap(new T01A(3), PrintingGCCallback.instance())
        );

        gc.waitForGCAndFinalize(5, TimeUnit.SECONDS);
    }
}
