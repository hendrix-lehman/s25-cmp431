/*
 * This source file was generated by the Gradle 'init' task
 */
package org.example

class App {
  val greeting: String
    get() {
      return "Hello World!"
    }
}

fun arrayStuff() {
  val numbers = arrayOf(1, 2, 3, 4, 5) // values: [1, 2, 3, 4, 5], indices: [0, 1, 2, 3, 4], size: 5
  val names =
          arrayOf(
                  "Alice",
                  "Bob",
                  "Charlie"
          ) // values: ["Alice", "Bob", "Charlie"], indices: [0, 1, 2], size: 3
  val mixed =
          arrayOf(
                  1,
                  "Alice",
                  2,
                  "Bob",
                  3,
                  "Charlie"
          ) // values: [1, "Alice", 2, "Bob", 3, "Charlie"], indices: [0, 1, 2, 3, 4, 5], size: 6

  // accessing elements
  println(numbers[0]) // 1
  println(names[1]) // Bob
  println(mixed[5]) // Charlie

  // change an element value
  names[1] = "Bobby"
  println(names[1]) // Bobby
}

fun listStuff() {
  val numbers = listOf(1, 2, 3, 4, 5) // values: [1, 2, 3, 4, 5], indices: [0, 1, 2, 3, 4], size: 5
  val names =
          listOf(
                  "Bob",
                  "Charlie",
                  "Alice",
          ) // values: ["Alice", "Bob", "Charlie"], indices: [0, 1, 2], size: 3
  val mixed =
          listOf(
                  1,
                  "Alice",
                  2,
                  "Bob",
                  3,
                  "Charlie"
          ) // values: [1, "Alice", 2, "Bob", 3, "Charlie"], indices: [0, 1, 2, 3, 4, 5], size: 6

  // accessing elements
  println(numbers.get(0)) // 1, get() is a member function of List
  println(names[1]) // Charlie
  println(mixed[5]) // Charlie

  // change an element value
  // names[1] = "Bobby" // error: val cannot be reassigned

  // List is immutable, but we can create a mutable list
  val mutableNames = mutableListOf("Alice", "Bob", "Charlie")
  mutableNames[1] = "Bobby" // OK

  // higher-order functions
  names.forEach { println("name: $it") }

  // grouping
  val grouped = names.groupBy { it.first() }
  println(grouped) // {B=[Bob], C=[Charlie, A=[Alice]]}

  // fold
  val sum = numbers.fold(0) { total, value -> total + value }
  println(sum) // 15

  // sort
  val sorted = names.sorted()
  println(sorted) // [Alice, Bob, Charlie]
}

fun setStuff() {
  val numbers = setOf(1, 2, 3, 4, 5) // values: [1, 2, 3, 4, 5], size: 5
  val names = setOf("Alice", "Bob", "Charlie") // values: ["Alice", "Bob", "Charlie"], size: 3
  val mixed =
          setOf(
                  1,
                  "Alice",
                  2,
                  "Bob",
                  3,
                  "Charlie"
          ) // values: [1, "Alice", 2, "Bob", 3, "Charlie"], size: 6

  // accessing elements
  println(numbers.contains(1)) // true
  println(names.contains("Bob")) // true
  println(mixed.contains("Charlie")) // true

  // change an element value
  // names[1] = "Bobby" // error: val cannot be reassigned

  // Set is immutable, but we can create a mutable set
  val mutableNames = mutableSetOf("Alice", "Bob", "Charlie")
  mutableNames.add("Diana") // OK
}

fun mapStuff() {
  val numbers =
          mapOf(1 to "one", 2 to "two", 3 to "three") // values: {1=one, 2=two, 3=three}, size: 3
  val names =
          mapOf(
                  "a" to "Alice",
                  "b" to "Bob",
                  "c" to "Charlie"
          ) // values: {a=Alice, b=Bob, c=Charlie}, size: 3
  val mixed =
          mapOf(
                  1 to "Alice",
                  "b" to 2,
                  3 to "Charlie"
          ) // values: {1=Alice, b=2, 3=Charlie}, size: 3

  // accessing elements
  println(numbers[1]) // one
  println(names["b"]) // Bob
  println(mixed[3]) // Charlie

  // change an element value
  // names["b"] = "Bobby" // error: val cannot be reassigned

  // Map is immutable, but we can create a mutable map
  val mutableNames = mutableMapOf("a" to "Alice", "b" to "Bob", "c" to "Charlie")
  mutableNames["b"] = "Bobby" // OK

  // higher-order functions
  names.forEach { (key, value) -> println("key: $key, value: $value") }

  val filtered = names.filter { (key, value) -> key == "b" }
  println(filtered) // {b=Bob}
}

fun main() {

  // let's talk about collections in Kotlin

  // Arrays
  // arrayStuff()

  // Lists
  listStuff()

  // Sets
  // setStuff()

  // Maps
  // mapStuff()
}
