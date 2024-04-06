object FactorOf3 extends App{
    //Write programs to print the following series.
    //1,even,3,even,5,even,.......35,even
    for (i <- 1 to 24) {
      // Print each element of the series
      if(i%3==0){
        print("factor of three,")
      }
      else{
        print(s"$i"+",")
      }

  }

}
