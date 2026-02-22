package feb

fun addBinary(a: String, b: String) {
    val sum = a.toInt(2) + b.toInt(2)
    println(Integer.toBinaryString(sum))
}


fun main() {
    addBinary("1010", "1011")
}