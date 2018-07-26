package Lesson6.exception;

import java.math.BigInteger;

/**
 * n! = 1 * 2 * 3 * ... * n, n >= 0<br/>
 * 3! = 1 * 2 * 3 = 6<br/>
 * 0! = 1<br/>
 */
public final class Factorial {

    private Factorial() {}

    /**
     * @throws IllegalArgumentException
     */
    public static BigInteger factorial(int n) {
        checkFactorialArg(n);

        BigInteger res = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            res = res.multiply(BigInteger.valueOf(i));
        }

        return res;
    }

    /**
     * @throws IllegalArgumentException
     */
    private static void checkFactorialArg(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("negative factorial arg: " + n);
        }
    }
}
