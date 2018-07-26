package Lesson11.multithreading2.creation;

public class EmptyThreadCreation {

    public static void main(String[] args) {
        Thread thread = new Thread(); // why does constructor allow this?
        thread.start();
    }
}