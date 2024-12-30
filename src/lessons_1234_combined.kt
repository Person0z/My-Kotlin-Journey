// This is a combination of lessons 1, 2, 3, and 4. All of these are put together to make
// and apply to something, so I can learn, as doing is the only way to learn,
// and so I can remember.
//
// This program is me making a fast food which has a name, menu, and customers who buy food

const val storeName: String = "Burger King"
var storeMenu = mutableListOf("Burger", "Fries", "Chicken Sandwich", "Double Whooper")
var totalCustomers: Int = 0
var totalBurgers: Int = 50 // Inventory of Burger King
var totalFries: Int = 25 // Inventory of Burger King
var totalWhooper: Int = 17 // Inventory of Burger King
var totalChickenSandwich: Int = 6 // Inventory of Burger King

fun main() {
    println("The store, '$storeName' is now Open!") // lists the stores name
    println("In walks a family of four") // What is happening
    totalCustomers += 4 // Adds four to the totalCustomers var
    println("There are a total of $totalCustomers customers now!") // List total customers in the store
    println("One person from the four had to run back to the car and grab something") // What happens
    --totalCustomers // Subtracts total customers by one
    println("There are now a total of $totalCustomers") // List total customers
    println("The family wants to know the menu, which is: $storeMenu")
    println("The family wants to order 4 burgers with 3 sides of fries, and one double Whooper") // What is happening
    println("The cashier puts in the order, however, needs to first check if there is enough in stock")
    totalFries -= 50
    burgerStock() // Call if function to check stock
}

fun burgerStock() { // Check Burger stock, if burger stock is less than or equal to 0 then they are out
    if (totalBurgers <= 0) {
        println("Sorry we are out of stock on Burger!s")
    } else {
        println("Burgers are in stock!")
    }
}

fun friesStock() { // Same as burger stock but with fries
    if (totalFries <= 0) {
        println("Sorry we are out of fries!")
    } else {
        println("Fries are in stock!")
    }
}

fun whooperStock() { // check whooper stock
    if (totalWhooper <= 0) {
        println("Sorry we are out of stock on Whoopers")
    } else {
        println("Whoopers are in stock!")
    }
}

fun chickenSandwichStock() { // check chicken sandwich stock
    if (totalChickenSandwich <= 0) {
        println("Sorry we are out of stock on Chicken Sandwiches")
    } else {
        println("Chicken Sandwiches are in stock!")
    }
}
