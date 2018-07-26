package Lesson4;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Taras");
        names.add("Masha");
        System.out.println(names);

        Iterable<String> x = names;
    }
}
