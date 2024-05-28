package assignments

import assignments.Thief_data._

object Thief_test extends App {

  println("Enter a string containing 0 and 1 only : ")
  val str = scala.io.StdIn.readLine()

  val result1 = numberOfFlips(str)
  println("Number of Flips : " + result1)

  val result2 = numberOfFlips2(str)
  println("Number of Flips : " + result2)
}
