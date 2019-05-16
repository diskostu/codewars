package de.diskostu.codewars;

import org.junit.Assert;
import org.junit.Test;

public class FunctionalAdditionTest {

    @Test
    public void simpleAdd() {
        Assert.assertEquals("Kata.add(3,5)", FunctionalAddition.add(3).applyAsInt(5), 8);
    }
}