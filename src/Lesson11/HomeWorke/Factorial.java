package Lesson11.HomeWorke;

/*
Задание:
        1. Написать метод вычисления факториала.
        2. Написать метод вывода значения факториала в файл.
        3. Написать метод, в котором N потоков под индексами i = 1..N параллельно вычисляют факториал числа (K * i) и
        записывают в файл с названием "factorial K * i" (например, для K = 1000, "factorial 1000", "factorial 2000", ....)
        Дополнительно:
        4. Произвести бенчмарк и сравнить скорость работы многопоточного и аналогичного однопоточного кода.
        Протестировать программу для N = 100, K = 1000.
        Код должен быть чистым, максимально тестируемым.*/

import java.math.BigInteger;

public class Factorial {

    public BigInteger doFactorial(int value) {
        BigInteger factorial = BigInteger.ONE;
        if (value >= 1) {
            for (int i = 1; i <= value; i++) {
                factorial = factorial.multiply(BigInteger.valueOf(i));
            }
            return factorial;
        } else if (value == 0) {
            return BigInteger.ONE;
        } else {
            return BigInteger.valueOf(-1);
        }
    }
}