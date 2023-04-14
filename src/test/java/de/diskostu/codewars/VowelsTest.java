package de.diskostu.codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VowelsTest {

    @Test
    public void testEmpty() {
        assertEquals(0, Vowels.getCount(null));
        assertEquals(0, Vowels.getCount(""));
        assertEquals(0, Vowels.getCount("   "));
    }

    @Test
    public void testNoVowels() {
        assertEquals(0, Vowels.getCount("dcvbnmjhk"));
        assertEquals(0, Vowels.getCount("qwrtzplöäü"));
    }

    @Test
    public void testSomeVowels() {
        assertEquals(4, Vowels.getCount("qwertzuiopü"));
        assertEquals(1, Vowels.getCount("asdfghjkllöä"));
    }
}