import org.junit.Assert;
import org.junit.Test;

/**
 * @author https://github.com/diskostu
 */
public class ReverseWordsTest {

    @Test
    public void testReverseWords() {
        Assert.assertEquals("text great really a is This", ReverseWords.reverseWords("This is a really great text"));
    }

    @Test
    public void testReverseWordsEmpty() {
        Assert.assertNull(ReverseWords.reverseWords(null));
        Assert.assertEquals("", ReverseWords.reverseWords(""));
    }
}