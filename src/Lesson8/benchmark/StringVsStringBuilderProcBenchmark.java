package Lesson8.benchmark;

public class StringVsStringBuilderProcBenchmark {

    private static final int ADDING_QUANTITY = 1_000_000;
    private static final String STRING_FOR_APPEND = "1";

    public static void main(String[] args) {
        System.out.println("String builder: " + useStringBuilderTime());
        System.out.println("String: " + useStringTime());
    }

    private static void useStringBuilder() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ADDING_QUANTITY; i++) {
            sb.append(STRING_FOR_APPEND);
        }
    }

    private static void useString() {
        String s = "";
        for (int i = 0; i < ADDING_QUANTITY; i++) {
            s += STRING_FOR_APPEND;
        }
    }

    private static long useStringBuilderTime() {
        long start = System.currentTimeMillis(); // timestamp, ms since 1.1.1970

        useStringBuilder();

        long finish = System.currentTimeMillis();
        return finish - start;
    }

    private static long useStringTime() {
        long start = System.currentTimeMillis();

        useString();

        long finish = System.currentTimeMillis();
        return finish - start;
    }
}
