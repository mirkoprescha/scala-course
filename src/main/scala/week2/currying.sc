/**
  * CURRYING = function returning a function as result
  *
  * Useful in 1:n relationship between 2 parameters. a is always same value but b is changing.
  * https://dzone.com/articles/understanding-currying-scala
  */


object exercise {
  def product (f: Int => Int) (a: Int, b: Int): Int =
  if (a > b) 1
  else f(a) * product(f)(a+1,b)
  product(x => x)(1,2)

  def fact (n : Int)  = product (x => x) (1,n)
  fact (5)
}

