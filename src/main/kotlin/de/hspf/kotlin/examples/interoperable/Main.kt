package de.hspf.kotlin.examples.interoperable

fun main(args: Array<String>) {

    println("Sleeping 1s from Java")
    de.hspf.java.examples.interoperable.Main().sleep()
    println("Sleeping 1s from Kotlin using java objects")
    Thread.sleep(1000)
}