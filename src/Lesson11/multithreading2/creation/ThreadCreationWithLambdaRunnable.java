package Lesson11.multithreading2.creation;

import Lesson11.multithreading.ThreadUtils;

public class ThreadCreationWithLambdaRunnable {

    public static void main(String[] args) {
        Thread thread = new Thread(() -> ThreadUtils.println("Hello"));
        thread.start();

        ThreadUtils.println("Goodbye");
    }
}