package feb

fun maxsplit(s: String): Int {
    val set = mutableSetOf<Char>()

    for (ch in s) {
        set.add(ch)
        println(set)
    }
    return set.size
}


fun main() {
    println(maxsplit("nobude"))
}