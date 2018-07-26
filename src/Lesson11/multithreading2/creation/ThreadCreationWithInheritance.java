package Lesson11.multithreading2.creation;

import Lesson11.multithreading.ThreadUtils;

public class ThreadCreationWithInheritance {

    public static void main(String[] args) {
        Thread thread = new TaskThread();
        thread.start();

        ThreadUtils.println("Goodbye");
    }
}

class TaskThread extends Thread {
    @Override
    public void run() {
        ThreadUtils.println("Hello");
    }
}
