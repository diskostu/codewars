package de.diskostu.codewars;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindDivisorTest {

    private FindDivisor sut = new FindDivisor();


    @Test
    public void test() {
        assertEquals(3, sut.numberOfDivisors(4));
        assertEquals(2, sut.numberOfDivisors(5));
        assertEquals(6, sut.numberOfDivisors(12));
        assertEquals(8, sut.numberOfDivisors(30));
    }
}