package feb

class Solution {
    fun isPalindrome(x: Int): Boolean {
        if(x < 0 ) return false
        val tostr = x.toString()
        val revers = tostr.reversed()

        return tostr == revers
    }
}

fun main() {
    val sol = Solution()
    sol.isPalindrome(123)
}