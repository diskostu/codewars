package de.diskostu.codewars;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * https://www.codewars.com/kata/557af4c6169ac832300000ba/train/java
 *
 * @author https://github.com/diskostu
 */
class FruitGuy {

    private static final String ROTTEN = "rotten";


    static String[] removeRotten(String[] fruitBasket) {
        return Arrays.stream(fruitBasket == null ? new String[]{} : fruitBasket)
                .map(fruit -> fruit.startsWith(ROTTEN) ? fruit.replace(ROTTEN, "").toLowerCase() : fruit)
                .collect(Collectors.toList())
                .toArray(new String[]{});
    }


    public static void main(String[] args) {
        final String[] fruits = {"apple", "rottenBanana", "cherry"};
        System.out.println("fruits before:");
        Arrays.stream(fruits).forEach(s -> System.out.print(s + ", "));

        System.out.println();
        System.out.println("fruits after:");
        final String[] strings = removeRotten(fruits);
        Arrays.stream(strings).forEach(s -> System.out.print(s + ", "));
    }
}