package Assignments

import scala.io.Source


object Exam_data extends App {

  val scalaFileContents = Source.fromFile("src/Assignments/exam.txt").getLines()

  val datalist = for {
    line <- scalaFileContents
    values = line.split(", ").toList
  } yield values

  val lists = datalist.toList
  println(lists)

  val all_results = for {
    list <- lists
    result = result_calculator(list.head.toInt, list.tail.head.toInt, list.tail.tail.head.toInt)
  } yield  result

  val result_list = all_results.toList
  println(result_list)

  def result_calculator(k: Int, l: Int, m: Int): String =
    if (k*l <= m) "YES"
    else "NO"



}
