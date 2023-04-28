def SumOfSquares( x: Int , y:Int ) : Int = {
  if (x > y) 0
  else x*x + SumOfSquares(x+1, y)
}

SumOfSquares(1,4)

def SumOfCubes( x: Int , y:Int ) : Int = {
  if (x > y) 0
  else x*x*x + SumOfCubes(x+1, y)
}
SumOfCubes(1,4)

def SumHighOrder( x: Int , y:Int, f:Int => Int ) : Int = {
  if (x > y)
    0
  else
    f(x) + SumHighOrder(x+1, y, f)
}

SumHighOrder(1,4, n => n * n )  // Sum of Squares
SumHighOrder(1,4, n => n * n * n )  // Sum of Cubes
SumHighOrder(1,4, n => n * n * n * n)  // Sum of x power 4
import math.pow
pow(2,3)