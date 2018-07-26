package Lesson11.multithreading2.shared_resource.primitives.bad;

public class BadCounterSample {

    public static void main(String[] args) throws InterruptedException {
        BadCounterTask counterTask = new BadCounterTask();

        Thread thread1 = new Thread(counterTask);
        Thread thread2 = new Thread(counterTask);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(counterTask.getCount()); // NEVER 2_000_000!
    }
}

class BadCounterTask implements Runnable {

    private int count;

    @Override
    public void run() {
        for (int i = 0; i < 1_000_000; i++) {
            count++; // problem
        }
    }

    public int getCount() { // problem
        return count;
    }
}