package assignments

import scala.io.Source

object Core_data extends App {

//  val input = "9785 4"
//  val Array(number, repeats) = input.split(" ")
//  println(number)
//  println(repeats)

//  val core_digit_original = coreDigitNew(number)
//  println(core_digit_original)

//  val final_number = core_digit_original * repeats.toInt
//
//  val final_result = coreDigit(final_number)
//  println(final_result)


//  val num_repeats = repeats.toInt
//  val actual_number = number * num_repeats.toInt

//  val result = coreDigit(actual_number.toInt)
//  println(result)




  val scalaFile = Source.fromFile("src/assignments/CoreData.txt")
  val scalaFileContents = scalaFile.getLines()

  val data = for {
    line <- scalaFileContents
    //values = line.split(", ").toList
  } yield line


  val datalist = data.toList
  //println(datalist)

  val Array(num, repeat) = datalist.head.split(" ")

  println(num)
  println(repeat)

  val core_digit_original = coreDigitNew(num)
  println(core_digit_original)

  val final_number = core_digit_original * repeat.toInt

  val final_result = coreDigitNew(final_number.toString)
  println(final_result)


  def coreDigitNew(number: String): Int = {

    def coreDigitNewHelper(list: List[Char], sum: Int): Int = {
      //println(sum)
      if (list.isEmpty && sum < 10) sum
      else if (list.isEmpty) coreDigitNewHelper(sum.toString.toList, 0)
      else coreDigitNewHelper(list.tail, sum + (list.head.toInt - '0'))

    }
    coreDigitNewHelper(number.toList, 0)
  }

  scalaFile.close()

}
