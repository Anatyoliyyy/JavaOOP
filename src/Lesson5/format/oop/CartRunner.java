package Lesson5.format.oop;

import Lesson5.format.Product;

public class CartRunner {

    public static void main(String[] args) {
        Cart cart = new Cart();
        cart.add(new Product("MacBook", 2000));
        cart.add(new Product("Lenovo", 1500));
        cart.add(new Product("Asus", 1700));

        cart.print(csvFormatter());
        System.out.println();

        cart.print(toStringFormatter());
    }

    private static Formatter toStringFormatterWithLambda() {
        // lambda
        return product -> product.toString();
    }

    // static factory method
    private static Formatter toStringFormatter() {
        // anonymous class
        return new Formatter() {
            @Override
            public String format(Product product) {
                return product.toString();
            }
        };
    }

    private static Formatter csvFormatter() {
        return new CsvFormatter(";");
    }
}