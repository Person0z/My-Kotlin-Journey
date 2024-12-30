package Full_Kotlin_Tutorial_Indently

var byteNumber: Byte = 10
// Byte is 8 bits from -128 to 127

var shortNumber: Short = 200
// A short number is 16 bits from -32768 to 32767

var intNumber: Int = 40_000 // Underscores are not needed, just makes it easier to read/understand
// Int is 32 bits from -2147483648 to 2147483647

var longNumber: Long = 20_223_223_223_222_666
// Long number is 64 bits from -9223372036854775808 to 9223372036854775807

var floatNumber: Float = 3.145F
// Float 32 bits 6-7 digits

var doubleNumber: Double = 3.145123123
// Double is 64 bits 16-17 digits

var letter: Char = 'A'
// Char is 16 bits UTF-16 code unit

var isWorking: Boolean = false
// A true/false statment, 8 bits

var sentence: String = "Hello, my name is XYZ"
// String, a string of words

fun main() {
    // Call functions and print them to console
    println(byteNumber)
    println(shortNumber)
    println(intNumber)
    println(longNumber)
    println(floatNumber)
    println(doubleNumber)
    println(letter)
    println(isWorking)
    println(sentence)
    

    // Practice
    val a: Int = 1000 // Again a val can never be changed unlike a var which can be changed later in the code
    val b: String = "log message"
    val c: Double = 3.14
    val d: Long = 100_000_000_000_000
    val e: Boolean = false
    val f: Char = '\n'

}
