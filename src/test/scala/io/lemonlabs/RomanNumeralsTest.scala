package io.lemonlabs

import org.scalatest.{FlatSpec, Matchers}

class RomanNumeralsTest extends FlatSpec with Matchers {

  trait TestCase {
    val romanNumerals = new RomanNumerals {}
  }

  "0" should "return empty string" in new TestCase {
    romanNumerals.toRoman(0) should equal("")
  }

  "1" should "return I" in new TestCase {
    romanNumerals.toRoman(1) should equal("I")
  }

  "2" should "return some Is" in new TestCase {
    romanNumerals.toRoman(2) should equal("II")
  }

  "3" should "return some Is" in new TestCase {
    romanNumerals.toRoman(3) should equal("III")
  }

  "4" should "return IV" in new TestCase {
    romanNumerals.toRoman(4) should equal("IV")
  }

  "5" should "return V" in new TestCase {
    romanNumerals.toRoman(5) should equal("V")
  }

  "1999" should "return MCMXCIX" in new TestCase {
    romanNumerals.toRoman(1999) should equal("MCMXCIX")
  }

  "2016" should "return MCMXCIX" in new TestCase {
    romanNumerals.toRoman(2016) should equal("MMXVI")
  }

  "944" should "return CMXLIV" in new TestCase {
    romanNumerals.toRoman(944) should equal("CMXLIV")
  }

  "470" should "return CDLXX" in new TestCase {
    romanNumerals.toRoman(470) should equal("CDLXX")
  }

  "88" should "return LXXXVIII" in new TestCase {
    romanNumerals.toRoman(88) should equal("LXXXVIII")
  }
}
