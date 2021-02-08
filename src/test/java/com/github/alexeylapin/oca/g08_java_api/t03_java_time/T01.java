package com.github.alexeylapin.oca.g08_java_api.t03_java_time;

import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeParseException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

public class T01 {

    @Test
    void name1() {
        LocalDate.now();
    }

    @Test
    void name11() {
        LocalDate date = LocalDate.now();
        int year = date.getYear();
        Month month = date.getMonth();
        int monthValue = date.getMonthValue();
        int dayOfYear = date.getDayOfYear();
        int dayOfMonth = date.getDayOfMonth();
        DayOfWeek dayOfWeek = date.getDayOfWeek();
    }

    @Test
    void name2() {
        LocalDate date = LocalDate.of(2021, 1, 1);
    }

    @Test
    void name3() {
        LocalDate date = LocalDate.parse("2021-01-01");
    }

    @Test
    void name31() {
        Throwable throwable1 = catchThrowable(() -> LocalDate.parse("2021"));
        assertThat(throwable1).isInstanceOf(DateTimeParseException.class);

        Throwable throwable2 = catchThrowable(() -> LocalDate.parse("2021-01"));
        assertThat(throwable2).isInstanceOf(DateTimeParseException.class);

        Throwable throwable3 = catchThrowable(() -> LocalDate.parse("2021-1-01"));
        assertThat(throwable3).isInstanceOf(DateTimeParseException.class);

        Throwable throwable4 = catchThrowable(() -> LocalDate.parse("2021-1-1"));
        assertThat(throwable4).isInstanceOf(DateTimeParseException.class);
    }

    @Test
    void name4() {
        Throwable throwable = catchThrowable(() -> LocalDate.parse("2021-01-01T00:00:00"));

        assertThat(throwable).isInstanceOf(DateTimeParseException.class);
    }

}
