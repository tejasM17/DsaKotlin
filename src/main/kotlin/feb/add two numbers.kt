package feb


    fun romanToInt(s: String): Int? {
        val romanmap = mapOf(
            'I' to 1,
            'V' to 5,
            'X' to 10,
            'L' to 50,
            'C' to 100,
            'D' to 500,
            'M' to 1000
        )
        var total = 0

        for (i in s.indices) {
            val cur = romanmap[s[i]]!!

            if (i < s.length -1 && cur < romanmap[s[i + 1]]!!) {
                total -= cur
            } else {
                total += cur
            }
        }
        return total
    }



fun main() {
    println(romanToInt("IIV"))

}