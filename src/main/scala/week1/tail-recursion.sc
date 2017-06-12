import exercise.factorial

/*
 TAIl-RECURSION

 gcd
 ==> tail recursion

 if the last action of a function consists of calling itself! (the functons stack frame can be reused)
 Tail recursive functions are iterative processes.

 In scala only directly recursive calls are optimized.
 Use tail-recurision only to avoid deep nesting and stack-overflow (@tailrec annotation is required)

 TAIL-CALLS:
 In General: If the last action of a function consists of call ing a function (which maybe the same),
 one stack would be sufficient for both functions. Such calls are called tail-calls.
 */

//@tailrec
def gcd (a: Int, b: Int) : Int =
 if (b==0) a else gcd (b, a%b)

gcd(14,21)

/*
  factorial
  ==> not-tail-recursive function
 */

def factorial (a: Int) : Int =
  if (a==0) 1 else a * factorial(a-1)
factorial(3)

//design factorial as tail-recursive
object exercise {
  def factorial(n: Int): Int = {
    def loop (acc: Int, n: Int) : Int=
      if (n == 0) acc
      else loop (acc * n, n-1)
    loop (1, n)
  }

}
exercise.factorial(3)