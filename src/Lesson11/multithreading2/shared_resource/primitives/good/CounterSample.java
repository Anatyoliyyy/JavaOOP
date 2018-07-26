package Lesson11.multithreading2.shared_resource.primitives.good;

import java.util.concurrent.atomic.AtomicInteger;

public class CounterSample {

    public static void main(String[] args) throws InterruptedException {
        CounterTask counterTask = new CounterTask();

        Thread thread1 = new Thread(counterTask);
        Thread thread2 = new Thread(counterTask);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(counterTask.getCount()); // 2_000_000
    }
}

class CounterTask implements Runnable {

    private AtomicInteger count = new AtomicInteger();

    @Override
    public void run() {
        for (int i = 0; i < 1_000_000; i++) {
            count.incrementAndGet();
        }
    }

    public int getCount() {
        return count.get();
    }
}
