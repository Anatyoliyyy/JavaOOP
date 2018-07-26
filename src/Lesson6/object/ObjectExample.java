package Lesson6.object;

import Lesson5.format.Product;

public class ObjectExample {

    public static void main(String[] args) {
        Foo foo = new Foo();
        String s = foo.toString();
        System.out.println(s);

        Object x = new Foo();
        Object y = "Hello";
        Object z = new Product("MacBook", 2000);
    }
}

class Foo {

    @Override
    public String toString() {
        return "Foo{}";
    }
}