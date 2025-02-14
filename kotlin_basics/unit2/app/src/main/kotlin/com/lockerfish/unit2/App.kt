/*
 * This source file was generated by the Gradle 'init' task
 */
package com.lockerfish.unit2

class App {

  fun conditional() {
    val condition = true
    // AND operator in kotlin is &&
    // all conditions must be true for the block to execute
    if (condition && 1 == 1 && 2 == 2) { // each type is inferred
      println("AND Condition is true")
    } else {
      println("AND Condition is false")
    }

    // OR operator in kotlin is ||
    // any condition must be true for the block to execute
    if (condition || 1 == 2 || 2 == 3) {
      println("OR Condition is true")
    } else {
      println("OR Condition is false")
    }

    val trafficLightColor = "Red"

    if (trafficLightColor.lowercase() == "red") {
      println("Stop")
    } else if (trafficLightColor == "Yellow") {
      println("Slow down")
    } else if (trafficLightColor == "Green") {
      println("Go")
    } else {
      println("Invalid color")
    }
  }

  fun whenStatement() {
    val trafficLightColor = "Red"

    when (trafficLightColor.lowercase()) {
      "red" -> println("Stop")
      "yellow" -> println("Slow down")
      "green" -> println("Go")
      else -> println("Invalid color")
    }

    val num = 1
    when (num) {
      1 -> println("One")
      2 -> println("Two")
      3 -> println("Three")
      else -> println("Invalid number")
    }

    when (num) {
      1, 2 -> println("One or Two")
      3 -> println("Three")
      else -> println("Invalid number")
    }

    when (num) {
      in 1..10 -> println("Between 1 and 10")
      else -> println("Invalid number")
    }

    val x: Any = 13
    when (x) {
      is Int -> println("Int")
      is Float -> println("Float")
      is Double -> println("Double")
      else -> println("Invalid number")
    }
  }

  fun asExpressions() {

    val y: Any =
            if (1 == 1) {
              "One"
            } else {
              "Not One"
            }
    println(y)

    val x: Any =
            when (2) {
              1 -> "One"
              2 -> "Two"
              3 -> "Three"
              else -> "Not Listed"
            }
    println(x)
  }
}

fun main() {
  // App().conditional()
  // App().whenStatement()
  App().asExpressions()
}
