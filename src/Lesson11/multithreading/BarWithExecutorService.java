package Lesson11.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class BarWithExecutorService {

    public static void main(String[] args) {
        ThreadUtils.println("Bar is opened");

        ExecutorService executorService =
                Executors.newFixedThreadPool(2);

        for (int i = 1; i <= 3; i++) {
            Runnable drinker = new Drinker(i);
            executorService.submit(drinker);
        }

        executorService.shutdownNow();

//        executorService.submit(() -> System.out.println("111"));

        ThreadUtils.println("Bar is closed");
    }
}