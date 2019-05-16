package de.diskostu.codewars;

/**
 * https://www.codewars.com/kata/equal-sides-of-an-array/train/java
 *
 * @author https://github.com/diskostu
 */
class EqualSidesOfAnArray {

    static int findEvenIndex(int[] ints) {
        if (ints.length == 0) {
            return -1;
        }

        int index = 0;
        boolean match = false;
        while (index < ints.length) {
            final int leftSum = sumArrayAtIndex(ints, index, true);
            final int rightSum = sumArrayAtIndex(ints, index, false);

            if (leftSum == rightSum) {
                match = true;
                break;
            }
            index++;
        }

        return match ? index : -1;
    }

    private static int sumArrayAtIndex(final int[] aArray, final int aIndex, final boolean isLeft) {
        if (aArray.length <= aIndex) {
            throw new IllegalArgumentException("Index is out of bounds");
        }

        if (aArray.length == 0) {
            return 0;
        }

        int sum = 0;
        for (int i = isLeft ? 0 : (aIndex + 1); i < (isLeft ? aIndex : aArray.length); i++) {
            sum += aArray[i];
        }

        return sum;
    }
}