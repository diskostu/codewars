package de.diskostu.codewars

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class DeodorantEvaporatorTest {
    @ParameterizedTest
    @CsvSource(
        "10.0, 10.0, 10.0, 22",
        "10.0, 10.0, 5.0, 29",
        "100.0, 5.0, 5.0, 59",
    )
    fun testFixed(content: Double, evapPerDay: Double, threshold: Double, exected: Int) {
        assertThat(evaporator(content, evapPerDay, threshold)).isEqualTo(exected)
    }
}
