package Lesson11.multithreading;

public class ThreadCreationWithRunnable {

    public static void main(String[] args) {
        System.out.println("0");

        Runnable r1 = ThreadCreationWithRunnable::printHello;
        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                System.out.println("1");
            }
        };
        Runnable r3 = new Task();

        Thread thread = new Thread(r1);

        System.out.println("0.5");

        thread.start();

        System.out.println("2");
    }

    private static void printHello() {
        System.out.println("1");
    }
}

class Task implements Runnable {
    @Override
    public void run() {
        System.out.println("1");
    }
}