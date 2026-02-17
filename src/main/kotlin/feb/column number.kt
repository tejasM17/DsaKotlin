package feb

    fun convertToTitle(columnNumber: Int): String {
            var num = columnNumber
            var res = ""

            while (num > 0){
                num--
                val reminder = num % 26
                val char = 'A' + reminder
                res =  char + res
                num /= 26
            }
            return res


        }



fun main() {

    println(convertToTitle(6304))

}