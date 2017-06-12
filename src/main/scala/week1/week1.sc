println ("hekk")
//lesson2

/*
REPL - read eval print lool (scala)

 */

def radius = 10


def square (x: Double) = x*x

square(4)
square(square(3)) //81


def sumOfSquares(x: Double, y: Double) = square(x)+square(y)
sumOfSquares(3,2+2)

/*
substitzion model -> reduce each expresion until its a value. Formalized in lambda calculus
->Works only as long as there are no side effects (e.g. c++)

Termination? -> infinite loop can occur, due to just rught hand side replacement of function (again and again)
def loop :Int = loop

 */

def loop :Int = loop
//warning: method loop does nothing other than call itself recursively

//recursion
//def loop  = loop
/*
<console>:11: error: recursive method loop needs result type
 */

/*
  by val vs by name

  --> by default scala reduces each expression to a value and passes it as atgument to function

 Both strategies reduce to same final result, as long as
 - reduced expression resolve to pure functions
 - and evaluations terminate

 */


//for which call is which evaluation strategy the fastest?(less steps)
def test (x: Int, y: Int)  = x * x
test (2,3) // same
test (3+4, 8) // call by value is faster
test (7, 2*4) // by name (because 2*4 will not be reduced/evaluated)
test (3+4, 2*4) //same

//example where call by value will not terminate, but call by name would
def first (x: Int, y: Int) = x
//first(1 , loop) --> call by value would not terminate


def constOne (x: Int, y : =>  Int) = 1
constOne(1+2, loop)
//constOne(loop,1+2) -> would not terminate



/*
  definitions can be passed by value or by name
 */
val x = 2
val y = square(x)  //by value, when it is defined
def z = square (x) //by name, because its right hand side is evaluated in each use


def loop2 : Boolean = loop2
def ok = loop2  //works
//val infinite = look


//if else is used for expressions not for statements (you don't set values like in JAVA)

def abs(x:Int) = if (x>=0) x else -x
abs(3)
abs(-3)


true || true
false && true

//booleans are short circuit evaluated


def and (x: Boolean, y:Boolean) = if (x) y else false
and(true,false)
and(true,true)
and(false,true)
//but and(false, loop) would still evaluate loop because and run indefinelty it is not call by name


def or (x: Boolean, y:Boolean) = if (x) true else y
or(true,false)
or(true,true)
or(false,true)



//long expressions
// use paranthesis, because semicolon is never placed inside by compiler
// or finish line with operator

1 + 2 + 3 + 4 +
5 +6  //21

1 + 2 + 3 + 4
  + 5 +6
//10
//11

