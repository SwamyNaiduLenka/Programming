object DynamicArray extends App {

  println("Enter the size of the Array")

  val size = scala.io.StdIn.readInt()

  val arr = new Array[Int](size)

  for (i <- 0 until arr.length) {

    println("Enter the element of the Array at", i)
    arr(i) = scala.io.StdIn.readInt()

  }


  for (i <- 0 until arr.length) {
    println(arr(i))
  }

}

