object ArrayEleSum extends App {
  // Find the sum of all elements in an array.
  val data = Array(5, 2, 8, 1, 3)
  var sum = 0

  for (i <- 0 until data.length) {
    sum += data(i)
  }

  println(s"Sum of the Array ${data.mkString(", ")} elements is $sum")
}

