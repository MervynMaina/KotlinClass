fun main() {


    val cars = arrayOf("Toyota", "Nissan", "Datsun", "Mazda")

    println(cars[2])
    cars[2] = "Mercedes"
    println(cars[2])
    println(cars.size)

    println()

    for (y in cars){
        println(y)
    }

    println()

    if ("Mazda" in cars){
        println("Available")
    }else{
        println("Not available")
    }
}