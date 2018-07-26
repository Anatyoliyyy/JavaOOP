package Lesson5.format.oop;

import Lesson5.format.Product;

public class NameFormatter implements Formatter {

    @Override
    public String format(Product product) {
        return product.getName();
    }
}
