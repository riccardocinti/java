package com.riccardocinti.datetime;

import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;

public class MonthExample {

    public static void main(String[] args) {
        Month month = Month.JUNE;
        Locale locale = Locale.ITALY;
        System.out.println(month.getDisplayName(TextStyle.FULL, locale));
        System.out.println(month.getDisplayName(TextStyle.NARROW, locale));
        System.out.println(month.getDisplayName(TextStyle.SHORT, locale));
    }
}
