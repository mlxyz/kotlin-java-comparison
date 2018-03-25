package de.hspf.kotlin.examples.extension

import java.math.BigInteger

/**
 * Returns the number of digits of the current number
 * This methods logic was taken from https://stackoverflow.com/a/23773083
 * @return The number of digits in this BigInteger
 */
fun BigInteger.getDigits(): Int {

    val factor = Math.log(2.0) / Math.log(10.0)
    val digitCount = (factor * this.bitLength() + 1).toInt()
    return if (BigInteger.TEN.pow(digitCount - 1).compareTo(this) > 0) {
        digitCount - 1
    } else digitCount
}