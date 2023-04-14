package de.diskostu.codewars;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FunctionalAdditionTest {

    @Test
    public void simpleAdd() {
        assertThat(FunctionalAddition.add(3).applyAsInt(5)).isEqualTo(8);
    }
}