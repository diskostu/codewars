package de.diskostu.codewars;

import com.google.common.base.Preconditions;
import org.apache.commons.lang3.StringUtils;

/**
 * https://www.codewars.com/kata/583f158ea20cfcbeb400000a/
 *
 * @author https://github.com/diskostu
 */
class ArithmeticFunction {

    private final static String ADD = "add";
    private final static String SUBTRACT = "subtract";
    private final static String MULTIPLY = "multiply";
    private final static String DIVIDE = "divide";

    static int arithmetic(final int a, final int b, final String operator) {
        Preconditions.checkArgument(a >= 0);
        Preconditions.checkArgument(b >= 0);
        Preconditions.checkArgument(!StringUtils.isBlank(operator));

        switch (operator) {
            case ADD:
                return a + b;
            case SUBTRACT:
                return a - b;
            case MULTIPLY:
                return a * b;
            case DIVIDE:
                return a / b;
        }

        return -1;
    }
}