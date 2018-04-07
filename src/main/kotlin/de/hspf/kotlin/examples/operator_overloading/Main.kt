package de.hspf.kotlin.examples.operator_overloading

import java.awt.Point

fun main(args: Array<String>) {

    val point1 = Point(1, 2)
    val point2 = Point(3, 5)

    println(point1 + point2)
}

private operator fun Point.plus(point: Point): Point {

    return Point(this.x + point.x, this.y + point.y)
}
