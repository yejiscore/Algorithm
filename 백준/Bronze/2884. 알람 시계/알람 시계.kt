import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    var Hour = nextInt()
    var Minute = nextInt()

    // 시간변화
    if (Minute < 45) {
        Hour -= 1
        Minute += 60
    }
    if (Hour == -1) {
        Hour = 23
    }
    
    // 45분 앞서는 시간으로
    Minute -= 45

    print("$Hour $Minute")
}