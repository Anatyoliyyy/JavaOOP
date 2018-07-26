package Lesson1.dynamicarray.oop;

import java.util.Arrays;

public class DynamicArray {

    // fields
    int[] elems = new int[4];
    int size = 0;

    // interface + implementation

    public void addLast(int n) {
        if (size == elems.length) {
            int newLength = (int) (elems.length * 1.5);
            elems = Arrays.copyOf(elems, newLength);
        }
        elems[size] = n;
        size++;
    }

    public String toString() {
        return Arrays.toString(Arrays.copyOf(elems, size));
    }
}
