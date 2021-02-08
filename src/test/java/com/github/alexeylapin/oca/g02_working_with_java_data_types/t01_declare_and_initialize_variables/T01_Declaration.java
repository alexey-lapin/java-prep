package com.github.alexeylapin.oca.g02_working_with_java_data_types.t01_declare_and_initialize_variables;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class T01_Declaration {

    // oca exam [A-Za-z$_]

    @Test
    void declareStringWithLegalName() {
        String string;
        String _; // invalid since java 9
        String $;
        String $_1abc$2_3;
        String пере_$менная;
    }

    @Test
    void declareMultipleStringVariables() {
        String a, b, c;
    }

    @Test
    void declareMultipleStringVariablesWithPartialAssignment() {
        int a, b = 1, c;
    }

    @Test
    void declareFinalVariable() {
        final int i = 1; // final local variables require explicit initialization
    }

    @Test
    void declareFinalVariable2() {
        final int i = 1, j;
    }

    @Test
    void name2() {
        int x = (x = 3) * 4;

        assertThat(x).isEqualTo(12);
    }
}
