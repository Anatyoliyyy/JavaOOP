package Lesson1.HomeWorke;

/* Написать метод, находящий количество дней, прошедших с дня рождения человека.
День рождения задается в формате “YYYY-MM-DD”, где YYYY - год (4 цифры), MM - номер месяца (2 цифры),
DD - номер дня (2 цифры). Примеры формата: “1972-12-28”, “2005-05-01”.
Использовать класс java.time.LocalDate.
 */

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Task3DaysFromBirthDateCalculator {

    public static void main(String[] args) {
        String dateOfBirth = "1985-12-27";

        long daysFromBirth = daysFromBirthDate(dateOfBirth);
        System.out.println(daysFromBirth);
    }

    private static long daysFromBirthDate(String dateOfBirthString) {
        LocalDate dateOfBirth = LocalDate.parse(dateOfBirthString, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        LocalDate currentDate = LocalDate.now();

        return ChronoUnit.DAYS.between(dateOfBirth, currentDate);
    }
}

//Enter:
//1972-12-28
//Result:
//16589
//
//Process finished with exit code 0

//Enter:
//2005-05-01
//Result:
//4777
//
//Process finished with exit code 0

//Enter:
//1985-12-27
//Result:
//11842
//
//Process finished with exit code 0