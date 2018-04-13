import java.util.Arrays;

/**
 * https://www.codewars.com/kata/5949481f86420f59480000e7/train/java
 *
 * @author https://github.com/diskostu
 */
class OddOrEvenSum {

    final static String ODD = "odd";
    final static String EVEN = "even";

    static String oddOrEven(int[] ints) {
        return Arrays.stream(ints).sum() % 2 == 0 ? EVEN : ODD;
    }
}