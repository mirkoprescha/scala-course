
object rationals {
  val x = new Rational(1,3)
  val y = new Rational (5,7)
  val z  = new Rational (3,2)
  x.numer
  x.denom
  println(x.add(y))
  println(x.sub(y))
  println(x.sub(y).sub(z)) // expected resut -79/42

}


class Rational (x: Int, y: Int) {
  //functions defined in a data abstraction like class are calle methods
  def numer = x
  def denom = y
  def add (that: Rational) =
    new Rational (
      numer * that.denom + that.numer * denom,
      denom * that.denom)


  def neg = new Rational (-numer, denom)

  def sub (that: Rational) = add (that.neg)

  override def toString = numer + "/" + denom
}


rationals
rationals.x.neg