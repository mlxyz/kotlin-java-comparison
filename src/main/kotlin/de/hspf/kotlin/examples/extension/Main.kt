package de.hspf.kotlin.examples.extension

import java.math.BigInteger
import java.util.*

fun main(args: Array<String>) {

    val bigInteger = BigInteger(1024, Random())

    println("The number $bigInteger has ${bigInteger.getDigits()} digits.")
}