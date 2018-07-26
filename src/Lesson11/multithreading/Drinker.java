package Lesson11.multithreading;

public class Drinker implements Runnable {

    private final int id;

    Drinker(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        for (int beer = 1; beer <= 5; beer++) {
            ThreadUtils.println("I'm " + id + " drinker. " +
                    "I'm drinking " + beer + " beer");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
