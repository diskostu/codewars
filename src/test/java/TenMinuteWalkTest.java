import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TenMinuteWalkTest {

    @Test
    public void testIsValid() {
        assertTrue("Should return true", TenMinuteWalk.isValid(new char[]{'n', 's', 'n', 's', 'n', 's', 'n', 's',
                'n', 's'}));
        assertFalse("Should return false", TenMinuteWalk.isValid(new char[]{'w', 'e', 'w', 'e', 'w', 'e', 'w', 'e',
                'w', 'e', 'w', 'e'}));
        assertFalse("Should return false", TenMinuteWalk.isValid(new char[]{'w'}));
        assertFalse("Should return false", TenMinuteWalk.isValid(new char[]{'n', 'n', 'n', 's', 'n', 's', 'n', 's',
                'n', 's'}));
    }
}