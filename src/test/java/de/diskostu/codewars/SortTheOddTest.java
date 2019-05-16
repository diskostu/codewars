package de.diskostu.codewars;

import org.junit.Assert;
import org.junit.Test;

public class SortTheOddTest {

    @Test
    public void testEmpty() {
        Assert.assertArrayEquals(new int[]{}, SortTheOdd.sortArray(new int[]{}));
    }

    @Test
    public void test1() {
        int[] lala = new int[]{3, 2, 1};

        // 2 stays. 1 and 3 switch places.
        Assert.assertArrayEquals(new int[]{1, 2, 3}, SortTheOdd.sortArray(lala));
    }

    @Test
    public void test2() {
        int[] lala = new int[]{1, 5, 8, 3, 0, 9, 2};

        // 0 doesn't move
        Assert.assertArrayEquals(new int[]{1, 3, 8, 5, 0, 9, 2}, SortTheOdd.sortArray(lala));
    }

    @Test
    public void testMultipleSame() {
        int[] lala = new int[]{1, 5, 8, 1, 0, 1, 2};

        // 0 doesn't move
        Assert.assertArrayEquals(new int[]{1, 1, 8, 1, 0, 5, 2}, SortTheOdd.sortArray(lala));
    }
}