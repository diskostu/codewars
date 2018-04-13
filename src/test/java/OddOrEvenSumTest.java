import org.junit.Assert;
import org.junit.Test;

/**
 * @author https://github.com/diskostu
 */
public class OddOrEvenSumTest {

    @Test
    public void testEmpty() {
        Assert.assertEquals(OddOrEvenSum.EVEN, OddOrEvenSum.oddOrEven(new int[]{}));
    }

    @Test
    public void testEven() {
        Assert.assertEquals(OddOrEvenSum.EVEN, OddOrEvenSum.oddOrEven(new int[]{1, 2, 3, 4}));
        Assert.assertEquals(OddOrEvenSum.EVEN, OddOrEvenSum.oddOrEven(new int[]{1, 2, 3, 4, 5, 6, 7, 8}));
    }

    @Test
    public void testOdd() {
        Assert.assertEquals(OddOrEvenSum.ODD, OddOrEvenSum.oddOrEven(new int[]{1, 2}));
        Assert.assertEquals(OddOrEvenSum.ODD, OddOrEvenSum.oddOrEven(new int[]{1, 2, 3, 4, 5}));
    }
}