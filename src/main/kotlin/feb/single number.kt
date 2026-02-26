package feb

fun singleNumber(nums: IntArray): Int {
    var result = 0
    for (n in nums) {
        result = result xor n
    }
    return result
}

fun main() {
    val arr = intArrayOf(4, 1, 2, 1,3, 2)
    println(singleNumber(arr))
}