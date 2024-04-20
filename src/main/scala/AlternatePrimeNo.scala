object AlternatePrimeNo extends App {

  var count = 0
  var alt = 1
  var a = 100
  for (i <- 1 to a) {
    count=0
    for (j <- 1 to i+1) {
      //var num = 1
      if (i % j == 0) {
        count = count + 1
        //print(i,j,count)
      }
    }
      if (count == 2) {
        alt = alt + 1
        if (alt % 2 == 0)
          println(s"The number $i is prime")
      }
  }
}