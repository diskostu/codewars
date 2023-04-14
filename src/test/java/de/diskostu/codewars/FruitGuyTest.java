package de.diskostu.codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FruitGuyTest {
    @Test
    public void testEmptyFruit() {
        assertEquals(0, FruitGuy.removeRotten(new String[0]).length);
    }


    @Test
    public void testAllRottenArray() {
        String[] rotten = new String[]{"rottenApple", "rottenBanana", "rottenApple", "rottenPineapple", "rottenKiwi"};
        String[] expected = new String[]{"apple", "banana", "apple", "pineapple", "kiwi"};
        assertArrayEquals(expected, FruitGuy.removeRotten(rotten));
    }
}