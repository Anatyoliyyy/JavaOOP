package Lesson8.sorting;

import java.time.LocalDate;

public class StringComparing {

    public static void main(String[] args) {
        System.out.println("ABCD".compareTo("EFG")); // < 0
        System.out.println("Home".compareTo("Homework")); // < 0
        System.out.println("Homework".compareTo("Homework")); // 0

        LocalDate ld1 = LocalDate.of(1990, 5, 10);
        LocalDate ld2 = LocalDate.of(1990, 3, 20);
        System.out.println(ld1.compareTo(ld2)); // > 0
    }
}
