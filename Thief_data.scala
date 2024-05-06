package Assignments

import scala.io.Source

object Thief_data extends App {

  val scalaFileContents = Source.fromFile("src/Assignments/thief.txt").getLines()

  val datalist = for {
    line <- scalaFileContents
    //values = line.split(", ").toList
  } yield  line

  val lists = datalist.toList
  //println( lists )

  val toggles = for {
    list <- lists
    result = NumberOfFlips(list)
  } yield  result

  val togglesList = toggles.toList
  println(togglesList)



  def NumberOfFlips(str: String): Int = {
    var count = 0
    var isOpen = true

    for(s <- str) {
      if((s == '0' && isOpen) || (s == '1' && !isOpen)) {
        count += 1
        isOpen = !isOpen
      }
    }
    count
  }

}
