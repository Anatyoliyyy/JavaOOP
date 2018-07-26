package Lesson11.HomeWorke;

import java.math.BigInteger;

public class FactorialN implements Runnable {

    private final int i;
    private final int k;

    public FactorialN(int i, int k) {
        this.i = i;
        this.k = k;
    }

    @Override
    public void run() {

        Factorial factorial = new Factorial();
        BigInteger doFactorial = factorial.doFactorial(i * k);

        FactorialFileWriter factorialFileWriter = new FactorialFileWriter(i * k);
        factorialFileWriter.writeToFile(doFactorial);
    }
}