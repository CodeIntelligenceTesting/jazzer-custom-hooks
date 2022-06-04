package com.code_intelligence.example;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

// ExampleApplication throws an error if the current date is before the year 2000,
// otherwise prints it.
public class ExampleApplication {

    public static void main(String... args) {
        LocalDateTime now = LocalDateTime.now();
        if (now.isBefore(LocalDateTime.of(2000,1, 1, 0, 0))) {
            throw new IllegalArgumentException("Back to the future with you!");
        }
        System.out.printf("Today is %s\n", now.format(DateTimeFormatter.ISO_DATE));
    }

}
