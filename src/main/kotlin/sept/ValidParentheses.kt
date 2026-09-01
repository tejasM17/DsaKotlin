package sept

import java.util.Stack

class ValidParentheses {
    fun isValid(str: String): Boolean {
        val stack = Stack<Char>()

//        if an opening str
        for (i in str.indices){
            println(str[i])
            if (str[i] == '(' || str[i] == '{' || str[i] == '['){
                stack.push(str[i])
            } else {
                if (stack.isEmpty()){
                    return false
                }

                if (stack.peek() == '(' && str[i] == ')' ||
                    stack.peek() == '{' && str[i] == '}' ||
                    stack.peek() == '[' && str[i] == ']'){
                    stack.pop()
                }else{
                    return false
                }
            }
        }
        return stack.isEmpty()
    }
}

fun main() {
    val str = "("
    val solution = ValidParentheses()
    println(solution.isValid(str))
}