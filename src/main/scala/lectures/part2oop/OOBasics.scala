package lectures.part2oop

object OOBasics extends App {

  val person = new Person("Zan", 21)
  println(person.age)
  person.greet("Daniel")
  person.greet()

  val author = new Writer("Zan", "surname", 2001)
  val imposter = new Writer("Imposter", "surname", 2002)
  val novel = new Novel("Great Expectations", 2002, author)
  println(novel.authorAge)
  println(novel.isWrittenBy(author))
  println(novel.isWrittenBy(imposter))

  val counter = new Counter
  counter.inc.print
  counter.inc.inc.inc.print
  counter.inc(10).print
}


// constructor
class Person(name: String, val age: Int = 0) {
  // body
  val x = 2

  // method
  def greet(name: String): Unit = println(s"${this.name} says: Hi, $name")

  // overloading
  def greet(): Unit = println(s"Hi, I am $name")

  // multiple constructors
  def this(name: String) = this(name, 0)
  def this() = this("John Doe")
}

/*
  Novel and a Write

  Write: firstname, surname, year
    - method fullname

  Novel: name, year of release, author
    - authorAge
    - isWrittenBy(author)
    - copy (new year of release) = new instance of Novel
*/

class Writer(firstname: String, surname: String, val year: Int) {
  def fullName: String = firstname + " " + surname
}

class Novel(name: String, year: Int, author: Writer) {
  def authorAge = year - author.year
  def isWrittenBy(author: Writer) = author == this.author
  def copy(newYear: Int) = new Novel(name, newYear, author)
}

/*
  Counter class
    - receives an int value
    - method current count
    - method to increment / decrement => new Counter
    - overload inc/dec to receive an amount
 */

class Counter(val count: Int = 0) {
  def inc = {
    println("incrementing")
    new Counter(count + 1)
  }
  def dec = {
    println("decrementing")
    new Counter(count - 1)
  }

  def inc(n: Int): Counter = {
    if (n <= 0) this
    else inc.inc(n - 1)
  }

  def dec(n: Int): Counter = {
    if (n <= 0) this
    else dec.dec(n - 1)
  }

  def print = println(count)
}



// class parameters are NOT FIELD