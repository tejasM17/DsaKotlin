package org.example.nov

class Solution {
    fun findMissingAndRepeatedValues(grid: Array<IntArray>): IntArray {
        val seen = mutableSetOf<Int>()

        val expSum = 0
        val actSum = 0

        var repeated = 0
        var missing = 0

        for (row in grid){
            for (num in row) {
                if (!seen.add(num)){
                    repeated = num
                }
            }
        }

        for (i in grid.indices){

        }
        return intArrayOf()
    }
}