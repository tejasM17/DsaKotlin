package march

fun minOperations(nums: IntArray, k: Int): Int {
    var sumOfArr = 0

    for (i in nums) {
        sumOfArr += i
    }
    return sumOfArr % k
}

fun main() {
    println(minOperations(intArrayOf(3,9,7), 5))
}