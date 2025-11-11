import java.util.Scanner
fun main() {

    var x = Scanner(System.`in`)

    println("Enter age...")
    var age = x.nextInt()

    if (age >= 18) {
        println("You qualify to be a voter")
    }
    else{
        println("Not a voter")
    }





}