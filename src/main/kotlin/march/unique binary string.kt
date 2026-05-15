package march

fun findDifferentBinaryString(nums: Array<String>): String {
    val res = StringBuilder()

    for (i in nums.indices) {
        if (nums[i][i] == '0') {
            res.append('1')
        } else {
            res.append('0')
        }
    }

    return res.toString()
}
