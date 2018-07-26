package Lesson8.sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparableExample {

    public static void main(String[] args) {
        List<String> names = Arrays.asList(
                "Vlad",
                "Ivan",
                "Boris",
                "Masha",
                "Boris"
        );
        Collections.sort(names);

        System.out.println(names);
    }
}