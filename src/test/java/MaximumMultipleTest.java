import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaximumMultipleTest {

    private void test(String message, int expected, int actual) {
        assertEquals(message, expected, actual);
    }

    @Test
    public void smallPositives() {
        test("The largest multiple of 2 between 0 and 7 is 6.", 6, MaximumMultiple.maxMultiple(2, 7));
        test("The largest multiple of 3 between 0 and 10 is 9.", 9, MaximumMultiple.maxMultiple(3, 10));
        test("The largest multiple of 7 between 0 and 17 is 14.", 14, MaximumMultiple.maxMultiple(7, 17));
    }

    @Test
    public void largerPositives() {
        test("The largest multiple of 10 between 0 and 50 is 50.", 50, MaximumMultiple.maxMultiple(10, 50));
        test("The largest multiple of 37 between 0 and 200 is 185.", 185, MaximumMultiple.maxMultiple(37, 200));
        test("The largest multiple of 7 between 0 and 100 is 98.", 98, MaximumMultiple.maxMultiple(7, 100));
    }

}