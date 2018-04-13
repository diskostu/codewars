import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;

public class ReverseWords {

    private final static String DELIMITER = " ";
    public String reverseWords(final String aTextToReverse) {
        if (StringUtils.isBlank(aTextToReverse)) {
            return aTextToReverse;
        }

        final String[] split = aTextToReverse.split(DELIMITER);
        ArrayUtils.reverse(split);
        return String.join(DELIMITER, split);
    }
}