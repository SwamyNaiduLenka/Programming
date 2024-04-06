object fibonacciSeries extends App {

  var a =0
  var b=1
  print(a+" ")
  print(b+" ")
  var c=0
  for(i<-1 to 10){
    c=a+b
    print(c+" ")
    a=b
    b=c

  }


}
