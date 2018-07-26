package Lesson5.format.oop;



import Lesson5.format.Product;

import java.util.LinkedList;
import java.util.List;

public class Cart {

    private final List<Product> products = new LinkedList<>();

    public void add(Product product) {
        products.add(product);
    }

    public void print(Formatter formatter) {
        for (Product product : products) {
            String s = formatter.format(product);
            System.out.println(s);
        }
    }
}
