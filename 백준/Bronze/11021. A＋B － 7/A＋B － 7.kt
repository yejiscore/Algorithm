fun main() {
    var T = readln().toInt()

    for (i in 1..T) {
        var (A, B) = readln().split(" ").map { it.toInt() }
        val result = A + B

        println("Case #$i: $result")
    }
}