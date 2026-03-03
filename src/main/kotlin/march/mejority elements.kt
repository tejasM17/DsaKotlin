package march

fun majorityElement(nums: IntArray): Int {

    fun majority(left: Int, right: Int): Int {
        if (left == right) {
            return nums[left]
        }

        val mid = (left + right) / 2

        val leftMajor = majority(left, mid)
        val rightMajor = majority(mid + 1, right)

        if (leftMajor == rightMajor) {
            return leftMajor
        }

        var leftCount = 0
        var rightCount = 0

        for (i in left..right) {
            if (nums[i] == leftMajor) leftCount++
            if (nums[i] == rightMajor) rightCount++
        }

        return if (leftCount > rightCount) leftMajor else rightMajor
    }

    return majority(0, nums.lastIndex)
}

fun main() {
    println(majorityElement(intArrayOf(2,2,1,1,1,2,2)))
}