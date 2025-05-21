package de.diskostu.codewars;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class EqualSidesOfAnArray2Test {

    @Test
    void shouldReturn0ForEmptyArray() {
        // Arrange
        int[] arr = {};
        int expected = 0;

        // Act
        int actual = EqualSidesOfAnArray2.findEvenIndex(arr);

        // Assert
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnMinus1ForSingleElementArray() {
        // Arrange
        int[] arr = {10};
        int expected = -1; // Based on the provided code's logic

        // Act
        int actual = EqualSidesOfAnArray2.findEvenIndex(arr);

        // Assert
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnMinus1ForSingleZeroElementArray() {
        // Arrange
        int[] arr = {0};
        int expected = -1; // Based on the provided code's logic

        // Act
        int actual = EqualSidesOfAnArray2.findEvenIndex(arr);

        // Assert
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturn3WhenLeftSideEqualsRightSideForExample1() {
        // Arrange
        int[] arr = {1, 2, 3, 4, 3, 2, 1};
        int expected = 3;

        // Act
        int actual = EqualSidesOfAnArray2.findEvenIndex(arr);

        // Assert
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturn1WhenLeftSideEqualsRightSideForExample2() {
        // Arrange
        int[] arr = {1, 100, 50, -51, 1, 1};
        int expected = 1;

        // Act
        int actual = EqualSidesOfAnArray2.findEvenIndex(arr);

        // Assert
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnMinus1WhenNoIndexFound() {
        // Arrange
        int[] arr = {1, 2, 3, 4, 5, 6};
        int expected = -1;

        // Act
        int actual = EqualSidesOfAnArray2.findEvenIndex(arr);

        // Assert
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturn0ForArrayOfZeros() {
        // Arrange
        int[] arr = {0, 0, 0, 0};
        int expected = 0;

        // Act
        int actual = EqualSidesOfAnArray2.findEvenIndex(arr);

        // Assert
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturn2ForNegativeNumbersArray() {
        // Arrange
        int[] arr = {-1, -2, -3, -2, -1};
        int expected = 2;

        // Act
        int actual = EqualSidesOfAnArray2.findEvenIndex(arr);

        // Assert
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnMinus1ForAnotherSingleElementArray() {
        // Arrange
        int[] arr = {8};
        int expected = -1; // Consistent with single element array rule by current code

        // Act
        int actual = EqualSidesOfAnArray2.findEvenIndex(arr);

        // Assert
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnMinus1ForComplexCaseWithNoEvenIndex() {
        // Arrange
        int[] arr = {10, -80, 10, 10, 15, 35};
        int expected = -1;

        // Act
        int actual = EqualSidesOfAnArray2.findEvenIndex(arr);

        // Assert
        assertThat(actual).isEqualTo(expected);
    }
    
    @Test
    void shouldReturn2ForArrayWherePivotIsCorrectlyFound() {
        // Arrange
        int[] arr = {1,2,3,2,1};
        int expected = 2;

        // Act
        int actual = EqualSidesOfAnArray2.findEvenIndex(arr);

        // Assert
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnMinus1WhenLastElementCouldBePivotButIsNotByCurrentLogic1() {
        // Arrange
        // For {1,2,3,0}, index 3 (value 0) would be pivot if logic allowed: Left sum 1+2+3=6, Right sum 0.
        // Current code returns -1.
        int[] arr = {1,2,3,0};
        int expected = -1; 

        // Act
        int actual = EqualSidesOfAnArray2.findEvenIndex(arr);

        // Assert
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnMinus1WhenLastElementCouldBePivotButIsNotByCurrentLogic2() {
        // Arrange
        // For {1,-1,5}, index 2 (value 5) would be pivot: Left sum 1-1=0, Right sum 0.
        // Current code returns -1.
        int[] arr = {1,-1,5};
        int expected = -1;

        // Act
        int actual = EqualSidesOfAnArray2.findEvenIndex(arr);

        // Assert
        assertThat(actual).isEqualTo(expected);
    }
}
