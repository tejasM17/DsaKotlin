package feb

fun lengthOfLastWorld(s: String): Int {
    val pada= "  hi iuse jvh  skj vkjs kjkj  vjw we    sjsc  s  "
    println(pada.length)
    val trm = pada.trim()
    println(trm.length)
    val l = s.trim()
    println(l)
    val worlds = l.split(Regex("\\s+"))
    println(worlds)
    return if (worlds.isEmpty() || worlds[0] == " ") 0 else worlds.last().length

}

fun main() {
    println(lengthOfLastWorld("Hello World  am    tejasm "))

}