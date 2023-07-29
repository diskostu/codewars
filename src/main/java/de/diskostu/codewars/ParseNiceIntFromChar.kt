package de.diskostu.codewars

/**
 * <a href="https://www.codewars.com/kata/557cd6882bfa3c8a9f0000c1/">Kata</a>
 */
fun getAge(yearsOld: String): Int {
    return Character.digit(yearsOld[0], 10)
}