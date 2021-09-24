package bionix.hillel.com;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class By3Test {
    public void main(String[] args) {
        testBy3();
        testBy3Array();
    }

    @Test
    public void testBy3() {
        assertFalse("false", By3.by3WithoutResidual("31"));
        assertTrue("true", By3.by3WithoutResidual("33"));
    }

    @Test
    public void testBy3Array() {
        String first = "[true, true, false, true, false]";
        String second = Arrays.toString(By3.by3WithoutResidualArray(new String[]{"123", "8409", "100853", "33333333", "7"}));
        assertEquals(first, second);
    }
}