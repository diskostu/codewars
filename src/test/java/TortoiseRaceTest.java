import org.junit.Assert;
import org.junit.Test;

public class TortoiseRaceTest {

    @Test
    public void testSame() {
        Assert.assertArrayEquals(new int[]{0, 0, 0}, TortoiseRace.race(100, 100, 0));
    }

    @Test
    public void test1() {
        Assert.assertArrayEquals(new int[]{0, 0, 0}, TortoiseRace.race(100, 100, 0));
    }
}