class Solution {
    fun isPalindrome(x: Int): Boolean {
        if (x < 0) return false 
        val org = x.toString()
        return org == org.reversed()
    }
}
