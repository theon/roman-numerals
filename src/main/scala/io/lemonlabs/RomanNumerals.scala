package io.lemonlabs

import scala.annotation.tailrec

trait RomanNumerals {

  val symbols = Vector(
    1000 -> "M",
    900  -> "CM",
    500  -> "D",
    400  -> "CD",
    100  -> "C",
    90   -> "XC",
    50   -> "L",
    40   -> "XL",
    10   -> "X",
    9    -> "IX",
    5    -> "V",
    4    -> "IV",
    1    -> "I"
  )

  def toRoman(i: Int): String = {
    @tailrec def buildRoman(remaining: Int, soFar: String): String = {
      val symbol = symbols.find(_._1 <= remaining)
      symbol match {
        case Some((num, sym)) => buildRoman(remaining - num, soFar + sym)
        case None => soFar
      }
    }

    if(i == 0) ""
    else buildRoman(i, "")
  }
}
