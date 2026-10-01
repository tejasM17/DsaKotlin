package org.example.sept

import feb.isPalindrome

class ValPalindrome {
    fun isPalindrome(s: String): Unit {
        var L = 0
        var R = s.length - 1

        println(s[R])
    }
}

fun main() {
    val str = "Was it a car or a cat I saw?"
    val pal = isPalindrome(str)
}