package de.diskostu.codewars

fun evaporator(content: Double, evap_per_day: Double, threshold: Double): Int {
    var days = 0
    var contentVar = content
    val percentageGasLostPerDay = 1 - (evap_per_day / 100)
    val thresholdAmount = content / 100 * threshold

    while (contentVar >= thresholdAmount) {
        contentVar *= percentageGasLostPerDay
        days++
    }

    return days
}