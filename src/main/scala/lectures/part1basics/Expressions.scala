package lectures.part1basics

object Expressions extends App {

  val x = 1 + 2 // EXPRESSION
  println(x)

  println(2 + 3 * 4)
  // + - * / & | ^ << >> >>>

  println(1 == x)
  // == != > >= < <=

  println(!(1 == x))
  // ! && ||

  var aVariable = 2
  aVariable += 3 // also works with -= *= /=
  println(aVariable)

  // Instructions (DO) vs Expressions (VALUE)

  // IF expression
  val aCondition = true
  val aConditionValue = if(aCondition) 5 else 3 // IF EXPRESSION
  println(aConditionValue)
  println(if(aCondition) 5 else 3)

  var i = 0
  while (i < 10) {
    println(i)
    i += 1
  }
  // NEVER WRITE THIS AGAIN.

  // EVERYTHING in Scala is an Expression!

  val aWeirdValue = (aVariable = 3) // Unit === void
  println(aWeirdValue)

  // side effects: println(), whiles, reassigning

  // Code blocks
  val aCodeBlock = {
    val y = 2
    val z = y + 1

    if (z > 2) "hello" else "goodbye"
  }
  // The value of code block is that value of LAST EXPRESSION

  // QUESTION
  // 1. difference between "hello world" vs println("hello world") ?
  // ans : "hello world" is a String but println("hello world") is expression that return Unit
  // 2.

  val someValue = {
    2 < 3
  }
  // someValue = False

  val someOtherValue = {
    if(someValue) 239 else 986
    42
  }
  // someOtherValue = 42
}
