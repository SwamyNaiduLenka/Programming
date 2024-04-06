object PatternMultipliedValue extends App {
//Write programs to print the following series. 5*4,5*3,5*2,......5*(-12)
  //(Print in two ways – patter & multiplied value)
  val n = 5

  for (i <- n-1 to 1 by -1) {
    // Print each element of the series
    val k = n*i
    print(s"$n X $i = $k ," )
  }


}
