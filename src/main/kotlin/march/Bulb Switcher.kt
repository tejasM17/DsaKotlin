package march

import kotlin.math.sqrt

fun bulbSwitch(n: Int): Int {
    return sqrt(n.toDouble()).toInt()
}

fun main() {
println(bulbSwitch(3))
}