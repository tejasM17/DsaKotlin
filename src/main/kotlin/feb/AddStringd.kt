package feb


class AddStringd {
    fun addStrings(num1: String, num2: String): String {
        val intNum1 = num1.toLong()
        val intNum2 = num2.toLong()
        val tostr = (intNum2 + intNum1).toString()
        return tostr
    }
}

fun main() {
    val sum = AddStringd()
    println(sum.addStrings("-8040758926105372666", "10405985147604178950Z"))
}