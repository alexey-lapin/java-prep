package com.github.alexeylapin.oca.g03_using_operators_and_desicion_constructs.t03_if_else_ternary;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class T01 {

    @Test
    void ifWithTrueLiteralAndBody() {
        int result = 0;

        if (true) { // always true is legal
            result++;
        }

        assertThat(result).isEqualTo(1);
    }

    @Test
    void ifWithFalseLiteralAndBody() {
        int result = 0;

        if (false) { // always false is legal (while(false) {...} - not!)
            result++; // unreachable
        }

        assertThat(result).isEqualTo(0);
    }

    @Test
    void name2() {
        if (true)
            if (true) System.out.println();
            else ;
    }

    @Test
    void ifWithTrueLiteralAndEmptyBlockWithoutBraces() {
        int result = 0;

        if (true) ;

        assertThat(result).isEqualTo(0);
    }

    @Test
    void ifWithFalseLiteralAndEmptyBlockWithoutBraces() {
        int result = 0;

        if (false) ;

        assertThat(result).isEqualTo(0);
    }

    @Test
    void ifWithTrueLiteralAndEmptyBlockWithBraces() {
        int result = 0;

        //@formatter:off
        if (true) {}
        //@formatter:on

        assertThat(result).isEqualTo(0);
    }

    @Test
    void ifWithFalseLiteralAndEmptyBlockWithBraces() {
        int result = 0;

        //@formatter:off
        if (false) {}
        //@formatter:on

        assertThat(result).isEqualTo(0);
    }

    @Test
    void ifWithTrueLiteralAndMultipleStatementsOnTheSameLine() {
        int result = 0;

        //@formatter:off
        if (true) result++; result++; result++;
        //@formatter:on

        // without braces {} only controls the first statement

        assertThat(result).isEqualTo(3);
    }

    @Test
    void ifWithFalseLiteralAndMultipleStatementsOnTheSameLine() {
        int result = 0;

        //@formatter:off
        if (false) result++; result++; result++;
        //@formatter:on

        // without braces {} only controls the first statement

        assertThat(result).isEqualTo(2);
    }

    @Test
    void ifWithTrueLiteralAndMultipleStatementsOnNextLinesWithTrickyFormatting() {
        int result = 0;

        //@formatter:off
        if (true)
            result++;
            result++;
            result++;
        //@formatter:on

        // tricky formatting
        // without braces {} only controls the first statement

        assertThat(result).isEqualTo(3);
    }


    @Test
    void ifWithFalseLiteralAndMultipleStatementsOnNextLinesWithTrickyFormatting() {
        int result = 0;

        //@formatter:off
        if (false)
            result++;
            result++;
            result++;
        //@formatter:on

        // tricky formatting
        // without braces {} only controls the first statement

        assertThat(result).isEqualTo(2);
    }

    @Test
    void ifWithTrueLiteralAndMultipleStatementsOnNextLinesWithCommonFormatting() {
        int result = 0;

        if (true)
            result++;
        result++;
        result++;

        // without braces {} only controls the first statement

        assertThat(result).isEqualTo(3);
    }


    @Test
    void ifWithFalseLiteralAndMultipleStatementsOnNextLinesWithCommonFormatting() {
        int result = 0;

        if (false)
            result++;
        result++;
        result++;

        // without braces {} only controls the first statement

        assertThat(result).isEqualTo(2);
    }

    @Test
    void ifWithPrimitiveLiteralTrueAssignment() {
        int result = 0;

        boolean b;
        if (b = true) {
            result++;
        }

        assertThat(result).isEqualTo(1);
        assertThat(b).isEqualTo(true);
    }

    @Test
    void ifWithWrapperLiteralTrueAssignment() {
        int result = 0;

        Boolean b;
        if (b = true) {
            result++;
        }

        assertThat(result).isEqualTo(1);
        assertThat(b).isEqualTo(true);
    }

    @Test
    void ifWithPrimitiveExpressionAssignment() {
        int result = 0;

        boolean b;
        if (b = 1 == 1) {
            result++;
        }

        assertThat(result).isEqualTo(1);
        assertThat(b).isEqualTo(true);
    }

    @Test
    void ifWithPrimitiveMethodCallAssignment() {
        int result = 0;

        // local class
        class C {
            boolean evaluate() {
                return true;
            }
        }

        boolean b;
        if (b = new C().evaluate()) {
            result++;
        }


        assertThat(result).isEqualTo(1);
        assertThat(b).isEqualTo(true);
    }

    @Test
    void name() {
        label:
        if (true) break label;
        int result = 0;

        assertThat(result).isEqualTo(0);
    }

    @Test
    void name3() {
        if (true) {
            String str = "";
        } else {
            String str = "";
        }
    }

    @Test
    void name4() {
//        if (true)
//            String str = "";
    }

    @Test
    void name5() {
        int i = true ? 1 : 2;
    }
}
