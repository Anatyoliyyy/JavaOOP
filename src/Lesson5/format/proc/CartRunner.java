package Lesson5.format.proc;

import Lesson5.format.Product;

public class CartRunner {

    public static void main(String[] args) {
        ProcCart cart = new ProcCart();
        cart.add(new Product("MacBook", 2000));
        cart.add(new Product("Lenovo", 1500));
        cart.add(new Product("Asus", 1700));

        cart.print("name");
        System.out.println();

        cart.print("csv");
        System.out.println();

        cart.print("json");
        System.out.println();
    }
}