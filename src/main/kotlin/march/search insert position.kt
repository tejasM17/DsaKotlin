package march

fun binarySearch(nums: IntArray, target: Int): Int {
    var left = 0
    var right = nums.size - 1
    while (left <= right) {
        val mid = left + (right - left)/2
        if (nums[mid] == target){
            return mid
        }
        else if (nums[mid] < target){
            left = mid + 1
        } else {
            right = mid -1
        }
    }
    return left
}
fun main() {
    println(binarySearch(intArrayOf(1,3,5,6), 7))
}