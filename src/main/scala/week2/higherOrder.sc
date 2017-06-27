/*
  sum up all values between a and b
 */
def sumInts (a: Int, b: Int) : Int =
  if (a > b) 0 else {
    println ("a: " + a)
    a + sumInts(a+1, b)
  }

sumInts(3,9)



/*
sum up the cubes
 */

def cube (x: Int) = x*x*x

def sumCubes (a: Int, b: Int) : Int = {

  if (a > b) {
    println ("Ende")
    0
  }
    else

  {
    println ("a*a*a: " + cube(a))
    println ("a: " + a)
    cube(a) + sumCubes(a+1, b)
  }
}

sumCubes(3,5)


/**
  *
  * Functions are called Higher-Order functions if the get a function as a parameter or return a function as result
  * Useful, if we need to reuse a pattern of a general function like "sum up" specific function results.
  * We often need to pass very specific functions to higher order functions like map, filter or reduce
  */

def factorial(a :Int): Int = if (a==0) 1 else a * factorial (a-1)
def sum(f: Int => Int, a: Int, b: Int): Int =
  if (a > b) 0 else
    f(a) + sum(f,a+1,b)

sum(cube, 3,5)
sum(factorial,1,2)

factorial(1)
factorial(2)

/*****
  * Function Types
  *
  * type A => B is the type of a function that takes A as an argument and returns a B
  */

/**
  * ANONYMOUS FUNCTIONS: to avoid creation of small functions
  * example of an anonymous function that raises the cube o passed INT
  *   (x: Int) => x+x+x
  */


//rewrite above sum of cubes using anonym. f
sum((x:Int) => x*x*x,3,5)
//or
sum( x => x*x*x,3,5)



println ("//Sum function as tail-recursive")


def sumTR (f: Int => Int,a: Int, b: Int): Int = {
  def loop (a: Int, acc: Int): Int = {
    println ("a is " + a)
    if (a>b) acc
    else loop (a+1,f(a) + acc)
  }
  loop (a,0)
}

sumTR((x:Int) => x*x*x,3,5)

