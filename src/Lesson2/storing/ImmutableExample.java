package Lesson2.storing;

public class ImmutableExample {

    public static void main(String[] args) {
        String s = "Hello";
        s = s.concat(", world");
        System.out.println(s); // Hello
    }
}
