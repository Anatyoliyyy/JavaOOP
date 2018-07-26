package Lesson11.multithreading;

public class ThreadCreationWithTread {

    public static void main(String[] args) {
        Thread thread = new MyThread();
        thread.start();

        System.out.println("2");
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("1");
    }
}