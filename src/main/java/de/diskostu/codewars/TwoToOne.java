package de.diskostu.codewars;

import java.util.stream.Collectors;

/**
 * https://www.codewars.com/kata/two-to-one/train/java
 *
 * @author https://github.com/diskostu
 */
class TwoToOne {
    static String longest(String s1, String s2) {
        return (s1 + s2).chars()
                .mapToObj(i -> (char) i)
                .distinct()
                .sorted()
                .map(String::valueOf)
                .collect(Collectors.joining());
    }
}