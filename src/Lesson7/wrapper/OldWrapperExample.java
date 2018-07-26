package Lesson7.wrapper;

public class OldWrapperExample {

    public static void main(String[] args) {
        // Java < 5

        int x = 10;
        Integer a = Integer.valueOf(x);
        Integer b = Integer.valueOf(20);
        Integer c = Integer.valueOf(a.intValue() + b.intValue());
    }
}