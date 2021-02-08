package com.github.alexeylapin.oca.g03_using_operators_and_desicion_constructs.t04_switch;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SwitchTest01 {

    /*
     * in Java 8 only switch operator accepts a variety of data types
     *
     * switch accepts:
     * - byte
     * - short
     * - char
     * - int
     *
     * - Byte
     * - Short
     * - Character
     * - Integer
     *
     * - String
     * - Enum
     */

    /**
     * @see InvalidSwitch01
     */
    @Test
    void switchWithEmptyBody() {
        int result = 0;

        byte a = 2;
        switch (a) {
        }

        assertThat(result).isEqualTo(0);
    }

    @Test
    void switchWithCasesAndDefaultMatchesAndFallsThrough() {
        int result = 0;

        byte a = 2;
        switch (a) {
            case 0:
                result++; // not execute
            case 1:
                result++; // not execute
            case 2:
                result++; // execute and fall through
            case 3:
                result++; // execute
            default:
                result++; // execute
        }

        assertThat(result).isEqualTo(3);
    }

    @Test
    void switchWithCasesDoesNotMatch() {
        int result = 0;

        byte a = 5;
        switch (a) {
            case 0:
                result++; // not execute
            case 1:
                result++; // not execute
            case 2:
                result++; // not execute
            case 3:
                result++; // not execute
        }

        assertThat(result).isEqualTo(0);
    }

    @Test
    void switchWithCasesAndDefaultDefaults() {
        int result = 0;

        byte a = 5;
        switch (a) {
            case 0:
                result++; // not execute
            case 1:
                result++; // not execute
            case 2:
                result++; // not execute
            case 3:
                result++; // not execute
            default:
                result++; // execute
        }

        assertThat(result).isEqualTo(1);
    }

    @Test
    void switchWithCasesAndDefaultDefaultsAndFallsThrough() {
        int result = 0;

        byte a = 5;
        switch (a) {
            case 0:
                result++; // not execute
            case 1:
                result++; // not execute
            default:
                result++; // execute and fall through
            case 2:
                result++; // execute
            case 3:
                result++; // execute
        }

        // default can be anywhere in switch not only in the end

        assertThat(result).isEqualTo(3);
    }

    /**
     * @see InvalidSwitch03
     */
    @Test
    void switchUsesWiderCaseConst1() {
        int result = 0;

        byte a = 2;
        switch (a) {
            case (short) 0:
                result = 0;
            case (short) 127:
                result = 127;
        }

        assertThat(result).isEqualTo(0);
    }

    /**
     * @see InvalidSwitch03
     */
    @Test
    void switchUsesWiderCaseConst2() {
        int result = 0;

        byte a = 2;
        switch (a) {
            case (char) 0:
                result = 0;
            case (char) 127:
                result = 127;
        }

        assertThat(result).isEqualTo(0);
    }

    /**
     * @see InvalidSwitch03
     */
    @Test
    void switchUsesWiderCaseConst3() {
        int result = 0;

        byte a = 2;
        switch (a) {
            case (int) 0:
                result = 0;
            case (int) 127:
                result = 127;
        }

        assertThat(result).isEqualTo(0);
    }

    @Test
    void switchWithChars() {
        int result = 0;

        char ch = 'c';
        switch (ch) {
            case 'a':
                result++; // not execute
            case 'b':
                result++; // not execute
            case 'c':
                result++; // execute
            case 'd':
                result++; // execute
        }

        assertThat(result).isEqualTo(2);
    }

    /**
     * @see InvalidSwitch04
     */
    @Test
    void switchWithVariable() {
        int result = 0;

        int a = 3;
        final int b = 3;
        switch (a) {
            case 2:
                result++; // not execute
            case b:
                result++; // execute
        }

        assertThat(result).isEqualTo(1);
    }

    @Test
    void switchWithIntegerSumExpression() {
        int result = 0;

        int a = 3;
        switch (a) {
            case 2:
                result++; // not execute
            case 1 + 2:
                result++; // execute
        }

        assertThat(result).isEqualTo(1);
    }

    @Test
    void switchWithStringConcatenationExpression() {
        int result = 0;

        switch ("ss") {
            case "s":
                result++; // not execute
            case "s" + "s":
                result++; // execute
        }

        assertThat(result).isEqualTo(1);
    }

    /**
     * @see InvalidSwitch05
     * @see InvalidSwitch06
     */
    @Test
    void switchAcceptsWrapper() {
        int result = 0;

        switch (new Integer(1)) { // performs unboxing
            case 1:
                result++;
        }

        assertThat(result).isEqualTo(1);
    }

    /**
     * @see InvalidSwitch09
     */
    @Test
    void switchAcceptsString() {
        int result = 0;

        switch ("ss") {
            case "ss":
                result++;
        }

        assertThat(result).isEqualTo(1);
    }

    /**
     * @see InvalidSwitch09
     * @see InvalidSwitch10
     */
    @Test
    void switchWithStringVariableAcceptsString() {
        int result = 0;

        final String ss = "ss";
        switch ("ss") {
            case ss:
                result++;
        }

        assertThat(result).isEqualTo(1);
    }

    @Test
    void switchWithBreaks() {
        int result = 0;

        int a = 2;
        switch (a) {
            case 1:
                result++; // not execute
                break;
            case 2:
                result++; // execute
                break;
            case 3:
                result++; // not execute
                break;
            case 4:
                result++; // not execute
                break;
            default:
                result++; // not execute
                break;
        }

        assertThat(result).isEqualTo(1);
    }

    @Test
    void switchWithBreaks2() {
        int result = 0;

        int a = 5;
        switch (a) {
            case 1:
                result++; // not execute
                break;
            case 2:
                result++; // execute
                break;
            default:
                result++; // not execute
                break;
            case 3:
                result++; // not execute
                break;
            case 4:
                result++; // not execute
                break;
        }

        assertThat(result).isEqualTo(1);
    }

    @Test
    void switchInitializesVariable() {
        int s;
        switch (5) {
            case 1:
            case 2:
            case 3:
            case 4:
            default:
                s = 1;
        }

        assertThat(s).isEqualTo(1);
    }

    /**
     * @see InvalidSwitch11
     */
    @Test
    void switchWithAssignment() {
        int result = 0;

        int a;
        switch (a = 1) {
            case 1:
                result++;
        }

        assertThat(result).isEqualTo(1);
    }

    @Test
    void switchWithCaseVariableDeclaration() {
        switch (1) {
            case 1:
                System.out.println(1);
            case 2:
                int i = 10;
            case 3:
                i = 20;
                break;
            case 4:
                i = 30;
        }
    }
}
