import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AnagramTest {
    @Test
    public void exampleTests() {
        Anagram sut = new Anagram();

        assertTrue(sut.isAnagram("foefet", "toffee"));
        assertTrue(sut.isAnagram("Buckethead", "DeathCubeK"));
        assertTrue(sut.isAnagram("Twoo", "Woot"));
        assertFalse(sut.isAnagram("apple", "pale"));
    }
}