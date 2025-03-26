import java.util.Scanner

fun main() {
    var read = Scanner(System.`in`)

    println("Enter First number: ")
    var num1 = read.nextInt()

    println("Enter an operator(+,/,-,*):")
    var operator = read .next()[0]

    print("Enter second number: " )
    var num2 = read.nextInt()

    var result = when (operator) {
        '+' -> num1 + num2
        '-' -> num1 - num2
        '*' -> num1 * num2
        '/' -> if (num2 != 0)
            num1 / num2 else "Cannot divide by zero"

        else -> "invalid operator"
    }
    println("result: $result")
}