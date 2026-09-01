package dsaconsepts

//Stack: A data structure that follows LIFO: Last In, First Out.
//Example: push(10) → push(20) → pop() gives 20 because the last item added comes out first.
//Remember: “Like a stack of plates: put on top, remove from top.”


fun main() {
    val stack = ArrayDeque<Int>()

    stack.addLast(10) // push
    stack.addLast(20) // push

    println(stack.removeLast()) // 20
}