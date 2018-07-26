package Lesson8.sorting;

import Lesson5.format.Product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortingRunner {

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        products.add(new Product("MacBook", 2000));
        products.add(new Product("Asus", 1600));
        products.add(new Product("Asus", 1100));
        products.add(new Product("Lenovo", 1500));
        products.add(new Product("Asus", 1700));


        System.out.println(products);

        Comparator<Product> byPriceReversed =
                new PriceComparator().reversed();

        Comparator<Product> byName =
                new NameComparator();

        products.sort(byName.thenComparing(byPriceReversed));

        System.out.println(products);
    }
}

class PriceComparator implements Comparator<Product> {
    @Override
    public int compare(Product a, Product b) {
        return Long.compare(a.getPrice(), b.getPrice());
    }
}

class NameComparator implements Comparator<Product> {
    @Override
    public int compare(Product a, Product b) {
        return a.getName().compareTo(b.getName());
    }
}

/**
 * Use {@link java.util.Collections#reverseOrder(Comparator)} instead.
 */
class ReversedComparator<T> implements Comparator<T> {

    private final Comparator<T> comparator;

    ReversedComparator(Comparator<T> comparator) {
        this.comparator = comparator;
    }

    @Override
    public int compare(T a, T b) {
        return comparator.compare(b, a);
    }
}
