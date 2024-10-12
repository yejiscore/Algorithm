fun main() {
    var (A, B) = readLine()!!.split(" ").map { it.toInt() }
    var C = readLine()!!.toInt()

    B += C

    if (B >= 60) {
        A = A + B / 60
        B = B % 60
    }

    if (A >= 24) A -= 24

    print("$A $B")
}