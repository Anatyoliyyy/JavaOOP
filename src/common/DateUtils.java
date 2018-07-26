package common;

import java.util.GregorianCalendar;

public final class DateUtils {

    private DateUtils() {
    }

    public static long getTimestamp(int dayOfMoth, int month, int year) {
        return new GregorianCalendar(year, month - 1, dayOfMoth).getTime().getTime();
    }

}
