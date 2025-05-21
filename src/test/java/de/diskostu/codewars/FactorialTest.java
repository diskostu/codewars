package de.diskostu.codewars;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class FactorialTest {

    private final Factorial fact = new Factorial();

    @Test
    public void shouldReturn1WhenInputIs0() {
        // Arrange
        int input = 0;
        int expectedOutput = 1;

        // Act
        int actualOutput = fact.factorial(input);

        // Assert
        assertThat(actualOutput).isEqualTo(expectedOutput);
    }

    @Test
    public void shouldReturn6WhenInputIs3() {
        // Arrange
        int input = 3;
        int expectedOutput = 6;

        // Act
        int actualOutput = fact.factorial(input);

        // Assert
        assertThat(actualOutput).isEqualTo(expectedOutput);
    }

    @Test
    public void shouldReturn120WhenInputIs5() {
        // Arrange
        int input = 5;
        int expectedOutput = 120;

        // Act
        int actualOutput = fact.factorial(input);

        // Assert
        assertThat(actualOutput).isEqualTo(expectedOutput);
    }

    @Test
    public void shouldThrowIllegalArgumentExceptionWhenInputIsLessThan0() {
        // Arrange
        int input = -1;

        // Act & Assert
        assertThatThrownBy(() -> fact.factorial(input))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("arg out of range (0 ... 12)");
    }

    @Test
    public void shouldThrowIllegalArgumentExceptionWhenInputIsGreaterThan12() {
        // Arrange
        int input = 13;

        // Act & Assert
        assertThatThrownBy(() -> fact.factorial(input))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("arg out of range (0 ... 12)");
    }
}
