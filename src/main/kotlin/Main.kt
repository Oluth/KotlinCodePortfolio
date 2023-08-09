import portfolio.LinearCongruentialGenerator

fun main() {

    var index = 0
    var seed = 2
    val maxIndex = 50
    val testObject = LinearCongruentialGenerator(
        module = 1107,
        increment = 2,
        factor = 41
    )

    while(index < maxIndex && !testObject.alreadyCalculated(seed)) {
        seed = testObject.nextRnd(seed)
        println(seed)
        index++
    }

    println("Reached loop after $index calculations.")

}

