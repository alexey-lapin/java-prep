package com.github.alexeylapin.oca.g03_using_operators_and_desicion_constructs.t04_switch;

import org.junit.jupiter.api.Test;

public class SwitchTest00 {

    @Test
    void acceptsBytePrimitive() {
        byte v = 1;
        switch (v) {
        }
    }

    @Test
    void acceptsByteWrapper() {
        Byte v = 1;
        switch (v) {
        }
    }

    @Test
    void acceptsShortPrimitive() {
        short v = 1;
        switch (v) {
        }
    }

    @Test
    void acceptsShortWrapper() {
        Short v = 1;
        switch (v) {
        }
    }

    @Test
    void acceptsCharPrimitive() {
        char v = 'a';
        switch (v) {
        }
    }

    @Test
    void acceptsCharacterWrapper() {
        Character v = 'a';
        switch (v) {
        }
    }

    @Test
    void acceptsIntegerPrimitive() {
        int v = 1;
        switch (v) {
        }
    }

    @Test
    void acceptsIntegerWrapper() {
        Integer v = 1;
        switch (v) {
        }
    }

    @Test
    void acceptsString() {
        String v = "1";
        switch (v) {
        }
    }

    @Test
    void acceptsEnum() {
        Color v = Color.RED;
        switch (v) {
        }
    }

    enum Color {
        RED,
        GREEN,
        BLUE
    }

}
