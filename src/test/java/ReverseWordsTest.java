import org.junit.Assert;
import org.junit.Test;

public class ReverseWordsTest {

    private ReverseWords sut = new ReverseWords();

    @Test
    public void testReverseWords() {
        Assert.assertEquals("text great really a is This", sut.reverseWords("This is a really great text"));
    }

    @Test
    public void testReverseWordsEmpty() {
        Assert.assertNull(sut.reverseWords(null));
        Assert.assertEquals("", sut.reverseWords(""));
    }
}