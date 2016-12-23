object session{
  1+2

  def sqrt(x: Double) = {
    def abs(x: Double) = if (x<0) -x else x

    def sqrtIter(guess: Double, x: Double): Double =
      if (isGoodEnough(guess, x)) guess
      else sqrtIter(improve(guess, x), x)

    def isGoodEnough(guess: Double, x: Double) =
      abs(guess*guess - x)/x < 0.001

    def improve(guess: Double, x: Double) =
      (guess + x / guess) / 2

    sqrtIter(x/2, x)
  }

  sqrt(4)
  sqrt(1924012)

  def pascal(c: Int, r: Int): Int = {
    if ((c == 0) || c == r) 1
    else if (c > r || c < 0) 0
    else pascal(c, r-1) + pascal(c-1, r-1)
  }
  pascal(2,5)



  def contains(s: Int => Boolean, elem: Int): Boolean = s(elem)
  def singletonSet(elem: Int): Int => Boolean = {
    def check(val: Int): Boolean = {
      val == elem
    }
    check
  }

  contains(singletonSet(1), 1)
}