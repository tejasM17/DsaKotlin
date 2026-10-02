package org.example.sept

class ValPalindrome {
    fun isPalindrome(s: String): Boolean {
        val str = s.lowercase()
        var L = 0
        var R = str.length - 1

        while (L < R){
            while (L < R && !str[L].isLetterOrDigit() ){
                L++
            }

            while (L < R && !str[R].isLetterOrDigit()){
                R--
            }

            if (str[L] == str[R]) {
                L++
                R--
            } else return false
        }
        return true
    }
}

fun main() {
    val str = "Was it a car or a cat I saw?"
    val obj = ValPalindrome()

    val isvalid = obj.isPalindrome(str)
    println(isvalid)
}