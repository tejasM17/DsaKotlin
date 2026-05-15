package org.example.may

class longPal {
    fun longestPalindrome(s: String): String {
        var result = ""
        for (i in s.indices) {
            var l = i
            var r = i

            while (l >= 0 && r < s.length && s[l] == s[r]) {
                if ((r - l + 1) > result.length) {
                    result = s.substring(l, r + 1)
                }
                r++
                l--
            }
            l = i
            r = i + 1
            while (l >= 0 && r < s.length && s[l] == s[r]) {
                if ((r - l + 1) > result.length) {
                    result = s.substring(l, r + 1)
                }
                r++
                l--
            }
        }
        return result
    }
}


fun main() {
    val sol = longPal()
    sol.longestPalindrome("babad")

    println(sol.toString())
}