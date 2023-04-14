package de.diskostu.codewars;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class YourOrderPleaseTest {
    @Test
    public void test1() {
        assertThat(YourOrderPlease.order("is2 Thi1s T4est 3a")).isEqualTo("Thi1s is2 3a T4est");
    }

    @Test
    public void test2() {
        assertThat(YourOrderPlease.order("4of Fo1r pe6ople g3ood th5e the2")).isEqualTo("Fo1r the2 g3ood 4of th5e pe6ople");
    }

    @Test
    public void test3() {
        assertThat(YourOrderPlease.order("")).isEqualTo("");
    }
}