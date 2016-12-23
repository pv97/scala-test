package recfun

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
      if ((r == 0) || c == r) 1
      else if (c > r || c < 0) 0
      else pascal(c, r-1) + pascal(c-1, r-1)
    }
  
  /**
   * Exercise 2
   */
    def balance(chars: List[Char]): Boolean = {
      def helper(chars: List[Char], length: Int) : Int =
        if chars(0) == "("
          helper(chars.tail, length + 1)
        else if chars(0) == ")"
          if (length - 1 < 0) -1
          else helper(chars.tail, lenght - 1)
        else
          helper(chars.tail, length)

      (helper(chars,0) == 0) true else false
    }

  /**
   * Exercise 3
   */
    def countChange(money: Int, coins: List[Int]): Int =
      if (money == 0) 1
      else if (money < 0) 0
      for( var i <- 0 to coins.size - 1 ){

      }
  }
