object NumberEven extends App{
//Write programs to print the following series.
  //1,even,3,even,5,even,.......35,even
  for (i <- 1 to 36) {
    // Print each element of the series
    if(i%2==0){
      print("even")
    }
    else{
      print(i)
    }
    }

}
