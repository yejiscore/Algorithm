import java.util.*

fun main() = with(Scanner(System.`in`)) {
    val A = nextInt()
    val B = nextInt()
    val C = nextInt()

    val prize = when {
        A == B && B == C -> 10000 + A * 1000
        A == B || A == C -> 1000 + A * 100
        B == C -> 1000 + B * 100
        else -> maxOf(A, B, C) * 100
    }
    
    print(prize)
}