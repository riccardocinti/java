package com.riccardocinti.datetime;

import java.time.LocalTime;

public class LocalTimeExample {

    public static void main(String[] args) {
        LocalTime thisSec;
        while (true) {
            thisSec = LocalTime.now();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            display(thisSec.getHour(), thisSec.getMinute(), thisSec.getSecond());
        }
    }

    private static void display(int hours, int minutes, int seconds) {
        System.out.println(hours + ":" + minutes + ":" + seconds);
    }

}
