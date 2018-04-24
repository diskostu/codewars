import org.junit.Assert;
import org.junit.Test;

public class VowelsTest {

    @Test
    public void testEmpty() {
        Assert.assertEquals(0, Vowels.getCount(null));
        Assert.assertEquals(0, Vowels.getCount(""));
        Assert.assertEquals(0, Vowels.getCount("   "));
    }

    @Test
    public void testNoVowels() {
        Assert.assertEquals(0, Vowels.getCount("dcvbnmjhk"));
        Assert.assertEquals(0, Vowels.getCount("qwrtzplöäü"));
    }

    @Test
    public void testSomeVowels() {
        Assert.assertEquals(4, Vowels.getCount("qwertzuiopü"));
        Assert.assertEquals(1, Vowels.getCount("asdfghjkllöä"));
    }
}