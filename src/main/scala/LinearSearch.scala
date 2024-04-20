object LinearSearch extends App {
  val arr = Array(10, 20, 30, 40, 50, 60, 70, 80, 90)
  val searchElement = 60
  var found = false

  for (i <- 0 until arr.length) {
    if (searchElement == arr(i)) {
      found = true
      println(s"$searchElement is in the array")
    }
  }

  if (!found) {
    println(s"$searchElement is not in the array")
  }
}
