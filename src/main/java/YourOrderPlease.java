import com.google.common.base.CharMatcher;
import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;

/**
 * https://www.codewars.com/kata/55c45be3b2079eccff00010f/train/java
 */
public class YourOrderPlease {

    public static String order(String words) {
        if (StringUtils.isBlank(words)) {
            return words;
        }

        final String[] wordsArray = words.split(" ");
        final String[] sortedArray = new String[wordsArray.length];

        Arrays.stream(wordsArray)
                .forEach(str -> sortedArray[Integer.parseInt(CharMatcher.inRange('1', '9').retainFrom(str)) - 1] = str);

        return String.join(" ", sortedArray);
    }
}