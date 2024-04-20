object SubArraySum extends App{

  var k =3
  var arr =Array(10,20,50,62,55,98,99)
  var maxSum =0
  //val sums = Array(Int) //
  //val sums: Array[Int] = Array.empty[Int]
  val sums: Array[Int] = Array()

  for(i<-0 to arr.length-k){
    var sum =0
    for (j <- i until i + k){
      sum =arr(j)+sum
    }
 ///println(sum)
    sums(i) =sum
  }
for(i<-0 to sums.length){
  for(j<-i to sums.length){
  if(sums(i)>sums(j) && sums(i)>maxSum)
    maxSum=sums(i)
  else
  maxSum=sums(j)
  }

  }

}
