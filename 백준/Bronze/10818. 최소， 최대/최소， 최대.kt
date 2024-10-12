fun main() {
    val N = readln().toInt()
    val numbers = readln().split(" ").map { it.toInt() }

    val maxValue = numbers.maxOrNull()
    val minValue = numbers.minOrNull()

    print("$minValue $maxValue")
}