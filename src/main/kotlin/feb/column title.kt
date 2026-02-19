package feb

    fun titleToNumber(columnTitle: String): Int {
        var res = 0

        for (c in columnTitle) {
            val value = c - 'A' + 1
            res = res * 26 + value
        }
        return res
    }


fun main() {
    println(titleToNumber("ZC"))
}