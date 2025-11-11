import java.util.Scanner
fun main() {
    var y = Scanner(System.`in`)

    println("Enter day (i.e 1, 2, 3, 4, 5) : ")
    var day = y.nextInt()

    var result = when(day){
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        else -> "Invalid day of the week"
    }



}