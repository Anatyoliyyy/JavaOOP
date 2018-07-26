package common;

import java.util.Random;

public final class RandomIdGenerator {

    private static Random random = new Random();

    private RandomIdGenerator() {}

    /**
     * Генерирует псевдослучайный id типа int.
     *
     * @return псевдослучайный id.
     */
    public static int generateInt() {
        return random.nextInt();
    }

}
