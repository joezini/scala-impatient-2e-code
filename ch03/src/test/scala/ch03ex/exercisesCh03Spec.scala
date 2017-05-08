package ch03ex

import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by edwardsj on 02/05/2017.
  */
class exercisesCh03Spec extends FlatSpec with Matchers {

  val ex = new exercisesCh03

  "randomArray" should "make a random array of length n" in {

    val a = ex.randomArray(6)

    a.length shouldBe 6
    for (x <- a) {
      x should be < 6
      x should be >= 0
    }

  }

  "adjacentSwap" should "swap adjacent integers in an array" in {
    ex.adjacentSwap(Array(1,2,3,4,5)) shouldBe Array(2,1,4,3,5)
  }


}
