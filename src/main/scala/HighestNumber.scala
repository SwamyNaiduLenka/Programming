object HighestNumber extends App{
  val arr = Array(10,20,30,80,50,60)
  var High =0

  for(i<-0 until arr.length-1) {
    for (j <- i + 1 until arr.length) {
      if ((arr(i) > arr(j)) && (arr(i) > High)) {
          High = arr(i)
      }
      else if ((arr(j) > arr(i)) && (arr(j) > High)) {
        High = arr(j)
      }

    }
  }
  println("Highest",High)



}
