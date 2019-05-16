package de.diskostu.codewars;

import java.util.Arrays;

/**
 * https://www.codewars.com/kata/5aff237c578a14752d0035ae/train/java
 *
 * @author https://github.com/diskostu
 */
class PredictYourAge {
    static int predictAge(final int... ages) {
        final int sum = Arrays.stream(ages)
                              .map(operand -> operand * operand)
                              .sum();
        return Math.toIntExact((long) Math.sqrt(sum) / 2);
    }
}