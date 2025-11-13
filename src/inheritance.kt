fun main() {

    var a = Animal()
    a.sound()

    var d = Duck()
    d.swim()
    d.sound()

    var h = Horse()
    h.movement()
}

//Parent Class/Base Class/SuperClass
open class Animal{
    var isMammal = true

    fun sound(){
        println("Animal is making a sound")
    }

    fun sleep(){
        println("Animal is sleeping")
    }
}

//Child Class/SubClass/Derived Class
class Duck:Animal(){
    var hasFeathers = true
    var color = "White"
    var hasBeak = true

    fun swim(){
        println("Duck is swimming")
    }

}

class Horse{
    var hasTail = true
    var isWild = true

    fun movement(){
        println("Horse is galloping")
    }
}