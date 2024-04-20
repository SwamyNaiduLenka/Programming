object TailRecursion extends App{
  def factorial(number:Int, result:Int): Int = {
    if (number==1)
      result
    else
      factorial(number-1, result*number)
  }
  println("factorial(5,1) using tail recursion",factorial(5,1))

}
