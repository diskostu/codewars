package de.diskostu.codewars;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MaximumMultipleTest {

    @Test
    public void smallPositives() {
        assertThat(MaximumMultiple.maxMultiple(2, 7)).isEqualTo(6);
        assertThat(MaximumMultiple.maxMultiple(3, 10)).isEqualTo(9);
        assertThat(MaximumMultiple.maxMultiple(7, 17)).isEqualTo(14);
    }

    @Test
    public void largerPositives() {
        assertThat(MaximumMultiple.maxMultiple(10, 50)).isEqualTo(50);
        assertThat(MaximumMultiple.maxMultiple(37, 200)).isEqualTo(185);
        assertThat(MaximumMultiple.maxMultiple(7, 100)).isEqualTo(98);
    }
}