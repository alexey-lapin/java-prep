package com.github.alexeylapin.oca.g06_methods.t01;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class T02 {

    @Nested
    class C01 {

        String m(byte input) {
            return "byte";
        }

        @Test
        void name() {
            assertThat(m((byte) 0x1)).isEqualTo("byte");
        }

    }

    @Nested
    class C02 {

        String m(short input) {
            return "short";
        }

        @Test
        void name() {
            assertThat(m((byte) 1)).isEqualTo("short");
        }

    }

    @Nested
    class C03 {

        String m(char input) {
            return "char";
        }

        @Test
        void name() {
//            assertThat(m((byte) 1)).isEqualTo("short");
        }

    }

    @Nested
    class C04 {

        String m(int input) {
            return "int";
        }

        @Test
        void name() {
            assertThat(m((byte) 1)).isEqualTo("int");
        }

    }

    @Nested
    class C05 {

        String m(long input) {
            return "long";
        }

        @Test
        void name() {
            assertThat(m((byte) 1)).isEqualTo("long");
        }

    }

    @Nested
    class C06 {

        String m(float input) {
            return "float";
        }

        @Test
        void name() {
            assertThat(m((byte) 1)).isEqualTo("float");
        }

    }

    @Nested
    class C07 {

        String m(double input) {
            return "double";
        }

        @Test
        void name() {
            assertThat(m((byte) 1)).isEqualTo("double");
        }

    }

    @Nested
    class C08 {

        String m(Byte input) {
            return "Byte";
        }

        @Test
        void name() {
            assertThat(m((byte) 1)).isEqualTo("Byte");
        }

    }

    @Nested
    class C09 {

        String m(Short input) {
            return "Short";
        }

        String m(Number input) {
            return "Number";
        }

        String m(Object input) {
            return "Object";
        }

        @Test
        void name() {
            assertThat(m((byte) 1)).isEqualTo("Number");
        }

    }

    @Nested
    class C10 {

        String m(Short input) {
            return "Short";
        }

        String m(Number input) {
            return "Number";
        }

        String m(Object input) {
            return "Object";
        }

        @Test
        void name() {
            assertThat(m(1)).isEqualTo("Number");
        }

    }

    @Nested
    class C11 {

        Classes m(Short input) {
            return new Classes("Short", input);
        }

        Classes m(Object input) {
            return new Classes("Object", input);
        }

        @Test
        void name() {
            Classes result = m(1);
            assertThat(result.parameterType).isEqualTo("Object");
            assertThat(result.argumentType).isEqualTo("Integer");
        }

    }

    @Nested
    class C120 {

        Classes m(int... input) {
            return new Classes("int...", input);
        }

        Classes m(int input) {
            return new Classes("int", input);
        }

        @Test
        void name() {
            Classes result = m(10);
            assertThat(result.parameterType).isEqualTo("int");
            assertThat(result.argumentType).isEqualTo("Integer");
        }

        @Test
        void name2() {
            Classes result = m(10, 11);
            assertThat(result.parameterType).isEqualTo("int...");
            assertThat(result.argumentType).isEqualTo("int[]");
        }

        @Test
        void name3() {
            Classes result = m(new int[]{10, 11});
            assertThat(result.parameterType).isEqualTo("int...");
            assertThat(result.argumentType).isEqualTo("int[]");
        }

    }

    @Nested
    class C12 {

        Classes m(Object... input) {
            return new Classes("Object...", input);
        }

        Classes m(Object input) {
            return new Classes("Object", input);
        }

        @Test
        void name() {
            Classes result = m(new Object());
            assertThat(result.parameterType).isEqualTo("Object");
            assertThat(result.argumentType).isEqualTo("Object");
        }

    }

    @Nested
    class C13 {

        Classes m(Object... input) {
            return new Classes("Object...", input);
        }

        Classes m(Object input) {
            return new Classes("Object", input);
        }

        @Test
        void name() {
            Classes result = m(new Object(), new Object());
            assertThat(result.parameterType).isEqualTo("Object...");
            assertThat(result.argumentType).isEqualTo("Object[]");
        }

    }

    @Nested
    class C14 {

        Classes m(Object... input) {
            return new Classes("Object...", input);
        }

        Classes m() {
            return new Classes("Object", "empty");
        }

        @Test
        void name() {
            Classes result = m();
            assertThat(result.parameterType).isEqualTo("Object");
            assertThat(result.argumentType).isEqualTo("empty");
        }

    }

    static class Classes {
        String parameterType;
        String argumentType;

        public Classes(String parameterType, String argumentType) {
            this.parameterType = parameterType;
            this.argumentType = argumentType;
        }

        public Classes(String parameterType, Object argument) {
            this(parameterType, argument.getClass().getSimpleName());
        }
    }

}
