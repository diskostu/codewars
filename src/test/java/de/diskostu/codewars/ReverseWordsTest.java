package de.diskostu.codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

/**
 * @author <a href="https://github.com/diskostu">diskostu</a>
 */
public class ReverseWordsTest {

    @Test
    public void testReverseWords() {
        assertEquals("text great really a is This", ReverseWords.reverseWords("This is a really great text"));
    }

    @Test
    public void testReverseWordsEmpty() {
        assertNull(ReverseWords.reverseWords(null));
        assertEquals("", ReverseWords.reverseWords(""));
    }
}