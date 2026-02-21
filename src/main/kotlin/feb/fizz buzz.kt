package feb

fun fizzBuzz(n : Int) {

    val lis: MutableList<String> = mutableListOf()
    for (i in 1..n) {
        if (i % 15 == 0){
            lis.add("Fizz")
        }
        else if (i % 3 == 0) {
            lis.add("Buzz")
        }
        else if (i % 5 == 0){
            lis.add("FizzBuzz")
        }
        else {
            lis.add(i.toString())
        }
    }
    println(lis)


}

fun main() {
    fizzBuzz(15)
}