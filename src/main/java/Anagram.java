import java.util.HashMap;
import java.util.Map;

/**
 * https://www.codewars.com/kata/529eef7a9194e0cbc1000255/train/java
 * <br>
 * Smart solution: https://www.codewars.com/kata/reviews/57cc4e9fe850d4995b00000c/groups/57cd92f0fa9fc50f5800025a
 *
 * @author https://github.com/diskostu
 */
class Anagram {
    boolean isAnagram(final String test, final String original) {
        if (test.length() != original.length()) {
            return false;
        }

        final Map<String, Integer> char1Map = new HashMap<>();
        final Map<String, Integer> char2Map = new HashMap<>();

        for (final char c : test.toLowerCase().toCharArray()) {
            final String stringValue = String.valueOf(c);
            if (char1Map.containsKey(stringValue)) {
                char1Map.put(stringValue, char1Map.get(stringValue) + 1);
            }

            char1Map.put(stringValue, 1);
        }

        for (final char c : original.toLowerCase().toCharArray()) {
            final String stringValue = String.valueOf(c);
            if (char2Map.containsKey(stringValue)) {
                char2Map.put(stringValue, char2Map.get(stringValue) + 1);
            }

            char2Map.put(stringValue, 1);
        }

        return char1Map.equals(char2Map);
    }
}