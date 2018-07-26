package Lesson10.java8;

import Lesson5.format.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class StreamAPIExample {

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("MacBook", 2000));
        products.add(new Product("Lenovo", 1500));
        products.add(new Product("Asus", 1700));

        // imperative
        for (Product product : products) {
            if (product.getPrice() < 1800) {
                String name = product.getName();
                System.out.println(name);
            }
        }
        System.out.println();

        Predicate<Product> predicate = p -> p.getPrice() < 1800;
        Function<Product, String> f = Product::getName;

        // declarative
        Set<String> collect = products.stream()
                .filter(predicate)
                .map(f)
                .collect(Collectors.toSet());
    }
}
