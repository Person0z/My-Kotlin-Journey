// This is a combination of lessons 1, 2, 3, and 4. All of these are put together to make
// and apply to something, so I can learn, as doing is the only way to learn,
// and so I can remember.
//
// This program is me making a fast food which has a name, menu, and customers who buy food

const val storeName: String = "Burger King"
val storeMenu = listOf("Burger", "Fries", "Chicken Sandwich", "Double Whopper")
var totalCustomers: Int = 0
var totalBurgers: Int = 13 // Inventory of Burger King
var totalFries: Int = 25 // Inventory of Burger King
var totalWhopper: Int = 17 // Inventory of Burger King
var totalItemsOrderedInt: Int = 0 // Initial items ordered amount int
var totalItemsOrderedList = mutableListOf<String>() // List of items ordered, creates an empty list
var customerMoney: Double = 500.1156

fun main() {
    println("The store, '$storeName' is now Open!") // lists the stores name
    println("In walks a family of four") // What is happening
    totalCustomers += 4 // Adds four to the totalCustomers var
    println("There are a total of $totalCustomers customers now!") // List total customers in the store
    println("One person from the four had to run back to the car and grab something") // What happens
    --totalCustomers // Subtracts total customers by one
    println("There are now a total of $totalCustomers") // List total customers
    println("The family wants to know the menu, which is: $storeMenu")
    println("The family wants to order 4 burgers with 3 sides of fries, and one double Whopper") // What is happening
    println("The cashier puts in the order, however, needs to first check if there is enough in stock") // comment

    if (totalBurgers < 4) { // Checks burger stock, if burger stock is lower than 4 it'll tell them they are out of stock, if not then it will subtract it
        println("Sorry, we are out of burgers. Can you order something else?") // Prints out of stock
    } else { // Else (if they have in stock)
        totalBurgers -= 4 // subtracts 4 from the stock
        totalItemsOrderedInt += 4 // add 4 to the total items ordered
        totalItemsOrderedList.add("Burger") // add the item ordered to the list
        println("Added 4 burgers to your order!") // prints that 4 was added
        println("You now have: $totalItemsOrderedList on your order. Anything else?") // list the order to the customer
    }

    println("Give me one moment looking for the fries and checking stock.") // comment

    if (totalFries < 3) { // checks stock
        println("Sorry we are out of fries") // prints if out of stock
    } else { // else statement
        totalFries -= 3 // removes 3 fries from inventory
        totalItemsOrderedInt += 3 // adds 3 fries to order
        totalItemsOrderedList.add("Fries") // adds fries to list
        println("Added 3 Fries to your order!") // prints output
        println("You now have: $totalItemsOrderedList on your order. Anything else?") // list order to customer
    }

    println("Adding one double Whopper, please wait. Checking Stock!")

    if (totalWhopper < 1) { // check stock
        println("Sorry we don't have any in stock") // prints that there are none in stock
    } else { // else
        totalWhopper -= 1 // removes one from inventory
        totalItemsOrderedInt += 1 // adds one to total items
        totalItemsOrderedList.add("Double Whopper") // add to list
        println("Added one Whopper to your order!")
        println("You now have $totalItemsOrderedList on your order. Anything else?")
    }

    println("Customer: Nope") // Convo
    println("Cashier: Okay! it'll be $30.14") // Price of order
    println("Customer: Alright!") // Convo

    if (customerMoney < 30.14) { // Checks money
        println("Sorry you don't have enough money, I will need to cancel the entire order") // prints if no money
        ++totalWhopper  // adds back to inventory
        --totalItemsOrderedInt // removes from list ordered
        totalItemsOrderedList.remove("Double Whopper") // removes from list ordered
        totalFries += 3 // adds back to inventory
        totalItemsOrderedInt -= 3 // removes from list ordered
        totalItemsOrderedList.remove("Fries") // removes from list ordered
        totalBurgers += 4 // adds back to inventory
        totalItemsOrderedInt -= 4 // removes from list ordered
        totalItemsOrderedList.remove("Burger") // removes from list ordered
        println(customerMoney) // prints money
    } else {
        customerMoney -= 30.14 // removes money from account
        println("Transaction Successful!") // prints
        println("Picks up $totalItemsOrderedInt items which contain $totalItemsOrderedList!") // prints items int and string
    }

    println("You know have $customerMoney left in your bank account") // prints money left

    totalCustomers -= 3 // customers leave

    println("The End, $storeName is now closed!")

}
