package Lesson7.HomeWorke.Task2ComparablePair;

import java.time.LocalDate;

public class ComparablePairRunner {
    public static void main(String[] args) {
        ComparablePair<String> names = new ComparablePair<>("Alexander", "Bob");
        System.out.println(names.bigger()); // Bob
        System.out.println(names.smaller()); // Alexander

        ComparablePair<LocalDate> dates = new ComparablePair<>(
                LocalDate.of(1995, 8, 4),
                LocalDate.of(1990, 10, 3)
        );
        System.out.println(dates.bigger()); // 1995-08-04
        System.out.println(dates.smaller()); // 1990-10-03

        names = new ComparablePair<>("Bob", "Bob");
        System.out.println(names.bigger()); // Bob
        System.out.println(names.smaller()); // Bob
    }
}


//Bob
//Alexander
//1995-08-04
//1990-10-03
//Bob
//Bob
//
//Process finished with exit code 0