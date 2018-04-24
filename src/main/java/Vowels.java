import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.List;

/**
 * https://www.codewars.com/kata/54ff3102c1bad923760001f3
 *
 * @author diskostu_muc (Twitter)
 */
public class Vowels {

    private final static List<Character> vowelList;

    static {
        vowelList = Arrays.asList('a', 'e', 'i', 'o', 'u');
    }

    public static int getCount(final String str) {
        if (StringUtils.isBlank(str)) {
            return 0;
        }

        int vowelCount = 0;
        final char[] chars = str.toCharArray();
        for (char aChar : chars) {
            if (vowelList.contains(aChar)) {
                vowelCount++;
            }
        }

        return vowelCount;
    }
}