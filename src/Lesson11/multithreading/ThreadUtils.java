package Lesson11.multithreading;

public class ThreadUtils {

    private ThreadUtils() {}

    public static void println(Object msg) {
        Thread currentThread = Thread.currentThread();
        System.out.println(String.format("%-20s: %s", currentThread.getName(), msg));
    }

    /**
     * @return has thread been interrupted?
     */
    public static boolean sleep(long millis) {
        try {
            Thread.sleep(millis);
            return false;
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return true;
        }
    }
}