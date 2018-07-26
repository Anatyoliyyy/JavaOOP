package Lesson6.exception;

import java.math.BigInteger;

public class FactorialRunner {

    public static void main(String[] args) {
        try {
            BigInteger factorial = Factorial.factorial(-1);
            System.out.println(factorial);
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException: " + e.getMessage());
        } catch (IllegalStateException e) {
            System.out.println("IllegalStateException: " + e.getMessage());
        } finally {
            System.out.println("Finally");
        }

        System.out.println("Goodbye");
    }
}
