fun main () {
    val allStudents = (1..30).toMutableList()

    repeat(28) {
        val student = readln().toInt()
        allStudents.remove(student)
    }
    
    println(allStudents.minOrNull())
    println(allStudents.maxOrNull())
}