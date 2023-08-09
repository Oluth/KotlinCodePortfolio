package portfolio

class LinearCongruentialGenerator(
    val module : Int,
    val factor : Int,
    val increment : Int
    )
    {
        var calculatedNumberTable = IntArray(module)

    fun nextRnd(input : Int) : Int {
        calculatedNumberTable[input] = 1
        return ((factor * input) + increment) % module
    }


    fun alreadyCalculated(input : Int) : Boolean {
        return calculatedNumberTable[input] != 0
    }


}