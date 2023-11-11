package de.diskostu.codewars

import kotlin.math.truncate

fun findScreenHeight(width: Int, ratio: String): String {
    val (ratioWidth, ratioHeight) = ratio.split(":").map { it.toInt() }.zipWithNext()[0]
    val height = truncate(width.toDouble() / ratioWidth * ratioHeight).toInt().toString()
    return width.toString() + "x$height"
}