package Lesson10.java8;

import Lesson5.format.Product;
import Lesson5.format.oop.Formatter;

public class LambdaExample {

    public static void main(String[] args) {
        Formatter csvFormatter =
                p -> p.getName() + "," + p.getPrice();

        String s = csvFormatter.format(new Product("Lenovo", 2000));
        System.out.println(s);
    }
}
