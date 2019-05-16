package de.diskostu.codewars;

import org.junit.Assert;
import org.junit.Test;

public class PredictYourAgeTest {

    @Test
    public void testMethod() {
        Assert.assertEquals(86, PredictYourAge.predictAge(65, 60, 75, 55, 60, 63, 64, 45));
        Assert.assertEquals(79, PredictYourAge.predictAge(32, 54, 76, 65, 34, 63, 64, 45));
    }
}