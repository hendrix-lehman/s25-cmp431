fun main() {
  sayHello("Kotlin", 5)

  val tip = calculateTip(20.0)
  println("The total tip is $tip")
}

fun calculateTip(amount: Double, percentage: Double = 0.15): Double {
  return amount * percentage
}

fun sayHello(name: String, number: Int = 1) {
  var message = "Hello, $name! Your favorite number is $number."
  message = "something else"
  println(message)
}

