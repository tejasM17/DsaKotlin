package feb.med

fun maxArea(height: IntArray): Int {
    var left = 0
    var right = height.lastIndex
    var maxArea = 0

    while (left < right) {
        val width = right - left
        val minHeight = minOf(height[left], height[right])
        val area = width * minHeight

        maxArea = maxOf(maxArea, area)

        // Move the smaller height
        if (height[left] < height[right]) {
            left++
        } else {
            right--
        }
    }

    return maxArea
}

