package ch02ex

/**
  * Created by edwardsj on 27/04/2017.
  */

trait Output {
  def print(s: String) = Console.println(s)
}

class exercisesCh02 extends Output {

  def signum(number: Double): Int = {
    if (number > 0)
      1
    else if (number == 0)
      0
    else
      -1
  }

  def forLoopEquivalent = {
    for (i <- 10 to 0 by -1) print(i.toString)
  }

  def countDown(n: Int) = {
    for (i <- n to 0 by -1) print(i.toString)
  }

}

