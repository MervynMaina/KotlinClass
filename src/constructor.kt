fun main() {

    var dog1 = Dog("Bob", "German Shepherd", 4)
    println(dog1.name + " " + dog1.breed + " " + dog1.age)

    var dog2 = Dog("Tom", "Chihuahua", 2)
    println(dog2.name + " " + dog2.breed + " " + dog2.age)

    var dog3 = Dog("James", "Siberian Husky", 6)
    println(dog3.name + " " + dog3.breed + " " + dog3.age)

}

class Dog(var name: String, var breed: String, var age: Int){

}