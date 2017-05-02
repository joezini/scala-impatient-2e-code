package ch03ex

import Math._

/**
  * Created by edwardsj on 02/05/2017.
  */
class exercisesCh03 {

  def randomArray(n: Int): Array[Int] = {
    for (_ <- 0 until n) yield round(n * Math.random).toInt
  }.toArray

}
