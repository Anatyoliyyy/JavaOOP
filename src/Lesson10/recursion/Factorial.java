package Lesson10.recursion;

public class Factorial {

    public static void main(String[] args) {
        System.out.println(factorial(10000));
    }

    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("negative arg: " + n);
        }
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}