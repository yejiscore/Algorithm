fun main() {
    val N = readln().toInt()
    val numbers = readLine()!!.split(" ").map { it.toInt() }
    val v = readln().toInt()

    val countOfV = numbers.count { it == v }

    print(countOfV)
}