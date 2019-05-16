package de.diskostu.codewars;

import java.util.function.IntUnaryOperator;

class FunctionalAddition {

    static IntUnaryOperator add(int n) {
        return operand -> operand + n;
    }
}