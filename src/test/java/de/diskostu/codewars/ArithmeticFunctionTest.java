package de.diskostu.codewars;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ArithmeticFunctionTest {

    @Test
    public void testBasic() {
        assertThat(ArithmeticFunction.arithmetic(1, 2, "add")).isEqualTo(3);
        assertThat(ArithmeticFunction.arithmetic(8, 2, "subtract")).isEqualTo(6);
        assertThat(ArithmeticFunction.arithmetic(8, 2, "multiply")).isEqualTo(16);
        assertThat(ArithmeticFunction.arithmetic(8, 2, "divide")).isEqualTo(4);
    }
}