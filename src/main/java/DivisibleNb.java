/**
 * @author @diskostu_muc (Twitter)
 * http://www.codewars.com/kata/is-n-divisible-by-x-and-y/train/java
 */
public class DivisibleNb {

    /**
     * We check if a given number is divisble by two other numbers.
     */
    public static boolean isDivisible(long numberToCheck, long divider1, long divider2) {
        return numberIsDivisible(numberToCheck, divider1) && numberIsDivisible(numberToCheck, divider2);
    }

    /**
     * Helper method. Checks if a given number is divisible by another number.
     *
     */
    private static boolean numberIsDivisible(long numberToCheck, long divisor) {
        return numberToCheck % divisor == 0;
    }
}