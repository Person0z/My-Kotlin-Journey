package Full_Kotlin_Tutorial_Indently

var item = "Hammer" // Can be changed
var item2: String = "Hammer"
// I don't need to put that it is a string as Kotlin already does that for me, however, I can put it if I want to.

val fruits = "Apple" // Can NEVER be changed

fun main() {
    item = "Carrots" // I can change the value of a var (variables) and Kotlin won't mind
    println(item)
    // fruits = "Orange" // I can't do this, a val (value) is permanent and can't be changed ever, will result in an error.
    // println(fruits)
}