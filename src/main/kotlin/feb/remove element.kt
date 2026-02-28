package feb

fun removeElement(nums: IntArray, `val`: Int): Int {
    var k = 0

    for (i in nums) {
        if (i != `val`){
            nums[k] = i
            k++
        }
    }
    return k

}

fun main() {
    println(removeElement(intArrayOf(0,1,2,2,3,0,4,2), 2))
}