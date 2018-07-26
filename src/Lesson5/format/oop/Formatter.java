package Lesson5.format.oop;

import Lesson5.format.Product;

public interface Formatter {

    public static final int X = 10; // BAD PRACTICE

    String format(Product product);

    default void print(Product product) {
        String s = format(product);
        System.out.println(s);
    }
}