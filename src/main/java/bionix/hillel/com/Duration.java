package bionix.hillel.com;

import java.util.concurrent.TimeUnit;

public class Duration {
    public static void main(String[] args) {
        System.out.println(calculateDuration1(366200000));
    }

    public static String calculateDuration1(long seconds) {
        String s = null;
        int year = (int) TimeUnit.SECONDS.toDays(seconds) / 365;
        int day = (int) TimeUnit.SECONDS.toDays(seconds) - (year * 365);
        int hours = (int) (TimeUnit.SECONDS.toHours(seconds) - (day * 24) - (year * 365 * 24));
        long minute = TimeUnit.SECONDS.toMinutes(seconds) - (hours * 60L) - ((long) day * 24 * 60) - ((long) year * 365 * 24 * 60);
        long second = TimeUnit.SECONDS.toSeconds(seconds) - (minute * 60) - ((long) hours * 60 * 60) -
                ((long) day * 24 * 60 * 60) - ((long) year * 365 * 24 * 60 * 60);
        if ((year == 0) && (day == 0) && (hours == 0) && (minute == 0) && (second == 0))
            s = "NOW";
        if (year == 0)
            s = day + " day, " + hours + " hour, " + minute + " minute and " + second + " seconds";

        if (day == 0)
            s = hours + " hour, " + minute + " minute and " + second + " seconds";

        if (hours == 0)
            s = minute + " minute and " + second + " seconds";

        if (minute == 0)
            s = second + " seconds";

        if (year != 0)
            s = year + " year, " + day + " day, " + hours + " hour, " + minute + " minute and " + second + " seconds";

        return s;
    }
}