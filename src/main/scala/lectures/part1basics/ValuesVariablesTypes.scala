package lectures.part1basics

object ValuesVariablesTypes {

  //  val x: Int = 42
  val x = 42
  println(x)

  //  val is IMMUTABLE
  //  x = 2

  val aString: String = "hello"
  val anotherString = "goodbye"

  val aBoolean: Boolean = false
  val aChar: Char = 'a'
  val aInt: Int = x
  val aShort: Short = 4512
  val aLong: Long = 1232132132
  val aFloat: Float = 2.0f
  val aDouble: Double = 22.5

  // variables
  // var is mutable
  var aVariable: Int = 4
  aVariable = 5
}