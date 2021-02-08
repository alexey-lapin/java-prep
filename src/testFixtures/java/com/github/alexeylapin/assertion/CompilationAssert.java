package com.github.alexeylapin.assertion;

import com.github.alexeylapin.reflect.ClassResource;
import org.assertj.core.api.AbstractAssert;
import org.assertj.core.api.Fail;
import org.assertj.core.api.ThrowableAssert;

import static org.assertj.core.api.Assertions.catchThrowable;

public class CompilationAssert extends AbstractAssert<CompilationAssert, ThrowableAssert.ThrowingCallable> {

    public CompilationAssert(ThrowableAssert.ThrowingCallable callable) {
        super(callable, CompilationAssert.class);
    }

    public static CompilationAssert assertThat(ThrowableAssert.ThrowingCallable callable) {
        return new CompilationAssert(callable);
    }

    public void fails() {
        Throwable throwable = catchThrowable(actual);
        if (throwable == null) {
            Fail.fail("Expecting code to throw an exception.");
        }
    }

    public void succeeds() {
        Throwable throwable = catchThrowable(actual);
        if (throwable != null) {
            Fail.fail("Expecting code not to throw an exception.");
        }
    }

//    public static void assertCompilationSuccess(ThrowableAssert.ThrowingCallable callable) {
//        Throwable throwable = catchThrowable(callable);
//
//        assertThat(throwable).isInstanceOf(ReflectException.class);
//        assertThat(throwable).hasMessageStartingWith("Compilation error");
//        System.out.println(throwable.getMessage());
//    }

//    public static void assertCompilationFailure(ThrowableAssert.ThrowingCallable callable) {
//        Throwable throwable = catchThrowable(callable);
//
//        assertThat(throwable).isInstanceOf(ReflectException.class);
//        assertThat(throwable).hasMessageStartingWith("Compilation error");
//        System.out.println(throwable.getMessage());
//    }

    public static ThrowableAssert.ThrowingCallable compilation(ClassResource classResource) {
        return classResource::compile;
    }

}
