
import org.junit.Assert;
import org.junit.Test;

/**
 * @author @diskostu_muc (Twitter)
 */
public class DivisibleNbTest {

    @Test
    public void test1() {
        Assert.assertTrue(DivisibleNb.isDivisible(12, 4, 3));
        Assert.assertTrue(DivisibleNb.isDivisible(3, 1, 3));
        Assert.assertTrue(DivisibleNb.isDivisible(12, 2, 6));
        Assert.assertTrue(DivisibleNb.isDivisible(1, 1, 1));
        Assert.assertFalse(DivisibleNb.isDivisible(100, 5, 3));
        Assert.assertFalse(DivisibleNb.isDivisible(12, 7, 5));
    }
}