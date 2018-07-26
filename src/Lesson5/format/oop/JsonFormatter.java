package Lesson5.format.oop;

import Lesson5.format.Product;

public class JsonFormatter implements Formatter {

    @Override
    public String format(Product product) {
        return "{\"name\": \"" + product.getName() + "\", \"price\": " + product.getPrice() + "}";
    }
}