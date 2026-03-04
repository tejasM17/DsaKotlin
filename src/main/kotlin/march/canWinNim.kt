package march

fun canWinNim(n: Int): Boolean {
    return n % 4 != 0
}

fun main() {
    println(canWinNim(4))
}