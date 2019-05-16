package de.diskostu.codewars;

/**
 * https://www.codewars.com/kata/54da539698b8a2ad76000228/
 *
 * @author https://github.com/diskostu
 */
class TenMinuteWalk {

    private TenMinuteWalk() {
    }

    static boolean isValid(final char[] chars) {
        if (chars.length != 10) {
            return false;
        }

        int x = 0;
        int y = 0;

        // compute the position in the grid
        for (final char aChar : chars) {
            switch (aChar) {
                case 'n':
                    y++;
                    break;
                case 's':
                    y--;
                    break;
                case 'w':
                    x--;
                    break;
                case 'e':
                    x++;
                    break;
                default:
                    throw new IllegalArgumentException("unknown direction: " + aChar);
            }
        }

        return x == 0 && y == 0;
    }
}