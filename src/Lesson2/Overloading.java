package Lesson2;

public class Overloading {

    public static void main(String[] args) {
        double sum = sum(10.0, 20.0);
        System.out.println(sum);
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static double sum(double a, double b) {
        return a + b;
    }

    public static String sum(String s1, String s2) {
        return s1 + s2;
    }
}
