package Lesson2.storing;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateExample {

    public static void main(String[] args) {
        // Java 8
        LocalTime lt = LocalTime.now();
        System.out.println(lt);

        LocalDate ld = LocalDate.now();
        System.out.println(ld);

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        LocalDateTime nowYearAgo = now.minusYears(1);
        System.out.println("now = " + now);
        System.out.println("nowYearAgo = " + nowYearAgo);
    }
}
