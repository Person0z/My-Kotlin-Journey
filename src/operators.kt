fun arithmetic() {
    val firstNumber: Double = 15.5
    val secondNumber: Double = 3.5

    val textOne = "beginning"
    val textTwo = " Middle "
    val textThree = "End"

    // Arithmetic Operators
    // Are things like addition, subtraction, multiplication, division, modulus (remainder), increment (add one), decrement (subtract one)

    println("+ - * / %") // Symbols
    println("$firstNumber + $secondNumber = ${firstNumber + secondNumber}") // First states the numbers being added then the equal after is the numbers being added together
    println("$firstNumber - $secondNumber = ${firstNumber - secondNumber}") // First states the numbers are being subtracted and then subtracts them
    println("$firstNumber * $secondNumber = ${firstNumber * secondNumber}") // States the numbers then multiples them
    println("$firstNumber / $secondNumber = ${firstNumber / secondNumber}") // States numbers then divides
    println("$firstNumber % $secondNumber = ${firstNumber % secondNumber}") // divides first and second numbers outputs what the remainder was of the number

    println("${textOne + textTwo + textThree}")
    // OR
    println(textOne + textTwo + textThree)

}

fun assignment() {
    // Assignment Operators
    var total = 0 // var can be changed whereas val can not be changed when the code is running
    println(total) // print total var
    println("+ - * / %")

    total += 6 // Adds 5 to the total var
    println(total) // Outputs 5

    total -= 5 // Subtracts 6 from the total var
    println(total) // output 1 since we changed var adding 5 then removing

    total *= 20 // Multiples by 20 and 20*1=20
    println(total) // Output is 20

    total /= 10 // divides by 10, output should be 2
    println(total)

    total %= 3 // divides until gets remainder of
    println(total)


}

fun unary() {
    var total = 25 + (-30) // + or - symbols
    // Outputs 5

    ++total // makes it go up by one
    // outputs -4
    --total // makes it go down by one
    // outputs -5

    println(total++)
    // does increment/decrement after completing line
    println(total)

    var isWorking = true

    if (!isWorking) { // If it is not working
        //checks if isWorking is false
        println("Something doesn't work")
    } else { // If it is working
        println("Something Worked")
    }

}

fun comparison() {
    var number = 10
    var biggerNumber = 12
    var randomNumber = (1..20).random()

    if (number > biggerNumber) {
        println("Number is more than biggerNumber")
    } else {
        println("Number is less than number")
    }

    if (number < biggerNumber) {
        println("Number is greater than number")
    } else {
        println("Number is greater than number")
    }

    if (number >= biggerNumber) {
        println("Number is less than number")
    } else {
        println("Number is less than number")
    }

    if (number <= biggerNumber) {
        println("Number is greater than number")
    } else {
        println("Number is greater than number")
    }

    if (number == biggerNumber ) {
        println("Number is equal to number")
    } else {
        println("Number is not equal to number")
    }

    if (number != biggerNumber) {
        println("Number does not equal to number")
    } else {
        println("Number is equal to number")
    }

    if (number < biggerNumber && number < randomNumber) {
        println("Numbers")
    } else {
        println("so much writing")
    }

    if (number < biggerNumber || number > randomNumber) {
        println("Numbers")
    }

}

fun inOperator() {
    var numbers = listOf(1, 3, 5, 7,8)
    var randomNumber = (1..20).random()

    if (randomNumber in numbers) {
        println("Success + $numbers")
    } else {
        println("fail: $randomNumber and $numbers")
    }

}


fun main () {
    arithmetic()
    assignment()
    unary()
    comparison()
    inOperator()
}