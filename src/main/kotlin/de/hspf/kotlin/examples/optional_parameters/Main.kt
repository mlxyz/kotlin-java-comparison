package de.hspf.kotlin.examples.optional_parameters

fun main(args: Array<String>) {
    printString("Hallo Welt!")

    printString("Hallo Welt!", true)

}

private fun printString(stringToPrint: String, shouldShout: Boolean = false) {
    println(if (shouldShout) stringToPrint.toUpperCase() else stringToPrint)
}

