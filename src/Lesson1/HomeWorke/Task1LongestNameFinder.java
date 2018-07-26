package Lesson1.HomeWorke;

/* Написать метод, находящий самое длинное имя пользователя в списке имен.
Если список пустой, бросить исключение IllegalArgumentException.
Использовать цикл for-each.
 */

import java.util.ArrayList;
import java.util.Arrays;

public class Task1LongestNameFinder {

    public static void main(String[] args) {
        String[] namesArr = new String[] {"Phil", "Anny", "Richard", "Chris"};
        ArrayList<String> names = new ArrayList<>(Arrays.asList(namesArr));

        String longestNameString = longestName(names);
        System.out.println(longestNameString);
    }

    private static String longestName(ArrayList<String> names) {
        if (names.isEmpty()) throw new IllegalArgumentException("Array is empty");

        int longestStringLength = names.get(0).length();
        String longestString = names.get(0);

        if (names.size() == 1) return longestString;

        for (String curName:names) {
            if (curName.length() > longestStringLength) {
                longestStringLength = curName.length();
                longestString = curName;
            }
        }

        return longestString;
    }
}

//Result:
//Richard
//
//Process finished with exit code 0