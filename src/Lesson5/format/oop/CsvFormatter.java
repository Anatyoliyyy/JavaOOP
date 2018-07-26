package Lesson5.format.oop;

import Lesson5.format.Product;

public class CsvFormatter implements Formatter {

    private final String delimiter;

    public CsvFormatter(String delimiter) {
        this.delimiter = delimiter;
    }

    public CsvFormatter() {
        this(",");
    }

    @Override
    public String format(Product product) {
        return product.getName() + delimiter + product.getPrice();
    }
}
