package feb

fun finalValueAfterOperations(operations: Array<String>): Int {
    var x = 0

    for (ch in operations) {
        when(ch){
            "++X","X++" -> x++
            else -> x--
        }
    }
    return  x

}


fun main() {
    println(finalValueAfterOperations(arrayOf("++X","X++","X++")))
}