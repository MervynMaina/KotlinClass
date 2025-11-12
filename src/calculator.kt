import java.util.Scanner

fun main() {
    var reader = Scanner(System.`in`)

    println("Enter the first number:")
    var num1 = reader.nextDouble()

    println("Enter the operator (+, -, *, /):")
    var operator = readLine()

    println("Enter the second number:")
    var num2 = reader.nextDouble()

    var result = when (operator) {
        "+" -> num1 + num2
        "-" -> num1 - num2
        "*" -> num1 * num2
        "/" -> {
            if (num2 != 0.0) {
                num1 / num2
            } else {
                println("Error: Division by zero is not allowed.")
                return
            }
        }
        else -> {
            println("Invalid operator. Please use +, -, *, or /.")
            return
        }
    }

    println("Result: $num1 $operator $num2 = $result")
}