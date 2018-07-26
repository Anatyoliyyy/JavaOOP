package Lesson1.dynamicarray.proc;

import java.util.Arrays;
import java.util.Scanner;

public class DynamicArrayAppV2 {

    public static void main(String[] args) {
        int[] elems = readClientElemsFromConsole();
        System.out.println(Arrays.toString(elems));
    }

    public static int[] readClientElemsFromConsole() {
        Scanner scanner = new Scanner(System.in);

        int size = 0;
        int[] elems = new int[4];

        int n = readClientElem(scanner);
        while (n != 0) {
            if (size == elems.length) {
                int newLength = (int) (elems.length * 1.5);
                elems = Arrays.copyOf(elems, newLength);
            }
            elems[size] = n;
            size++;

            n = readClientElem(scanner);
        }
        return Arrays.copyOf(elems, size);
    }

    public static int[] addLastElem(int[] elems, int n) {
        int[] newElems = Arrays.copyOf(elems, elems.length+1);
        newElems[newElems.length - 1] = n;
        return newElems;
    }

    public static int readClientElem(Scanner scanner) {
        System.out.print(">> ");
        while (!scanner.hasNextInt()) {
            scanner.next(); // skip

            System.out.println("Illegal input");
            System.out.print(">> ");
        }
        return scanner.nextInt();
    }
}
