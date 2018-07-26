package Lesson11.multithreading;

public class BarWithMultithreading {

    public static void main(String[] args) {
        ThreadUtils.println("Bar is opened");

        for (int i = 1; i <= 100_000; i++) {
            Runnable drinker = new Drinker(i);
            Thread drinkerThread = new Thread(drinker);
            drinkerThread.start();
        }

        ThreadUtils.println("Bar is closed");
    }
}
