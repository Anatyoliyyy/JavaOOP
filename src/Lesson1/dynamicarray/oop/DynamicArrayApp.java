package Lesson1.dynamicarray.oop;

import java.util.Scanner;

public class DynamicArrayApp {
    public static void main(String[] args) {
        System.out.println("OOP Version");
        DynamicArray elems = readClientElemsFromConsole();
        System.out.println(elems.toString()); // <------
    }

    public static DynamicArray readClientElemsFromConsole() {
        Scanner scanner = new Scanner(System.in);

        DynamicArray elems = new DynamicArray();

        int n = readClientElem(scanner);
        while (n != 0) {
            elems.addLast(n); // <------

            n = readClientElem(scanner);
        }
        return elems;
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


//OOP Version
//>> 20
//>> 30
//>> 45
//>> -85
//>> 0
//[20, 30, 45, -85]
//
//Process finished with exit code 0