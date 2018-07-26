package Lesson4;

public class Overloading {

    public static void main(String[] args) {
        double x = sum(new int[]{10, 20});
        System.out.println(x);
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static double sum(double a, double b) {
        return a + b;
    }

    public static int sum(int[] a) {
        int sum = 0;
        for (int elem : a) {
            sum += elem;
        }
        return sum;
    }
}
