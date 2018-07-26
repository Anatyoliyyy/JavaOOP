package Lesson11.multithreading;

public class CurrentThreadExample {

    public static void main(String[] args) {
        f();
    }

    private static void f() {
        g();
    }

    private static void g() {
        Thread currentThread = Thread.currentThread();
        System.out.println(currentThread.getId());
        System.out.println(currentThread.getName());

        System.out.println();

        for (StackTraceElement stackTraceElement : currentThread.getStackTrace()) {
            System.out.println(stackTraceElement);
        }
    }
}
