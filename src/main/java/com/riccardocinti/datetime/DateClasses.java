package com.riccardocinti.datetime;

import java.time.*;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class DateClasses {

    public static void main(String[] args) {
        localDate();
        yearMonth();
        monthDay();
    }

    public static void localDate() {
        LocalDate date = LocalDate.of(1987, Month.JUNE, 16);
        LocalDate dateWith = date.with(TemporalAdjusters.next(DayOfWeek.SUNDAY));
        DayOfWeek dow = date.getDayOfWeek();
        System.out.println(date);
        System.out.println(dow);
        System.out.println(dateWith);

        LocalDate example = LocalDate.of(2000, Month.NOVEMBER, 20);
        TemporalAdjuster adj = TemporalAdjusters.next(DayOfWeek.WEDNESDAY);
        LocalDate nextWed = example.with(adj);
        System.out.printf("For the date of %s, the next Wednesday is %s.%n",
                example, nextWed);
    }

    public static void yearMonth() {
        YearMonth date = YearMonth.now();
        System.out.printf("%s: %d%n", date, date.lengthOfMonth());

        YearMonth date2 = YearMonth.of(2010, Month.FEBRUARY);
        System.out.printf("%s: %d%n", date2, date2.lengthOfMonth());

        YearMonth date3 = YearMonth.of(2012, Month.FEBRUARY);
        System.out.printf("%s: %d%n", date3, date3.lengthOfMonth());
    }

    public static void monthDay() {
        MonthDay date = MonthDay.of(Month.FEBRUARY, 29);
        boolean validLeapYear = date.isValidYear(2020);
        System.out.println(validLeapYear);

        boolean isSupported = date.isSupported(ChronoField.DAY_OF_MONTH);
        System.out.println(isSupported);
    }
}
