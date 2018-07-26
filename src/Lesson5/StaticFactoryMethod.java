package Lesson5;

import java.time.LocalDate;

public class StaticFactoryMethod {

    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate date = LocalDate.of(2018, 1, 10);
    }
}
