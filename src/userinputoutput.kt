import java.util.Scanner
fun main() {

    var read = Scanner(System.`in`)

    println("Enter your fullname")
    var fullname = readln()
    println("Fullname : $fullname")

    println()

    println("Enter your age")
    var age = read.nextInt()
    println("I am $age years old")

    println()

    println("Enter weight(kg)")
    var weight = read.nextDouble()
    println("Weight : $weight kg")


}