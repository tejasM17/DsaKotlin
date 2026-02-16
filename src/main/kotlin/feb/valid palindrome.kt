package feb

fun isPalindrome(s: String): Boolean {
    val lettersAndDigit = mutableListOf<Char>()
    for (c  in s.lowercase()){
        if (c.isLetterOrDigit()){
            lettersAndDigit.add(c)
            println(c)
        }
    }
    val reversed = if(lettersAndDigit.reversed() != lettersAndDigit) return false else true
    return reversed
//    if (lettersAndDigit != reversed) {
//        return false
//    } else {
//        return true
//    }
}

fun main() {
    println(isPalindrome("A man, a plan, a canal: Panama"))
}