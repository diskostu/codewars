package de.diskostu.codewars;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.*;

class FibonacciTest {

    @ParameterizedTest
    @CsvSource({
            "20, 6765",
            "21, 10946",
            "22, 17711",
            "23, 28657",
            "24, 46368",
            "25, 75025",
            "26, 121393",
            "27, 196418",
            "28, 317811",
            "29, 514229"
    })
    void testFibonacciCalculation(int input, int expected) {
        long calculated = Fibonacci.calculateFibonacci(input);
        assertThat(calculated).isEqualTo(expected);
    }
}