package chapter01

import scala.io.StdIn

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.time.temporal.WeekFields
import java.util.Locale

object HelloWorld {
  def main(args: Array[String]): Unit = {
    println("hahha")
    System.out.print("11111")
    val `if` = "if"
    println(`if`)


    println(parseStringToDateTime("2021-12-25 00:00:03", "yyyy-MM-dd HH:mm:ss"))
    val localDateTime: LocalDateTime = parseStringToDateTime("2021-12-25 00:00:03", "yyyy-MM-dd HH:mm:ss")
    val weekFields: WeekFields = WeekFields.of(Locale.CHINA)
    val i: Int = localDateTime.get(weekFields.weekOfWeekBasedYear)
    val b: Int = localDateTime.get(weekFields.weekOfYear)

    println(i)
    println(b)
  }

  def parseStringToDateTime(time: String, format: String): LocalDateTime ={
    val df: DateTimeFormatter = DateTimeFormatter.ofPattern(format)

     LocalDateTime.parse(time, df)
  }

}
