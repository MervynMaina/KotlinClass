fun main() {

    var employee1 = Employee()//Creating an object
    println(employee1.name)
    employee1.movement()
    println()

    var employee2 = Employee()
    println(employee2.name)
}

class Employee{
    //Attributes/Characteristics/Variables
    var name = "John"
    var position = "Administrator"
    var gender = "Male"
    var age = 45

    //Behaviour/Method
    fun movement(){
        println("Employee is moving")
    }
}