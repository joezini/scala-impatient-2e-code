package ch04ex

import java.util.Scanner

/**
  * Created by edwardsj on 18/05/2017.
  */
class exercisesCh04 {

  def discount10(items: Map[String, Double]): Map[String, Double] = {
    for ((k, v) <- items) yield (k, v * 0.9)
  }

}

object myApp extends App {

  // Ex 4.2
  val in = new java.util.Scanner(new java.io.File("ch04/pandp.txt"))
  var words = scala.collection.mutable.Map[String, Int]()
  while (in.hasNext("(\\b[^\\s]+\\b*)")) {  // Not a perfect regex but regex is fucking boring
    val nextWord = in.next("(\\b[^\\s]+\\b*)")
    if (words.contains(nextWord))
      words(nextWord) += 1
    else
      words(nextWord) = 1
  }
  println(words)

  // Ex 4.3
  val in2 = new java.util.Scanner(new java.io.File("ch04/pandp.txt"))

  def nextWord(scanner: java.util.Scanner, wordCounts: Map[String, Int]): Map[String, Int] = {

    def addWord(word: String, wordCounts: Map[String, Int]): Map[String, Int] = {
      if (wordCounts.contains(word)) {
        val currCount = wordCounts(word)
        wordCounts.updated(word, currCount + 1)
      } else
        wordCounts + (word -> 1)
    }

    if (in2.hasNext("(\\b[^\\s]+\\b*)")) {
      val another = in.next("(\\b[^\\s]+\\b*)")
      nextWord(scanner, addWord(another, wordCounts))
    }

  }

  println(nextWord(in2, Map()))

}