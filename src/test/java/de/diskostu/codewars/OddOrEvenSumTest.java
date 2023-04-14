package de.diskostu.codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author <a href="https://github.com/diskostu">diskostu</a>
 */
public class OddOrEvenSumTest {

    @Test
    public void testEmpty() {
        assertEquals(OddOrEvenSum.EVEN, OddOrEvenSum.oddOrEven(new int[]{}));
    }

    @Test
    public void testEven() {
        assertEquals(OddOrEvenSum.EVEN, OddOrEvenSum.oddOrEven(new int[]{1, 2, 3, 4}));
        assertEquals(OddOrEvenSum.EVEN, OddOrEvenSum.oddOrEven(new int[]{1, 2, 3, 4, 5, 6, 7, 8}));
    }

    @Test
    public void testOdd() {
        assertEquals(OddOrEvenSum.ODD, OddOrEvenSum.oddOrEven(new int[]{1, 2}));
        assertEquals(OddOrEvenSum.ODD, OddOrEvenSum.oddOrEven(new int[]{1, 2, 3, 4, 5}));
    }
}