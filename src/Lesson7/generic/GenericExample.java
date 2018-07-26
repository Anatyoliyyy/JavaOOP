package Lesson7.generic;

import java.util.ArrayList;
import java.util.List;

public class GenericExample { // Java 5 (2004)

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("Taras");
//        names.add(10);

        System.out.println(names);
    }
}