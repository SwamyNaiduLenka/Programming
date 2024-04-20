object FactorialRecursion extends App{
  //var number=5
  def factorial(number:Int): Int = {
    if (number==1)
      return 1
    else
      number*factorial(number-1)
  }
println(factorial(5))
}
