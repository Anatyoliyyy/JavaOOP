package Lesson7.generic;

import Lesson2.post.Post;

import java.util.ArrayList;
import java.util.List;

public class WithoutGenericExample { // Java 5 (2005)

    public static void main(String[] args) {
        List names = new ArrayList();

        names.add(10);
        names.add("Taras");
        names.add(new Post("a", "b", 10));

        String s = (String)names.get(0);
        System.out.println(s);

        System.out.println(names);
    }
}