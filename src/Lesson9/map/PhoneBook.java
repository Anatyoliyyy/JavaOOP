package Lesson9.map;

import java.util.*;

public class PhoneBook {

    public static void main(String[] args) {
        Map<String, PhoneNumber> phoneBook = new TreeMap<>();

        // HashMap - random order
        // LinkedHashMap - original order
        // TreeMap - sorted order

        phoneBook.put("Vasya", new PhoneNumber("+380500000001")); // O(1)
        phoneBook.put("Masha", new PhoneNumber("+380500000002"));
        phoneBook.put("Ivan", new PhoneNumber("+380500000003"));
        phoneBook.put("Taras", new PhoneNumber("+380500000004"));
        phoneBook.put("Ilya", null); // bad practice

        phoneBook.put("Ivan", new PhoneNumber("+380500000005"));

        PhoneNumber ivan = phoneBook.get("Ivan");
        System.out.println(ivan);

        PhoneNumber ilya = phoneBook.get("Ilya");
        System.out.println(ilya);

        System.out.println();

        System.out.println("Keys: ");
        Set<String> names = phoneBook.keySet();
        for (String name : names) {
            System.out.println(name);
        }

        System.out.println();

        System.out.println("Values:");
        Collection<PhoneNumber> phoneNumbers = phoneBook.values();
        for (PhoneNumber phoneNumber : phoneNumbers) {
            System.out.println(phoneNumber);
        }

        System.out.println();

        System.out.println("Pairs:");
        Set<Map.Entry<String, PhoneNumber>> pairs = phoneBook.entrySet();
        for (Map.Entry<String, PhoneNumber> pair : pairs) {
            String name = pair.getKey();
            PhoneNumber phoneNumber = pair.getValue();
            System.out.println(name + " -> " + phoneNumber);
        }
    }
}

class PhoneNumber {

    private final String number;

    public PhoneNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "PhoneNumber{" +
                "number='" + number + '\'' +
                '}';
    }
}
