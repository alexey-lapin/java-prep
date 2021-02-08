package com.github.alexeylapin.oca;

import org.joor.ReflectException;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.github.alexeylapin.assertion.CompilationAssert.assertThat;
import static com.github.alexeylapin.assertion.CompilationAssert.compilation;
import static org.assertj.core.api.Assertions.assertThat;
import static com.github.alexeylapin.reflect.ClassResource.fromPackage;
import static com.github.alexeylapin.reflect.ClassResource.setBasePackage;
import static org.assertj.core.api.Assertions.catchThrowable;

public class CompTest {

    @BeforeAll
    static void beforeAll() {
        setBasePackage("com.github.alexeylapin.oca");
    }

    @Test
    void name1() {
        Throwable throwable = catchThrowable(() -> fromPackage("p1").ofClass("NewClass").compile());

        assertThat(throwable).isInstanceOf(ReflectException.class);
        assertThat(throwable).hasMessageStartingWith("Compilation error");
    }

    @Test
    void name2() {
        Throwable throwable = catchThrowable(() -> fromPackage("p1").ofClass("V1").compile());

        assertThat(throwable).isInstanceOf(ReflectException.class);
        assertThat(throwable).hasMessageStartingWith("Compilation error");
        System.out.println(throwable.getMessage());
    }

    @Test
    void name3() {
//        Reflect compile1 = fromPackage("p1").ofPackage("sub").ofClass("V3").compile();
//        Reflect compile2 = fromPackage("p1").ofClass("V4").compile();
//        Reflect reflect = compile2.create();
//        Object o = reflect.get();
//        System.out.println(o);
//        System.out.println(reflect.call("m2").get().toString());
//        Throwable throwable = catchThrowable(() -> fromPackage("p1").ofClass("V4").compile());

//        assertThat(throwable).isInstanceOf(ReflectException.class);
//        assertThat(throwable).hasMessageStartingWith("Compilation error");
//        System.out.println(throwable.getMessage());
//
//        assertCompilationFailure(() -> fromPackage("p1").ofClass("V4").compile());

        assertThat(compilation(fromPackage("p1").ofClass("V4"))).succeeds();
    }

}
