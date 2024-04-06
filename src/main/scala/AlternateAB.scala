object AlternateAB extends App {
//Write a program to print A, B alternatively for 100 times. Ex: (A, B, A, B,
  //A,B...)
// Define the series
  val a = "A"
  val b = "B"

  // Iterate 7 times
  for (i <- 1 to 7) {
    // Print each element of the series
    print(a+",")
    print(b+",")
  }
}
