package org.example.may

class twoSum {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = HashMap<Int, Int>()

        for (i in nums.indices){
            val c = target - nums[i]
            println(i)

            if (map.containsKey(c)){
                return intArrayOf(map[c]!!,i)
            }
            map[nums[i]] = i
        }
        return intArrayOf()
    }
}

fun main() {

    val solution = twoSum()

    val nums = intArrayOf(2, 7, 11, 15)
    val target = 9

    val result = solution.twoSum(nums, target)

    println("Indices: ${result[0]}, ${result[1]}")
}