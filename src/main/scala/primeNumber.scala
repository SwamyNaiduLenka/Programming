object primeNumber extends App {

  var count =0
  var a =23
  for(i<-1 to a){
    if(a%i==0){
      count=count+1
    }
  }

  if(count==2){
    println(s"The number $a is prime")
  }
  else {
    println(s"The number $a is not prime")
  }
}
