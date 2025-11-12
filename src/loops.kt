fun main() {
    //While Loop
    var number = 20

    while (number <= 25){
        println("Number : $number")
        number ++
    }

    println()

    //Program 2
    var number2 = 40

    while (number2 >= 35){
        println("Number : $number2")
        number2 --
    }

    println()

    //Do...While Loop
    var num = 1

    do {
        println("Number is $num")
        num++
    }
    while (num <= 5)

    println()

    //For Loop
    for (letter in 'a'..'d'){
        println("Letter : $letter")
    }

    println()

    for (x in 46..51){
        println(x)
    }

    //Break and Continue statement
    for (y in 55..60){
        if (y == 58){
            continue
        }
        println("Number : $y")
    }






}