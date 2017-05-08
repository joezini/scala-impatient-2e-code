package ch03ex

import Math._

/**
  * Created by edwardsj on 02/05/2017.
  */
class exercisesCh03 {

  def randomArray(n: Int): Array[Int] = {
    for (_ <- 0 until n) yield floor(n * Math.random).toInt
  }.toArray

  def adjacentSwap(arr: Array[Int]): Array[Int] = {

    def swapFirstTwo(arr: Array[Int]): Array[Int] = {
      if (arr.size > 1)
        Array(arr(1), arr(0)) ++ arr.drop(2)
      else
        arr
    }

    if (arr.size > 1)
      swapFirstTwo(arr).take(2) ++ adjacentSwap(arr.drop(2))
    else
      arr
  }

}
