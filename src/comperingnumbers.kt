import java.util.Scanner
fun main() {
    var read = Scanner(System.`in`)
    println("Enter number1 :")
    var number1  = read.nextInt()
    println("Enter number2 :")
    var number2  = read.nextInt()
    println("Enter number3 :")
    var number3  = read.nextInt()


    if (number1 >= number2 && number2 >= number3){
        println("$number1 is the largest number")
    }
    else if (number2 >= number1 && number1 >= number3){
        println("$number2 is the largest number")
    }
    else println("$number3 is the largest number")
}