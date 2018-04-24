import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * https://www.codewars.com/kata/578aa45ee9fd15ff4600090d
 *
 * Best solution: https://www.codewars.com/kata/reviews/592caa2b859ddf8de8000867/groups/592cc0c871afe2924b00003d
 *
 * @author diskostu_muc (Twitter)
 */
public class SortTheOdd {
    public static int[] sortArray(int[] array) {
        if (array == null || array.length == 0) {
            return array;
        }

        final List<Integer> oddNumbersAsListSorted = getOddNumbersAsListSorted(array);

        final int[] changedArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            // zero or even: just take the value
            if (array[i] == 0 || array[i] % 2 == 0) {
                changedArray[i] = array[i];
                continue;
            }

            // odd: take the first from the sorted list
            changedArray[i] = oddNumbersAsListSorted.get(0);
            oddNumbersAsListSorted.remove(0);
        }

        return changedArray;
    }

    private static List<Integer> getOddNumbersAsListSorted(final int[] array) {
        List<Integer> list = Arrays.stream(array).boxed().collect(Collectors.toList());

        final List<Integer> oddItems = new ArrayList<>();
        for (Integer integer : list) {
            if (integer % 2 != 0) {
                oddItems.add(integer);
            }
        }

        Collections.sort(oddItems);

        return oddItems;
    }

    public static void main(String[] args) {
        final List<Integer> oddNumbersAsListSorted = getOddNumbersAsListSorted(new int[]{3, 2, 1, 5, 1});

        System.out.println(oddNumbersAsListSorted);
    }
}