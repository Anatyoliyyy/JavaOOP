package Lesson11.multithreading2.creation;

import Lesson11.multithreading.ThreadUtils;

public class ThreadCreationWithRunnable {

    public static void main(String[] args) {
        Thread thread = new Thread(new Task());
        thread.start();

        ThreadUtils.println("Goodbye");
    }
}

class Task implements Runnable {
    @Override
    public void run() {
        ThreadUtils.println("Hello");
    }
}
