package Lesson11.multithreading2.creation;


import Lesson11.multithreading.ThreadUtils;

public class ThreadCreationWithAnonymousRunnable {

    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                ThreadUtils.println("Hello");
            }
        });
        thread.start();

        ThreadUtils.println("Goodbye");
    }
}
