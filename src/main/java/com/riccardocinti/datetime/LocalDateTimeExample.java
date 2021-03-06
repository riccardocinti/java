package com.riccardocinti.datetime;

import java.time.LocalDateTime;
import java.time.Month;

public class LocalDateTimeExample {

    public static void main(String[] args) {
        System.out.printf("now: %s\n", LocalDateTime.now());

        System.out.printf("Apr 15, 1994 @ 11:30am: %s\n",
                LocalDateTime.of(1994, Month.APRIL, 15, 11, 30));

        System.out.printf("6 months from now: %s\n",
                LocalDateTime.now().plusMonths(6));

        System.out.printf("6 months ago: %s\n",
                LocalDateTime.now().minusMonths(6));
    }

}
