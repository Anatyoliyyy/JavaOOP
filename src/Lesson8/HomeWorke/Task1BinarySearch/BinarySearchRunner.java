package Lesson8.HomeWorke.Task1BinarySearch;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class BinarySearchRunner {
    public static void main(String[] args) {
        int[] array = {10, 20, 20, 30, 50};
        System.out.println(BinarySearch.binarySearch(array, 30)); // 3
        System.out.println(BinarySearch.binarySearch(array, 20)); // 2
        System.out.println(BinarySearch.binarySearch(array, 40)); // -4
        System.out.println();

        List<Integer> list = Arrays.asList(10, 20, 20, 30, 50);
        System.out.println(BinarySearch.binarySearch(list, Integer.valueOf(30), byValue())); // 3
        System.out.println(BinarySearch.binarySearch(list, Integer.valueOf(20), byValue())); // 2
        System.out.println(BinarySearch.binarySearch(list, Integer.valueOf(40), byValue())); // -4
    }

    public static Comparator<Integer> byValue() {
        return new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.intValue() - o2.intValue();
            }

        };
    }
}

//3
//2
//-4
//
//3
//2
//-4
//
//Process finished with exit code 0