@file:Suppress("UNREACHABLE_CODE")

/**
 * =====================================================
 * Kotlin Collections Task 1 - Monkeys
 *
 *    __v__
 *   ( o o )   __v__
 *    (---)   ( o o )
 *             (---)
 *
 * Oh, no! There are monkeys loose in your house. You
 * had better collect all their names so that you can
 * report them to the authorities!
 */


fun main() {
    println("Kotlin Collections Task 1 - Monkeys")
    println("-----------------------------------")
    println()

    // Create a list to store monkey names
    val monkeys = mutableListOf<String>()
    while (true) {
        // Add in some test monkeys
        monkeys.add("Dave")
        monkeys.add("Jimmy")
        monkeys.add("Amy")

        // Show the monkeys
        showMonkeys(monkeys)
        println(monkeyCounter(monkeys))

        // Check the list
        check(monkeys.count() == 3)
        check(monkeyCounter(monkeyList = monkeys) == "There are 3 Monkeys!")


        // See which monkey has the longest name
        println("Longest Name: ${longestMonkeyName(monkeys)}")
        check(longestMonkeyName(monkeys) == "Jimmy")

        // Adding Monkeys --------------------------------------------

        // Ask the user for three new monkey names and add to the list
        for (i in 1..3) {
            getNewMonkey(monkeys)
        }

        // Show the monkeys
        showMonkeys(monkeys)
        println(monkeyCounter(monkeys))
        println("Longest Name: ${longestMonkeyName(monkeys)}")

        // Check the list
        check(monkeys.count() == 6)
        check(monkeyCounter(monkeys) == "There are 6 monkeys!")

        // Removing Monkeys --------------------------------------------

        // Delete the first monkey
        deleteFirstMonkey(monkeys)

        // Show the monkeys
        showMonkeys(monkeys)
        println(monkeyCounter(monkeys))
        println("Longest Name: ${longestMonkeyName(monkeys)}")

        // Check the list
        check(monkeys.count() == 5)
        check(monkeyCounter(monkeys) == "There are 5 monkeys!")

        // Delete the last monkey
        deleteLastMonkey(monkeys)

        // Show the monkeys
        showMonkeys(monkeys)
        println(monkeyCounter(monkeys))
        println("Longest Name: ${longestMonkeyName(monkeys)}")

        // Check the list
        check(monkeys.count() == 4)
        check(monkeyCounter(monkeys) == "There are 4 monkeys!")

        // Try to delete 10 monkeys
        for (i in 1..10) {
            deleteFirstMonkey(monkeys)
        }

        // Show the monkeys
        showMonkeys(monkeys)
        println(monkeyCounter(monkeys))
        println("Longest Name: ${longestMonkeyName(monkeys)}")

        // Check the list
        check(monkeys.count() == 0)
        check(monkeyCounter(monkeys) == "There are no monkeys!")
    }
}


/**
 * Show a given list of monkeys in the format
 * Monkey List
 * -------------------
 * Monkey 1: Dave
 * Monkey 2: Jimmy
 * Monkey 3: Sally
 * etc.
 */
fun showMonkeys(monkeyList: List<String>) {
    println("Monkey List")
    println("-------------------")

    // Loop through the given list and show each monkey
    for (i in 0..<monkeyList.size) {
        println("Monkey ${i + 1}: ${monkeyList[i]}")
    }

}


/**
 * Get a monkey name from the user (no blanks allowed)
 * and then add it to the given monkey list
 */
fun getNewMonkey(monkeyList: MutableList<String>): String {
    var monkeyName: String
    while (true) {
        println("Enter New Monkey Name:")
        monkeyName = readln()
        if (monkeyName.isNotBlank()) break
    }

    monkeyList.add(monkeyName)

    // Show some feedback
    println("Added new monkey: $monkeyName")
    return ""
}


/**
 * Returns the number of monkeys in the given list
 * in the format:
 *   There are N monkeys!
 * If there are no monkeys, it should return:
 *   There are no monkeys!
 */
fun monkeyCounter(monkeyList: List<String>): String {
    // return the number of monkeys in the list
    val numMonkeys = monkeyList.size
    return "There are $numMonkeys Monkeys!"
}


/**
 * Returns the name of the monkey
 */
fun longestMonkeyName(monkeyList: List<String>): String {
    // Loop through the list and find the longest name
    var longestName = ""
    for (name in monkeyList) {
        if (name.length > longestName.length) {
            longestName = name
        }
    }
    return longestName
}


/**
 * Removes the first monkey from the given list
 * if the list is not empty
 */
fun deleteFirstMonkey(monkeyList: MutableList<String>) {
    // Remove the first one from the list
    monkeyList.removeFirst()
    // Show some feedback
    println("Removing monkey: ")
}


/**
 * Removes the last monkey from the given list
 * if the list is not empty
 */
fun deleteLastMonkey(monkeyList: MutableList<String>) {
    // Remove the last one from the list
    monkeyList.removeLast()
    // Show some feedback
    println("Removing monkey: NAME HERE")
}

