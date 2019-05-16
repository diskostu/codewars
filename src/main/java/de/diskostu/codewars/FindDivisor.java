package de.diskostu.codewars;

import java.util.stream.LongStream;

/**
 * https://www.codewars.com/kata/find-divisors-of-a-number/train/java
 *
 * @author https://github.com/diskostu
 */
class FindDivisor {
    long numberOfDivisors(final int n) {
        return LongStream.range(1L, n + 1L)
                .filter(value -> n % value == 0)
                .count();
    }
}