/*
sqrt function newtons
estimate y (e.g. 1)
avg (x , x/y)
 */
object session {

 def abs (x: Double) = if (x<0) -x else x



  def sqrt(x: Double) = {
    def sqrtIter(guess: Double): Double =
      if (isGoodEnough(guess)) guess
      else sqrtIter(improveGuess(guess))

    def isGoodEnough(guess: Double) =
      abs(guess * guess - x) < 0.001

    def improveGuess(guess: Double) =
      ( guess + x / guess ) / 2

    sqrtIter(1.0)
  }

  sqrt(2)
  sqrt(4)
}

