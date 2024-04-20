object AlternateEvenNum extends App {
  val num = 100
  var count = 0

  for (i <- 0 until num+1 ) {
    if (i % 2 == 0) {
      count += 1
      if (count % 2 != 0) {
        println(i)
      }
    }
  }
}
