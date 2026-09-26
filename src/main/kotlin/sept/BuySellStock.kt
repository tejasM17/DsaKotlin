package org.example.sept

import kotlin.math.max

class BuyAndSellStock {
    fun maxProfit(prices: IntArray): Int {
        var minPrice = prices[0]
        var maxProfit = 0

        for (price in prices) {
            println(price)
            if (price < minPrice){
                minPrice = price
            }
            val profit = price - minPrice
            maxProfit = maxOf(maxProfit,profit)
        }
        return maxProfit
    }
}

fun main() {
 val array = intArrayOf(7,1,5,3,6,4)
    val arr = BuyAndSellStock()
    println("Max Profit : ${arr.maxProfit(array)}")
}
