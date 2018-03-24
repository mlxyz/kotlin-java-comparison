@file:Suppress("IMPLICIT_CAST_TO_ANY")

package de.hspf.kotlin.examples.safe

fun main(args: Array<String>) {
/*
    var output: String
    output = if (Math.round(Math.random()).toInt() == 1) "This is a string" else null //compile error as output must never be null
*/
    var output: String? = if (Math.round(Math.random()).toInt() == 1) "This is a string" else null


    println("Length: " + output?.length) //output? will return null if it is null and not throw a NullPointerException


    val obj = if (Math.round(Math.random()).toInt() == 1) "This is a string" else 100

    if (obj is String) {
        println("String Length: " + obj.length) //auto cast to String because we know that obj is String
    }
    if (obj is Int) {
        println("Integer +1 : " + obj + 1)
    }
}