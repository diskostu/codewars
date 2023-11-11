package de.diskostu.codewars

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class FindScreenSizeTest {
    @ParameterizedTest
    @CsvSource(
        "1024, 1024x768",
        "211, 211x158"
    )
    fun test4By3(width: Int, expected: String) {
        assertThat(findScreenHeight(width, "4:3")).isEqualTo(expected)
    }

    @Test
    fun test16By9() {
        assertThat(findScreenHeight(1280, "16:9")).isEqualTo("1280x720")
    }

    @Test
    fun test32By9() {
        assertThat(findScreenHeight(3840, "32:9")).isEqualTo("3840x1080")
    }
}
