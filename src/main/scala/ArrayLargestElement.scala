object ArrayLargestElement extends App{
//Find the largest element in an array.

  var data= Array(5, 2, 8, 1, 3)
  var l = data.length
  var highest =data(0)
  for(i<-0 until l){
    for(j<-i+1 to l-1) {
      if (highest < data(j))
        highest = data(j)
    }
  }
  println(s"Largest element of the array is $highest")

}
