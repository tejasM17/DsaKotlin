package org.example.nov




fun main() {
    val fruits = arrayOf("apples", "oranges", "lime")

    println(fruits.contains("oranges"))
    println(fruits.contains("banana"))

    println("oranges" in fruits)
    println("banana" !in fruits)

    val numbers = intArrayOf(1, 2, 3)

    println(numbers.contains(2))
    println(numbers.contains(4))
}


