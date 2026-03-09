package march

fun isHappy(n: Int): Boolean {
    val seen = mutableSetOf<Int>()
    var num = n

    while (num != 1) {
        if (num in seen) return false
        seen.add(num)

        num = num.toString()
            .map { (it - '0') * (it - '0') }
            .sum()
    }

    return true
}

fun main() {
    println(isHappy(19))
}