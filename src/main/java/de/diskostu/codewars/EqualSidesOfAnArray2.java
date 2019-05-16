package de.diskostu.codewars;

import java.util.Arrays;

/**
 * https://www.codewars.com/kata/equal-sides-of-an-array/train/java
 * <p>
 * This is a re-code of the best solution on codewars: <a href="https://www.codewars
 * .com/kata/reviews/567ce36181c53d755500005d/groups/568ecd16173b4ae82100005b">Link</a>
 *
 * @author https://github.com/diskostu
 */
class EqualSidesOfAnArray2 {

    static int findEvenIndex(int[] ints) {
        if (ints.length == 0) {
            return 0;
        }

        int sumLeft = 0;
        int sumRight = Arrays.stream(ints).sum() - ints[0];

        for (int i = 1; i < ints.length; i++) {
            if (sumLeft == sumRight) {
                return i - 1;
            }
            sumLeft += ints[i - 1];
            sumRight -= ints[i];
        }

        return -1;
    }

    public static void main(String[] args) {
        findEvenIndex(new int[]{1, 2, 3, 4, 3, 2, 1});
    }
}