/**
 * https://www.codewars.com/kata/factorial/train/java
 *
 * @author https://github.com/diskostu
 */
class Factorial {
    int factorial(int n) {
        if (n < 0 || n > 12) {
            throw new IllegalArgumentException("arg out of range (0 ... 12)");
        }

        return n == 0 ? 1 : n * factorial(n - 1);
    }
}