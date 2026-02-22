package feb

fun addBinary(a: String, b: String): String {
//    val sum = a.toInt(2) + b.toInt(2)
//    println(Integer.toBinaryString(sum))

    var i = a.length - 1
    var j = b.length - 1
    var carry = 0

    val res = StringBuilder()

    while (i >= 0 || j >= 0 || carry != 0) {
        val BitA = if (i >= 0) a[i] - '0' else 0
        val BitB = if (j >= 0) b[j] - '0' else 0

        val sum = BitA + BitB + carry
        res.append(sum % 2)
        carry = sum / 2

        i--
        j--
    }
    return res.reverse().toString()
}


fun main() {
    println(addBinary("1010", "1011"))
}