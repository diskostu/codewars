package de.diskostu.codewars;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author @diskostu_muc (Twitter)
 */
public class DivisibleNbTest {

    @Test
    public void test1() {
        assertThat(DivisibleNb.isDivisible(12, 4, 3)).isTrue();
        assertThat(DivisibleNb.isDivisible(3, 1, 3)).isTrue();
        assertThat(DivisibleNb.isDivisible(12, 2, 6)).isTrue();
        assertThat(DivisibleNb.isDivisible(1, 1, 1)).isTrue();
        assertThat(DivisibleNb.isDivisible(100, 5, 3)).isFalse();
        assertThat(DivisibleNb.isDivisible(12, 7, 5)).isFalse();
    }
}