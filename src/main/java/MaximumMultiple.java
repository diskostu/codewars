import java.util.stream.IntStream;

/**
 * https://www.codewars.com/kata/5aba780a6a176b029800041c/train/java
 *
 * @author https://github.com/diskostu
 */
class MaximumMultiple {
    static int maxMultiple(int divisor, int bound) {
        return IntStream.range(0, bound)
                // reverse order: https://stackoverflow.com/q/24010109/1057348
                .map(i -> bound - i)
                .filter(value -> value % divisor == 0)
                .findFirst().getAsInt();
    }
}