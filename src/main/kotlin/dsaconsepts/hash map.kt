package dsaconsepts

fun basicHashMaping() {
    val maping = HashMap<String, Int>()

    maping["BMW"] = 4
    maping["Mercidece"] = 3
    maping["Rolls Royce"] = 2
    maping["Porcshe"] = 1
    maping["Bugatti"] = 5
    maping["Ferrarri"] = 6

    println("BMW count: ${maping["BMW"]}")
    println("Mercidece count: ${maping["Mercidece"]}")
    println("Rolls Royce count: ${maping["Rolls Royce"]}")
    println("Porcshe count: ${maping["Porcshe"]}")
}

fun main() {
    basicHashMaping()
}