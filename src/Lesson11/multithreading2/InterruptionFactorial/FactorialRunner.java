package Lesson11.multithreading2.InterruptionFactorial;

import Lesson11.multithreading.ThreadUtils;

import java.util.concurrent.TimeUnit;

public class FactorialRunner {

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new FactorialTask(1_000_000));
        thread.start();

        Thread.sleep(TimeUnit.SECONDS.toMillis(3));

        thread.interrupt();

        ThreadUtils.println("Main is finished");
    }
}