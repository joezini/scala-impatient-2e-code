package ch04ex

import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by edwardsj on 18/05/2017.
  */
class exercisesCh04Spec extends FlatSpec with Matchers {

  val ex = new exercisesCh04
  val items = Map("iMac" -> 1200.00, "Rug" -> 250.00, "Saga" -> 15.00)

  "discount10" should "discount the values in a map by 10%" in {
    ex.discount10(items) shouldBe Map("iMac" -> 1080.00, "Rug" -> 225.00, "Saga" -> 13.50)
  }

}
