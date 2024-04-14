object TwoSumProblem extends App{

  val arr = Array(10,20,30,40,50,60,70,90)
  val targetsum=100

  for(i<- 0 until arr.length){

      for(j<-i+1 until arr.length){
        if(arr(i)+arr(j)==targetsum){
          println(arr(i),arr(j))
        }

      }
    }




}
