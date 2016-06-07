package recfun

import scala.annotation.tailrec

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */

    def pascal(c: Int, r: Int): Int = {
      if(c ==0 || c ==r ) 1
      else {
        pascal(c-1,r-1) +  pascal(c,r-1)
      }

  }

  
  /**
   * Exercise 2
   */
    def balance(chars: List[Char]): Boolean = {

      def checkIt(chars: List[Char], numOpenedPar: Int): Boolean = {

        chars match {
          case Nil => numOpenedPar == 0
          case h :: tail =>
            val newNumOpenedPar =
              if (h == '(')
                numOpenedPar + 1
              else if (h == ')')
                numOpenedPar - 1
              else
                numOpenedPar
            if (newNumOpenedPar > 0 || newNumOpenedPar == 0)
              checkIt(tail, newNumOpenedPar)
            else
              false

          case _ => false
        }

      }
      checkIt(chars, 0)
    }
  
  /**
   * Exercise 3
   */
    def countChange(money: Int, coins: List[Int]): Int = {

      def count(money : Int, coins: List[Int]) : Int ={
        coins match {
          case Nil => 0
          case h :: tail =>
            if(money == h) 1
            else if( money < h) 0
            else
              countChange(money - h, coins) + countChange(money, tail)
        }
      }
      count(money, coins.sorted)
    }
  }
