package bionix.hillel.com;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DurationTest {
    public static void main(String[] args) {
        testDuration();
    }

    @Test
    public static void testDuration() {
        assertEquals(Duration.calculateDuration1(62), "1 minute and 2 seconds");
        assertEquals(Duration.calculateDuration1(3662), "1 hour, 1 minute and 2 seconds");
        assertEquals(Duration.calculateDuration1(366200000), "11 year, 223 day, 10 hour, 13 minute and 20 seconds");
    }
}