package com.github.alexeylapin.oca.g02_working_with_java_data_types.t01_declare_and_initialize_variables;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class T02_Literals {

    @Nested
    class StringLiterals {
        @Test
        void stringLiteral() {
            String string = "literal";
            String string2 = "😊";
            System.out.println(string2);
            System.out.println("\ud83d\udc3b");
        }
    }

    @Nested
    class IntegerLiterals {
        @Test
        void intLiteral() {
            int i = 1;
        }

        @Test
        void intLiteralWithUnderscore() {
            int i = 10_0;

            assertThat(i).isEqualTo(100);
        }

        @Test
        void intLiteralWithUnderscores() {
            int i = 1_0___0;

            assertThat(i).isEqualTo(100);
        }
    }

    @Test
    void name41() {
        double d = 1_0___0.0_0__00;
    }

    @Nested
    class LongLiterals {
        @Test
        void longLiteralWithSmallLetter() {
            long l = 1l;
        }

        @Test
        void longLiteralWithLargeLetter() {
            long l = 1L;
        }

        @Test
        void longLiteralWithLargeLetterAndUnderscores() {
            long l = 100___000_00L;

            assertThat(l).isEqualTo(10000000L);
        }

        @Test
        void longLiteralWithSmallAndLargeLetterAndUnderscores() {
            assertThat(10_00__0l).isEqualTo(1000_0L);
        }
    }

    @Nested
    class FloatLiterals {
        @Test
        void floatLiteralWithSmallLetter() {
            float f = 1f; // valid integral
        }

        @Test
        void floatLiteralWithLargeLetter() {
            float f = 1F;
        }

        @Test
        void floatLiteralWithoutDecimalPart() {
            float f = 1.f;

            assertThat(f).isEqualTo(1.0f);
            assertThat(Float.compare(f, 1.0f)).isEqualTo(0);
        }

        @Test
        void floatLiteralWithoutWholePart() {
            float f = .5f;

            assertThat(f).isEqualTo(0.5f);
            assertThat(Float.compare(f, 0.5f)).isEqualTo(0);
        }

        @Test
        void floatLiteralWithSmallAndLargeLetterAndUnderscores() {
            assertThat(10__00.00_0f).isEqualTo(1_00_0.0__00F);
            assertThat(1000.0f).isEqualTo(1000.000f).isEqualTo(1000.000000f);
        }
    }

    @Nested
    class DoubleLiterals {
        @Test
        void doubleLiteralWithSmallLetter() {
            double d = 1d;
        }

        @Test
        void doubleLiteralWithLargeLetter() {
            double d = 1D;
        }

        @Test
        void doubleLiteralWithoutDecimalPart() {
            double d = 1.D;

            assertThat(d).isEqualTo(1.0);
        }

        @Test
        void doubleLiteralWithoutWholePart() {
            double d = .5D;

            assertThat(d).isEqualTo(0.5);
        }

        @Test
        void doubleLiteralWithoutDecimalPartAndLetter() {
            double d = 1.; // default floating point literal is double - d or D can be omitted
        }

        @Test
        void doubleLiteralWithoutWholePartAndLetter() {
            double d = .5; // default floating point literal is double - d or D can be omitted
        }

        @Test
        void doubleLiteralsWithExponent() {
            assertThat(.0e2).isEqualTo(.0E2).isEqualTo(.0E3).isEqualTo(0);
            assertThat(0e0).isEqualTo(0E0).isEqualTo(0);
            assertThat(0E0d).isEqualTo(0e0D).isEqualTo(0);
        }

        @Test
        void doubleHexadecimalLiteral() {
            assertThat(0x0e0d).isEqualTo(0X0E0D).isEqualTo(3597);
        }
    }

    @Nested
    class OctalLiterals {
        @Test
        void intOctal1() {
            int i = 010;

            assertThat(i).isEqualTo(8);
        }

        @Test
        void intOctal2() {
            assertThat(010).isEqualTo(0010).isEqualTo(8);
        }

//        @Test
//        void doubleOctal() {
//            double i = 0010.1700;
//
//            assertThat(i).isEqualTo(10.17);
//        }
    }

    @Nested
    class HexadecimalLiterals {
        @Test
        void hexadecimalLiteralSmallLetter() {
            int i = 0xA;

            assertThat(i).isEqualTo(10);
        }

        @Test
        void hexadecimalLiteralLargeLetter() {
            int i = 0Xb;

            assertThat(i).isEqualTo(11);
        }
    }

    @Nested
    class BinaryLiterals {
        @Test
        void binaryLiteralWithSmallLetter() {
            int i = 0b10;

            assertThat(i).isEqualTo(2);
        }

        @Test
        void binaryLiteralWithLargeLetter() {
            int i = 0B11;

            assertThat(i).isEqualTo(3);
        }
    }

    @Nested
    class CharLiterals {
        @Test
        void charLiteral() {
            char c = 'a';
        }

        @Test
        void charLiteralUnicode1() {
            char c = '\u0000';
        }

        @Test
        void charLiteralUnicode2() {
            char c = '\uffff';
        }

        @Test
        void charLiteralUnicode3() {
            char c = '\ufFfF';
        }

        @Test
        void charLiteralUnicode4() {
            assertThat('\u0028').isEqualTo('(');
            assertThat('\u0061').isEqualTo('a');
            assertThat('\u0062').isEqualTo('b');
        }
    }

    @Nested
    class BooleanLiterals {
        @Test
        void trueLiteral() {
            boolean b = true;
        }

        @Test
        void falseLiteral() {
            boolean b = false;
        }
    }

}
