package Lesson10.tree;


import Lesson5.format.Product;

import java.util.*;

public class ProductTree {

    public static void main(String[] args) {
        SortedMap<Long, Product> priceToProduct = new TreeMap<>();

        priceToProduct.put(2000L, new Product("MacBook", 2000));
        priceToProduct.put(1500L, new Product("Lenovo", 1500));
        priceToProduct.put(1700L, new Product("Asus", 2000));

        SortedMap<Long, Product> sample = priceToProduct.subMap(1000L, 2000L);
        System.out.println(sample.values());

        System.out.println(priceToProduct.headMap(1600L).values());
        System.out.println(priceToProduct.tailMap(1600L).values());
    }
}