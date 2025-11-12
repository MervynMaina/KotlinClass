fun main() {
    //Inbuilt Functions/Standard Library Functions - Already exist

    var result = Math.sqrt(144.0)
    println("The squareroot is $result")

    var number = Math.round(54.81)
    println("The output is $number")

    println()

    day()//Calling a function

    println()

    student("Mark", 25, "MIT")
    student("Ann", 23, "Cybersecurity")

    println()

    add(54, 87)
}

//User-Defined Functions
fun day(){
    println("Today is Wednesday")
}

//Parameters/Variables and Arguments/Values
fun student(name: String, age: Int, course: String){
    println("Name : $name, Age : $age, Course : $course")

}

fun add(num1: Int, num2: Int){
    println(num1 + num2)

}