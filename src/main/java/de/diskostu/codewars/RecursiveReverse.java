package de.diskostu.codewars;

/**
 * https://www.codewars.com/kata/recursive-reverse-string/train/java
 *
 * @author https://github.com/diskostu
 */
public class RecursiveReverse {

    private int i = 0;


    String reverse(String str) {
        if (i == str.length() - 1) {
            i = 0;
            return str;
        }

        final String lastChar = str.substring(str.length() - 1);
        final String partBefore = str.substring(0, i);
        final String partAfter = str.substring(i, str.length() - 1);

        i++;

        return reverse(partBefore + lastChar + partAfter);
    }

    public static void main(String[] args) {
        System.out.println("final: " + new RecursiveReverse().reverse("hallo"));
    }
}
