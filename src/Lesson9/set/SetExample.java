package Lesson9.set;

import java.util.*;

public class SetExample {

    public static void main(String[] args) {
        List<String> langs = langs();

        Set<String> uniqueLangs = new TreeSet<>(langs);
//        for (String lang : langs) {
//            uniqueLangs.add(lang);
//        }
        System.out.println(uniqueLangs);

        System.out.println(uniqueLangs.contains("Java"));
        System.out.println(uniqueLangs.contains("Haskel"));
    }

    private static List<String> langs() {
        return Arrays.asList(
                "Python",
                "Java",
                "JavaScript",
                "Java",
                "Kotlin",
                "Java",
                "JavaScript",
                "Java",
                "JavaScript",
                "C#",
                "C#",
                "JavaScript",
                "Kotlin",
                "Java",
                "Kotlin",
                "C#",
                "C#",
                "Python",
                "C#",
                "Python",
                "Python"
        );
    }

}