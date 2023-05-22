package lectures.part1basics

object CBNvsCBV extends App {

  def calledByValue(x: Long): Unit = {
    println("by vlaue: " + x)
    println("by vlaue: " + x)
  }

  def calledByName(x: => Long): Unit = {
    println("by value: " + x)
    println("by value: " + x)
  }

  calledByValue(System.nanoTime()) // calledByValue(2618912913178250)
  calledByName(System.nanoTime())
}
