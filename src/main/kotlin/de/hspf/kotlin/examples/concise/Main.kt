package de.hspf.kotlin.examples.concise

import de.hspf.java.examples.concise.User

fun main(args: Array<String>) {

    val user1 = User("Max Mustermann", "max@example.com", "Musterfirma GmbH")
    val user2 = User("Max Mustermann", "max@example.com", "Musterfirma GmbH")

    println("User 1 is " + user1.toString())
    println("User 2 is " + user2.toString())

    println("User 1 and 2 are " + (if (user1 == user2) "equal" else "not equal") + ".")

    user2.name = "Maxime Musterfrau"
    println("User 2 name is now " + user2.name)
    println("User 1 and 2 are " + (if (user1 == user2) "equal" else "not equal") + ".")

    val user3 = User("Angelo Merte", "merte@angelo.com", "BRD GmbH")
    val user4 = User("Zacharia Zweibein", "zach@gmail.com", "Zauber GmbH")

    val userList: List<User> = listOf(user1, user2, user3, user4)
    println("Users starting with \"M\":")
    println(userList.filter { it.name.startsWith("M") })
}