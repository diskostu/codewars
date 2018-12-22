import java.util.ArrayList;

/**
 * https://www.codewars.com/kata/number-of-people-in-the-bus/train/java
 *
 * @author https://github.com/diskostu
 */
class Metro {

    static int countPassengers(ArrayList<int[]> stops) {
        return stops.stream().mapToInt(value -> value[0]).sum() - stops.stream().mapToInt(value -> value[1]).sum();

        // Alternative:
//        stops.stream().collect(Collectors.summingInt(value -> value[0]));
    }
}